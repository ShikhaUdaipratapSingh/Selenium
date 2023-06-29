package com.matrix.shikha.selenium.assignment.POMAssignment13;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{

    WebDriver driver;

    @BeforeMethod
    public void init() {
        //Pre-requisite or Setup or Config
        driver = initBrowser();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test
    public void verifyRegistration() {
        WebDriver driver = initBrowser();

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.navigateToMyAccount();
    }
}
