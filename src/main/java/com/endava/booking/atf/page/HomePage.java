package com.endava.booking.atf.page;


import com.endava.booking.atf.common.action.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage {

    public JavascriptExecutor jse;
    public WebDriver driver;


    public HomePage(WebDriver driver) {
        super(driver);
        jse = (JavascriptExecutor) driver;
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @Override
    public boolean isElementDisplayed() {
        try {
            return this.searchButton.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    @FindBy(xpath = "//input[@type='search']")
    WebElement locationField;
    @FindBy(xpath = "//div[@class='xp__dates-inner']")
    WebElement dateSelector;
    @FindBy(xpath = "//div[@class='bui-calendar__wrapper']")
    List<WebElement> dateTables;
    @FindBy(xpath = "//td[@class='bui-calendar__date']")
    List<WebElement> dates;
    @FindBy(xpath = "//button[@data-sb-id='main']")
    private WebElement searchButton;


    public void selectCheckInOutDate() {
        dateSelector.click();
        dateTables.get(0);
        dates.get(10).click();
        dateTables.get(1);
        dates.get(20).click();
    }

}
