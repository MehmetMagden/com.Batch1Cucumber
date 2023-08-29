package ReviewPackageNotInFramework;

import org.junit.Test;
import utilities.Driver;

import javax.swing.*;
import java.time.Duration;

public class C05_ImplicitlyWait {



    @Test
    public void test01(){

        // our computers are faster than internet connection speed and websites' data base speed.
        // A Computer will try to execute all the code in nanoseconds.  So Computers should
        // wait for them for all steps.

        // to handle that we use implicitly wait
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
}
