package com.matrix.shikha.selenium.assignment.pomassignment15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class CatalogPage {

    WebDriver driver;

    public CatalogPage (WebDriver driver) {this.driver = driver; }

    public void navigateToCatalogPage() {

        String expectedProduct = driver.findElement(By.xpath("//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")).getText();
        System.out.println("Expected Product: " +expectedProduct);

        Actions actions = new Actions(driver);
        driver.findElement(By.id("search_query_top")).click();
        actions.sendKeys(expectedProduct).build().perform();
        driver.findElement(By.name("submit_search")).click();

        String actualProduct = driver.findElement(By.xpath("//*[@class='product-name' and @title = 'Faded Short Sleeve T-shirts']")).getText();
        System.out.println("Actual Product: " +actualProduct);

        //Verification
        Assert.assertEquals(actualProduct, expectedProduct);

    }
}
