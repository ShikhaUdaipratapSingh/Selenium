package com.matrix.shikha.selenium.assignment.PageObjectModelAssignment12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToHomePage() {

        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.xpath("//div[@class='shopping_cart_container']")).click();

    }
}
