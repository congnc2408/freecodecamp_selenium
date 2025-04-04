package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import utilities.DropDownUtility;
import utilities.JavascriptUtility;

import java.util.List;

import static utilities.DropDownUtility.*;
import static utilities.JavascriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage{
    private By standMultiSelect = By.id("cars");

    public void selectStandardMulti(String text){
       scrollToElementJS(standMultiSelect);
       //    Select select = new Select(find(standardMultiSelect));
        //    select.selectByVisibleText(text);
        selectByVisibleText(standMultiSelect, text);
    }

    public void selectStandardMulti(int index){
        scrollToElementJS(standMultiSelect);
        //    Select select = new Select(find(standardMultiSelect));
        //    select.selectByVisibleText(text);
        selectByIndex(standMultiSelect, index);
    }

    public void deselectStandardMulti(String value){
        scrollToElementJS(standMultiSelect);
        //    Select select = new Select(find(standardMultiSelect));
        //    select.selectByVisibleText(text);
        deselectBytValue(standMultiSelect, value);
    }

    public List<String> getAllSelectedStandardMultiOptions(){
        return getAllSelectedOption(standMultiSelect);
    }
}
