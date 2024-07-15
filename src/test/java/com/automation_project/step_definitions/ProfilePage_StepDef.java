package com.automation_project.step_definitions;

import com.automation_project.pages.ProfilePage;
import com.automation_project.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProfilePage_StepDef {

    ProfilePage profilePage = new ProfilePage();


    @When("user clicks on profile dropdown")
    public void user_clicks_on_profile_dropdown() {
        profilePage.profileDropdown.click();

    }
    @When("user clicks on My Profile option")
    public void user_clicks_on_my_profile_option() {
        profilePage.myProfileOption.click();


    }
    @Then("user should see below options on my Profile Page")
    public void user_should_see_below_options_on_my_profile_page(List<String> expectedModules) {


       List<String> actualModules = BrowserUtils.getElementsText(profilePage.profilePageModules);


        System.out.println("actualModules.size() = " + actualModules.size());


        Assert.assertEquals("Profile page options do not match", expectedModules, actualModules);

    }

    @And("user selects the {string} tab")
    public void userSelectsTheTab(String tabName) {
        profilePage.generalTab.isSelected();
    }

    @Then("the email displayed should match {string}")
    public void theEmailDisplayedShouldMatch(String expectedEmail) {

        BrowserUtils.waitForVisibility(profilePage.displayedEmail,10);

        String actualEmail = profilePage.displayedEmail.getText();


        Assert.assertEquals("the email dispalyed does not match",  expectedEmail, actualEmail);

    }
}
