package com.matrix.shikha.selenium.assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assignment3 {

    @Test
    public void verifyUserRegistration() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com/index.php");

        driver.manage().window().maximize();

        WebElement signinLink = driver.findElement(By.linkText("Sign in"));
        signinLink.click();

        WebElement createanAccount = driver.findElement(By.id("email_create"));
        createanAccount.sendKeys("shikha.singh6@gmail.com");

        WebElement createButton = driver.findElement(By.name("SubmitCreate"));
        createButton.click();
        Thread.sleep(10000);

        WebElement Mrs = driver.findElement(By.id("id_gender2"));
        Mrs.click();

        WebElement firstName = driver.findElement(By.name("customer_firstname"));
        firstName.sendKeys("Shikha");

        WebElement lastName = driver.findElement(By.name("customer_lastname"));
        lastName.sendKeys("Singh");

        WebElement passWord = driver.findElement(By.name("passwd"));
        passWord.sendKeys("Shikha");

        WebElement dateOfBirthDay = driver.findElement(By.id("days"));
        dateOfBirthDay.sendKeys("11");

        WebElement dateOfBirthdayMonth = driver.findElement(By.id("months"));
        dateOfBirthdayMonth.sendKeys("January");

        WebElement dateofBirthYear = driver.findElement(By.id("years"));
        dateofBirthYear.sendKeys("1990");

        WebElement company = driver.findElement(By.id("company"));
        company.sendKeys("Keywords");

        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("2705, Rue Modugno");

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Montreal");

        WebElement state = driver.findElement(By.name("id_state"));
        state.sendKeys("Vermont");

        WebElement zipCode = driver.findElement(By.name("postcode"));
        zipCode.sendKeys("00000");

        WebElement country = driver.findElement(By.id("id_country"));
        country.sendKeys("United States");

        WebElement homePhone = driver.findElement(By.id("phone"));
        homePhone.sendKeys("5145811213");

        WebElement mobilePhone = driver.findElement(By.id("phone_mobile"));
        mobilePhone.sendKeys("5145811414");

        WebElement aliasAddress = driver.findElement(By.name("alias"));
        aliasAddress.sendKeys("2705 Rue Modugno");

        WebElement register = driver.findElement(By.name("submitAccount"));
        register.click();

        //WebElement signOut = driver.findElement(By.linkText("Sign out"));
        //signOut.click();

//        String ActualTitle = driver.getTitle();
//        System.out.println("ActualTitle");
//        Assert.assertTrue(true);




    }
}
