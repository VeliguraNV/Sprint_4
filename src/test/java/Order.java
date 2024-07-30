import org.example.HomePage;
import org.example.ForWhomOrderPage;
import org.example.AboutRentOrderPage;
import org.example.ConfirmOrderPage;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;

@RunWith(Parameterized.class)
public class Order {
    private final String firstName;
    private final String secondName;
    private final String address;
    private final String telephoneNumber;

    private final String comment;

    public Order(String firstName, String secondName, String address, String telephoneNumber, String comment) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
                this.comment = comment;
    }

    @Parameterized.Parameters

    public static Object[][] getCredentials() {

        return new Object[][]{
                {"Иван", "Иванов", "г.Москва, ул.Совесткая", "79057935489", "нет"},
                {"Петр", "Петров", "г.СПБ, ул.Совесткая", "89057928514", "Позвоните за час"},
        };
    }
@Before

        public void WebDriver() {
//    ChromeOptions options = new ChromeOptions();
//    options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
//   WebDriver driver = new ChromeDriver(options);
//    driver.get("https://qa-scooter.praktikum-services.ru/");
//    HomePage objHomePage = new HomePage(driver);
}
    @Test
    public void positiveOrderHeaderButton() {
                ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
     driver.get("https://qa-scooter.praktikum-services.ru/");
        HomePage objHomePage = new HomePage(driver);
        objHomePage.clickHeaderButtonOrder();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Content__bmtHS")));
        ForWhomOrderPage objForWhomOrderPage = new ForWhomOrderPage(driver);
        objForWhomOrderPage.setFirstName(firstName);
        objForWhomOrderPage.setSecondName(secondName);
        objForWhomOrderPage.setAddress(address);
        objForWhomOrderPage.setInputMetroStation();
        objForWhomOrderPage.setTelephoneNumber(telephoneNumber);
objForWhomOrderPage.clickButtonNext();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Checkboxes__3lWSI")));
        AboutRentOrderPage objAboutRentOrderPage = new AboutRentOrderPage(driver);

        objAboutRentOrderPage.setInputDeliveryDate();
        objAboutRentOrderPage.setInputRentalPeriod2days();
        objAboutRentOrderPage.setBlackColor();
        objAboutRentOrderPage.setInputComment(comment);
objAboutRentOrderPage.clickButtonOrder();
        ConfirmOrderPage objConfirmOrderPage = new ConfirmOrderPage(driver);
        objConfirmOrderPage.clickConfirmButton();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен'])")));
       driver.quit();
    }

@Test
    public void posiitveOrderBigButton() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");
        HomePage objHomePage = new HomePage(driver);

    WebElement element = driver.findElement(By.className("Home_RoadMap__2tal_"));
    ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    new WebDriverWait(driver, Duration.ofSeconds(5))
            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")));

        objHomePage.clickBigButtonOrder();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Content__bmtHS")));
        ForWhomOrderPage objForWhomOrderPage = new ForWhomOrderPage(driver);
        objForWhomOrderPage.setFirstName(firstName);
        objForWhomOrderPage.setSecondName(secondName);
        objForWhomOrderPage.setAddress(address);
        objForWhomOrderPage.setInputMetroStation();
        objForWhomOrderPage.setTelephoneNumber(telephoneNumber);
        objForWhomOrderPage.clickButtonNext();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.className("Order_Checkboxes__3lWSI")));
        AboutRentOrderPage objAboutRentOrderPage = new AboutRentOrderPage(driver);

        objAboutRentOrderPage.setInputDeliveryDate();
        objAboutRentOrderPage.setInputRentalPeriod2days();
        objAboutRentOrderPage.setBlackColor();
        objAboutRentOrderPage.setInputComment(comment);
        objAboutRentOrderPage.clickButtonOrder();
        ConfirmOrderPage objConfirmOrderPage = new ConfirmOrderPage(driver);
        objConfirmOrderPage.clickConfirmButton();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен'])")));
        driver.quit();
    }


}