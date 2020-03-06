package org.com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(className = "HPHeaderLogin")
    private WebElement loginIcon;

    public void clickLoginIcon()
    {
        loginIcon.click();
    }

}
