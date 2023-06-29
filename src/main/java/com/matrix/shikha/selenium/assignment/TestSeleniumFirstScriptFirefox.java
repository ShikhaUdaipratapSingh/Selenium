package com.matrix.shikha.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSeleniumFirstScriptFirefox {

    // Scenario 1:
    // 1. Open Firefox browser
    // 2. Navigate to https://www.saucedemo.com/ application
    // 3. Get the title (Actual Title : Which is coming from Application)
    // 4. Compare the title with Expected title (This is the expectations of the client)

    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        //System.setProperty("webdriver.gecko.driver", "//Users//shikhasingh//Java-Selenium//Driver//geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com/");
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title" +actualTitle);
        String expectedTitle = "Swag Labs";

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test case is Pass");
                    }
        else {
            System.out.println("Test case is fail");
        }

    }
}
