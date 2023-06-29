package com.matrix.shikha.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsTest {

    private WebDriver driver;
    //private String url = "https://demo.guru99.com/test/simple_context_menu.html";
    //private String url = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
//    private String url = "https://demo.opencart.com/";
    private String url = "https://www.saucedemo.com/";

    @BeforeMethod
    public void initBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);

    }

    //@Test
    public void verifyMouseEvents() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get(url);


        WebElement btnRightClick = driver.findElement(By.xpath("//span[text()='right click me']"));

        //Right Click using mouse events
        Actions actions = new Actions(driver);
        actions.contextClick(btnRightClick).build().perform();
        driver.findElement(By.xpath("//span[text()='Copy']")).click();
        driver.switchTo().alert().accept();


        // Double click using Mouse

        WebElement btnDoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        actions.doubleClick(btnDoubleClick).build().perform();

    }

    //@Test
    public void verifyDragAndDrop() {

//        WebElement source = driver.findElement(By.xpath("//div[@id='box3']"));
//        WebElement destination = driver.findElement(By.xpath("//div[@id='box103']"));
//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(source, destination).build().perform();
//
//        WebElement source1 = driver.findElement(By.xpath("//div[@id='box7']"));
//        WebElement destination1 = driver.findElement(By.id("box107"));
//        Actions actions1 = new Actions(driver);
//        actions1.dragAndDrop(source1, destination1).build().perform();
//
//        WebElement source2 = driver.findElement(By.id("box7"));
//        WebElement destination2 = driver.findElement(By.id("box105"));
//        Actions actions2 = new Actions(driver);
//        actions2.clickAndHold(source2).moveToElement(destination2).release().build().perform();
    }

    //@Test
    public void verifyMouseHover() {
        WebElement listItemDesktop = driver.findElement(By.xpath("//a[text()='Desktops']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(listItemDesktop).build().perform();

        driver.findElement(By.xpath("//*[@id='narbar-menu']//li[1]//ul/li/a")).click();
    }

    @Test
    public void verifyKeyboardEvents() {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("user-name"));
        actions.keyDown(element, Keys.SHIFT).sendKeys("shikha").keyUp(Keys.SHIFT).build().perform();
        actions.doubleClick().build().perform();

    }
}
