package ReviewPackageNotInFramework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class C18_ExplicitlyWait {

    /*

    Some times implicitly wait wont be enough for a step. For example when we want to download 1gb file. and thest it

    we need to wait for 5 mins.

    in this kind of situations we need to create explicitly wait.



     */

        @Test
    public void test(){


            // first way to use explicitly wait
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(300));

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementsId")));

        }

        // Second way : we can also create our own explicitly wait method.
        WebElement elementToWait = ReusableMethods.waitForWebElement(300,"idOfElement");


}
