package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class TopMenuPage extends BasePage {

    @FindBy(css = "a img[src*='logo']")
    private WebElement storeLogo;

    @FindBy(name = "img_cart")
    private WebElement cartImage;

    @FindBy(css = "a[href*='signonForm']")
    private WebElement signInLink;

    @FindBy(css = "a[href*='help']")
    private WebElement helpLink;

    @FindBy(css = "input[name='keyword']")
    private WebElement searchField;

    @FindBy(css = "input[name='searchProducts']")
    private WebElement searchButton;

    @FindBy(css = "#QuickLinks img[src*='fish']")
    private WebElement fishLink;

    @FindBy(css = "#QuickLinks img[src*='dogs']")
    private WebElement dogsLink;

    @FindBy(css = "#QuickLinks img[src*='reptiles']")
    private WebElement reptilesLink;

    @FindBy(css = "#QuickLinks img[src*='cats']")
    private WebElement catsLink;

    @FindBy(css = "#QuickLinks img[src*='birds']")
    private WebElement birdsLink;

    @Step("Getting is store logo is displayed")
    public boolean isStoreLogoDisplayed() {
        WaitForElement.waitUntilElementIsVisible(storeLogo);
        log().info("Returned boolean value-dependent if store logo is displayed");
        return storeLogo.isDisplayed();
    }

    @Step("Click on store logo")
    public void clickOnStoreLogo(){
        WaitForElement.waitUntilElementIsClickable(storeLogo);
        storeLogo.click();
        log().info("Clicked on store logo");
    }

    @Step("Click on cart image")
    public void clickOnCartImage(){
        WaitForElement.waitUntilElementIsClickable(cartImage);
        cartImage.click();
        log().info("Clicked on cart image");
    }

    @Step("Click on sign-in link")
    public void clickOnSignInLink(){
        WaitForElement.waitUntilElementIsClickable(signInLink);
        signInLink.click();
        log().info("Clicked on sign-in link");
    }

    @Step("Click on help link")
    public void clickOnHelpLink(){
        WaitForElement.waitUntilElementIsClickable(helpLink);
        helpLink.click();
        log().info("Clicked on help link");
    }

    @Step("Fill search field")
    public TopMenuPage fillSearch(String search){
        WaitForElement.waitUntilElementIsClickable(searchField);
        searchField.sendKeys(search);
        log().info("Filled search field");
        return this;
    }

    @Step("Click on search button")
    public SearchPage clickOnSearchButton(){
        WaitForElement.waitUntilElementIsClickable(searchButton);
        searchButton.click();
        log().info("Clicked on search button");
        return new SearchPage();
    }

    @Step("Click on fish link")
    public AnimalPage clickOnFishLink(){
        WaitForElement.waitUntilElementIsClickable(fishLink);
        fishLink.click();
        log().info("Clicked on fish link");
        return new AnimalPage();
    }

    @Step("Click on dogs link")
    public AnimalPage clickOnDogsLink(){
        WaitForElement.waitUntilElementIsClickable(dogsLink);
        dogsLink.click();
        log().info("Clicked on dogs link");
        return new AnimalPage();
    }

    @Step("Click on reptiles link")
    public AnimalPage clickOnReptilesLink(){
        WaitForElement.waitUntilElementIsClickable(reptilesLink);
        reptilesLink.click();
        log().info("Clicked on reptiles link");
        return new AnimalPage();
    }

    @Step("Click on cats link")
    public AnimalPage clickOnCatsLink(){
        WaitForElement.waitUntilElementIsClickable(catsLink);
        catsLink.click();
        log().info("Clicked on cats link");
        return new AnimalPage();
    }

    @Step("Click on birds link")
    public AnimalPage clickOnBirdsLink(){
        WaitForElement.waitUntilElementIsClickable(birdsLink);
        birdsLink.click();
        log().info("Clicked on birds link");
        return new AnimalPage();
    }
}
