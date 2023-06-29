package com.matrix.shikha.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigations {

    @Test
    public void verifyNavigationCommands() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        WebDriver.Navigation nav = driver.navigate();
        nav.to("https://demo.opencart.com/");
        //driver.navigate().to("https://www.opencart.com/");

        //**to(URL)**

        //by creating object
        //URL url = new URL("https://demo.opencart.com/");
        //driver.navigate().to(url);

        // driver.navigate().to(new URL("https://demo.opencart.com/"));
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Tablets']")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();

    }
}
