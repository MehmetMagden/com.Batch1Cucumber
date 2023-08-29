package ReviewPackageNotInFramework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class C12_Iframe {

    /*
    Iframe is like a different page inside of another page. To locate a webelement inside of the Iframe we need to
    switch our Driver to Iframe.

     */

    @Test
    public void test(){

        Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");

        //Driver.getDriver().switchTo().frame("mce_0_ifr"); // we can switch our driver by using the id of the iframe

        WebElement iframe = Driver.getDriver().findElement(By.id("mce_0_ifr")); // first locating the iframe then switching is faster then other options
        Driver.getDriver().switchTo().frame(iframe);

        // when we switch our driver, driver will stay in the iframe.
        // if we want to do something in the main page, we need to switch back to main page

        WebElement iframeTextBoxWebElement = Driver.getDriver().findElement(By.id("tinymce"));

        System.out.println(iframeTextBoxWebElement.getText()); // Your content goes here.



    }

}
