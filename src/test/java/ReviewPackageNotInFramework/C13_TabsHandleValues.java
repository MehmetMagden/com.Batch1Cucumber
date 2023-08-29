package ReviewPackageNotInFramework;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Driver;

import javax.swing.*;
import java.util.Set;

public class C13_TabsHandleValues {

    @Test
    public void test(){

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");

        String handleValueOfFirstPage = Driver.getDriver().getWindowHandle(); // first tab's handle value

        Driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click(); // we have two tabs right now

        Set<String> handleValues = Driver.getDriver().getWindowHandles(); // all hande values are stored in this Set

        String secondPageHandleValue ="";

        for (String eachHandleValue: handleValues
             ) {

            if (!eachHandleValue.equals(handleValueOfFirstPage) ){
                secondPageHandleValue = eachHandleValue;

            }

        }

        // when we have second tab's handle value, we can switch our driver to second tab

        Driver.getDriver().switchTo().window(secondPageHandleValue);







    }


}
