package com.matrix.shikha.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Assignment14 {

    @Test
    public void verifyJSExecutor() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;


        //1.Get the title
        String title = js.executeScript("return document.title").toString();
        System.out.println("This is the title: "+title);

        //2. To Enter Username
        js.executeScript("document.getElementById('email').value='shikha.prasang@gmail.com'");

        //3. To enter password
        js.executeScript("document.getElementById('pass').value='Shikha@11'");

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

       //4. To click on login button
        WebElement btnLogin = driver.findElement(By.name("login"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", btnLogin);

        //To scrolldown
        //js.executeScript("window.scrollBy(0, 500)");

        //Thread.sleep(1000);

        //Click on Groups
        WebElement lnkGroup = driver.findElement(By.xpath("//span[text()='Groups']"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].click();", lnkGroup);

        //To go backwards
        js.executeScript("history.back()");

        Thread.sleep(5000);

        driver.close();

    }
}
