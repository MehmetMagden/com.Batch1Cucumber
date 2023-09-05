package ReviewPackageNotInFramework;

import io.cucumber.java.en.Then;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Driver;

public class C14_ActionsClass {

/*

To perform complex steps as a user in the website, we can use actions class. ( like holding down a button or hovering your
mouse on a web element or drag and drop actions )

1) we need to create an actions object  with the driver
// Actions actions = new Actions(driver);

2) by using the object we have created we can perform actions. But we should not forget to write .perform() at the end.

 */

    @Test
    public void test(){

        Actions actions = new Actions(Driver.getDriver());

        actions.keyDown(Keys.SHIFT).perform();


        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");

        WebElement area = Driver.getDriver().findElement(By.id("hot-spot"));

        actions.contextClick(area).perform();

    }

}
