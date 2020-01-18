package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class TopMenuPage extends BasePage {

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    private WebElement signOnLink;

    @FindBy(css = "a img[src*='logo']")
    private WebElement storeLogo;

    @Step("Getting is store logo is displayed")
    public boolean isStoreLogoDisplayed() {
        WaitForElement.waitUntilElementIsVisible(storeLogo);
        log().info("Returned boolean value-dependent if store logo is displayed");
        return storeLogo.isDisplayed();
    }
}
