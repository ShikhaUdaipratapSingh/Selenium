package com.matrix.shikha.selenium.assignment.pomassignment15;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass{

    @Test
    public void verifyProductName() {

        WebDriver driver = initBrowser();

        HomePage homePage = new HomePage(driver);
        homePage.navigateToHomePage();

        CatalogPage catalogPage = new CatalogPage(driver);
        catalogPage.navigateToCatalogPage();

    }

}
