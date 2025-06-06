package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
//import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUntility extends  Utility{
   public static void explicitWaitVisible(int second, By locator){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
       wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

   }

   public static void fluentWaitUntilVisible (int seconds, By locator){
       FluentWait<org.openqa.selenium.WebDriver> fluentWait = new FluentWait<>(driver)
               .withTimeout(Duration.ofSeconds(seconds))
               .pollingEvery(Duration.ofMillis(500))
               .ignoring(org.openqa.selenium.NoSuchElementException.class)
               .ignoring(StaleElementReferenceException.class);
        fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));

   }

//    public static void fluentWaitUntilVisible (int seconds, By locator){
//        FluentWait fluentWait = new FluentWait(driver)
//                .withTimeout(Duration.ofSeconds(seconds))
//                .pollingEvery(Duration.ofMillis(500))
//                .ignoring(NoSuchFieldException.class,
//                        StaleElementReferenceException.class);
//         fluentWait.until(ExpectedConditions.visibilityOfElementLocated(locator));

//    }

}
