package ReviewPackageNotInFramework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class C09_DropDown {

    @Test
    public void test(){

        /*
        If there is a dropdown in the website we need to follow three steps
        1) locate the dropdown
        2) Create a select object
        3) Select the options ( by using visible text or index or value)

         */

        Driver.getDriver().get("https://www.amazon.com");
        WebElement amazonDropDownMenu = Driver.getDriver().findElement(By.id("searchDropdownBox"));

        Select select = new Select(amazonDropDownMenu);

        select.selectByVisibleText("Baby");






    }
}
