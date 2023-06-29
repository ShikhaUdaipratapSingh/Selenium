package com.matrix.shikha.selenium.assignment;

import com.matrix.nikhil.newJava.array.Array;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Assignment10 {

//    Scenario10
//    Do not use Select here
//    Steps:
//    Open https://preview.colorlib.com/theme/bootstrap/multiselect-04/
//    Click on all the options available in dropdown
//    And verify if all are selected or not

    @Test
    public void verifySelections() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://preview.colorlib.com/theme/bootstrap/multiselect-04/");

        driver.manage().window().maximize();

        WebElement ddlSelection = driver.findElement(By.xpath("//div[text()='Nothing selected']"));
        ddlSelection.click();

        List<WebElement> list = driver.findElements(By.xpath("//ul/li/a/span[@class='text']"));
        List<String> actualListOfCities = new ArrayList<>();
        actualListOfCities.add("Toronto");
        actualListOfCities.add("Bucharest");
        actualListOfCities.add("Paris");

        List<String> expectedlistOfCities = new ArrayList<>();

        for (WebElement element : list) {
            expectedlistOfCities.add(element.getText());
        }

    }
}
