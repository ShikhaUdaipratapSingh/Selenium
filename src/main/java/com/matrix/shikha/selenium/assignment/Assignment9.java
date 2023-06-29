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

public class Assignment9 {

//    Scenario 9
//    Do not use Select here
//    Steps:
//    Open https://preview.colorlib.com/theme/bootstrap/multiselect-07/
//    Select Family, Friends, Work options from multi dropdown
//    And Verify if they are selected or not

    @Test
    public void verifyDropdownList() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://preview.colorlib.com/theme/bootstrap/multiselect-07/");

        driver.manage().window().maximize();

        WebElement txtField = driver.findElement(By.xpath("//div[text()='Select Topics']"));
        txtField.click();
        Thread.sleep(2000);

        List<WebElement> elements = driver.findElements(By.xpath("//a"));
        List<String> actuallist = new ArrayList<>();
        actuallist.add("Family");
        actuallist.add("Friends");
        actuallist.add("Work");

        List<String> expectedlist = new ArrayList<>();

        for (WebElement element : elements){
            expectedlist.add(element.getText());
        }
        Assert.assertEquals(actuallist, expectedlist);

    }

}
