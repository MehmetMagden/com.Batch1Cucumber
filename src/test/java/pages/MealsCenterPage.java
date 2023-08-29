package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MealsCenterPage {

    public MealsCenterPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//img[@class='img-200'])[1]")
    public WebElement homePageLogo;

    @FindBy (xpath = "//input[@class='form-control form-control-text']")
    public WebElement homePageSearchTextBox;

    @FindBy ( xpath = "//a[@class='ssm-toggle-navx']")
    public WebElement homePageCartLink;

    @FindBy(xpath = "//*[@class='no-results m-auto']")
    public WebElement afterClickingCartLinkCartSymbol;

    @FindBy (xpath = "//a[@class='cart-handle ssm-toggle-navx']")
    public  WebElement homePageCartSymbol;

    @FindBy (xpath = "//a[text()='Sign in']")
    public WebElement homePageSignInButton;



}
