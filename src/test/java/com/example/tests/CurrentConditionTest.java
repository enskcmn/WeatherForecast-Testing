package com.example.tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import webpages.CurrentConditionsPage;

import java.util.concurrent.TimeUnit;

public class CurrentConditionTest {
    WebDriver driver;
    //WebDriver opts;

    @BeforeTest
    public void setup() {
        //use Chrome Driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void isCurrentWeatherPageOpened() {

        CurrentConditionsPage currentConditionsPage = new CurrentConditionsPage(driver);
        currentConditionsPage.getWeatherText();

        //Check if page is opened
        Assert.assertTrue(currentConditionsPage.isPageOpened());

    }

    @AfterTest
    public void close() {
        driver.close();
    }
}
