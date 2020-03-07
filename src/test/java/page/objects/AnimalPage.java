package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class AnimalPage extends BasePage {
    @FindBy(css = "#Content h2")
    private WebElement header;

    @FindBy(css = "#BackLink a")
    private WebElement backLink;

    @Step("Get page header")
    public String getPageHeader() {
        WaitForElement.waitUntilElementIsVisible(header);
        log().info("Gotten page header");
        return header.getText();
    }

    @Step("Click on back link")
    public void clickOnBackLink() {
        WaitForElement.waitUntilElementIsClickable(backLink);
        backLink.click();
        log().info("Clicked on back link");
    }
}
