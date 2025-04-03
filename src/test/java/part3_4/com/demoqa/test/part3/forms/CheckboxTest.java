package part3_4.com.demoqa.test.part3.forms;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CheckboxTest extends BaseTest {
    @Test
    public  void testCheckbox() throws InterruptedException {
        var formsPage = homePage.goToForm().clickPracticeForm();
        formsPage.clickSportsCheckbox();
        formsPage.clickReadingCheckbox();
        formsPage.clickOtherCheckbox();
        Thread.sleep(3000);
        formsPage.unclickReadingCheckbox();
        boolean isReadingCheckboxSelected =  formsPage.isFemaleSelected();
        Assert.assertFalse(isReadingCheckboxSelected,"\n Reading checkbox Is Selected \n");
    }
}
