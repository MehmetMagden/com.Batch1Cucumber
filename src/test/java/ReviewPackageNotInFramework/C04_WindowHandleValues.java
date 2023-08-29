package ReviewPackageNotInFramework;

import org.junit.Test;
import utilities.Driver;

public class C04_WindowHandleValues {


    @Test
    public void test01(){

        // every tab we open in browser has a unique hanlde value. so we can use these unique handle valuse to
        // switch our driver between them.

        Driver.getDriver().get("https://www.amazon.com");

        String handleValueOfPage = Driver.getDriver().getWindowHandle();

        System.out.println(handleValueOfPage);

        Driver.closeDriver();  // 68313B8AEF2C4D054276099B7B13EF38




    }
}
