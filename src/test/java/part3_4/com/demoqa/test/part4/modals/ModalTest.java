package part3_4.com.demoqa.test.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {
    @Test
    public void testModalDialog(){
        var afwPage = homePage.goToAlerts_Frame_WindowsPage();
        var modalDialogsPage = afwPage.clickModalDialog();
        modalDialogsPage.clickSmallModalButton();
        String actualText = modalDialogsPage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"),
                "\n The Message Does Not Contain 'Small modal'\n");

        modalDialogsPage.clickCloseButton();
    }

}
