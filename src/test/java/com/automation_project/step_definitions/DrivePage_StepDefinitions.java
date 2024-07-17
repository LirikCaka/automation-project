package com.automation_project.step_definitions;

import com.automation_project.pages.BasePage;
import com.automation_project.pages.DrivePage;
import com.automation_project.pages.LoginPage;
import com.automation_project.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class DrivePage_StepDefinitions {

    DrivePage drivePage = new DrivePage();

    @Then("user clicks on Drive button")
    public void user_clicks_on_drive_button() {

        drivePage.DriveButton.click();

    }
    @Then("user can see the following modules on the Drive page.")
    public void user_can_see_the_following_modules_on_the_drive_page(List<String> modules){
        String actualModule = drivePage.MyDriveButton.getText();
        String expected = modules.get(0);
        Assert.assertEquals(actualModule,expected);

        actualModule = drivePage.AllDocumentsButton.getText();
        expected = modules.get(1);
        Assert.assertEquals(actualModule,expected);

        actualModule = drivePage.CompanyButton.getText();
        expected = modules.get(2);
        Assert.assertEquals(actualModule,expected);

        actualModule = drivePage.SalesAndManagementButton.getText();
        expected = modules.get(3);
        Assert.assertEquals(actualModule,expected);

        actualModule = drivePage.TopManagementsButton.getText();
        expected = modules.get(4);
        Assert.assertEquals(actualModule,expected);

        actualModule = drivePage.DriveCleanupButton.getText();
        expected = modules.get(5);
        Assert.assertEquals(actualModule,expected);


    }
}
