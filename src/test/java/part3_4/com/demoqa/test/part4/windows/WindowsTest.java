package part3_4.com.demoqa.test.part4.windows;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;
import utilities.GetUtility;

import static utilities.GetUtility.getURL;

public class WindowsTest extends BaseTest {
    @Test
    public void testNewWindow(){
        var windowsPage = homePage.goToAlerts_Frame_WindowsPage().clickWindowsPage();
        windowsPage.clickNewWindowsButton();
        windowsPage.switchToNewWindow();
        String actualURL =  getURL();
        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(actualURL,expectedURL,
                "\n Actual & Expected URL's do not match\n");

    }
}
