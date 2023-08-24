package stepDefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.DemoPage;
import utilities.ReusableMethods;

public class DemoStepDefinitions {

    DemoPage demoPage;

    @Then("Prints the Company list to the console")
    public void prints_the_company_list_to_the_console() {
        demoPage = new DemoPage();

        for (int i = 1; i <demoPage.companyNamesList.size() ; i++) {

            System.out.println(demoPage.companyNamesList.get(i).getText());

        }
    }


    @Then("tests that DCB Bank is listed")
    public void tests_that_dcb_bank_is_listed() {
        demoPage = new DemoPage();
        boolean flag = false;

        for (int i = 1; i <demoPage.companyNamesList.size() ; i++) {

            if (demoPage.companyNamesList.get(i).getText().equals("DCB Bank")){
                flag=true;
                break;
            }

        }

        Assert.assertTrue(flag);


    }

    @Then("Test that the button will be visible after {int} sec")
    public void testThatTheButtonWillBeVisibleAfterSec(int sec) {
        demoPage = new DemoPage();

        // let's create our own explicitly wait by using try-catch

        // it will try to locate the element and if it can not locate it, it will throw an exception
        // catch block will catch the exception and the code in the block will be executed
        try {
            Assert.assertTrue(demoPage.unVisibleButton.isDisplayed());
        } catch (NoSuchElementException e) {
            ReusableMethods.waitfor(1);
            testThatTheButtonWillBeVisibleAfterSec(sec-1);
        }


    }
}
