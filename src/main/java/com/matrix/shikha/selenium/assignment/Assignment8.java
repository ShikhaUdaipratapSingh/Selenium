package com.matrix.shikha.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Assignment8 {
//    Scenario8
//    Use select here
//    Steps:
//    Open https://www.facebook.com/
//    Click on Create New Account
//    Select 27-March-2000 from 3 dropdowns
//    Also, get all months(Jan-Dec) from the month dropdown and verify it has correct months or not (use Assert here).


    @Test
    public void  verifyDropDown() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(1000);

        WebElement ddlMonth = driver.findElement(By.id("month"));
        ddlMonth.click();
        Select month = new Select(ddlMonth);
        month.selectByVisibleText("Mar");
        Thread.sleep(1000);

        WebElement ddlDate = driver.findElement(By.id("day"));
        ddlDate.click();
        Select day = new Select(ddlDate);
        day.selectByIndex(26);
        Thread.sleep(1000);

        WebElement ddlYear = driver.findElement(By.id("year"));
        ddlYear.click();
        Select year = new Select(ddlYear);
        year.selectByVisibleText("2000");
        Thread.sleep(1000);

        WebElement listOfMonths = driver.findElement(By.xpath("//select[@id='month']"));
        Select select = new Select(listOfMonths);
        List<String> actualMonths = new ArrayList<>();
        actualMonths.add("Jan");
        actualMonths.add("Feb");
        actualMonths.add("Mar");
        actualMonths.add("Apr");
        actualMonths.add("May");
        actualMonths.add("Jun");
        actualMonths.add("Jul");
        actualMonths.add("Aug");
        actualMonths.add("Sep");
        actualMonths.add("Oct");
        actualMonths.add("Nov");
        actualMonths.add("Dec");

        List<String> expectedMonths = new ArrayList<>();

        for (WebElement elements : select.getOptions()) {
            expectedMonths.add(elements.getText());
        }

        Assert.assertEquals(actualMonths, expectedMonths);




    }
}
