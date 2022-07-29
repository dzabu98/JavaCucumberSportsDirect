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



    public SportsDirectSalePage(@NonNull WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void pageUrlCheck() {
        String url = "https://rs.sportsdirect.com/sale";
        Assert.assertEquals(driver.getCurrentUrl(), url, "URLs are not matching");
    }

    private void clickOnBrand(int brandInteger)
    {
        waitForPageToFinishWithLoading();
        WebElement popularBrands = popularBrandsWrapper.findElement(By.className("ulPopBrands"));
        List<WebElement> brands = popularBrands.findElements(By.className("brandLogo"));
        WebElement brand = brands.get(brandInteger);
        click(brand);
    }


    public void clickOnNikeLogo() throws InterruptedException {
       clickOnBrand(0);
    }

    private void brandLogoCheck(int brandInteger, String nameOfTheBrand)
    {
        waitForPageToFinishWithLoading();
        WebElement popularBrands = popularBrandsWrapper.findElement(By.className("ulPopBrands"));
        List<WebElement> brands = popularBrands.findElements(By.className("brandLogo"));
        WebElement brandName = brands.get(brandInteger);
        Assert.assertEquals(brandName.findElement(By.tagName("a")).getText(), nameOfTheBrand, "Text is not found on selected brand");
    }

    public void nikeLogoPresenceCheck()
    {
        String nameOfTheBrand = "nike";
        int brandInteger = 0;
        brandLogoCheck(brandInteger, nameOfTheBrand);
    }
}

