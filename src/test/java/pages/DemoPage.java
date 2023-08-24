package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoPage {

    public DemoPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//table/tbody/tr/td[1]")
    public List<WebElement> companyNamesList;

    @FindBy (id = "visibleAfter")
    public WebElement unVisibleButton;


}
