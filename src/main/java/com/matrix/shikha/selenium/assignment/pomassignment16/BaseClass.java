package com.matrix.shikha.selenium.assignment.pomassignment16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    /*Scenario: Verify that Total Price is reflecting correctly if the user changes quantity on 'Shopping Cart Summary' Page.
Steps to Automate:
1. Open link http://automationpractice.com/index.php
2. Login to the website.
3. Move your cursor over the Dresses link.
4. Click on the sub menu ‘Summer Dresses’.
5. Mouse hover on the second product(Printed Summer Dresses) displayed.
6. 'More' button will be displayed, click on the 'More' button.
7. Make sure the quantity is set to 1.
8. Select size 'M'
9. Select the color of your choice.
10. Click the 'Add to Cart' button.
11. Click the 'Proceed to checkout' button.
12. Change the quantity to 2.
13. Verify that Total price is changing and reflecting the correct price.*/

    public WebDriver initBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        return driver;
    }

    public Properties readProperties() throws IOException {
        String projectPath = System.getProperty("user.dir");
        File file = new File(projectPath + "src/main/java/com/matrix/shikha/selenium/assignment/pomassignment16/config.properties");
        FileInputStream fin = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fin);
        return prop;

    }

}
