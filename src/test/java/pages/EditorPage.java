package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditorPage {

    public EditorPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//button[@class='dt-button buttons-create']")
    public WebElement homePageNewButton;

    @FindBy(id = "DTE_Field_first_name")
    public WebElement infoPageFirstNameTextBox;

    @FindBy(id = "DTE_Field_last_name")
    public WebElement infoPageLastNameTextBox;

    @FindBy(id = "DTE_Field_position")
    public WebElement infoPagePositionTextBox;

    @FindBy(id = "DTE_Field_office")
    public WebElement infoPageOfficeTextBox;

    @FindBy(id = "DTE_Field_extn")
    public WebElement infoPageExtensionTextBox;

    @FindBy(id = "DTE_Field_start_date")
    public WebElement infoPageStartDateTextBox;

    @FindBy(id = "DTE_Field_salary")
    public WebElement infoPageSalaryTextBox;

    @FindBy(xpath = "//button[text()='Create']")
    public WebElement infoPageCreateButton;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement homePageSearchTextBox;

    @FindBy (xpath = "//td[@class='sorting_1']")
    public  WebElement afterSearchTableName ;


}
