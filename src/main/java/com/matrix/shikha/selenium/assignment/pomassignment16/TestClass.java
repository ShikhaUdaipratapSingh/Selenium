package com.matrix.shikha.selenium.assignment.pomassignment16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestClass extends BaseClass{

    WebDriver driver;

    @BeforeMethod
    public void init() throws IOException {
        driver = initBrowser();
    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }

    @Test
    public void verifyTotalPrice() throws InterruptedException {

        WebDriver driver = initBrowser();

        SigninPage signinPage = new SigninPage(driver);
        signinPage.navigateToSigninPage();

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.navigateToMyAccountPage();

        CataloguePage cataloguePage = new CataloguePage(driver);
        cataloguePage.navigateToCataloguePage();

        ProductPage productPage = new ProductPage(driver);
        productPage.navigateToProductPage();

        OrderPage orderPage = new OrderPage(driver);
        orderPage.navigateToOrderPage();


    }

}
