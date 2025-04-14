package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import utilities.GetUtility;
import utilities.WaitUntility;

import static utilities.GetUtility.getText;
import static utilities.WaitUntility.explicitWaitVisible;

public class DynamicPropertiesPage extends  ElementsPage{
    private By visibleAfterButton = By.id("visibleAfter");
    public String getVisibleAfterButtonText(){
        explicitWaitVisible(5,visibleAfterButton);

        String visibleText =  getText(visibleAfterButton);
        System.out.println("Button Text: "+ visibleText);
        return visibleText;

    }
}
