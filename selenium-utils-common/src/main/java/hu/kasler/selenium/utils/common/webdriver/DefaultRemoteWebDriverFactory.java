package hu.kasler.selenium.utils.common.webdriver;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class DefaultRemoteWebDriverFactory implements RemoteWebDriverFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultWebDriverFactory.class);

    @Override
    public WebDriver getRemoteWebDriver(String seleniumServerUrl, Capabilities capabilities) {
        try {
            return new RemoteWebDriver(new URL(seleniumServerUrl), capabilities);
        } catch (MalformedURLException e) {
            LOGGER.error("Wrong URL format: " + seleniumServerUrl);
            throw new IllegalArgumentException(e);
        }
    }

    public WebDriver getChromeRemoteWebdriver(String seleniumServerUrl){
        return getRemoteWebDriver(seleniumServerUrl, DesiredCapabilities.chrome());
    }

    public WebDriver getFirefoxRemoteWebdriver(String seleniumServerUrl){
        return getRemoteWebDriver(seleniumServerUrl, DesiredCapabilities.firefox());
    }
}
