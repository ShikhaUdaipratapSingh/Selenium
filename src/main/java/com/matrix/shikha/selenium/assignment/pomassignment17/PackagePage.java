package com.matrix.shikha.selenium.assignment.pomassignment17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PackagePage {

    WebDriver driver;

    public PackagePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPackagePage() throws InterruptedException {

        Thread.sleep(15000);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//img[@alt='TIRUPATI MOKSHAM']"));
        js.executeScript("window.scrollTo(0, 1000)", element);

//        WebElement element = driver.findElement(By.xpath("/html/body/app-root/tourpackagelist/div[2]/div/div[3]/div/div[98]/div/div[2]/div/h5"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).build().perform();


        //WebElement txtTitle = driver.findElement(By.xpath(""))

    }
}
