package hu.kasler.selenium.utils.common.webdriver;

/**
 * Webdriver factory.
 */

import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.WebDriver;

public interface WebDriverFactory {

     /**
      * Returns the requested driverManagerType's WebDriver.
      * @param driverManagerType driver manager type representing browser
      * @return Webdriver
      */
    WebDriver getWebDriver(DriverManagerType driverManagerType);
}
