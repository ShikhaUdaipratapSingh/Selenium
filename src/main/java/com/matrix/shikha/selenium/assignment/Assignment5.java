package com.matrix.shikha.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment5 {

//    Scenario
//    Steps:
//    Login to application https://www.saucedemo.com
//    Print the count of total products displayed on the products page

    @Test
    public void verifyProductCount() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        driver.manage().window().maximize();

        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        List<WebElement> listOfProducts = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        System.out.println("Number of Products: " +listOfProducts.size());

        System.out.println(" using for each loop");



        for (WebElement elements : listOfProducts) {
            String names = elements.getText();
            System.out.println(names);

        }

        System.out.println("using for loop");

        for (int i=0; i < listOfProducts.size(); i++) {
            WebElement element = listOfProducts.get(i);
            System.out.println(element.getText());

        }

    }
}
