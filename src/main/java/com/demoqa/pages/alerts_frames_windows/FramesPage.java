package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;
import utilities.SwitchToUtility;

import static utilities.SwitchToUtility.*;

public class FramesPage extends Alerts_Frame_WindowsPage {
    private By textInFrame =  By.id("sampleHeading");
    private String iFrameBigBox = "frame1";
    private By headerFrameText = By.xpath("//div[@id='app']//h1[text()='Frames']");
    private By iFrameSmallBox = By.xpath("//div[@id='frame2Wrapper']/iframe");

    private void switchToBigBox(){
//        driver.switchTo().frame(iFrameBigBox);
        switchToFrameString(iFrameBigBox);
    }

    private void switchToSmallBox(){
//        switchToFrameIndex(3);
        switchToFrameElement(find(iFrameSmallBox));
    }

    public String gettextInBigFrame(){
        switchToBigBox();
        String bigFrameText = find(textInFrame).getText();
        System.out.println("Big Frame Text: "+bigFrameText);
//        driver.switchTo().parentFrame();
        switchToDefaultContent();
       // driver.switchTo().defaultContent();
        return bigFrameText;
    }

    public String getHeaderFramesText(){
        return find(headerFrameText).getText();
    }

    public String getTextSmallFrame(){
        switchToSmallBox();
        String smallFrameText = find(textInFrame).getText();
        System.out.println("Small Frame Text: "+smallFrameText);
        switchToDefaultContent();
        return smallFrameText;
    }
}
