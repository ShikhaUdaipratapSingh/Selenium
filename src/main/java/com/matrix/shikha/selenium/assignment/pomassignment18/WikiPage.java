package com.matrix.shikha.selenium.assignment.pomassignment18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class WikiPage {

    private final WebDriver driver;

    public WikiPage(WebDriver driver) {this.driver = driver;}

    public List<String> getWikiPageURL(String URL) {
        driver.get(URL);

        WebElement txtSearch = driver.findElement(By.name("search"));
        txtSearch.sendKeys("Pushpa: The Rise - Part 1");
        driver.findElement(By.id("searchButton")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//*[@id='mw-content-text']/div[1]/table[1]/tbody/tr[12]/th/div"));
        js.executeScript("arguments[0].scrollIntoView(true)", element);

        String releaseDate = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[12]/td/div/ul/li")).getText();
        String countryOrigin = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[14]/td")).getText();

        List<String> wikiDetails = new ArrayList<>();
        wikiDetails.add(releaseDate);
        wikiDetails.add(countryOrigin);
        System.out.println("Wiki Details: " +wikiDetails);
        return wikiDetails;


    }
}
