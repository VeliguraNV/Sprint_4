package org.example;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HomePage {
    private WebDriver driver;
    private By cookieButton = By.className("App_CookieButton__3cvqF");//кнопка принятия куки
    private By firstAccordion = By.id("accordion__heading-0"); //первый аккордеон
    private By secondAccordion = By.id("accordion__heading-1");// второй аккордеон
    private By thirdAccordion = By.id("accordion__heading-2");//3
    private By fourthAccordion = By.id("accordion__heading-3");//4
    private By fifthAccordion = By.id("accordion__heading-4");//5
    private By sixthAccordion = By.id("accordion__heading-5");//6
    private By seventhAccordion = By.id("accordion__heading-6");//7
    private By eighthAccordion = By.id("accordion__heading-7");//8

    private By headerButtonOrder = By.xpath(".//button[@class='Button_Button__ra12g' and text()='Заказать']"); // кнопка "Заказать" в хедере
    private By bigButtonOrder = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']"); // кнопка "Заказать" внизу

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCookieButton () {
        driver.findElement(cookieButton).click(); }
    public void clickFirstAccordion() {
        driver.findElement(firstAccordion).click();
    }
    public void clickSecondAccordion() {
        driver.findElement(secondAccordion).click();
    }
    public void clickThirdAccordion() {
        driver.findElement(thirdAccordion).click();
    }
    public void clickFourthAccordion() {
        driver.findElement(fourthAccordion).click();
    }
    public void clickFifthAccordion() {
        driver.findElement(fifthAccordion).click();
    }
    public void clickSixthAccordion() {
        driver.findElement(sixthAccordion).click();
    }
    public void clickSeventhAccordion() {
        driver.findElement(seventhAccordion).click();
    }
    public void clickEighthAccordion() {
        driver.findElement(eighthAccordion).click();;
    }
    public void clickHeaderButtonOrder() {
        driver.findElement(headerButtonOrder).click();
    }

    public void clickBigButtonOrder() {
        driver.findElement(bigButtonOrder).click();
    }


    }
