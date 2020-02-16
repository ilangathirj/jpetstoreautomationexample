package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class MainPage extends BasePage {

    @FindBy(id = "MainImageContent")
    private WebElement mainImageContent;

    @FindBy(css = "#Sidebar a img[src*='fish']")
    private WebElement sidebarFishLink;

    @FindBy(css = "#Sidebar a img[src*='dogs']")
    private WebElement sidebarDogsLink;

    @FindBy(css = "#Sidebar a img[src*='cats']")
    private WebElement sidebarCatsLink;

    @FindBy(css = "#Sidebar a img[src*='reptiles']")
    private WebElement sidebarReptilesLink;

    @FindBy(css = "#Sidebar a img[src*='birds']")
    private WebElement sidebarBirdsLink;

    @FindBy(css = "area[alt*='Fish']")
    private WebElement FishImg;

    @FindBy(css = "area[alt*='Dogs']")
    private WebElement DogsImg;

    @FindBy(css = "area[alt*='Cats']")
    private WebElement CatsImg;

    @FindBy(css = "area[alt*='Reptiles']")
    private WebElement ReptilesImg;

    @FindBy(xpath = "//area[@alt='Birds'][2]")
    private WebElement BirdsImg;

    @FindBy(xpath = "//area[@alt='Birds'][1]")
    private WebElement BirdsBigImg;

    @Step("Getting is the main image is displayed")
    public boolean isMainImageDisplayed() {
        WaitForElement.waitUntilElementIsVisible(mainImageContent);
        log().info("Returned boolean value-dependent if main image is displayed");
        return mainImageContent.isDisplayed();
    }

    @Step("Click on sidebar fish link")
    public AnimalPage clickOnSidebarFishLink(){
        WaitForElement.waitUntilElementIsClickable(sidebarFishLink);
        sidebarFishLink.click();
        log().info("Clicked on sidebar fish link");
        return new AnimalPage();
    }

    @Step("Click on sidebar dogs link")
    public AnimalPage clickOnSidebarDogsLink(){
        WaitForElement.waitUntilElementIsClickable(sidebarDogsLink);
        sidebarDogsLink.click();
        log().info("Clicked on sidebar dogs link");
        return new AnimalPage();
    }

    @Step("Click on sidebar cats link")
    public AnimalPage clickOnSidebarCatsLink(){
        WaitForElement.waitUntilElementIsClickable(sidebarCatsLink);
        sidebarCatsLink.click();
        log().info("Clicked on sidebar cats link");
        return new AnimalPage();
    }

    @Step("Click on sidebar reptiles link")
    public AnimalPage clickOnSidebarReptilesLink(){
        WaitForElement.waitUntilElementIsClickable(sidebarReptilesLink);
        sidebarReptilesLink.click();
        log().info("Clicked on sidebar reptiles link");
        return new AnimalPage();
    }

    @Step("Click on sidebar birds link")
    public AnimalPage clickOnSidebarBirdsLink(){
        WaitForElement.waitUntilElementIsClickable(sidebarBirdsLink);
        sidebarBirdsLink.click();
        log().info("Clicked on sidebar birds link");
        return new AnimalPage();
    }

    @Step("Click on fish image")
    public AnimalPage clickOnFishImg(){
        WaitForElement.waitUntilElementIsClickable(FishImg);
        FishImg.click();
        log().info("Clicked on fish image");
        return new AnimalPage();
    }

    @Step("Click on dogs image")
    public AnimalPage clickOnDogsImg(){
        WaitForElement.waitUntilElementIsClickable(DogsImg);
        DogsImg.click();
        log().info("Clicked on dogs image");
        return new AnimalPage();
    }

    @Step("Click on cats image")
    public AnimalPage clickOnCatsImg(){
        WaitForElement.waitUntilElementIsClickable(CatsImg);
        CatsImg.click();
        log().info("Clicked on cats image");
        return new AnimalPage();
    }

    @Step("Click on reptiles image")
    public AnimalPage clickOnReptilesImg(){
        WaitForElement.waitUntilElementIsClickable(ReptilesImg);
        ReptilesImg.click();
        log().info("Clicked on reptiles image");
        return new AnimalPage();
    }

    @Step("Click on birds image")
    public AnimalPage clickOnBirdsImg(){
        WaitForElement.waitUntilElementIsClickable(BirdsImg);
        BirdsImg.click();
        log().info("Clicked on birds image");
        return new AnimalPage();
    }

    @Step("Click on birds big image")
    public AnimalPage clickOnBirdsBigImg(){
        WaitForElement.waitUntilElementIsClickable(BirdsBigImg);
        BirdsBigImg.click();
        log().info("Clicked on birds big image");
        return new AnimalPage();
    }
}
