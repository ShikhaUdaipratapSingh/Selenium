package com.matrix.shikha.selenium.assignment.pomassignment18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class IMDBPage {

    private final WebDriver driver;

    public IMDBPage(WebDriver driver) {this.driver = driver;}

    public List<String> getIMDBPageURL(String url) {
        driver.get(url);

        driver.findElement(By.id("suggestion-search")).sendKeys("Pushpa: The Rise - Part 1");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//td[@class='primary_photo']/following-sibling::td/a")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//div[@data-testid='title-details-header']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        driver.findElement(By.xpath("//a[text()='January 7, 2022 (United States)']")).click();
        String releaseDate = driver.findElement(By.xpath("//tr[@class='ipl-zebra-list__item release-date-item']/following-sibling::tr[5]/td[2]")).getText();
        String txt = driver.findElement(By.xpath("//*[@id='releaseinfo_content']/table[1]/tbody/tr[6]/td[1]/a")).getText();



        List<String> imdbDetails = new ArrayList<>();
        imdbDetails.add(releaseDate);
        imdbDetails.add(txt);
        System.out.println("IMDB Details: " +imdbDetails);
        return imdbDetails;
    }




}
