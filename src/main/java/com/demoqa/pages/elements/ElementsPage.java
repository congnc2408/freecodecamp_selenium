package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import utilities.JavascriptUtility;

import static utilities.JavascriptUtility.scrollToElementJS;

public class ElementsPage  extends HomePage {
    private By webTablesMenuItem =  By.xpath("//li[@id = 'item-3']/span[text() = 'Web Tables']");
    private By lickMenuItem = By.xpath("//li[@id='item-5']/span[text()='Links']");
    private By dynamicPropertiesMenuItem = By.xpath("//li[@id = 'item-8']//span[text() = 'Dynamic Properties']");
    private By TextBoxMenuItem = By.xpath("//li[@id = 'item-0']/span[text() = 'Text Box']");

    public WebTablesPage clickWebTables(){

        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks(){
        click(lickMenuItem);
        return new LinksPage();
    }

    public DynamicPropertiesPage clickDynamicProperties(){
        scrollToElementJS(dynamicPropertiesMenuItem);
        click(dynamicPropertiesMenuItem);
        return new DynamicPropertiesPage();
    }

    public textBoxPage clickTextBox(){
        scrollToElementJS(TextBoxMenuItem);
        click(TextBoxMenuItem);
        return new textBoxPage();
    }
}
