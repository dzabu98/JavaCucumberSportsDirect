package group.revealed.steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class StepDefinitions {

    private final Base base;

    @Given("User opens Google search page")
    public void userOpensGoogleSearchPage() {
        base.getDriver().get("https://www.google.com");
    }

    @Given("^I navigate to QA Revealed homepage$")
    public void i_navigate_to_QA_Revealed_homepage()
    {
        // Write code here that turns the phrase above into concrete actions
        base.getDriver().get("https://www.qarevealed.com/");
    }

    @When("^I click on contact us tab in menu$")
    public void i_click_on_Nas_tim_link_in_menu() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        base.getRevealedHomePage().clickOnContactUs();
    }

    @Then("relevant information is shown")
    public void relevantInformationIsShown() {
        base.getContactUsPage().checkTitle();
        base.getContactUsPage().openHours();
    }

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
        base.getSDirectSalePage().pageUrlCheck();
    }

    @Given("^I can see Nike logo inside of POPULAR SALE BRANDS tab$")
    public void i_can_see_Nike_logo_inside_of_POPULAR_SALE_BRANDS_tab()
    {
        base.getSDirectSalePage().nikeLogoPresenceCheck();
    }

    @When("^I click on Nike logo of Sale page$")
    public void i_click_on_Nike_logo_of_Sale_page() throws InterruptedException
    {
        base.getSDirectSalePage().clickOnNikeLogo();
    }

    @Then("Page url should contain word sale and word nike")
    public void page_url_should_contain_word_sale_and_word_nike()
    {
        base.getSDirectNikeSalePage().pageUrlCheck();
    }

    @Then("I should see the title NIKE SALE on top of the page")
    public void i_shoul_see_the_title_NIKE_SALE_on_top_of_the_page()
    {
        base.getSDirectNikeSalePage().pageNameCheck();
    }

}
