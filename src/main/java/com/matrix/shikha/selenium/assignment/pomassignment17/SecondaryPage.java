package com.matrix.shikha.selenium.assignment.pomassignment17;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SecondaryPage {

    WebDriver driver;

    public SecondaryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSecondaryPage() {
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Second Page - Window Handles: " + windows);
        System.out.println(driver.getCurrentUrl());

        List<String> listWindows = new ArrayList<>(windows);
        System.out.println("Multiple Windows List: " + listWindows);
        driver.switchTo().window(listWindows.get(1));
        System.out.println("Secondary Window: " + driver.getCurrentUrl());

        driver.findElement(By.xpath("//a[@title='Holiday Packages']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

}
