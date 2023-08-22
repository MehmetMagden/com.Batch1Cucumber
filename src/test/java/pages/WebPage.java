package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebPage {

    public WebPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//h1[text()='LOGIN PORTAL']")
    public WebElement homePageLoginPortalLink;

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement secondTabUserName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement secondTabPassword;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='My Courses & Promo Codes']")
    public WebElement firstTabTextValue;

}
