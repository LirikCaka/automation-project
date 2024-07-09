package com.automation_project.pages;


import com.automation_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userName;



    @FindBy(name="USER_PASSWORD")
    public WebElement password;

    @FindBy(xpath = "//div[@class='errortext']")

    public WebElement errorMessage;

    @FindBy(xpath = "//input[@type='submit']")

    public WebElement loginButton;





}
