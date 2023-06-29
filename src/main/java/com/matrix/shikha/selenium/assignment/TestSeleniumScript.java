package com.matrix.shikha.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSeleniumScript {

    @Test
    public void verifyTitle() {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.sephora.com/ca/en/");

        String actualTitle = driver.getTitle();

        System.out.println("Actual title:" + " " + actualTitle);

        //String expectedTitle = "Sephora";

        String expectedTitle = "Makeup, Skincare, Fragrance, Hair & Beauty Products | Sephora";

        Assert.assertEquals(actualTitle, expectedTitle);

        driver.manage().window().maximize();

        driver.close();

        //driver.quit();
    }
}
