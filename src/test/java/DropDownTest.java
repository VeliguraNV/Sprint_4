import org.example.HomePage;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DropDownTest {
    @Test
    public void fristDropdownPositiveTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        HomePage objHomePage = new HomePage(driver);

        WebElement element = driver.findElement(By.className("Home_FourPart__1uthg"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);

        objHomePage.clickFirstAccordion();
        String expectedText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElementLocated(By.id("accordion__panel-0"), expectedText));
driver.quit();
    }

}