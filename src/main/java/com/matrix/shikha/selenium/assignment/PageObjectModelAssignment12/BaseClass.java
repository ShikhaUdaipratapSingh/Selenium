package com.matrix.shikha.selenium.assignment.PageObjectModelAssignment12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {

    public WebDriver initBrowser() {
        //Pre-requisite / setup/configuration
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        return driver;
    }

    public Properties readProperties() throws IOException {
        String projectPath = System.getProperty("user.dir");
        File file= new File(projectPath+"src/main/java/com/matrix/shikha/selenium/assignment/PageObjectModelAssignment12/config.properties");
        FileInputStream fin = new FileInputStream(file);


        Properties prop = new Properties();
        prop.load(fin);

        return prop;
    }
}
