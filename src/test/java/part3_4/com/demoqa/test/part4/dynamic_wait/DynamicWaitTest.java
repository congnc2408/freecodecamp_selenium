package part3_4.com.demoqa.test.part4.dynamic_wait;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

@Test
public class DynamicWaitTest extends BaseTest {

    public void testVisibleAfterButtonText(){
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText =  dynamicPage.getVisibleAfterButtonText();
        String expectedText =  "Visible After 5 Seconds";
        Assert.assertEquals(actualText,expectedText
                ,"\n Actual & Expected Text Do Not Match \n");
    }


    public void testProgressBar(){
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue =  "100%";
        Assert.assertEquals(actualValue,expectedValue,"\nValue Is not 100%\n");
    }
}
