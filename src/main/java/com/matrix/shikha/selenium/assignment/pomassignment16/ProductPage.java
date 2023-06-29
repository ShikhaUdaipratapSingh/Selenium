package com.matrix.shikha.selenium.assignment.pomassignment16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {this.driver = driver;}

    public void navigateToProductPage() throws InterruptedException {

        WebElement ddlSize = driver.findElement(By.id("group_1"));
        Select size = new Select(ddlSize);
        size.selectByVisibleText("M");
        driver.findElement(By.name("Yellow")).click();
        driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
        Thread.sleep(5000);
        Actions actions = new Actions(driver);
        WebElement proceedCheckout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
        actions.moveToElement(proceedCheckout).click().build().perform();


    }


}
