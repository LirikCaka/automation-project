package com.automation_project.pages;

import com.automation_project.utilities.BrowserUtils;
import com.automation_project.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfileNamePage {

    public ProfileNamePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "#user-block")
    public WebElement userProfileDropdown;

    @FindBy(xpath = "//span[contains(@class,'menu-popup-item-text')]")
    public List<WebElement> userProfileDropdownOptions;


    public void clickProfileOptionWithText(String Logout){
        clickWithText(userProfileDropdownOptions,Logout);

    }

    public void clickWithText(List<WebElement> elements, String txt) {

        for (WebElement element : elements) {

            if (element.getText().equals(txt)) {
                element.click();
                break;
            }
        }

    }


}
