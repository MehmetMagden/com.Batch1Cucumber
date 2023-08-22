package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.HeroPage;

public class HeroStepDefinitions {

    HeroPage heroPage;

    @When("Click the Add Element button")
    public void click_the_add_element_button() {
        heroPage = new HeroPage();
        heroPage.addElementButton.click();


    }
    @When("Wait until the Delete button is visible")
    public void wait_until_the_delete_button_is_visible() throws InterruptedException {
        Thread.sleep(2000);

    }
    @Then("Test that the Delete button is visible")
    public void test_that_the_delete_button_is_visible() {
        heroPage = new HeroPage();

        try {
            Assert.assertTrue(heroPage.deleteButton.isDisplayed());
        } catch (Exception e) {
            Assert.assertTrue(false);
        }


        // if the delete button is not there system won't be able to locate it so it will throw an exception

    }
    @Then("Delete the button by pressing the Delete button")
    public void delete_the_button_by_pressing_the_delete_button() {
        heroPage = new HeroPage();
        heroPage.deleteButton.click();


    }
    @Then("Test that the delete button is not visible")
    public void test_that_the_delete_button_is_not_visible() {

        //Thread.sleep(3000);
        heroPage = new HeroPage();

        try {
            heroPage.deleteButton.isDisplayed();  // delete button is not there so it will throw an exception
            Assert.assertTrue(false); // if detele button is not there, this line won't be executed because of the exception.
        } catch (Exception e) {   // if it throws an exception it means delete button is not there and test should pass
           Assert.assertTrue(true);
        }
        //Thread.sleep(3000);

    }

}
