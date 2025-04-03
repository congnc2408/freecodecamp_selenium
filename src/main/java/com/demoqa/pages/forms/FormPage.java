package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utilities.JavascriptUtility.scrollToElementJS;


public class FormPage extends HomePage {
    private By practiceFormMenuItem = By.xpath("//span[normalize-space()='Practice Form']");


    public PracticeFormPage clickPracticeForm(){
        scrollToElementJS(practiceFormMenuItem);
        click(practiceFormMenuItem);
        return new PracticeFormPage();
    }
}
