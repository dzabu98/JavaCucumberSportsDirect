package group.revealed.pages;

import group.revealed.steps.Base;
import group.revealed.utils.BasePage;
import lombok.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SportsDirectHomePage extends BasePage

{
        @FindBy(id = "topMenu")
       private WebElement topMenuHolder;


    public SportsDirectHomePage(@NonNull WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    private void chooseCategory(int categoryInteger)
    {
        WebElement topMenu = topMenuHolder.findElement(By.id("ulTopLevelMenu"));
        List<WebElement> tabs = topMenu.findElements(By.className("root"));
        WebElement category = tabs.get(categoryInteger);
        click(category);
    }

        public void clickOnSaleTab() throws InterruptedException {
            chooseCategory(0);
        }



}
