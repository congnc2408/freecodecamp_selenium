package part3_4.com.demoqa.test.part3.javascript;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class JavascriptTest extends BaseTest {
    @Test
    public void testScrollingToElement(){
        homePage.goToForm();
    }
}
