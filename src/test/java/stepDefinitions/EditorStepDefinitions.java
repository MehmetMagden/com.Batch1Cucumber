package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorPage;

public class EditorStepDefinitions {

    EditorPage editorPage;

    @Then("clicks the new button")
    public void clicks_the_new_button() {
        editorPage = new EditorPage();
        editorPage.homePageNewButton.click();


    }
    @Then("enters firstName {string}")
    public void enters_first_name(String firstName) {
        editorPage = new EditorPage();
        editorPage.infoPageFirstNameTextBox.sendKeys(firstName);


    }
    @Then("enters lastName {string}")
    public void enters_last_name(String lastName) {
        editorPage = new EditorPage();
        editorPage.infoPageLastNameTextBox.sendKeys(lastName);

    }
    @Then("enters position {string}")
    public void enters_position(String position) {

        editorPage = new EditorPage();
        editorPage.infoPagePositionTextBox.sendKeys(position);
    }
    @Then("enters office {string}")
    public void enters_office(String office) {
        editorPage = new EditorPage();
        editorPage.infoPageOfficeTextBox.sendKeys(office);
    }
    @Then("enters extension {string}")
    public void enters_extension(String extension) {

        editorPage = new EditorPage();
        editorPage.infoPageExtensionTextBox.sendKeys(extension);

    }
    @Then("enters startDate {string}")
    public void enters_start_date(String startDate) {
        editorPage = new EditorPage();
        editorPage.infoPageStartDateTextBox.sendKeys(startDate);

    }
    @Then("enters salary {string}")
    public void enters_salary(String salary) {
        editorPage = new EditorPage();
        editorPage.infoPageSalaryTextBox.sendKeys(salary);

    }
    @Then("clicks the Create button")
    public void clicks_the_create_button() {
        editorPage = new EditorPage();
        editorPage.infoPageCreateButton.click();

    }
    @When("user searches by {string}")
    public void user_searches_by(String firstName) {
        editorPage = new EditorPage();
        editorPage.homePageSearchTextBox.sendKeys(firstName + Keys.ENTER);

    }
    @Then("verifies that the {string} is in the name section")
    public void verifies_that_the_is_in_the_name_section(String firstName) {
        editorPage = new EditorPage();

        String actualValue = editorPage.afterSearchTableName.getText();
        String expectedValue = firstName;
        Assert.assertTrue(actualValue.contains(expectedValue));

    }
}
