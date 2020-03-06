package org.com.automationPractice.customwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static DriverManager instance=null;
    private WebDriver driver;
    private WebDriverWait driverWait;
    private static final String BASE_URL = "http://todo.ly/";

    public DriverManager()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public WebDriver getWebDriver()
    {
        return driver;
    }
    public void init()
    {
        driver.get(BASE_URL);
    }

    public static DriverManager getInstance()
    {
        if (instance == null)
        {
            new DriverManager();
        }
        return instance;
    }
    public WebDriverWait getWebDriverWait()
    {
        driverWait = new WebDriverWait(driver,30);
        return driverWait;
    }
}
