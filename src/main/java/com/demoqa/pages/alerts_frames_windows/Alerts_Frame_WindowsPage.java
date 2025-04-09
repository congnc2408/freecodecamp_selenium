package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import utilities.JavascriptUtility;

import static utilities.JavascriptUtility.scrollToElementJS;

public class Alerts_Frame_WindowsPage extends HomePage {
    private By modalDialogsMenuItem =  By.xpath("//li[@id = 'item-4']/span[text() = 'Modal Dialogs']");
    private By alertsMenuItem =  By.xpath("//li[@id = 'item-1']//span[text() = 'Alerts']");
    private By framesMenuItem =  By.xpath("//li[@id = 'item-2']//span[text() ='Frames']");

    public AlertsPage clickAlerts(){
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }

    public ModalDialogsPage clickModalDialog(){
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }
    public FramesPage clickFramesPage(){
        scrollToElementJS(framesMenuItem);
        click(framesMenuItem);
        return new FramesPage();
    }

}
