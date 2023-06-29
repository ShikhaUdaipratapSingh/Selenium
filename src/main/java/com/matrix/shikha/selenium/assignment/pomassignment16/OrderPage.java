package com.matrix.shikha.selenium.assignment.pomassignment16;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class OrderPage {

    WebDriver driver;

    public OrderPage(WebDriver driver) {this.driver = driver;}

    public void navigateToOrderPage () {
        driver.findElement(By.id("cart_quantity_up_6_32_0_734323")).click();

        WebElement singleUnitPrice = driver.findElement(By.id("product_price_6_32_734323"));
        String unitPrice = singleUnitPrice.getText();
        System.out.println("Single Unit Price: "+unitPrice);

        WebElement ttlQuantity = driver.findElement(By.xpath("//input[@size='2']"));
        String productQty = ttlQuantity.getText();
        System.out.println("Product Quantity: "+productQty);

        String expectedPrice = "$63.00";
        System.out.println("Expected Price: "+expectedPrice);

        WebElement element = driver.findElement(By.xpath("//td[@colspan='3' and @class='total_price_container text-right']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);

        String actualPrice = driver.findElement(By.id("total_price_container")).getText();
        System.out.println("Actual Price: " +actualPrice);

        Assert.assertEquals(actualPrice, expectedPrice)  ;

    }
}
