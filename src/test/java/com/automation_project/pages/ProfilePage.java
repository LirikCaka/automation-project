package com.automation_project.pages;

import com.automation_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage {
    public ProfilePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-block")
    public WebElement profileDropdown;

    @FindBy(xpath = "//span[.='My Profile']")
    public WebElement myProfileOption;

   // @FindBy(xpath = "//*[@id='profile-menu-filter']")
   @FindBy(css = "#profile-menu-filter a")
    public List<WebElement> profilePageModules;

    @FindBy(xpath = "//a[.= 'General']")
    public WebElement generalTab;

    //@FindBy(xpath = "(//a[.='hr1@cydeo.com'])[3]")
    @FindBy(xpath = "//td[.='E-Mail:']/..//a")
    public WebElement displayedEmail;


   



}
