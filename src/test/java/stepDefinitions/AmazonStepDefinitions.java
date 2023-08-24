package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage;

    @Given("User goes amazon webpage")
    public void user_goes_amazon_webpage() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("User searches for Nutella")
    public void user_searches_for_nutella() {
        amazonPage = new AmazonPage();
        amazonPage.amazonSearchBoxWebElement.sendKeys("Nutella"+ Keys.ENTER);
    }

    @Then("Test that resultText has Nutella in it")
    public void test_that_result_text_has_nutella_in_it() {

        String expectedWord = "Nutella";
        String actualResultText = amazonPage.amazonResultsTextWebElement.getText();
        Assert.assertTrue(actualResultText.contains(expectedWord));

    }

    @Then("User closes the page")
    public void user_closes_the_page() {
        Driver.closeDriver();
    }

    @And("User searches for Samsung")
    public void userSearchesForSamsung() {

        amazonPage = new AmazonPage();
        amazonPage.amazonSearchBoxWebElement.sendKeys("Samsung"+ Keys.ENTER);

    }

    @And("Test that resultText has Samsung in it")
    public void testThatResultTextHasSamsungInIt() {

        String expectedWord = "Samsung";
        String actualResultText = amazonPage.amazonResultsTextWebElement.getText();
        Assert.assertTrue(actualResultText.contains(expectedWord));

    }

    @Given("User searches for Apple")
    public void user_searches_for_apple() {

        amazonPage = new AmazonPage();
        amazonPage.amazonSearchBoxWebElement.sendKeys("Apple"+ Keys.ENTER);
    }

    @Given("Test that resultText has Apple in it")
    public void test_that_result_text_has_apple_in_it() {

        String expectedWord = "Apple";
        String actualResultText = amazonPage.amazonResultsTextWebElement.getText();
        Assert.assertTrue(actualResultText.contains(expectedWord));

    }


    @Then("User searches for {string}")
    public void user_searches_for(String wordToBeSearched) {

        amazonPage = new AmazonPage();
        amazonPage.amazonSearchBoxWebElement.sendKeys(wordToBeSearched+ Keys.ENTER);

    }
    @Then("Test that resultText has {string} in it")
    public void test_that_result_text_has_in_it(String wordToBeSearched) {

        String expectedWord = wordToBeSearched;
        String actualResultText = amazonPage.amazonResultsTextWebElement.getText();
        Assert.assertTrue(actualResultText.contains(expectedWord));
    }

    @Given("User goes {string} webpage")
    public void user_goes_webpage(String dersierdURL) {

        Driver.getDriver().get(ConfigReader.getProperty(dersierdURL));
    }

    @Then("Test that url has {string} in it")
    public void test_that_url_has_in_it(String expectedWord) {


        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedWord));


    }


    @Then("Test that the products at first page has Nutella Hazelnut")
    public void testThatTheProductsAtFirstPageHasNutellaHazelnut() {
        amazonPage = new AmazonPage();
        boolean flag = false;


        for (int i = 0; i < amazonPage.searchedProductsList.size(); i++) {

            if (amazonPage.searchedProductsList.get(i).getText().contains("Nutella Hazelnut")){

                flag=true;
                break;
            }

        }

        Assert.assertTrue(flag);


    }
}
