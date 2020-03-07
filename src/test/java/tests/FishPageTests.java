package tests;

import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.objects.*;
import utils.testng.listeners.RetryAnalyzer;

import static navigation.ApplicationURLs.FISH_URL;

@Listeners({utils.testng.listeners.TestListener.class})
public class FishPageTests extends TestBase{

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Angelfish page by clicking the link")
    public void asUserClicksTheAngelfishLink(){
        DriverUtils.navigateToPage(FISH_URL);

        FishPage fishPage = new FishPage();
        fishPage.clickOnAngelfishLink();

        AngelfishPage angelfishPage = new AngelfishPage();

        Assert.assertTrue(angelfishPage.getPageHeader().contains("Angelfish"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Tiger Shark page by clicking the link")
    public void asUserClicksTheTigerSharkLink(){
        DriverUtils.navigateToPage(FISH_URL);

        FishPage fishPage = new FishPage();
        fishPage.clickOnTigerSharkLink();

        TigerSharkPage tigerSharkPage = new TigerSharkPage();

        Assert.assertTrue(tigerSharkPage.getPageHeader().contains("Tiger Shark"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Koi page by clicking the link")
    public void asUserClicksTheKoiLink(){
        DriverUtils.navigateToPage(FISH_URL);

        FishPage fishPage = new FishPage();
        fishPage.clickOnKoiLink();

        KoiPage koiPage = new KoiPage();

        Assert.assertTrue(koiPage.getPageHeader().contains("Koi"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Goldfish page by clicking the link")
    public void asUserClicksTheGoldfishLink(){
        DriverUtils.navigateToPage(FISH_URL);

        FishPage fishPage = new FishPage();
        fishPage.clickOnGoldfishLink();

        GoldfishPage goldfishPage = new GoldfishPage();

        Assert.assertTrue(goldfishPage.getPageHeader().contains("Goldfish"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test return to the main menu by clicking the link")
    public void asUserClicksTheBackLink(){
        DriverUtils.navigateToPage(FISH_URL);

        FishPage fishPage = new FishPage();
        fishPage.clickOnBackLink();

        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isMainImageDisplayed());
    }
}
