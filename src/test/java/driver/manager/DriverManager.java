package driver.manager;

import driver.BrowserFactory;
import driver.listeners.WebDriverEventListenerRegistrar;
import org.openqa.selenium.WebDriver;

import static configuration.TestRunProperties.getBrowserToRun;
import static configuration.TestRunProperties.getIsRemoteRun;
import static driver.BrowserType.FIREFOX;

public class DriverManager {

    private static WebDriver driver;

    private DriverManager() {
    }

    public static WebDriver getWebDriver() {

        if (driver == null) {
            driver = new BrowserFactory(getBrowserToRun(), getIsRemoteRun()).getBrowser();
            driver = WebDriverEventListenerRegistrar.registerWebDriverEventListener(driver);
        }

        return driver;
    }

    public static void disposeDriver() {
        driver.close();
        if (!getBrowserToRun().equals(FIREFOX)) {
            driver.quit();
        }
        driver = null;
    }
}
