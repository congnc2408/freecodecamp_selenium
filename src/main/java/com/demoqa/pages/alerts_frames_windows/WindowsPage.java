package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;
import utilities.SwitchToUtility;

import java.util.Set;

import static utilities.SwitchToUtility.switchToWindow;

public class WindowsPage extends Alerts_Frame_WindowsPage {
    private By newWindowButton = By.id("windowButton");
    public void clickNewWindowsButton(){
        click(newWindowButton);
    }

    public void switchToNewWindow(){
        //step 1: get the current "Main" window handle
        String currentHandle = driver.getWindowHandle();
        System.out.println("Main Window ID: "+currentHandle +"\n");
        //step 2: get all window handle
        Set<String> allHandles =  driver.getWindowHandles();
        System.out.println("# of open Window ID: "+allHandles.size());
        for (String handle: allHandles){
            if (currentHandle.equals(handle)){
                System.out.println("1st window ID: "+handle);
            }else{
                driver.switchTo().window(handle);
                switchToWindow(handle);
                System.out.println("2nd Window ID: "+handle);
            }
        }
        //step 3: switch to the new window using the window handle

    }
}
