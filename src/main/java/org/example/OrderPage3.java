package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage3 {
    private WebDriver driver;


    private  By confirmButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    private By cancelButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i' and text()='Нет']");


    public OrderPage3(WebDriver driver) {
        this.driver = driver;
    }
    public void clickConfirmButton() {
        driver.findElement(confirmButton).click();
    }
}