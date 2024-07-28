package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 public class OrderPage1 {
    private WebDriver driver;
    private By inputFirstName = By.xpath("//input[@placeholder='* Имя']");
    private By inputSecondName = By.xpath("//input[@placeholder='* Фамилия']");
    private  By inputAddress = By.xpath("//input[@placeholder='* Адрес: куда привезти заказ']");
    private By inputMetroStation = By.xpath("//input[@placeholder='* Станция метро']");
    private By inputTelephoneNumber = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");

    private By buttonNext = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    public OrderPage1(WebDriver driver) {
        this.driver=driver;
    }

    public void OrderPage1(WebDriver driver) {
    this.driver = driver;
}
public void setFirstName(String firstName) {
    driver.findElement(inputFirstName).sendKeys(firstName);
}
public void setSecondName(String secondName) {
    driver.findElement(inputSecondName).sendKeys(secondName);
}
public void setAddress(String address) {
    driver.findElement(inputAddress).sendKeys(address);
}
public void setInputMetroStation() {
    driver.findElement(inputMetroStation).click();
    driver.findElement(By.xpath(".//div[@class='Order_Text__2broi' and text()='Сокольники']")).click();

    }
    public void setTelephoneNumber(String telephoneNumber) {
    driver.findElement(inputTelephoneNumber).sendKeys(telephoneNumber);
    }
    public void clickButtonNext(){
        driver.findElement(buttonNext).click();
    }
}
