package ReviewPackageNotInFramework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import utilities.Driver;
import utilities.ReusableMethods;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C16_DownloadFileTest {

    @Test
    public void test(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/download");

        WebElement iconButton = Driver.getDriver().findElement(By.xpath("//a[text()='icon.png']"));

        iconButton.click();

        ReusableMethods.waitfor(5);

        String filePath = System.getProperty("user.home") +"\\Downloads\\icon.png";

        Assert.assertTrue(Files.exists(Paths.get(filePath)));

        Driver.closeDriver();







    }
}
