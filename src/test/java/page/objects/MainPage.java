package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class MainPage extends BasePage {

    @FindBy(id = "MainImageContent")
    private WebElement mainImageContent;

    @Step("Getting is the main image is displayed")
    public boolean isMainImageDisplayed() {
        WaitForElement.waitUntilElementIsVisible(mainImageContent);
        log().info("Returned boolean value-dependent if main image is displayed");
        return mainImageContent.isDisplayed();
    }
}
