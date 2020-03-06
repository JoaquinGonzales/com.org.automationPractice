package org.com.automationPractice.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitialPage extends BasePage {

    @FindBy(id = "NewItemContentInput")
    private WebElement newContentField;
    @FindBy(id = "NewItemAddButton")
    private WebElement newItemButton;
    @FindBy(id = "MainContentTasks")
    private WebElement table;

    public void addNewContentField(String newContent)
    {
        newContentField.sendKeys(newContent);
    }

    public void addNewItem()
    {
        newItemButton.click();
    }

    public String addNewItem(String itemName)
    {
        addNewContentField(itemName);
        addNewItem();
        return "hola";
    }
}
