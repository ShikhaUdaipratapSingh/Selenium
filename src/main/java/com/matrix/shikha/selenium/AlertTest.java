package com.matrix.shikha.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertTest {

    @Test
    public void verifyAlertPopUps() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
        Alert alert1 = driver.switchTo().alert();

        Thread.sleep(2000);
        String alertText = alert1.getText();
        System.out.println("AlertText " +alertText);
        //It will click on 'OK' button
        alert1.accept();



        driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        Thread.sleep(2000);
        alert1.dismiss();

        driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Alert alert2 = driver.switchTo().alert();
        Thread.sleep(2000);
        alert2.sendKeys("Welcome Shikha");
        Thread.sleep(2000);
        alert2.accept();


//        //It will click on 'Cancel' button
//        alert1.dismiss();
//
//        //To enter String value in text field of prompt box
//        alert1.sendKeys("xyz");
//
//
//        //It will fetch the text present in Alert Box
//        alert1.getText();


    }
}
