package com.matrix.shikha.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment6 {

    @Test
    public void verifyCountTexts() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");

        driver.manage().window().maximize();

        WebElement txtProductOffering = driver.findElement(By.xpath("//p[@class='latoBlack font10 appendBottom10 capText']"));
        System.out.println(txtProductOffering.getText());

        List<WebElement> getTxtList = driver.findElements(By.xpath("//p[text()='Product Offering']/following-sibling::ul[1]/child::li"));
        System.out.println("List of links: " +getTxtList.size());

        for (WebElement txtList : getTxtList) {
            System.out.println(txtList.getText());

        }

        System.out.println("------------------------------------------------------------");

        WebElement txtMakeMyTrip = driver.findElement(By.xpath("//p[text()='MakeMyTrip']"));
        System.out.println(txtMakeMyTrip.getText());

        List<WebElement> getMMTList = driver.findElements(By.xpath("//p[text()='MakeMyTrip']/following-sibling::ul[1]/child::li"));
        System.out.println("List of MakeMyTrip List:" +getMMTList.size());

        for (int i = 0; i < getMMTList.size(); i ++) {
            WebElement element = getMMTList.get(i);
            System.out.println(element.getText());

        }

        System.out.println("------------------------------------------------------------");

        WebElement txtAboutTheSite = driver.findElement(By.xpath("//p[text()='About the Site']"));
        System.out.println(txtAboutTheSite.getText());

        List<WebElement> getTextList = driver.findElements(By.xpath("//p[text()='About the Site']/following-sibling::ul[1]/child::li"));
        System.out.println("List of About The Site: " +getTextList.size());

        for (WebElement element : getTextList) {
            System.out.println(element.getText());
        }

        System.out.println("------------------------------------------------------------");

        WebElement txtQuickLinks = driver.findElement(By.xpath("//p[text()='Quick Links']"));
        System.out.println(txtQuickLinks.getText());

        List<WebElement> getQuickLinksList = driver.findElements(By.xpath("//p[text()='Quick Links']/following-sibling::ul[1]/child::li"));
        System.out.println("List of Quick Links: "+getQuickLinksList.size());

        for (WebElement element : getQuickLinksList) {
            System.out.println(element.getText());
        }


        System.out.println("------------------------------------------------------------");

        WebElement txtImportantLinks = driver.findElement(By.xpath("//p[text()='Important Links']"));
        System.out.println(txtImportantLinks.getText());

        List<WebElement> getImportantLinksList = driver.findElements(By.xpath("//p[text()='Important Links']/following-sibling::ul[1]/child::li"));
        System.out.println("List of Important Links: "+getImportantLinksList.size());

        for (int i = 0; i < getImportantLinksList.size(); i ++) {
            WebElement element = getImportantLinksList.get(i);
            System.out.println(element.getText());

        }

        driver.close();
        driver.quit();

    }
}
