package group.revealed.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;
import java.util.Locale;

@AllArgsConstructor

public class SportsDirectStepsDefinition

{

        private final Base base;

        @Given("^I navigate to SportsDirect homepage$")
        public void i_navigate_to_Sports_Direct_homepage()
        {
            // Write code here that turns the phrase above into concrete actions
            base.getDriver().get("https://rs.sportsdirect.com/");
        }

        @Given("^I click on SALE tab in top menu$")
                public void i_click_on_SALE_tab_in_top_menu() throws InterruptedException
        {
            base.getSDirectHomePage().clickOnSaleTab();
        }


        @Given("^Page url contains the word sale$")
        public void page_url_contains_the_word_sale()
        {
            base.getWdWait().until(ExpectedConditions.urlToBe("https://rs.sportsdirect.com/sale"));
        }

        @Given("^I can see Nike logo inside of POPULAR SALE BRANDS tab$")
        public void i_can_see_Nike_logo_inside_of_POPULAR_SALE_BRANDS_tab()
        {
            base.getWdWait().until(ExpectedConditions.presenceOfElementLocated(By.id("popBrand2")));
            WebElement nikeLogo = base.getDriver().findElement(By.id("popBrand2"));
            System.out.println(nikeLogo.findElement(By.tagName("a")).getText());
        }

        @When("^I click on Nike logo of Sale page$")
        public void i_click_on_Nike_logo_of_Sale_page() throws InterruptedException
        {
            base.getSDirectSalePage().clickOnNikeLogo();
        }

        @Then("Page url should contain word sale and word nike")
        public void page_url_should_contain_word_sale_and_word_nike()
        {
            String url = "https://rs.sportsdirect.com/sale/nike";
            base.getWdWait().until(ExpectedConditions.urlToBe(url));
            Assert.assertEquals(base.getDriver().getCurrentUrl(), url, "URLs are not matching");
        }

        @Then("I should see the title NIKE SALE on top of the page")
        public void i_shoul_see_the_title_NIKE_SALE_on_top_of_the_page()
        {
            base.getWdWait().until(ExpectedConditions.presenceOfElementLocated(By.id("lblCategoryHeader")));
            WebElement pageName = base.getDriver().findElement(By.id("lblCategoryHeader"));
            String nikeSale = "NIKE SALE";
            Assert.assertEquals(pageName.getText().toUpperCase(Locale.ROOT), nikeSale, "Page title is incorrect");
        }


}
