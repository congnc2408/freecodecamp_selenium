package part3_4.com.demoqa.test.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyBoardTest extends BaseTest {
    @Test
    public void testApplicationUsingKeyBoard(){
        var textBoxPage = homePage.goToElements().clickTextBox();
        textBoxPage.setFullName("NCC");
        textBoxPage.setEmail("NCC@gmail.com");
        textBoxPage.setCurrentAddress("Ha Dong - Ha Noi");
        textBoxPage.clickSubmitButton();
        String actualAdd =  textBoxPage.getCurrentAddress();
        Assert.assertTrue(actualAdd.contains("Ha Noi"),
                " \nActual Address Does Not Contain 'Ha Noi'\n");
    }
}
