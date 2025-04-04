package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.css.model.Value;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownUtility extends Utility{
    private  static Select findDropDown(By locator){
        return new Select(driver.findElement(locator));
    }

    public   static void selectByVisibleText(By locator, String text){
        findDropDown(locator).selectByVisibleText(text);
    }

    public  static void selectByIndex(By locator, int index){
        findDropDown(locator).selectByIndex(index);
    }

    public static void selectBytValue(By locator, String value){
        findDropDown(locator).selectByValue(value);
    }

    public static void deselectBytValue(By locator, String value){
        findDropDown(locator).deselectByValue(value);
    }

    public static List<String> getAllSelectedOption(By locator){
        List<WebElement> allSelectOptions = findDropDown(locator).getAllSelectedOptions();
        return allSelectOptions.stream()
                .map(WebElement::getText).collect(Collectors.toList());
    }
}
