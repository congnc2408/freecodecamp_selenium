package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import utilities.ActionUtility;
import utilities.GetUtility;

public class SliderPage extends WidgetsPage{
    private By slider =  By.xpath("//div[@id = 'sliderContainer']//input[@type = 'range']");
    private By sliderValue =  By.id("sliderValue");


    public void moveSilder(int x, int y){
//        Actions actions = new Actions(driver);
//        actions.dragAndDropBy(find(slider),x,y).perform();
        ActionUtility.dragAndDropBy(find(slider),x,y);
    }

    public  String getSliderValue(){
        return GetUtility.getAttribute(sliderValue,"value");

    }
}
