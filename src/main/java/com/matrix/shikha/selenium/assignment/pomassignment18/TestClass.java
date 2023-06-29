package com.matrix.shikha.selenium.assignment.pomassignment18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestClass extends BaseClass{

    WebDriver driver;

    @BeforeMethod
    public void init() {driver = initBrowser(); }

    @AfterMethod
    public void teardown(){driver.close();}

    @Test
    public void verifyMovieDetails() {


        IMDBPage imdbPage = new IMDBPage(driver);
        List<String> ImdbDetails = imdbPage.getIMDBPageURL("https://www.imdb.com/?ref_=nv_home");


        WikiPage wikiPage = new WikiPage(driver);
        List<String> WIKIDetails = wikiPage.getWikiPageURL("https://en.wikipedia.org/wiki/Wiki");


        Assert.assertEquals(ImdbDetails,WIKIDetails );

    }


}
