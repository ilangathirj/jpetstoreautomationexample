package page.objects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waits.WaitForElement;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//tr/td[3]")
    private WebElement searchResult;

    @Step("Get search result")
    public String getSearchResult() {
        WaitForElement.waitUntilElementIsVisible(searchResult);
        log().info("Got search result");
        return searchResult.getText();
    }
}
