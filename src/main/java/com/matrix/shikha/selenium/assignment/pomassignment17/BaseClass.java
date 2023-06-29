package com.matrix.shikha.selenium.assignment.pomassignment17;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {

    /* Assignment No. 17:
    Open https://indianrailways.gov.in/
    Mouse hover on Zonal Railways from menu items
    Click on Holiday Packages

    Click the OK button present on Alert to go to the next tab.
    Enter Origin/Destination City as ‘Tirupati’

    Get the Title, package code, upcoming date of journey and amount, print this information on the console. (Please refer below image)

            ---------------------------------------------------------------------------------------------------------------------- */

    public WebDriver initBrowser() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://indianrailways.gov.in/#");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;

    }

}
