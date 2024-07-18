package com.automation_project.pages;
import com.automation_project.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage  {

    public ActivityStreamPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "feed-add-post-form-tab-message")
    public WebElement messageBtn;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement btn_upload;

    public void uploadFile(String fileName) {
        String fileSeparator = System.getProperty("url");
        String path = System.getProperty("user.dir ") + fileSeparator + "src/test/resources/Files" + fileSeparator + fileName;
        btn_upload.sendKeys(path);

    }

    //public String getPictureSrcFromMessage() {

      //  public String getMessageContent (int indexOfMessage){
           // return messages.get(indexOfMessage - 1).getText();
        }



//C:\Users\arzug\Downloads\Portal.yeni.png



