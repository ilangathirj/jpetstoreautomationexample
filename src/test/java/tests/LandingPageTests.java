package tests;

import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.TopMenuPage;
import utils.testng.listeners.RetryAnalyzer;

import static navigation.ApplicationURLs.APPLICATION_URL;

@Listeners({utils.testng.listeners.TestListener.class})
public class LandingPageTests extends TestBase {

    @Severity(SeverityLevel.BLOCKER)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test is to enter the store by clicking the link and check if the store logo is displayed")
    public void asUserEntersTheStore() {
        DriverUtils.navigateToPage(APPLICATION_URL);

        LandingPage landingPage = new LandingPage();

        TopMenuPage topMenuPage = landingPage.clickOnEnterStoreLink();

        Assert.assertTrue(topMenuPage.isStoreLogoDisplayed());
    }
}
