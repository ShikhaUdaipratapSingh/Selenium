package com.matrix.shikha.selenium.assignment.PageObjectModelAssignment12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePage {

    WebDriver driver;
    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isDisplayMessagePresent() {

        WebElement displayMessage = driver.findElement(By.className("checkout_complete_container"));
        //boolean displayMessagePresent = displayMessage.isDisplayed();

        return displayMessage.isDisplayed();
    }
}
