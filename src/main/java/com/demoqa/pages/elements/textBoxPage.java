package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.ActionUtility;
import utilities.GetUtility;
import utilities.JavascriptUtility;
import utilities.WaitUntility;

import static utilities.ActionUtility.sendKeys;
import static utilities.GetUtility.getText;
import static utilities.JavascriptUtility.scrollToElementJS;
import static utilities.WaitUntility.explicitWaitVisible;

public class textBoxPage extends ElementsPage{
    private By fullNameField = By.id("userName");
    private By emailField = By.id("userName");
    private By currentAddresField = By.xpath("//textarea[@id= 'currentAddress']");
    private By submitButton = By.id("submit");
    private By currentAddressResult = By.xpath("//p[@id = 'currentAddress']");

    public void setFullName(String name){
        scrollToElementJS(fullNameField);
//        Actions act = new Actions(driver);
//        act.sendKeys(find(fullNameField), Keys.chord(name)).perform();
        sendKeys(find(fullNameField), Keys.chord(name));
    }

    public void setEmail(String email){
        setFullName(Keys.chord(Keys.TAB, email));
    }

    public void setCurrentAddress(String address){
        find(currentAddresField).sendKeys(address +Keys.ENTER);
        //set(currentAddresField, address +Keys.ENTER);
    }

    public void clickSubmitButton(){
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public String getCurrentAddress(){
        explicitWaitVisible(5,currentAddressResult);
        return getText(currentAddressResult);
    }
}
