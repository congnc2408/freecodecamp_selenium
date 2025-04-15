package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import utilities.JavascriptUtility;

import static utilities.JavascriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {
    private By selectMenuItem = By.xpath("//li[@id='item-8']/span[text()='Select Menu']");
    private By DatePickerMenuItem = By.xpath("//li[@id = 'item-2']/span[text() = 'Date Picker']");
    private By ProgressBarMenuItem = By.xpath("//li[@id = 'item-4']/span[text() = 'Progress Bar']");
    private By SliderMenuItem = By.xpath("//li[@id = 'item-3']/span[text() = 'Slider']");

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
    public ProgressBarPage clickProgressBar(){
        scrollToElementJS(ProgressBarMenuItem);
        click(ProgressBarMenuItem);
        return new ProgressBarPage();
    }

    public SliderPage clickSlider(){
        scrollToElementJS(SliderMenuItem);
        click(SliderMenuItem);
        return new SliderPage();
    }
}
