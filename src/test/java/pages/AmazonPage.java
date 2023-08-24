package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonPage {

    public AmazonPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy (id = "twotabsearchtextbox")
    public WebElement amazonSearchBoxWebElement;

    @FindBy (xpath = "//div[@class='sg-col-14-of-20 sg-col-18-of-24 sg-col s-breadcrumb sg-col-10-of-16 sg-col-6-of-12']")
    public WebElement amazonResultsTextWebElement;

    @FindBy (xpath = "//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")
    public List<WebElement> searchedProductsList;


}
