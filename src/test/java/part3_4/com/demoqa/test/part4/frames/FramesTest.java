package part3_4.com.demoqa.test.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class FramesTest extends BaseTest {

    @Test
    public  void testFramesBigBox(){
       var framesPage =  homePage.goToAlerts_Frame_WindowsPage().clickFramesPage();
        String actualkBigBoxText = framesPage.gettextInBigFrame();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualkBigBoxText,expectedBigBoxText,
                "\n Actual & Expected not Match\n");
        String actualHeaderText =  framesPage.getHeaderFramesText();
        String expectedHeaderText =  "Frames";
        Assert.assertEquals(actualHeaderText,expectedHeaderText,
                "\nActual & Expected Header Text Not Match\n");
    }

    @Test
    public void testFrameSmallBox(){
       var framesPage =  homePage.goToAlerts_Frame_WindowsPage().clickFramesPage();
       String actualSmallBoxText = framesPage.getTextSmallFrame();
        String expectedSmallBoxText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxText,expectedSmallBoxText ,
                "\n Actual & Expect Text do not match \n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText,expectedHeaderText,
                "\n Actual & Expected Header Text Do Not Match\n");
    }


}
