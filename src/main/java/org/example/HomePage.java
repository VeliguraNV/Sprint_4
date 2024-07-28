package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By firstAccordion = By.id("accordion__heading-0"); //первый аккордеон
    private By headerButtonOrder = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']"); // кнопка "Заказать" в хедере
    private By bigButtonOrder = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']"); // кнопка "Заказать" внизу

    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public void clickFirstAccordion() {
        driver.findElement(firstAccordion).click();
    }
    public void clickHeaderButtonOrder() {
        driver.findElement(headerButtonOrder).click();
    }
    public void clickBigButtonOrder() {
        driver.findElement(bigButtonOrder).click();
    }
}
