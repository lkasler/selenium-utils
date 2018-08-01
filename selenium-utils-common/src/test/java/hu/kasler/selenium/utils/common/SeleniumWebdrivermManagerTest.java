package hu.kasler.selenium.utils.common;


import hu.kasler.selenium.utils.common.webdriver.DefaultWebDriverFactory;
import hu.kasler.selenium.utils.common.webdriver.WebDriverFactory;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SeleniumWebdrivermManagerTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SeleniumWebdrivermManagerTest.class);

    @Test
    void testWithChrome() {
        WebDriverFactory webDriverFactory = new DefaultWebDriverFactory();
        WebDriver driver = webDriverFactory.getWebDriver(DriverManagerType.CHROME);
        driver.get("http://www.google.com/ncr");
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("Selenium");
        element.submit();

        LOGGER.info(driver.getTitle(), driver.getCurrentUrl());
        driver.quit();
    }

}
