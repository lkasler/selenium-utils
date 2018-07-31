package hu.kasler.selenium.utils.common.webdriver;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Default Webdriver factory implementation.
 */
public class DefaultWebDriverFactory implements WebDriverFactory {
    @Override
    public WebDriver getWebDriver(DriverManagerType driverManagerType) {
        WebDriver webDriver = null;
        WebDriverManager.getInstance(driverManagerType).setup();
        switch (driverManagerType) {
            case CHROME:
                webDriver = new ChromeDriver();
                break;
            case FIREFOX:
                webDriver = new FirefoxDriver();
                break;
            case EDGE:
                webDriver = new EdgeDriver();
                break;
            default:
                throw new UnsupportedOperationException(String.format("We don't support %s yet!", driverManagerType));

        }
        return webDriver;
    }
}
