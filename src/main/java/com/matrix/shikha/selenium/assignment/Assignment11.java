package com.matrix.shikha.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Assignment11 {

//    Scenario11
//    Steps:
//    Open https://demo.opencart.com/
//    Verify menu Items available on the main page

    @Test
        public void verifyMenuItems() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();

//        List<WebElement> menuBar = driver.findElements(By.xpath("//div[@class='collapse navbar-collapse']/ul/li/a"));
//        List<String> actualList = new ArrayList<>();
//        actualList.add("Desktops");
//        actualList.add("Laptops & Notebooks");
//        actualList.add("Components");
//        actualList.add("Tablets");
//        actualList.add("Software");
//        actualList.add("Phones & PDAs");
//        actualList.add("Cameras");
//        actualList.add("MP3 Players");
//
//        List<String> expectedList = new ArrayList<>();
//
//        for (WebElement element :menuBar) {
//            expectedList.add(element.getText());
//        }
//
//        Assert.assertEquals(actualList, expectedList);




        List<WebElement> menuBar = driver.findElements(By.xpath("//li[@class='nav-item dropdown' or @class='nav-item']"));
        List<String> expectedList = new ArrayList<>();
        expectedList.add("Desktops");
        expectedList.add("Laptops & Notebooks");
        expectedList.add("Components");
        expectedList.add("Tablets");
        expectedList.add("Software");
        expectedList.add("Phones & PDAs");
        expectedList.add("Cameras");
        expectedList.add("MP3 Players");

        List<String> actualList = new ArrayList<>();

        for (WebElement element:menuBar){
            actualList.add(element.getText());
        }

        Assert.assertEquals(expectedList, actualList);



    }



}
