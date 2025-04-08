package part3_4.com.demoqa.test.part4.screenshoot;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CaptureFailedScreenTest extends BaseTest {

    @Test
    public void testClickingSubmitButtonWithoutJavaScriptExcutor(){
        var practiceFormPage = homePage.goToForm().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }
}
