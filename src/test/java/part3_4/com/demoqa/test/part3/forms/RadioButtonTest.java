package part3_4.com.demoqa.test.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {

    @Test
    public  void testRadioButton(){
        var formPage = homePage.goToForm().clickPracticeForm();
        formPage.clickFemaleRadioButton();
        boolean isFemaleRadioButtonSelected =  formPage.isFemaleSelected();
        Assert.assertTrue(isFemaleRadioButtonSelected,
                "\n Female Radio Button Is Not Selected \n");
    }
}
