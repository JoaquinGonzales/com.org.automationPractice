package org.com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    private InitialPage initialPage;
    @FindBy(className = "HPHeaderLogin")
    private WebElement loginIcon;
    @FindBy(id = "ctl00_MainContent_LoginControl1_TextBoxEmail")
    private WebElement usernameField;
    @FindBy(id = "ctl00_MainContent_LoginControl1_TextBoxPassword")
    private WebElement passwordField;
    @FindBy(id = "ctl00_MainContent_LoginControl1_ButtonLogin")
    private WebElement loginButton;

    public void clickLoginIcon()
    {
        loginIcon.click();
    }
    public void sendUserNameValue(String username)
    {
        usernameField.sendKeys(username);
    }
    public void sendUserPassword(String userPassword)
    {
        passwordField.sendKeys(userPassword);
    }
    public void clickLoginButton()
    {
        loginButton.click();
    }

    public InitialPage filloutLoginForm(String userName, String userPassword)
    {
        clickLoginIcon();
        sendUserNameValue(userName);
        sendUserPassword(userPassword);
        clickLoginButton();
        return new InitialPage();
    }
}
