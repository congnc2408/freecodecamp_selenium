package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtility extends Utility{

    private static Actions actUtility(){
        return new Actions(driver);
    }

    public  static void dragAndDropBy(WebElement source, int x, int y){
        actUtility().dragAndDropBy(source,x,y).perform();
    }

    public static void sendKeys(WebElement source, CharSequence keys){
        actUtility().sendKeys(source,keys).perform();
    }
}
