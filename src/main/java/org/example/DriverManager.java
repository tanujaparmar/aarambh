package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    public enum DriverType {
        FIREFOX,
        GOOGLE_CHROME
    }

    private static WebDriver firefoxDriver() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Tanuja\\workspace\\aarambh\\src\\main\\resources\\geckodriver.exe");
        return new FirefoxDriver();
    }

    private static WebDriver chromeDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tanuja\\workspace\\aarambh\\src\\main\\resources\\chromedriver.exe");
        return new ChromeDriver();
    }

    public static WebDriver getDriver(DriverType driverType) {
        if (driverType == DriverType.FIREFOX) {
            return firefoxDriver();
        } else if(driverType == DriverType.GOOGLE_CHROME) {
            return chromeDriver();
        }
        throw new RuntimeException("Failed to get Driver");
    }
}
