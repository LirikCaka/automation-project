package com.automation_project.pages;

import com.automation_project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrivePage {

    public DrivePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@title='Drive']")
    public WebElement DriveButton;

    @FindBy(css = "div[data-text^='My'] a")
    public WebElement MyDriveButton;

    @FindBy(css = "div[data-text^='All'] a")
    public WebElement AllDocumentsButton;

    @FindBy(css = "div[data-text^='Company'] a")
    public WebElement CompanyButton;

    @FindBy(css = "div[data-text*='and'] a")
    public WebElement SalesAndManagementButton;

    @FindBy(css = "div[data-text^='Top'] a")
    public WebElement TopManagementsButton;

    @FindBy(css = "div[data-id='menu_my_disk_volume'] a")
    public WebElement DriveCleanupButton;



}
