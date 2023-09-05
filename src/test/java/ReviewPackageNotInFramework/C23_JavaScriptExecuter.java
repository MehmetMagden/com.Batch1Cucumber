package ReviewPackageNotInFramework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class C23_JavaScriptExecuter {

    /*

    Some times we can not click on a webelement by using selenium. In this kind of situations we can use
    Java Script executer to click on the webelement

    But we should be carefull because selenium acts like a user
    but JS will act like a computer, namely no matter what it will find it and click on it ( if it is there)

    *** when we use JS to click on something, it means we are not testing it as a user.
     */

    @Test
    public void test(){

        Driver.getDriver().get("https://www.amazon.com");
        // 1) we need to create a JS executer object
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        // by using this object we can run a JS code and use it on a web element

        WebElement randomWebELement = Driver.getDriver().findElement(By.xpath("//a[text()='Sell on Amazon Business']"));

        jse.executeScript("arguments[0].click();",randomWebELement);


    }


}
