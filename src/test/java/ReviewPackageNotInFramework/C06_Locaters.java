package ReviewPackageNotInFramework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import javax.swing.*;

public class C06_Locaters {

    @Test
    public void test01(){

        Driver.getDriver().get("https://www.amazon.com");

        // To locate a webelement by using its "id"
//        WebElement amazonSearchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
//        amazonSearchBox.sendKeys("Nutella");

        // to locate a webelement by using its "name"

//        WebElement amazonSearchBox = Driver.getDriver().findElement(By.name("field-keywords"));
//        amazonSearchBox.sendKeys("Nutella");

        //xpath
        // tag + attribute + value of the attribute

        WebElement amazonSearchBox = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Search Amazon']"));
        amazonSearchBox.sendKeys("Nutella");






    }
}
