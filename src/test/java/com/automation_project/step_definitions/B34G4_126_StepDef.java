package com.automation_project.step_definitions;

import com.automation_project.pages.InfinityLoginPage;
import com.automation_project.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class B34G4_126_StepDef {
    InfinityLoginPage infinityLoginPage = new InfinityLoginPage();
    @When("user clicks {string}")
    public void user_clicks(String string) {
        infinityLoginPage.employeesButton.click();
    }
    @Then("user should be able to see {string} Employees page")
    public void user_should_be_able_to_see_employees_page(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Company Structure"));

//
//        String actualTitle = Driver.getDriver().getTitle();
//        String expectedTitle = "Company Structure";
//
//        Assert.assertEquals(expectedTitle, actualTitle);
    }

}
