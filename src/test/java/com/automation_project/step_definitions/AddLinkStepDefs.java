package com.automation_project.step_definitions;

import com.automation_project.pages.AddLinkPage;
import com.automation_project.utilities.BrowserUtils;
import com.automation_project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddLinkStepDefs {

    AddLinkPage addLinkPage = new AddLinkPage();

    @And("user navigates to the link button")
    public void userNavigatesToTheLinkButton() {
    }

    @And("user click on the link button")
    public void userClickOnTheLinkButton() {
        addLinkPage.linkBtn.click();
    }

    @Then("user attaches a link to the specified text")
    public void userAttachesALinkToTheSpecifiedText() {
        addLinkPage.linkInput.sendKeys("url");

        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().defaultContent();
        addLinkPage.linkBtn.click();

    }

    @Given("user added a link to the message")
    public void userAddedALinkToTheMessage() {

    }
    @Then("user saved a link")
    public void userSavedALink() {
    }

    @Then("user should be navigated to the correct url")
    public void userShouldBeNavigatedToTheCorrectUrl() {
        addLinkPage.correctUrl.click();
    }


    @Then("the link should open in a new tab")
    public void theLinkShouldOpenInANewTab() {

    }
}
