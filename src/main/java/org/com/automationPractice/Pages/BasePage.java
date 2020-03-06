package org.com.automationPractice.Pages;

import org.com.automationPractice.customwebDriver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    private WebDriver driver;
    private WebDriverWait webDriverWait;

    public BasePage()
    {
        driver = DriverManager.getInstance().getWebDriver();
        webDriverWait = DriverManager.getInstance().getWebDriverWait();
        PageFactory.initElements(driver,this);
    }

}
