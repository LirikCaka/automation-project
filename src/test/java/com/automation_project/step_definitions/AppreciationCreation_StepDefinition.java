package com.automation_project.step_definitions;

import com.automation_project.pages.AppreciationCreationPage;
import com.automation_project.utilities.BrowserUtils;
import com.automation_project.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AppreciationCreation_StepDefinition {
    AppreciationCreationPage appreciationCreationPage = new AppreciationCreationPage();


    @When("user navigates to the Activity Stream page")
    public void userNavigatesToTheActivityStreamPage() {
        appreciationCreationPage.activityStreamPage.click();
    }

    @And("user clicks on More dropdown option")
    public void userClicksOnMoreDropdownOption() {
        appreciationCreationPage.moreDropdown.click();

    }


    @And("user clicks on the Appreciation tab")
    public void user_clicks_on_the_appreciation_tab() {
        appreciationCreationPage.appreciationTab.click();

    }


    @And("the user enters {string} in the Message content field")
    public void theUserEntersInTheMessageContentField(String appreciationMessageContent) {

        Driver.getDriver().switchTo().frame(appreciationCreationPage.iframe);

        appreciationCreationPage.appreciationMessageBox.sendKeys(appreciationMessageContent);

        Driver.getDriver().switchTo().defaultContent();

    }



    @And("the user selects {string} in the To field")
    public void theUserSelectsInTheToField(String appreciationReceiver) {
        appreciationCreationPage.ToField.isSelected();


    }

    @And("the user clicks the Send button")
    public void theUserClicksTheSendButton() {
        appreciationCreationPage.sendButton.click();
    }

    @Then("the appreciation should appear in the Activity Stream")
    public void theAppreciationShouldAppearInTheActivityStream() {

        appreciationCreationPage.appearedAppreciation.isDisplayed();
    }


    @And("user clicks the Send button without entering any data")
    public void userClicksTheSendButtonWithoutEnteringAnyData() {

        appreciationCreationPage.sendButton.click();
    }

    @Then("the system should display {string}")
    public void theSystemShouldDisplay(String expectedErrMessage1) {

        appreciationCreationPage.errMessage1.isDisplayed();

        String actualErrMessage1 = appreciationCreationPage.errMessage1.getText();

        Assert.assertEquals(expectedErrMessage1, actualErrMessage1);
    }

    @And("user cancel the selected receiver")
    public void userCancelTheSelectedReceiver() {

        appreciationCreationPage.cancelToButton.click();
    }


    @And("user clicks the Send button without selecting receiver")
    public void userClicksTheSendButtonWithoutSelectingReceiver() {

        appreciationCreationPage.sendButton.click();
    }


   @Then("the system should display following error message {string}")
   public void theSystemShouldDisplayFollowingErrorMessage(String expectedErrMessage2) {

       appreciationCreationPage.errMessage2.isDisplayed();

        String actualErrMessage2 = appreciationCreationPage.errMessage2.getText();


        Assert.assertEquals(expectedErrMessage2, actualErrMessage2);
    }


    @Then("the delivery option should be set to {string} by default")
    public void theDeliveryOptionShouldBeSetToByDefault(String expectedDeliveryOption) {

        appreciationCreationPage.ToField.isSelected();

        String actualDeliveryOption = appreciationCreationPage.ToField.getText();

        Assert.assertEquals(expectedDeliveryOption, actualDeliveryOption);
    }


    @And("the user clicks the Cancel button and appreciation cancelled")
    public void theUserClicksTheCancelButtonAndAppreciationCancelled() {


        appreciationCreationPage.appreciationCancelButton.click();
}


    @Then("the user should be returned to the {string} page")
    public void theUserShouldBeReturnedToThePage(String expectedTitle) {

        String actualTitle = appreciationCreationPage.activityStreamPageTitle.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
}



