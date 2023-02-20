package com.example.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import webpages.CurrentConditionsPage;

import java.util.concurrent.TimeUnit;

public class CurrentConditionTest {
    WebDriver driver;
    WebDriver opts;

    @Before
    public void setup() {
        //use Chrome Driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void applyAsDeveloper() {
        //Create object of HomePage Class
        CurrentConditionsPage currentConditionsPage = new CurrentConditionsPage(driver);
        currentConditionsPage.getWeatherText();

        //Check if page is opened
        Assert.assertTrue(currentConditionsPage.isPageOpened());

    }

    @After
    public void close() {
        driver.close();
    }
}
