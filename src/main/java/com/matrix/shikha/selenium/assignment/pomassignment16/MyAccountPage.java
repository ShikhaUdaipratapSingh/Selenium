package com.matrix.shikha.selenium.assignment.pomassignment16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyAccountPage {

    WebDriver driver;

    public MyAccountPage(WebDriver driver) {this.driver = driver;}

    public void navigateToMyAccountPage() {
        WebElement txtDresses = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(txtDresses).build().perform();
        driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")).click();

    }






}
