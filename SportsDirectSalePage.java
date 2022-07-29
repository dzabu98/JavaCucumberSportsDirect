package group.revealed.pages;

import group.revealed.utils.BasePage;
import lombok.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SportsDirectSalePage extends BasePage

{
    @FindBy(className = "divPopBrands")
    private WebElement popularBrandsWrapper;


    public SportsDirectSalePage(@NonNull WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

        public void clickOnNikeLogo() throws InterruptedException
        {
            waitForPageToFinishWithLoading();
            WebElement popularBrands = popularBrandsWrapper.findElement(By.className("ulPopBrands"));
            List<WebElement> brands = popularBrands.findElements(By.className("brandLogo"));
            WebElement nikeBrand = brands.get(0);
            click(nikeBrand);
        }


    }

