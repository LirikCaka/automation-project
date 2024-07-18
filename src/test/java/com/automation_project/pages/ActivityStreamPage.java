package com.automation_project.pages;
import com.automation_project.utilities.BrowserUtils;
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
    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageBoxFrame;
    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBox;
    @FindBy(xpath = "//img")
    public WebElement picture;

    public void uploadFile(String fileName) {
        String fileSeparator = System.getProperty("file.separator");
        String path = System.getProperty("user.dir") + fileSeparator + "src/test/resources/Files" + fileSeparator + fileName;
        btn_upload.sendKeys(path);

    }
    public static void switchToFrame(WebElement frameElement) {
        Driver.getDriver().switchTo().frame(frameElement);
    }
    public static void switchToDefaultContent() {
        Driver.getDriver().switchTo().defaultContent();
    }
    public String getMessageContent() {
        switchToFrame(messageBoxFrame);
        String message=messageBox.getText();
        switchToDefaultContent();
        return message;
    }

    public String getPictureSrcFromMessage() {
        switchToFrame(messageBoxFrame);
        BrowserUtils.waitFor(5);
        String source=picture.getAttribute("src");
        switchToDefaultContent();
        return source;
    }
    //public String getPictureSrcFromMessage() {

      //  public String getMessageContent (int indexOfMessage){
           // return messages.get(indexOfMessage - 1).getText();
        }



//C:\Users\arzug\Downloads\Portal.yeni.png



