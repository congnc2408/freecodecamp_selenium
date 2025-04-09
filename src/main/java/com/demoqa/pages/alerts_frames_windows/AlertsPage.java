package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends Alerts_Frame_WindowsPage{
    private By informationAlertButton =  By.id("alertButton");
    private By confirmationAlertButton =  By.id("confirmButton");
    private By confirmationResult =  By.id("confirmResult");
    private By promptAlertButton =  By.id("promtButton");
   private By promptAlertResult =  By.id("promptResult");

    public void clickInformationAlert(){
        click(informationAlertButton);
    }

    public void clickConfirmationAlertButton(){
        click(confirmationAlertButton);
    }

    public String getConfirmationResult(){
        return find(confirmationResult).getText();
    }
    public void clickpromptAlertButton(){
        click(promptAlertButton);
    }

    public  String getPromptAlertResult(){
        return find(promptAlertResult).getText();
    }


}
