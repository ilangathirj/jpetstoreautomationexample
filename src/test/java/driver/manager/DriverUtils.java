package driver.manager;

import io.qameta.allure.Step;

public class DriverUtils {

    public static void setInitialConfiguration() {
        DriverManager.getWebDriver().manage().window().maximize();
    }

    @Step("Navigating to URL: {pageUrl}")
    public static void navigateToPage(String pageUrl) {
        DriverManager.getWebDriver().navigate().to(pageUrl);
    }

    public static String getActualUrl(){return DriverManager.getWebDriver().getCurrentUrl();}
}
