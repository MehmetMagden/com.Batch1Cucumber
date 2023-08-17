package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class QdPage {

    public QdPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-sign-in-simple']")
    public WebElement qdHomePageLoginButton;

    @FindBy (xpath = "//input[@name='email']")
    public WebElement qdLoginPageMailTextBox;

    @FindBy (xpath = "//input[@name='password']")
    public WebElement qdLoginPagepasswordTextBox;

    @FindBy (xpath = "//button[@class='btn red radius-5 mt-4 w-100']")
    public WebElement qdLoginPageLoginButton;

    @FindBy (xpath = "//a[text()='My courses']")
    public WebElement qdAfterLoginMyCourseLink;
}
