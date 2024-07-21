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

        addLinkPage.linkInput.sendKeys("https://cydeo.com/");

        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().defaultContent();
        addLinkPage.linkBtn.click();

    }

    @Given("user added a link to the message")
    public void userAddedALinkToTheMessage() {
        addLinkPage.addLink.sendKeys("\"https://cydeo.com/\"");


    }

    @Then("user saved a link")
    public void userSavedALink() {
        addLinkPage.saveLink.click();
    }

    @Then("user should be navigated to the correct url")
    public void userShouldBeNavigatedToTheCorrectUrl() {
        addLinkPage.correctUrl.click();

        String linkUrl = addLinkPage.saveLink.getText();
        if (linkUrl.equals("\"https://cydeo.com/\"")) {
            System.out.println("User navigate to the correct URL");
        } else {
            System.out.println("User does not navigate to the correct URL");
        }
    }



}
