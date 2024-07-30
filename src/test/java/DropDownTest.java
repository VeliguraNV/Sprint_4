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
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOf(driver.findElement(By.className("App_CookieConsent__1yUIN"))));
objHomePage.clickCookieButton();
        objHomePage.clickFirstAccordion();
        String expectedText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElementLocated(By.id("accordion__panel-0"), expectedText));

objHomePage.clickSecondAccordion();
        String secondExpectedText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElementLocated(By.id("accordion__panel-1"), secondExpectedText));

        objHomePage.clickThirdAccordion();
        String thirdExpectedText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElementLocated(By.id("accordion__panel-2"), thirdExpectedText));

        objHomePage.clickFourthAccordion();
        String fourthExpectedText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElementLocated(By.id("accordion__panel-3"), fourthExpectedText));

        objHomePage.clickFifthAccordion();
        String fifthExpectedText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElementLocated(By.id("accordion__panel-4"), fifthExpectedText));

        objHomePage.clickSixthAccordion();
        String sixthExpectedText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElementLocated(By.id("accordion__panel-5"), sixthExpectedText));

        objHomePage.clickSeventhAccordion();
        String seventhExpectedText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElementLocated(By.id("accordion__panel-6"), seventhExpectedText));

        objHomePage.clickEighthAccordion();
        String eighthExpectedText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.textToBePresentInElementLocated(By.id("accordion__panel-7"), eighthExpectedText));

        driver.quit();
    }

    }
