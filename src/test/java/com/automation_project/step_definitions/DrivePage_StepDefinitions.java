package com.automation_project.step_definitions;

import com.automation_project.pages.BasePage;
import com.automation_project.pages.DrivePage;
import com.automation_project.pages.LoginPage;
import com.automation_project.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class DrivePage_StepDefinitions {

    DrivePage page = new DrivePage();

    @Then("user clicks on Drive button")
    public void user_clicks_on_drive_button() {

        page.DriveButton.click();

    }
    @Then("user can see the following modules on the Drive page.")
    public void user_can_see_the_following_modules_on_the_company_page_shown_as_design(List<String> modules) {
        List<WebElement> elements = Arrays.asList(
                page.MyDriveButton,
                page.AllDocumentsButton,
                page.CompanyButton,
                page.SalesAndManagementButton,
                page.TopManagementsButton,
                page.DriveCleanupButton
        );

        for (int i = 0; i < elements.size(); i++) {
            String actualModule = elements.get(i).getText();
            String expected = modules.get(i);
            Assert.assertEquals("Module at index " + i + " does not match", actualModule, expected);
        }
    }
}
