package com.matrix.shikha.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyboardActions {
    private WebDriver driver;
    private String url = "https://www.saucedemo.com/";

    @BeforeMethod
    public void initBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test
    public void verifyKeyboardActions() {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("user-name"));
        actions.keyDown(element, Keys.SHIFT).sendKeys("shikha").keyUp(Keys.SHIFT).build().perform();
        actions.doubleClick().build().perform();
    }

}
