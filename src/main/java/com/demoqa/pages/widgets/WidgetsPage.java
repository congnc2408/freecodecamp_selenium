package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import utilities.JavascriptUtility;

import static utilities.JavascriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {
    private By selectMenuItem = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
    private By DatePickerMenuItem = By.xpath("//li[@id = 'item-2']/span[text() = 'Date Picker']");

    public SelectMenuPage clickSelectMenu(){
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }
    public DatePickerMenuPage clickDatePicker(){
        scrollToElementJS(DatePickerMenuItem);
        click(DatePickerMenuItem);
        return new DatePickerMenuPage();
    }
}
