package com.matrix.shikha.selenium.assignment.PageObjectModelAssignment12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {

    WebDriver driver;
     public CheckoutOverviewPage(WebDriver driver) {
         this.driver = driver;
     }

    public void navigateToCheckoutPage() {

        driver.findElement(By.xpath("//button[@name='checkout']")).click();
        driver.findElement(By.name("firstName")).sendKeys("Shikha");
        driver.findElement(By.name("lastName")).sendKeys("Singh");
        driver.findElement(By.name("postalCode")).sendKeys("H4R2A8");
        driver.findElement(By.name("continue")).click();
        driver.findElement(By.name("finish")).click();

    }
}

