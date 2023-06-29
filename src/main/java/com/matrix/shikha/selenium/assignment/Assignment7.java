package com.matrix.shikha.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment7 {

//    Scenario
//    Steps:
//    Open https://www.google.com/
//    Enter ‘Selenium WebDriver’ keyword in search field like below
//    Print the count and their texts for the results

    @Test
    public void verifyCountsAndTexts() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

       // driver.findElement(By.xpath("//*[@class='YacQv gsfi']")).sendKeys("Selenium Driver");
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium Driver");
        Thread.sleep(2000);

        List<WebElement> list = driver.findElements(By.xpath("//ul/li[@class='sbct']//span[text()]"));
        System.out.println("The List: "+list.size());

        for (WebElement element : list) {
            System.out.println(element.getText());
        }

//        for (int i = 0; i < list.size(); i++) {
//            WebElement element = list.get(i);
//            System.out.println(element.getText());
//        }
    }


}
