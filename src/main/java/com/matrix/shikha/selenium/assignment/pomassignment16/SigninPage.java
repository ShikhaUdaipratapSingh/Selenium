package com.matrix.shikha.selenium.assignment.pomassignment16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {

    WebDriver driver;

    public SigninPage(WebDriver driver) {this.driver = driver;}

    public void navigateToSigninPage() {

        driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
        driver.findElement(By.id("email")).sendKeys("shikha.prasang@gmail.com");
        driver.findElement(By.id("passwd")).sendKeys("Shikha");
        driver.findElement(By.id("SubmitLogin")).click();



    }
}
