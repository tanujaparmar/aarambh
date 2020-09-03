package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookTester implements Tester {
    public void test(WebDriver driver) {
        driver.get("https://www.facebook.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
        element.sendKeys("tanuparmar7@gmail.com");

        WebElement passwordElement = driver.findElement(By.xpath("//input[@name='pass']"));
        passwordElement.sendKeys("1234567");

        WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
        button.click();
    }
}
