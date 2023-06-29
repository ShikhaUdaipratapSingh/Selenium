package com.matrix.shikha.selenium.assignment.POMAssignment13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class RegistrationPage {

    WebDriver driver;
    public RegistrationPage(WebDriver driver) {this.driver = driver; }

    public void navigateToMyAccount() {
        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.xpath("//a[text()='Register']")).click();

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("input-firstname"));
        actions.keyDown(element, Keys.SHIFT).sendKeys("shikha").build().perform();
        element.sendKeys(Keys.COMMAND + "a" ) ;
        element.sendKeys(Keys.COMMAND + "c");
        WebElement target = driver.findElement(By.id("input-password"));
        target.sendKeys(Keys.COMMAND + "v");


    }


}
