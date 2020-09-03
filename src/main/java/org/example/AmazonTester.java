package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTester implements Tester {
    public void test(WebDriver driver) {
        driver.get("http://www.amazon.com/");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        element.click();
        element.sendKeys("iphone");
        WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-text\"]/input"));
        searchElement.click();
        WebElement customerServiceLink= driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
        customerServiceLink.click();
        WebElement cartLink = driver.findElement(By.xpath("//*[@id=\"nav-cart-count\"]"));
        cartLink.click();
    }
}
