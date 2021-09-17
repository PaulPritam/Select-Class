package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Waits {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pritam Paul\\Downloads\\demo1\\MethodsofSelect\\" +
                "src\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        WebElement firstName = driver.findElement(By.name("firstname"));
        WebElement lastname = driver.findElement(By.name("lastname"));
        WebElement phone = driver.findElement(By.name("reg_email__"));
        WebElement password = driver.findElement(By.name("reg_passwd__"));

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOf(firstName));

//        sendKeys(driver,firstName,20,"Sam");
//        sendKeys(driver,lastname,20,"Smith");



    }

//    public static void sendKeys(WebDriver driver, WebElement element, int time, String input) {
//        new WebDriverWait(driver,time).until(ExpectedConditions.visibilityOf(element));
//        element.sendKeys(input);
//    }

//    public static void click(WebDriver driver, WebElement element, int time) {
//        new WebDriverWait(driver, time).
//                until(ExpectedConditions.elementToBeClickable(element));
//        element.click();
//    }


}
