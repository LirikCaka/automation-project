package com.automation_project.step_definitions;

import com.automation_project.pages.ProfileNamePage;
import com.automation_project.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProfileName_StepDefinitions {

    ProfileNamePage profileNamePage = new ProfileNamePage();

    @And("user clicks {string} option from profile option")
    public void userClicksOptionFromProfileOption(String Logout) {
        profileNamePage.clickProfileOptionWithText(Logout);
    }

    @Then("user should see {int} option under the on my profile name")
    public void userShouldSeeOptionUnderTheOnMyProfileName(List<String> expectedOptions) {

        List<String>actualOptions= BrowserUtils.getElementsText(profileNamePage.userProfileDropdownOptions);
        Assert.assertEquals(expectedOptions, actualOptions);
    }
}
