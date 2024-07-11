package com.automation_project.pages;

import com.automation_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InfinityDashboard {
    public  InfinityDashboard(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(id = "user-name")
    public WebElement fullname;

}
