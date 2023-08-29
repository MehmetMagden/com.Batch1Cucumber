package ReviewPackageNotInFramework;

import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import utilities.Driver;

public class C01_WindowsSizeAndPosition {


        @Test
    public void test01(){


            Driver.getDriver().get("https://www.mealscenter.com/"); // will open a browser

            System.out.println(Driver.getDriver().manage().window().getPosition());
            System.out.println(Driver.getDriver().manage().window().getSize());


            Driver.getDriver().manage().window().fullscreen(); // full screen

            System.out.println("fullScreen");
            System.out.println(Driver.getDriver().manage().window().getPosition());
            System.out.println(Driver.getDriver().manage().window().getSize());

            // to change size and position we need to use these codes

            Driver.getDriver().manage().window().setPosition(new Point(0,0));
            Driver.getDriver().manage().window().setSize(new Dimension(600,300));

            System.out.println("smaller size and fixed position");
            System.out.println(Driver.getDriver().manage().window().getPosition());
            System.out.println(Driver.getDriver().manage().window().getSize());






        }

}
