package ReviewPackageNotInFramework;

import org.junit.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class C03_Navigations {

    @Test
    public void test01(){

        Driver.getDriver().get("https://www.amazon.com");

        Driver.getDriver().navigate().to("https://www.facebook.com");

        ReusableMethods.waitfor(1);

        Driver.getDriver().navigate().back();
        ReusableMethods.waitfor(1);

        Driver.getDriver().navigate().forward();
        ReusableMethods.waitfor(1);

        Driver.getDriver().navigate().refresh();
        ReusableMethods.waitfor(1);
        Driver.getDriver().navigate().refresh();




    }
}
