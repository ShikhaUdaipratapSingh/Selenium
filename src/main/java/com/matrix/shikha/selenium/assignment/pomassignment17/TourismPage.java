package com.matrix.shikha.selenium.assignment.pomassignment17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TourismPage {

    WebDriver driver;

    public TourismPage (WebDriver driver) {
        this.driver = driver;}

    public void navigateToTourismPage() throws InterruptedException {

        Thread.sleep(15000);
        Set<String> childWindow = driver.getWindowHandles();
        System.out.println("Third Page Window Handles: "+childWindow );
        System.out.println(driver.getCurrentUrl());

        List<String> listOfWindows = new ArrayList<String>(childWindow );
        System.out.println("Third Page Multiple Windows: "+listOfWindows);
        driver.switchTo().window(listOfWindows.get(2));
        System.out.println("Tourism Window: "+driver.getCurrentUrl());




        WebElement txtOrigin = driver.findElement(By.xpath("//input[@placeholder='Enter Origin/Destination City']"));
        txtOrigin.click();
        txtOrigin.sendKeys("Tirupati");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='form-in-custom2']/following-sibling::div/button")).click();
    }
}
