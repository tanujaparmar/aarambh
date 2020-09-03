package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class DemoTester {
    public void test(WebDriver driver) throws InterruptedException {
        openDemoQaSite(driver);
        clickElement(driver);

        Thread.sleep(1000);
        testTextBox(driver);
        Thread.sleep(2000);
        testCheckBox(driver);
        Thread.sleep(2000);
        testRadioButton(driver);
        Thread.sleep(2000);
        testWebTables(driver);
        Thread.sleep(2000);
        testButton(driver);
        testLinks(driver);
        testUploadsDownloads(driver);
        testDynamicProperties(driver);
        testTextBox(driver);
    }

    private void openDemoQaSite(WebDriver driver) {
        driver.get("http://www.demoqa.com/");
    }

    private void clickElement(WebDriver driver) {
        driver.findElement(
                By.cssSelector("div.card:nth-child(1) > div:nth-child(1) > div:nth-child(2) > svg:nth-child(1)")
        ).click();
    }

    private WebElement getTextBoxElement(WebDriver driver) {
        return driver.findElement(By.cssSelector(".show > ul:nth-child(1) > li:nth-child(1) > span:nth-child(2)"));
    }

    private WebElement getFullNameElement(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"userName\"]"));
    }

    private WebElement getEmailElement(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
    }

    private WebElement getCurrentAddressElement(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
    }

    private WebElement getPermanentAddressElement(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
    }

    private void clickSubmitButton(WebDriver driver) {
        WebElement submitElement = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submitElement.click();

    }

    private void testTextBox(WebDriver driver) throws InterruptedException {
        getTextBoxElement(driver).click();
        Thread.sleep(2000);
        getFullNameElement(driver).sendKeys("Osmando");
        getEmailElement(driver).sendKeys("osmando@gmail.com");
        getCurrentAddressElement(driver).sendKeys("House no-4 street 2");
        getPermanentAddressElement(driver).sendKeys("House no-4 street 2");
        Thread.sleep(3000);
        clickSubmitButton(driver);
        // check if the data is saved or not

        WebElement nameElement = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        if (nameElement.isDisplayed()) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test not passed");
        }

        WebElement emailElement = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        if (emailElement.isDisplayed()) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test Not passed");
        }

        WebElement currentAddress =driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
        if (currentAddress.isDisplayed()) {
            System.out.println("Test passed");
        }else {
            System.out.println("Test Not passed");
        }

        WebElement permanentAddress = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
        if (permanentAddress.isDisplayed()) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test Not passed");
        }


    }

    private void testCheckBox(WebDriver driver) {
        WebElement checkBoxElement = driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
        checkBoxElement.click();
        WebElement homeElement = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[3]"));
        homeElement.click();
    }

    private void testRadioButton(WebDriver driver){
        WebElement radioButtonElement = driver.findElement(By.xpath("//*[@id=\"item-2\"]/span"));
        radioButtonElement.click();
        WebElement gradesElement = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/label"));
        gradesElement.click();



    }

    private WebElement getWebTablesElement(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"item-3\"]"));
    }
    private WebElement getEditCierraElement(WebDriver driver){
        return driver.findElement(By.cssSelector("#edit-record-1 > svg:nth-child(1) > path:nth-child(1)"));
    }
    private WebElement getSubmitElement(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"submit\"]"));
    }
    private WebElement getRowsElement(WebDriver driver) {
        return driver.findElement(By.cssSelector(".select-wrap > select:nth-child(1) > option:nth-child(4)"));
    }

    private void testWebTables(WebDriver driver) throws InterruptedException {
        getWebTablesElement(driver).click();
        // getEditCierraElement(driver).click();
        // Thread.sleep(2000);
        // getSubmitElement(driver).click();
        Thread.sleep(2000);

        WebElement rowsElement = getRowsElement(driver);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rowsElement);
        rowsElement.click();

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(500);
    }

    private WebElement getButtonElement(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"item-4\"]/span"));
    }

    private WebElement getDoubleClickMe(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));

    }

    private WebElement getRightClickMe(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
    }

    private WebElement getClickMe(WebDriver driver){
        return driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[3]/button"));
    }

    private void testButton(WebDriver driver){
        getButtonElement(driver).click();
        Actions actions = new Actions(driver);
        actions.doubleClick(getDoubleClickMe(driver)).perform();
        actions.contextClick(getRightClickMe(driver)).perform();
        getClickMe(driver).click();//*[@id="nKqA6"]
    }


    private WebElement getLinksElement(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"item-5\"]"));
    }

    private WebElement getHome(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"simpleLink\"]"));
    }

    private WebElement getDynamicHome(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"dynamicLink\"]"));
    }

    private WebElement getCreated(WebDriver driver){
        return driver.findElement(By.xpath("//*[@id=\"created\"]"));
    }

    private void testLinks(WebDriver driver) throws InterruptedException {
        getLinksElement(driver).click();
        getHome(driver).click();

        Thread.sleep(2000);
        List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));

        getDynamicHome(driver).click();
        Thread.sleep(1000);
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(3000);
        getCreated(driver).click();
   }

   private  void testUploadsDownloads(WebDriver driver) throws InterruptedException {
        WebElement uploadDownload = driver.findElement(By.xpath("//*[@id=\"item-6\"]/span"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",uploadDownload);
        Thread.sleep(2000);
        uploadDownload.click();

        WebElement chooseFile = driver.findElement(By.xpath("//*[@id=\"uploadFile\"]"));
        chooseFile.click();
   }

   private void testDynamicProperties(WebDriver driver){
        WebElement dynamicProperties = driver.findElement(By.xpath("//*[@id=\"item-7\"]/span"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dynamicProperties);
        dynamicProperties.click();
   }
}