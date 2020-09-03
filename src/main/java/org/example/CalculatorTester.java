package org.example;

import javafx.scene.control.Slider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CalculatorTester {
    public void test (WebDriver driver){
        driver.get("https://emicalculator.net/");
        WebElement homeamount = driver.findElement(By.cssSelector("#loanamountslider > span"));
        WebElement interestrate = driver.findElement(By.cssSelector("#loaninterestslider > span:nth-child(2)"));
        WebElement loantenure = driver.findElement(By.cssSelector("#loantermslider > span:nth-child(2)"));
        Actions action= new Actions(driver);
        //action.dragAndDropBy(homeamount,)
        // #loanamountslider > span
        //*[@id="loanamountslider"]/span
    }
}
