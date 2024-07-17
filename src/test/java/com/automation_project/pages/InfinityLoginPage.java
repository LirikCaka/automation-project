package com.automation_project.pages;

import com.automation_project.utilities.Driver;
import com.github.javafaker.Company;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfinityLoginPage {
    public InfinityLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='USER_LOGIN']")
    public WebElement username;

    @FindBy (xpath = "//input[@name='USER_PASSWORD']")
    public WebElement password;

    @FindBy(xpath = "//input[@class='login-btn']")
    public WebElement loginButton;

    public void login(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }
    @FindBy(linkText = "Employees")
    public WebElement employeesButton;

    @FindBy(xpath = "//span[@class='webform-small-button-text']")
    public WebElement addDepartmentButton;

    @FindBy(xpath = "//input[@id='NAME']")
    public WebElement departmentNameButton;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public WebElement addDepartmentNameButton;

    @FindBy(xpath = "//a[@title='SDETs Dept.']")
    public WebElement expectedTitle;

    @FindBy(xpath = "//span[@id='pagetitle']")
    public WebElement pageTitle;



}


