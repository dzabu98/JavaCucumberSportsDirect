package group.revealed.steps;

import group.revealed.driver.DriverManager;
import group.revealed.pages.*;
import group.revealed.pages.milosPages.MyFirstPage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@SuppressWarnings("unused")
@RequiredArgsConstructor
public class Base
{
    @Getter
    private final WebDriver driver = DriverManager.getDriver();
    @Getter
    private final GooglePage googlePage = new GooglePage(driver);
    @Getter
    private final QARevealedHomePage revealedHomePage = new QARevealedHomePage(driver);
    @Getter
    private final WebDriverWait wdWait = new WebDriverWait(driver, Duration.ofSeconds(20));
    @Getter
    private final MyFirstPage myFirstPage = new MyFirstPage(driver);
    @Getter
    private final QARevealedContactUsPage contactUsPage = new QARevealedContactUsPage(driver);
    @Getter
    private final SportsDirectHomePage sDirectHomePage = new SportsDirectHomePage(driver);
    @Getter
    private final SportsDirectSalePage sDirectSalePage = new SportsDirectSalePage(driver);
    @Getter
    private final SportsDirectNikeSalePage sDirectNikeSalePage = new SportsDirectNikeSalePage(driver);

}
