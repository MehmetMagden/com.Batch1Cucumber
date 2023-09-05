package ReviewPackageNotInFramework;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.io.File;
import java.io.IOException;

public class C22_ScreenShot {


    @Test
    public void test() throws IOException {

        Driver.getDriver().get("https://www.amazon.com");

        TakesScreenshot tss = (TakesScreenshot) Driver.getDriver();

        String SSpath = "target/ss/picture.jpeg";

        File ScreenShot = new File(SSpath);

        File tempFile = tss.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(tempFile,ScreenShot);


    }

    @Test
    public void webelementsPicture() throws IOException {

        Driver.getDriver().get("https://www.amazon.com");

        String filePath = "target/ss/WebELementpicture.jpeg";

        File screenShot = new File(filePath);

        WebElement amazonSearchBox = Driver.getDriver().findElement(By.id("twotabsearchtextbox"));


        File tempFile = amazonSearchBox.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(tempFile,screenShot);

    }

}
