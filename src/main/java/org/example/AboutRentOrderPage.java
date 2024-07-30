package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutRentOrderPage {
    private WebDriver driver;
    private By inputDeliveryDate = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
private By set2August = By.xpath("//div[@aria-label='Choose пятница, 2-е августа 2024 г.']");
    private By inputRentalPeriod = By.xpath("//div[@class='Dropdown-placeholder']");
    private By inputTwoDaysRent = By.xpath("//div[@class='Dropdown-option' and text()='двое суток']");
private By blackColor = By.id("black");

private By inputComment = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
private By buttonOrder = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    public AboutRentOrderPage(WebDriver driver) {
        this.driver=driver;
    }

    public void setInputDeliveryDate() {
        driver.findElement(inputDeliveryDate).click();
    driver.findElement(set2August).click();
}
public void setInputRentalPeriod2days() {
    driver.findElement(inputRentalPeriod).click();
    driver.findElement(inputTwoDaysRent).click();
}
public void setBlackColor() {
    driver.findElement(blackColor).click();
}
public void setInputComment(String comment) {
    driver.findElement(inputComment).sendKeys(comment);
}
public void clickButtonOrder() {
    driver.findElement(buttonOrder).click();
}
}

