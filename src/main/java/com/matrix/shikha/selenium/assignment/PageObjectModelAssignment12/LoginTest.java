package com.matrix.shikha.selenium.assignment.PageObjectModelAssignment12;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class LoginTest extends BaseClass{



    @Test
    public void verifyMessage() throws IOException {

        WebDriver driver = initBrowser();
        //PageActions

        //Login Page
        LoginPage loginPage = new LoginPage(driver);

        Properties prop = readProperties();
        loginPage.loginToApplication(prop.getProperty("username"), prop.getProperty("password"));

        //Home Page
        HomePage homePage = new HomePage(driver);
        homePage.navigateToHomePage();

        //Checkout Page
        CheckoutOverviewPage checkoutPage = new CheckoutOverviewPage(driver);
        checkoutPage.navigateToCheckoutPage();

        //Verification
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);
        boolean displayMessagePresent = checkoutCompletePage.isDisplayMessagePresent();

        Assert.assertTrue(displayMessagePresent);

    }
}
