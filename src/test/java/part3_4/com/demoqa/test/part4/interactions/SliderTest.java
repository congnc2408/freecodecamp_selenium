package part3_4.com.demoqa.test.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class SliderTest extends BaseTest {
    @Test
    public void testSliderResult(){
        int x = 180;
        int y = 0;
        var sliderPage = homePage.goToWidgets().clickSlider();
        sliderPage.moveSilder(x,y);
        String actualValue =  sliderPage.getSliderValue();
        String expectedValue = "78";
        Assert.assertEquals(actualValue,expectedValue,
                "\nActual= "+actualValue+"!="+"Expected= "+expectedValue+"\n");
    }
}
