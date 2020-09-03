package org.example;

import org.openqa.selenium.WebDriver;

public class Solution {

    public static void main(String[] args) throws InterruptedException {
       // WebDriver chromeDriver = DriverManager.getDriver(DriverManager.DriverType.GOOGLE_CHROME);
        WebDriver firefoxDriver = DriverManager.getDriver(DriverManager.DriverType.FIREFOX);

        DemoTester tester = new DemoTester();

        tester.test(firefoxDriver);


        System.out.println(" "+ firefoxDriver.getTitle());
    }
}
