package com.matrix.shikha.selenium.assignment.pomassignment17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PrimaryPage {

    WebDriver driver;

    public PrimaryPage(WebDriver driver) {this.driver = driver; }

    public void navigateToPrimaryPage() {
        Actions actions = new Actions(driver);
        WebElement hvrMouse = driver.findElement(By.xpath("//a[@title='Zonal Railways']"));
        actions.moveToElement(hvrMouse).build().perform();

        driver.findElement(By.xpath("//a[@title='South Western Railway']")).click();







    }
}
