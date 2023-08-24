package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPage {


    public AutoPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement homePageSignUpLoginButton;

    @FindBy (xpath = "//input[@data-qa='signup-name']")
    public WebElement loginPageNewUserNameBox;

    @FindBy (xpath = "//input[@data-qa='signup-email']")
    public WebElement loginPageNewUserEmailBox;

    @FindBy (xpath = "//button[@data-qa='signup-button']")
    public WebElement loginPageNewUserSignupButton;

    @FindBy (xpath = "//input[@id='id_gender1']")
    public WebElement NewUserInformationPageMrRadioButton;

    @FindBy (xpath = "//button[@data-qa='create-account']")
    public WebElement NewUserInformationPageMrCreateButton;

    @FindBy (xpath = "//b[text()='Account Created!']")
    public WebElement registerSuccessMessage;

}
