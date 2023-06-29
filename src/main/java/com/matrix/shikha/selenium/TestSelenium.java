package com.matrix.shikha.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestSelenium {

    public static void main(String[] args) {
        // Scenario 1:
        // 1. Open Chrome browser
        // 2. Navigate to https://www.saucedemo.com/ application
        // 3. Get the title (Actual Title : Which is coming from Application)
        // 4. Compare the title with Expected title (This is the expectations of the client)

        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver", "//Users//shikhasingh//Java-Selenium//Driver//chromedriver");
        WebDriver driver = new ChromeDriver(); // to initiate the browser
        driver.get("https://www.saucedemo.com/"); //get method is calling from Remote webdriver because there is not get method present in chromedriver - polymorphism
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title :" +actualTitle);
        String expectedTitle = "Swag Labs";

//        // Verification/Assertion
//        if(actualTitle.equals(expectedTitle)) {
//            System.out.println("Test case is pass");
//        } else {
//            System.out.println("Test case is fail");
//        }

        Assert.assertEquals(actualTitle, expectedTitle);
    }
}
