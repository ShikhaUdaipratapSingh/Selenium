package com.matrix.shikha.selenium.assignment.pomassignment16;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CataloguePage {

    WebDriver driver;

    public CataloguePage(WebDriver driver) {this.driver = driver;}

    public void navigateToCataloguePage() {

        WebElement element = driver.findElement(By.xpath("//*[@id='center_column']/div[2]/div[2]/form"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)", element);
        WebElement summerDress = driver.findElement(By.xpath("//*[@id='center_column']/ul/li[2]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(summerDress).build().perform();
        driver.findElement(By.xpath("//a[@rel='nofollow' and @data-id-product='6']/following-sibling::a/span")).click();
    }
}
