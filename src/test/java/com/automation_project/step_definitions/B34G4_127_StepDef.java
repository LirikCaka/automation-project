package com.automation_project.step_definitions;

import com.automation_project.pages.InfinityLoginPage;
import com.automation_project.utilities.BrowserUtils;
import com.automation_project.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class B34G4_127_StepDef {
    InfinityLoginPage infinityLoginPage = new InfinityLoginPage();
    @When("user add department with name {string}")
    public void user_add_department_with_name(String string) {
        infinityLoginPage.addDepartmentButton.click();

    }
    @Then("user should see created department")
    public void user_should_see_created_department() {
        infinityLoginPage.departmentNameButton.sendKeys("SDETs Dept.");
        infinityLoginPage.addDepartmentButton.click();
        Assert.assertTrue(infinityLoginPage.expectedTitle.isDisplayed());
    }

}
