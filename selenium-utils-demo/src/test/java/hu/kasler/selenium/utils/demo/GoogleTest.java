package hu.kasler.selenium.utils.demo;


import hu.kasler.selenium.utils.common.webdriver.DefaultWebDriverFactory;
import hu.kasler.selenium.utils.common.webdriver.WebDriverFactory;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleTest {

    @Test
    void testWithChrome(){
        WebDriverFactory webDriverFactory = new DefaultWebDriverFactory();
        WebDriver driver = webDriverFactory.getWebDriver(DriverManagerType.CHROME);
        driver.get("http://www.google.com/ncr");
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("TestingBot");
        element.submit();

        System.out.println(driver.getTitle());
        driver.quit();
    }

}
