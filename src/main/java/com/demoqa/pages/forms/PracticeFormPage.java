package com.demoqa.pages.forms;

import org.openqa.selenium.By;
import utilities.JavascriptUtility;

import static utilities.JavascriptUtility.clickJS;
import static utilities.JavascriptUtility.scrollToElementJS;

public class PracticeFormPage extends FormPage{
    private By femaleRadioButton = By.id("gender-radio-2");
    private  By sportHobbyCheckbox =  By.id("hobbies-checkbox-1");
    private  By readingHobbyCheckbox =  By.id("hobbies-checkbox-2");
    private  By otherHobbyCheckbox =  By.id("hobbies-checkbox-3");
    public void clickFemaleRadioButton(){
        JavascriptUtility.scrollToElementJS(femaleRadioButton);
        clickJS(femaleRadioButton);
    }


    public boolean isFemaleSelected(){
        return find(femaleRadioButton).isSelected();
    }

    public void clickSportsCheckbox(){
        if (!find(sportHobbyCheckbox).isSelected()){
            scrollToElementJS(sportHobbyCheckbox);
            clickJS(sportHobbyCheckbox);
        }
    }
    public void clickReadingCheckbox(){
        if (!find(readingHobbyCheckbox).isSelected()){
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }
    public void clickOtherCheckbox(){
        if (!find(otherHobbyCheckbox).isSelected()){
            scrollToElementJS(otherHobbyCheckbox);
            clickJS(otherHobbyCheckbox);
        }
    }

    public void unclickReadingCheckbox(){
        if (find(readingHobbyCheckbox).isSelected()){
            scrollToElementJS(readingHobbyCheckbox);
            clickJS(readingHobbyCheckbox);
        }
    }

    public boolean isReadingSelected(){
        return find(readingHobbyCheckbox).isSelected();
    }
}
