package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class FishPage extends AnimalPage{
    @FindBy(css = "a[href*='FI-SW-01']")
    private WebElement AngelfishLink;

    @FindBy(css = "a[href*='FI-SW-02']")
    private WebElement TigerSharkLink;

    @FindBy(css = "a[href*='FI-FW-01']")
    private WebElement KoiLink;

    @FindBy(css = "a[href*='FI-FW-02']")
    private WebElement GoldfishLink;

    @Step("Click on Angelfish link")
    public void clickOnAngelfishLink(){
        WaitForElement.waitUntilElementIsClickable(AngelfishLink);
        AngelfishLink.click();
        log().info("Clicked on Angelfish link");
    }

    @Step("Click on Tiger Shark link")
    public void clickOnTigerSharkLink(){
        WaitForElement.waitUntilElementIsClickable(TigerSharkLink);
        TigerSharkLink.click();
        log().info("Clicked on Tiger Shark link");
    }

    @Step("Click on Koi link")
    public void clickOnKoiLink(){
        WaitForElement.waitUntilElementIsClickable(KoiLink);
        KoiLink.click();
        log().info("Clicked on Koi link");
    }

    @Step("Click on Goldfish link")
    public void clickOnGoldfishLink(){
        WaitForElement.waitUntilElementIsClickable(GoldfishLink);
        GoldfishLink.click();
        log().info("Clicked on Goldfish link");
    }
}
