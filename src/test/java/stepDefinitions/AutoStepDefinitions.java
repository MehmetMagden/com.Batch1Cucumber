package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutoPage;
import utilities.Driver;

public class AutoStepDefinitions {

    String name ="";
    AutoPage autoPage;

    @Given("clicks the user sign in link")
    public void clicks_the_user_sign_in_link() {

        autoPage = new AutoPage();

        autoPage.homePageSignUpLoginButton.click();

    }
    @Given("user enters email address in Create and account section")
    public void user_enters_email_address_in_create_and_account_section() {
        Faker faker = new Faker();
        autoPage = new AutoPage();

        name =faker.name().firstName();

        autoPage.loginPageNewUserNameBox.sendKeys(name);

        autoPage.loginPageNewUserEmailBox.sendKeys(faker.internet().emailAddress());


    }
    @Given("clicks the Create an Account button")
    public void clicks_the_create_an_account_button() {
        autoPage = new AutoPage();
        autoPage.loginPageNewUserSignupButton.click();
    }
    @Given("user enters personal and contact information")
    public void user_enters_personal_and_contact_information() {
        autoPage = new AutoPage();
        Actions actions = new Actions(Driver.getDriver());
        Faker faker = new Faker();

        autoPage.NewUserInformationPageMrRadioButton.click();

        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("11")
                .sendKeys(Keys.TAB)
                .sendKeys("May")
                .sendKeys(Keys.TAB)
                .sendKeys("1999")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(name)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys("Canada")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();




    }
    @Given("the user clicks the Register button")
    public void the_user_clicks_the_register_button() {
        autoPage = new AutoPage();
        autoPage.NewUserInformationPageMrCreateButton.click();
    }
    @Then("verify account creation")
    public void verify_account_creation() {
        autoPage = new AutoPage();
        Assert.assertTrue(autoPage.registerSuccessMessage.isDisplayed());

    }
}
