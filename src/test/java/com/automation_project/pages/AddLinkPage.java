package com.automation_project.pages;
import com.automation_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AddLinkPage {

    public AddLinkPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "// * [@id='bx-b-link-blogPostForm']")
    public WebElement linkBtn;


    @FindBy(xpath = "//*[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement linkInput;

    @FindBy(xpath = "//input[@placeholder='Link URL']")
    public WebElement addLink;

    @FindBy(xpath = "//*[@id='undefined']")
    public WebElement saveLink;

    @FindBy(xpath = "//a[@href=\"https://cydeo.com/\"]")
    public WebElement correctUrl;

    }



