package com.automation_project.step_definitions;

import com.automation_project.pages.MessagePage;
import com.automation_project.utilities.BrowserUtils;
import com.automation_project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MessageStepDefs {

    MessagePage messagePage = new MessagePage();

    @When("user clicks on message tab")
    public void user_clicks_on_message_tab() {
        messagePage.messageBtn.click();
    }

    @Then("user should see the message table open")
    public void user_should_see_the_message_table_open() {
        messagePage.iframe.isDisplayed();
        BrowserUtils.sleep(3);
    }
    @Then("all employees should be set by default")
    public void allEmployeesShouldBeSetByDefault() {
        messagePage.employeesBtnText.isDisplayed();
    }

    @Then("user should be able to send message")
    public void userShouldBeAbleToSendMessage() {
        messagePage.sendBtn.click();

    }

    @Then("user should se error message if title is not specified")
    public void userShouldSeErrorMessageIfTitleIsNotSpecified() {
        messagePage.titleError.isDisplayed();
    }

    @Then("user should see error if recipient is not selected")
    public void userShouldSeeErrorIfRecipientIsNotSelected() {
        BrowserUtils.sleep(2);
        messagePage.employeesBtn.click();
        BrowserUtils.sleep(2);
        messagePage.sendBtn.click();
        BrowserUtils.sleep(2);
        messagePage.employeesBtnText.isDisplayed();
    }
}
