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
import utils.testng.listeners.RetryAnalyzer;

import static navigation.ApplicationURLs.MAIN_URL;

@Listeners({utils.testng.listeners.TestListener.class})
public class MainPageTests extends TestBase{

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Fish page by clicking the sidebar link")
    public void asUserClicksTheFishOnSidebar(){
        DriverUtils.navigateToPage(MAIN_URL);

        MainPage mainPage = new MainPage();
        AnimalPage animalPage = mainPage.clickOnSidebarFishLink();

        Assert.assertTrue(animalPage.getPageHeader().contains("Fish"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Dogs page by clicking the sidebar link")
    public void asUserClicksTheDogsOnSidebar(){
        DriverUtils.navigateToPage(MAIN_URL);

        MainPage mainPage = new MainPage();
        AnimalPage animalPage = mainPage.clickOnSidebarDogsLink();

        Assert.assertTrue(animalPage.getPageHeader().contains("Dogs"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Cats page by clicking the sidebar link")
    public void asUserClicksTheCatsOnSidebar(){
        DriverUtils.navigateToPage(MAIN_URL);

        MainPage mainPage = new MainPage();
        AnimalPage animalPage = mainPage.clickOnSidebarCatsLink();

        Assert.assertTrue(animalPage.getPageHeader().contains("Cats"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Reptiles page by clicking the sidebar link")
    public void asUserClicksTheReptilesOnSidebar(){
        DriverUtils.navigateToPage(MAIN_URL);

        MainPage mainPage = new MainPage();
        AnimalPage animalPage = mainPage.clickOnSidebarReptilesLink();

        Assert.assertTrue(animalPage.getPageHeader().contains("Reptiles"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Birds page by clicking the sidebar link")
    public void asUserClicksTheBirdsOnSidebar(){
        DriverUtils.navigateToPage(MAIN_URL);

        MainPage mainPage = new MainPage();
        AnimalPage animalPage = mainPage.clickOnSidebarBirdsLink();

        Assert.assertTrue(animalPage.getPageHeader().contains("Birds"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Fish page by clicking the image")
    public void asUserClicksTheFishImg(){
        DriverUtils.navigateToPage(MAIN_URL);

        MainPage mainPage = new MainPage();
        AnimalPage animalPage = mainPage.clickOnFishImg();

        Assert.assertTrue(animalPage.getPageHeader().contains("Fish"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Dogs page by clicking the image")
    public void asUserClicksTheDogsImg(){
        DriverUtils.navigateToPage(MAIN_URL);

        MainPage mainPage = new MainPage();
        AnimalPage animalPage = mainPage.clickOnDogsImg();

        Assert.assertTrue(animalPage.getPageHeader().contains("Dogs"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Cats page by clicking the image")
    public void asUserClicksTheCatsImg(){
        DriverUtils.navigateToPage(MAIN_URL);

        MainPage mainPage = new MainPage();
        AnimalPage animalPage = mainPage.clickOnCatsImg();

        Assert.assertTrue(animalPage.getPageHeader().contains("Cats"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Reptiles page by clicking the image")
    public void asUserClicksTheReptilesImg(){
        DriverUtils.navigateToPage(MAIN_URL);

        MainPage mainPage = new MainPage();
        AnimalPage animalPage = mainPage.clickOnReptilesImg();

        Assert.assertTrue(animalPage.getPageHeader().contains("Reptiles"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Birds page by clicking the image")
    public void asUserClicksTheBirdsImg(){
        DriverUtils.navigateToPage(MAIN_URL);

        MainPage mainPage = new MainPage();
        AnimalPage animalPage = mainPage.clickOnBirdsImg();

        Assert.assertTrue(animalPage.getPageHeader().contains("Birds"));
    }

    @Severity(SeverityLevel.NORMAL)
    @Test(retryAnalyzer = RetryAnalyzer.class)
    @Description("The goal of this test enters the Birds page by clicking the image")
    public void asUserClicksTheBirdsBigImg(){
        DriverUtils.navigateToPage(MAIN_URL);

        MainPage mainPage = new MainPage();
        AnimalPage animalPage = mainPage.clickOnBirdsBigImg();

        Assert.assertTrue(animalPage.getPageHeader().contains("Birds"));
    }
}
