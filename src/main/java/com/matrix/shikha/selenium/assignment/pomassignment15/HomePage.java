package com.matrix.shikha.selenium.assignment.pomassignment15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    WebDriver driver;
    public HomePage(WebDriver driver) { this.driver = driver;}

    public void navigateToHomePage() {

        WebElement listItems = driver.findElement(By.xpath("//a[text()='Women']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(listItems).build().perform();
        driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul/li[1]/a")).click();

    }

}
