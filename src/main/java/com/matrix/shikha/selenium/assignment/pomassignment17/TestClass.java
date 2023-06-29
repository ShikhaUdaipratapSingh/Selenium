package com.matrix.shikha.selenium.assignment.pomassignment17;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {

    WebDriver driver;



    @BeforeMethod
    public void init() {
        driver = initBrowser();
    }


    @Test
    public void verifyInfo() throws InterruptedException {

        WebDriver driver = initBrowser();

        PrimaryPage primaryPage = new PrimaryPage(driver);
        primaryPage.navigateToPrimaryPage();

        SecondaryPage secondaryPage = new SecondaryPage(driver);
        secondaryPage.navigateToSecondaryPage();

        TourismPage tourismPage = new TourismPage(driver);
        tourismPage.navigateToTourismPage();

        PackagePage packagePage = new PackagePage(driver);
        packagePage.navigateToPackagePage();

    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }
}