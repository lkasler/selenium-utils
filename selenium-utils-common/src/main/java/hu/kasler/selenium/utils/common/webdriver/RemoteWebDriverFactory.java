package hu.kasler.selenium.utils.common.webdriver;

/**
 * Webdriver factory.
 */

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;

public interface RemoteWebDriverFactory {

    /**
     * Returns remote webdriver, accessing remote browser via selenium server using browser capabilities
     *
     * @param seleniumServerUrl selenium server url
     * @param capabilities browser type capabilities, use seleniums DesiredCapabilities functions to achieve an instance
     * @return Webdriver
     */
    WebDriver getRemoteWebDriver(String seleniumServerUrl, Capabilities capabilities);
}
