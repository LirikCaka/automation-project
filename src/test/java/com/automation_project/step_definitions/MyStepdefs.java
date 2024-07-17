package com.automation_project.step_definitions;

import com.automation_project.pages.ActivityStreampage;
import com.automation_project.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class MyStepdefs {
    ActivityStreampage options=new ActivityStreampage();
    @And("user clicks {string}")
    public void userClicks(String option) {

        options.selectOption(option);
        BrowserUtils.sleep(2);
    }


    @Then("user should be to see the following options on the Activity Stream page")
    public void userShouldBeToSeeTheFollowingOptionsOnTheActivityStreamPage(List<String>expectedOptions) {

        List<String> actualOptions = BrowserUtils.getElementsText(options.tabOptions);

        Assert.assertEquals(expectedOptions,actualOptions);
    }
}


