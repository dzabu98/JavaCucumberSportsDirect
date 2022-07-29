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

import java.util.Locale;

public class SportsDirectNikeSalePage extends BasePage

{
    @FindBy(id = "lblCategoryHeader")
    private WebElement pageName;

    public SportsDirectNikeSalePage(@NonNull WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void pageUrlCheck()
    {

        String url = "https://rs.sportsdirect.com/sale/nike";
        Assert.assertEquals(driver.getCurrentUrl(), url, "URLs are not matching");
    }

    public void pageNameCheck()
    {
        String nikeSale = "NIKE SALE";
        Assert.assertEquals(pageName.getText().toUpperCase(Locale.ROOT), nikeSale, "Page title is incorrect");
    }
}
