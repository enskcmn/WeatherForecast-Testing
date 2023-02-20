package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CurrentConditionsPage {
    private WebDriver driver;

    //Page URL
    private static String PAGE_URL = "http://www.accuweather.com/en/tr/istanbul/318251/current-weather/318251?lang=en-us";

    //Locators

    //Apply as Developer Button
    @FindBy(xpath = "//body/div[1]/div[5]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]")
    private WebElement weatherText;

    @FindBy(xpath = "//h1[contains(text(),'Current Weather')]")
    private WebElement pageHeader;

    //Constructor
    public CurrentConditionsPage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void getWeatherText() {
        String weatherTxt = weatherText.getText();
        System.out.println(weatherTxt);
    }
    public boolean isPageOpened(){
        //Assertion
        return pageHeader.getText().contains("Current Weather");
    }

}
