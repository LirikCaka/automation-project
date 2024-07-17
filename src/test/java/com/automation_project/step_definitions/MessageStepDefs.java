package com.automation_project.step_definitions;

import com.automation_project.pages.MessagePage;
import com.automation_project.utilities.BrowserUtils;
import com.automation_project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MessageStepDefs {

    MessagePage messagePage = new MessagePage();

    @When("user clicks on message tab")
    public void user_clicks_on_message_tab() {
        messagePage.messageBtn.click();
    }
    @Then("user should be able to send message")
    public void userShouldBeAbleToSendMessage() {
        Driver.getDriver().switchTo().frame(messagePage.iframe);
        messagePage.messageBox.sendKeys("Hello World");
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().defaultContent();
        messagePage.sendBtn.click();

    }

    @Then("user clicks the Send button")
    public void userClicksTheSendButton() {
        messagePage.sendBtn.click();
        BrowserUtils.sleep(2);
    }
    @Then("Then user should see error message displayed {string}")
    public void thenUserShouldSeErrorMessageDisplayed(String errorMessage) {

        messagePage.titleError.isDisplayed();

        String actualErrorMessage = messagePage.titleError.getText();

        Assert.assertEquals(errorMessage, actualErrorMessage);
    }
    @Then("user enter message")
    public void userEnterMessage() {
        Driver.getDriver().switchTo().frame(messagePage.iframe);
        messagePage.messageBox.sendKeys("Hello World");
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().defaultContent();

    }


    @Then("all employees should be set by default")
    public void allEmployeesShouldBeSetByDefault() {
        messagePage.messageBtn.click();
        messagePage.employeesBtnText.isDisplayed();
    }
    @Then("user leave recipient blank")
    public void userLeaveRecipientBlank() {
        messagePage.employeesBtn.click();
    }
    @Then("Then user should se error message {string}")
    public void thenUserShouldSeErrorMessage(String employeesError) {
        messagePage.specifyPersonError.isDisplayed();

        String actualEmployeesMessage = messagePage.specifyPersonError.getText();

        Assert.assertEquals(employeesError, actualEmployeesMessage);
    }

    @Then("user should be able to cancel message")
    public void userShouldBeAbleToCancelMessage() {
        Driver.getDriver().switchTo().frame(messagePage.iframe);
        messagePage.messageBox.sendKeys("Hello World");
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().defaultContent();
        messagePage.cancelBtn.click();
    }


}
