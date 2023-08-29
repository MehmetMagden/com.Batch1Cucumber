package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.WebPage;
import utilities.Driver;

import java.util.Set;

public class WebStepDefinitions {

    WebPage webPage;
    String firstPageHandleValue =""; // we need to store firstPage Handle value because we are planing to go back to first tab
    // , and we need to create it in class level
    //so we can use it in different methods
    String secondPageHandleValue ="";

    @Then("Scroll down to Login Portal")
    public void scroll_down_to_login_portal() {

        // I don't need to scroll down to see login portal

    }
    @Then("Click Login Portal")
    public void click_login_portal() {
        webPage = new WebPage();
        firstPageHandleValue = Driver.getDriver().getWindowHandle();
        webPage.homePageLoginPortalLink.click();

    }
    @Then("Switch to other window")
    public void switch_to_other_window() {

        Set<String> handleValuesSet = Driver.getDriver().getWindowHandles();

        for (String eachValue: handleValuesSet
             ) {
            if (!eachValue.equals(firstPageHandleValue)){
                secondPageHandleValue = eachValue;
            }

        }

        Driver.getDriver().switchTo().window(secondPageHandleValue);


    }
    @Then("Write values in the {string} and {string} boxes")
    public void write_values_in_the_and_boxes(String userName, String password) {
        webPage = new WebPage();
        webPage.secondTabUserName.sendKeys(userName);
        webPage.secondTabPassword.sendKeys(password);

    }
    @Then("Press the login button")
    public void press_the_login_button() {
        webPage = new WebPage();
        webPage.loginButton.click();
    }
    @Then("Test that the popup text is {string}")
    public void test_that_the_popup_text_is(String expectedMessage) {
        String actualMessage = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(expectedMessage,actualMessage);



    }
    @Then("Close the Popup by saying Ok")
    public void close_the_popup_by_saying_ok() {
        Driver.getDriver().switchTo().alert().accept();

    }
    @Then("Go back to the first page")
    public void go_back_to_the_first_page() {

        Driver.getDriver().switchTo().window(firstPageHandleValue);

    }
    @Then("Test that the first page is returned")
    public void test_that_the_first_page_is_returned() {
        webPage = new WebPage();
        Assert.assertTrue(webPage.firstTabTextValue.isDisplayed());


    }


    @And("User closes all pages")
    public void userClosesAllPages() {

        Driver.quitDriver();
    }


}
