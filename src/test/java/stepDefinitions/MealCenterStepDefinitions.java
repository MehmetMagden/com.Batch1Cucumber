package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.MealsCenterPage;
import utilities.ConfigReader;
import utilities.Driver;

public class MealCenterStepDefinitions {

    MealsCenterPage mealsCenterPage;

    @Given("Visitor goes to the {string}")
    public void visitor_goes_to_the(String url) {
        Driver.getDriver().get(ConfigReader.getProperty("homePage"));

    }

    @Then("Tests the {string}")
    public void tests_the(String url) {

        String expecterUrl = ConfigReader.getProperty("homePageUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals( "URLs are not same ",  expecterUrl, actualUrl);

    }

    @Then("Tests the title {string}")
    public void testsTheTitle(String title) {
        String expectedTitle = ConfigReader.getProperty(title);
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    @Then("Tests that logo is visible")
    public void testsThatLogoIsVisible() {
        mealsCenterPage = new MealsCenterPage();

        Assert.assertTrue(mealsCenterPage.homePageLogo.isDisplayed());
        Assert.assertTrue(mealsCenterPage.homePageLogo.isEnabled());

    }

    @Then("Tests that SearchTextBox is visible")
    public void testsThatSearchTextBoxIsVisible() {
        mealsCenterPage = new MealsCenterPage();
        Assert.assertTrue(mealsCenterPage.homePageSearchTextBox.isDisplayed());
        Assert.assertTrue(mealsCenterPage.homePageSearchTextBox.isDisplayed());

    }

    @Then("Test that logo is active")
    public void testThatLogoIsActive() {
        mealsCenterPage = new MealsCenterPage();
        mealsCenterPage.homePageLogo.click();

        String expectedUrl = ConfigReader.getProperty("homePageUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();

    }

    @Then("Tests that Cart link is visible")
    public void testsThatCartLinkIsVisible() {
        mealsCenterPage = new MealsCenterPage();
        Assert.assertTrue(mealsCenterPage.homePageCartLink.isDisplayed());
        Assert.assertTrue(mealsCenterPage.homePageCartLink.isEnabled());




    }

    @Then("Test that Cart link is active")
    public void testThatCartLinkIsActive() {
        mealsCenterPage = new MealsCenterPage();
        mealsCenterPage.homePageCartLink.click();
        //ReusableMethods.waitfor(1);
        Assert.assertTrue(mealsCenterPage.afterClickingCartLinkCartSymbol.isDisplayed());
    }

    @Then("Tests that Cart Symbol is visible")
    public void testsThatCartSymbolIsVisible() {
        mealsCenterPage = new MealsCenterPage();
        Assert.assertTrue(mealsCenterPage.homePageCartSymbol.isDisplayed());
        Assert.assertTrue(mealsCenterPage.homePageCartSymbol.isEnabled());


    }

    @Then("Test that Cart Symbol is active")
    public void testThatCartSymbolIsActive() {
        mealsCenterPage = new MealsCenterPage();
        mealsCenterPage.homePageCartSymbol.click();

        Assert.assertTrue(mealsCenterPage.afterClickingCartLinkCartSymbol.isDisplayed());


    }

    @Then("Tests that Sign in link is visible")
    public void testsThatSignInLinkIsVisible() {
        mealsCenterPage = new MealsCenterPage();

        Assert.assertTrue(mealsCenterPage.homePageSignInButton.isDisplayed());
        Assert.assertTrue(mealsCenterPage.homePageSignInButton.isEnabled());


    }

    @Then("Tests that Sign in link is active")
    public void testsThatSignInLinkIsActive() {

        mealsCenterPage = new MealsCenterPage();

        mealsCenterPage.homePageSignInButton.click();

        String expectedUrl ="https://www.mealscenter.com/account/login";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);


    }

    @Then("Tests that Search box is visible")
    public void testsThatSearchBoxIsVisible() {
        mealsCenterPage = new MealsCenterPage();

        Assert.assertTrue(mealsCenterPage.homePageSearchTextBox.isDisplayed());



    }

    @Then("that Search box is active")
    public void thatSearchBoxIsActive() {

        mealsCenterPage = new MealsCenterPage();
        Assert.assertTrue(mealsCenterPage.homePageSearchTextBox.isEnabled());
    }

    @Then("Visiters searches {string} in the search box")
    public void visitersSearchesInTheSearchBox(String address) {
        mealsCenterPage = new MealsCenterPage();
        mealsCenterPage.homePageSearchTextBox.sendKeys(address);

        Driver.getDriver().findElement(By.xpath("//*[text()='London']")).click();


    }

    @Then("Tests that visiter can see restourant regarding to the address")
    public void testsThatVisiterCanSeeRestourantRegardingToTheAddress() {

    Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='d-inline text-truncate']")).isDisplayed());
    Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//*[@class='d-inline text-truncate']")).isEnabled());

    }
}
