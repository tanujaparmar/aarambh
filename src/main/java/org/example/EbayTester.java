package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbayTester implements Tester {
    public void test(WebDriver driver) {
        driver.get("http://www.ebay.com/");
        WebElement search = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]"));
        search.click();
        search.sendKeys("JBL speakers");
        WebElement DailyDeals = driver.findElement(By.xpath("//*[@id=\"gh-p-1\"]/a"));
        DailyDeals.click();
        driver.navigate().to("http://www.facebook.com/");
        driver.navigate().back();


    }
}
