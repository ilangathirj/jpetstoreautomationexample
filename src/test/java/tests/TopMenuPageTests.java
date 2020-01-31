package tests;

import driver.manager.DriverUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import page.objects.AnimalPage;
import page.objects.MainPage;
import page.objects.SearchPage;
import page.objects.TopMenuPage;
import utils.testng.listeners.RetryAnalyzer;

import static navigation.ApplicationURLs.*;

@Listeners({utils.testng.listeners.TestListener.class})
public class TopMenuPageTests extends TestBase{

    @Severity(SeverityLevel.MINOR)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test is to pass to the main store page by clicking the store logo")
    public void asUserClicksTheLogo(){
        DriverUtils.navigateToPage(SIGN_IN_URL);

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnStoreLogo();

        MainPage mainPage = new MainPage();

        Assert.assertTrue(mainPage.isMainImageDisplayed());
    }

    @Severity(SeverityLevel.BLOCKER)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the cart view by clicking the cart image")
    public void asUserClicksTheCartView(){
        DriverUtils.navigateToPage(MAIN_URL);

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnCartImage();

        Assert.assertTrue(DriverUtils.getActualUrl().contains("viewCart"));
    }

    @Severity(SeverityLevel.BLOCKER)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the sign-in form by clicking the link")
    public void asUserClicksTheSignIn(){
        DriverUtils.navigateToPage(MAIN_URL);

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnSignInLink();

        Assert.assertTrue(DriverUtils.getActualUrl().contains("signonForm"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the help by clicking the link")
    public void asUserClicksTheHelp(){
        DriverUtils.navigateToPage(MAIN_URL);

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnHelpLink();

        Assert.assertTrue(DriverUtils.getActualUrl().contains("help"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test uses the search")
    public void asUserUseTheSearch(){
        DriverUtils.navigateToPage(MAIN_URL);

        TopMenuPage topMenuPage = new TopMenuPage();
        SearchPage searchPage = topMenuPage
                .fillSearch("Goldfish")
                .clickOnSearchButton();

        Assert.assertTrue(searchPage.getSearchResult().contains("Goldfish"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the fish page by clicking the link")
    public void asUserClicksTheFish(){
        DriverUtils.navigateToPage(MAIN_URL);

        TopMenuPage topMenuPage = new TopMenuPage();
        AnimalPage animalPage = topMenuPage.clickOnFishLink();

        Assert.assertTrue(animalPage.getPageHeader().contains("Fish"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the dogs page by clicking the link")
    public void asUserClicksTheDogs(){
        DriverUtils.navigateToPage(MAIN_URL);

        TopMenuPage topMenuPage = new TopMenuPage();
        AnimalPage animalPage = topMenuPage.clickOnDogsLink();

        Assert.assertTrue(animalPage.getPageHeader().contains("Dogs"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the reptiles page by clicking the link")
    public void asUserClicksTheReptiles(){
        DriverUtils.navigateToPage(MAIN_URL);

        TopMenuPage topMenuPage = new TopMenuPage();
        AnimalPage animalPage = topMenuPage.clickOnReptilesLink();

        Assert.assertTrue(animalPage.getPageHeader().contains("Reptiles"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the cats page by clicking the link")
    public void asUserClicksTheCats(){
        DriverUtils.navigateToPage(MAIN_URL);

        TopMenuPage topMenuPage = new TopMenuPage();
        AnimalPage animalPage = topMenuPage.clickOnCatsLink();

        Assert.assertTrue(animalPage.getPageHeader().contains("Cats"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the birds page by clicking the link")
    public void asUserClicksTheBirds(){
        DriverUtils.navigateToPage(MAIN_URL);

        TopMenuPage topMenuPage = new TopMenuPage();
        AnimalPage animalPage = topMenuPage.clickOnBirdsLink();

        Assert.assertTrue(animalPage.getPageHeader().contains("Birds"));
    }
}
