package part3_4.com.demoqa.test.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;
import utilities.SwitchToUtility;

import static utilities.SwitchToUtility.*;

@Test
public class AlertsTest extends BaseTest {


    public void testInformationAlert(){
       var alertsPage =  homePage.goToAlerts_Frame_WindowsPage().clickAlerts();
       alertsPage.clickInformationAlert();
        String expectedAlertText = "You clicked a button";
        Assert.assertEquals(getAlertText(),expectedAlertText,"\n Actual & Expected Message Do Not Match\n");
        acceptAlert();
        //alertsPage.clickInformationAlert();
    }

    public void testConfirmationAlert(){
        String expectedConfirmationErsult = "You selected Cancel";
        var alertPage =  homePage.goToAlerts_Frame_WindowsPage().clickAlerts();
        alertPage.clickConfirmationAlertButton();
        dismissAlert();
        String actualConfirmationResult = alertPage.getConfirmationResult();
        Assert.assertEquals(actualConfirmationResult,expectedConfirmationErsult
                ,"\nYou Did Not Select Cancel\n");
    }

    public void testPromAlert(){
        String alertText = "Selenium with Java";
        String expectedResult = "You entered "+alertText;
        var alertsPage = homePage.goToAlerts_Frame_WindowsPage().clickAlerts();
        alertsPage.clickpromptAlertButton();
        setAlertText(alertText);
        acceptAlert();
        String actualResult = alertsPage.getPromptAlertResult();
        Assert.assertEquals(actualResult,expectedResult,
                "\n Actual & Expected Result Do Not Match\n");
    }

}
