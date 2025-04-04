package part3_4.com.demoqa.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DateTest extends BaseTest {
    @Test
    public void TestSelectingDate(){
        String month = "December";
        String day = "31";
        String year = "2034";
        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectYear(year);
        datePickerPage.selectMonth(month);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = month+"/"+day+"/"+year;
        Assert.assertEquals(actualDate,expectedDate, "\n Actual & Expected Dates Do Not Match\n"
                 +"\n Actual Date: " +actualDate
                 + "\n Expected Date: "+expectedDate);
    }
}
