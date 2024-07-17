package com.automation_project.pages;

import com.automation_project.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreampage extends BasePage
{
    public ActivityStreampage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@id='feed-add-post-form-tab']/span/span[1]")
    public List<WebElement> tabOptions;

    public void selectOption(String option){

        String locator=  "(//td[@class='bx-layout-inner-left'])[1]//li//a[contains(.,'"+option+"')]";

        WebElement optionEl = Driver.getDriver().findElement(By.xpath(locator));
        optionEl.click();


    }

}
