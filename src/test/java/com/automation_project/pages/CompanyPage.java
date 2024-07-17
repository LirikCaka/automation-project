package com.automation_project.pages;

import com.automation_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {

    public CompanyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@title='Company']")
    public WebElement CompanyPageButton;

    @FindBy(css = "div[data-text$='Information'] a")
    public WebElement InformationModule;
    @FindBy(css = "div[data-text^='Our'] a")
    public WebElement OurLifeModule;
    @FindBy(css = "div[data-text^='About'] a")
    public WebElement AboutModule;
    @FindBy(css = "div[data-text^='Photo'] a")
    public WebElement PhotoModule;
    @FindBy(css = "div[data-text='Video'] a")
    public WebElement VideoModule;
    @FindBy(css = "div[data-link='item5'] a")
    public WebElement CareerModule;
    @FindBy(css = "div[data-text*='News'] a")
    public WebElement NewsModule;
    @FindBy(css = "div[data-link='item7'] a")
    public WebElement MoreModule;

}
