package com.matrix.shikha.selenium.assignment.pomassignment18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    //Extract country
    //Extract release date
    //url1 = https://www.imdb.com/?ref_=nv_home
    //url2 = https://en.wikipedia.org/wiki/Main_Page

    public WebDriver initBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return  driver;

    }

}
