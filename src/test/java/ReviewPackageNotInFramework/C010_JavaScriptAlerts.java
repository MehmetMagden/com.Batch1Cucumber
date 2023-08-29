package ReviewPackageNotInFramework;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Driver;

public class C010_JavaScriptAlerts {


    @Test
    public void test(){

        /*
        when we are working with alerts, we need to switch our driver to the alert for each step
         */

        Driver.getDriver().get("https://the-internet.herokuapp.com/javascript_alerts");

        Driver.getDriver().findElement(By.xpath("//button[@onclick='jsAlert()']")).click(); // opens first js alert

        String alertText = Driver.getDriver().switchTo().alert().getText(); // gets the text of the alert
        System.out.println(alertText);  // I am a JS Alert

        Driver.getDriver().switchTo().alert().accept(); // it clicks on okey button

        Driver.getDriver().findElement(By.xpath("//button[@onclick='jsConfirm()']")).click(); // opens second alert
        Driver.getDriver().switchTo().alert().dismiss(); // to select "cancel"

        Driver.getDriver().findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Driver.getDriver().switchTo().alert().sendKeys("TestTest123");

        Driver.getDriver().switchTo().alert().accept();






    }
}
