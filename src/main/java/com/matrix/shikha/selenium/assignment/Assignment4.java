package com.matrix.shikha.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment4 {

//    Scenario
//    Login to application https://www.saucedemo.com
//    Click on the Add To Cart button of Sauce Labs Backpack product.
//    Checkout the item and place the order


    @Test
    public void addToCart() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");

        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("standard_user");

        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        WebElement addToCart = driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
        addToCart.click();

        WebElement cartButton = driver.findElement(By.className("shopping_cart_link"));
        cartButton.click();

        WebElement checkout = driver.findElement(By.name("checkout"));
        checkout.click();

        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Alicia");

        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("Keys");

        WebElement zipCode = driver.findElement(By.id("postal-code"));
        zipCode.sendKeys("H4R2A8");

        WebElement continueButton = driver.findElement(By.name("continue"));
        continueButton.click();

        WebElement finish = driver.findElement(By.name("finish"));
        finish.click();
        Thread.sleep(5000);

        WebElement backHome = driver.findElement(By.id("back-to-products"));
        backHome.click();

        WebElement options = driver.findElement(By.id("react-burger-menu-btn"));
        options.click();
        Thread.sleep(3000);

        WebElement logOut = driver.findElement(By.id("logout_sidebar_link"));
        logOut.click();
        Thread.sleep(3000);

        driver.close();
        driver.quit();
    }

}
