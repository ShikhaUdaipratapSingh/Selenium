package com.matrix.shikha.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTestngSeleniumScript {

    @Test
    public void verifyTitle() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "//Users//shikhasingh//Java-Selenium//Driver//chromedriver");

        WebDriver driver = new ChromeDriver(); // to initiate the browser

        driver.get("https://www.saucedemo.com/"); //get method is calling from Remote webdriver because there is not get method present in chromedriver - polymorphism

        String actualTitle = driver.getTitle();

        System.out.println("Actual Title :" +actualTitle);

        String expectedTitle = "Swag Labs";

        Assert.assertEquals(actualTitle, expectedTitle);

        driver.manage().window().maximize();

        //driver.close();
    }
}
