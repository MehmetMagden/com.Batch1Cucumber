package ReviewPackageNotInFramework;

import org.junit.Test;
import utilities.Driver;

public class C02_PageSourceCode {

    @Test
    public void test01(){

        Driver.getDriver().get("https://www.amazon.com");
        String sourceCode = Driver.getDriver().getPageSource();

        System.out.println(sourceCode);

    }
}
