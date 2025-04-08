package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

public class AlertsPage extends Alerts_Frame_WindowsPage{
    private By informationAlertButton =  By.id("alertButton");

    public void clickInformationAlert(){
        click(informationAlertButton);
    }
}
