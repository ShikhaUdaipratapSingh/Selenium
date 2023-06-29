package com.matrix.shikha.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class JavaScriptExecutorTest {

    @Test
    public void verifyJsExecutor() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;


        //To get the Title
        String title = js.executeScript("return document.title").toString();
        System.out.println("This is a title "+title);

        //To get URL of application
        String url = js.executeScript("return document.URL").toString();
        System.out.println("This is a URL "+url);

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        //To refresh the page
        js.executeScript("location.reload()");

        //To go backwards
        js. executeScript("history.back()");

        //To go forwards
        js.executeScript("history.forward()");

        //To click on an element
        WebElement btnLogin = driver.findElement(By.id("login-button"));
        js.executeScript("arguments[0].click()", btnLogin);

        //To enter the text in textfield
        js.executeScript("document.getElementById('user-name').value='standard_user'");

        //To scroll to bottom
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        //To scroll to top
        js.executeScript("window.scrollTo(0,0)");

        //To scroll until the elements are visible
//        WebElement element = driver.findElement(By.xpath("//*[text()='OrangeHRM OS 5.1']"));
//        js.executeScript("arguments[0].scrollintoview(true)", element);

    }
}
