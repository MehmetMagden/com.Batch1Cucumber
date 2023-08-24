package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.Driver;
import utilities.ReusableMethods;

public class WalmartStepDefinitions {

    @When("User clicks on shop furniture link")
    public void user_clicks_on_shop_furniture_link() {
        // if we can not click on a webelement by using selenium, we can use JS code
        //WebElement element = driver.findElement(By.id("gbqfd"));
        //JavascriptExecutor executor = (JavascriptExecutor)driver;
        //executor.executeScript("arguments[0].click();", element);

        WebElement walmartShopFurnitureLink = Driver.getDriver().findElement(By.xpath("//button[@data-testid='royal_login_button']"));

        JavascriptExecutor jsExecuter = (JavascriptExecutor) Driver.getDriver();
        //ReusableMethods.waitfor(10);
        jsExecuter.executeScript("arguments[0].click();",walmartShopFurnitureLink);


    }


    @Then("Test that regarding page is reached")
    public void test_that_regarding_page_is_reached() {

        WebElement facebookText = Driver.getDriver().findElement(By.xpath("//div[@class='_9ay7']"));
        Assert.assertTrue(facebookText.isDisplayed());

    }


}
