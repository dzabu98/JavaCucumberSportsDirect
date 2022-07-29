package group.revealed.pages;

import group.revealed.utils.BasePage;
import lombok.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

import static org.jsoup.nodes.Entities.EscapeMode.base;

public class SportsDirectSalePage extends BasePage {
    @FindBy(className = "divPopBrands")
    private WebElement popularBrandsWrapper;
    @FindBy(id = "popBrand2")
    private WebElement nikeBrand;


    public SportsDirectSalePage(@NonNull WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void pageUrlCheck() {
        String url = "https://rs.sportsdirect.com/sale";
        Assert.assertEquals(driver.getCurrentUrl(), url, "URLs are not matching");
    }


    public void clickOnNikeLogo() throws InterruptedException {
        waitForPageToFinishWithLoading();
        click(nikeBrand);
    }

    public void nikeLogoPresenceCheck()
    {
        waitForPageToFinishWithLoading();
        WebElement popularBrands = popularBrandsWrapper.findElement(By.className("ulPopBrands"));
        List<WebElement> brands = popularBrands.findElements(By.className("brandLogo"));
        WebElement nikeBrand = brands.get(0);
        String nike = "nike";
        Assert.assertEquals(nikeBrand.findElement(By.tagName("a")).getText(), nike, "Text is not found on selected element");
    }
}

