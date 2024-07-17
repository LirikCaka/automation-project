package com.automation_project.pages;

import com.automation_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationCreationPage {

    public AppreciationCreationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='menu-item-link']//span)[1]")
   public WebElement activityStreamPage;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreDropdown;

    @FindBy(xpath = "(//span[.='Appreciation'])[2]")
    public WebElement appreciationTab;

    @FindBy(xpath = "//iframe")
    public WebElement iframe;


    @FindBy(css = "body[contenteditable='true']")
    public WebElement appreciationMessageBox;

    @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")
    public WebElement ToField;


    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(xpath = "//div[.='Great job!']")
    public WebElement appearedAppreciation;


    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement errMessage1;

   @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement cancelToButton;

    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errMessage2;


    @FindBy(id = "blog-submit-button-cancel")
    public WebElement appreciationCancelButton;

   @FindBy(id = "pagetitle")
    public WebElement activityStreamPageTitle;

}
