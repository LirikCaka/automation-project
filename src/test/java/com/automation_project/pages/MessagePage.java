package com.automation_project.pages;

import com.automation_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {

    public MessagePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


@FindBy(xpath = "//span[.='Message']")

    public WebElement messageBtn;

@FindBy(xpath = "//iframe[@class='bx-editor-iframe']")

    public WebElement iframe;

@FindBy(xpath = "//button[@id='blog-submit-button-save']")

    public WebElement sendBtn;


    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")

    public WebElement cancelBtn;


    @FindBy(xpath = "//span[@class='feed-add-post-destination-text']")

    public WebElement employeesBtnText;

    @FindBy(xpath = "//span[.='The message title is not specified']")

    public WebElement titleError;


    @FindBy(xpath = "//span[.='Please specify at least one person.']")

    public WebElement specifyPersonError;

    @FindBy(xpath = "//div[@class='feed-add-post-text']")
    public WebElement iframeBody;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")

    public WebElement employeesBtn;


}
