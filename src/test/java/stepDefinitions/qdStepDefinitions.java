package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.QdPage;
import utilities.ConfigReader;

public class qdStepDefinitions {

    QdPage qdPage;

    @When("User clicks on homepage LoginButton")
    public void user_clicks_on_homepage_login_button() {
        qdPage = new QdPage();
        qdPage.qdHomePageLoginButton.click();


    }
    @When("User will enter an {string} to email box")
    public void user_will_enter_an_to_email_box(String desiredEmail) {
        qdPage = new QdPage();
        qdPage.qdLoginPageMailTextBox.sendKeys(ConfigReader.getProperty(desiredEmail));

    }
    @When("User will enter a {string} to password box")
    public void user_will_enter_a_to_password_box(String desiredPassword) {
        qdPage = new QdPage();

        qdPage.qdLoginPagepasswordTextBox.sendKeys(ConfigReader.getProperty(desiredPassword));
    }
    @When("User will click on loginPage LoginButton")
    public void user_will_click_on_login_page_login_button() {
        qdPage = new QdPage();
        qdPage.qdLoginPageLoginButton.click();
    }
    @Then("Test that User can see MyCourse link")
    public void test_that_user_can_see_my_course_link() {
        qdPage = new QdPage();

        Assert.assertTrue(qdPage.qdAfterLoginMyCourseLink.isDisplayed());
    }

    @Then("Test that user could not be login")
    public void testThatUserCouldNotBeLogin() {
        qdPage = new QdPage();
        Assert.assertTrue(qdPage.qdLoginPageMailTextBox.isDisplayed());


    }

    @And("User will wait for {int} sec")
    public void userWillWaitForSec(int sec) {

        try {
            Thread.sleep(sec*1000);
        } catch (InterruptedException e) {

        }

    }

    @And("User will manually enter an {string} to email box")
    public void userWillManuallyEnterAnToEmailBox(String emailValue) {

        qdPage = new QdPage();
        qdPage.qdLoginPageMailTextBox.sendKeys(emailValue);

    }

    @And("User will manually enter a {string} to password box")
    public void userWillManuallyEnterAToPasswordBox(String passwordValue) {

        qdPage = new QdPage();

        qdPage.qdLoginPagepasswordTextBox.sendKeys(passwordValue);
    }
}
