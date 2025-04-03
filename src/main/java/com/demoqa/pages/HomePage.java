package com.demoqa.pages;

import com.demoqa.pages.forms.FormPage;
import com.base.BasePage;
import org.openqa.selenium.By;
import static utilities.JavascriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private By formCard = By.xpath("//h5[normalize-space()='Forms']");

    public FormPage goToForm(){
        scrollToElementJS(formCard);
        click(formCard);
        return new  FormPage();
    }
}
