package part3_4.com.demoqa.test.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;
import utilities.SwitchToUtility;

import static utilities.SwitchToUtility.acceptAlert;
import static utilities.SwitchToUtility.getAlertText;

public class AlertsTest extends BaseTest {
    @Test
    public void testInformationAlert(){
       var alertsPage =  homePage.goToAlerts_Frame_WindowsPage().clickAlers();
       alertsPage.clickInformationAlert();
        String expectedAlertText = "You clicked a button";
        Assert.assertEquals(getAlertText(),expectedAlertText,"\n Actual & Expected Message Do Not Match\n");
        acceptAlert();
        //alertsPage.clickInformationAlert();
    } 

}
