package com.automation_project.step_definitions;

import com.automation_project.pages.InfinityDashboard;
import com.automation_project.pages.InfinityLoginPage;
import com.automation_project.utilities.ConfigurationReader;
import com.automation_project.utilities.Driver;
import com.automation_project.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InfinityB34G492Step_Def {
    String path="InfinityProjectCredentials1.xlsx";
    String firstname;
    //String lastname;


    InfinityLoginPage infinityLoginPage = new InfinityLoginPage();
    InfinityDashboard infinityDashboard = new InfinityDashboard();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("the user login with given credentials from {string} and {int}")
    public void the_user_login_with_given_credentials_from_and(String SheetName, Integer RowNumber) {
        ExcelUtil excelUtil = new ExcelUtil(path, SheetName);
        String username = excelUtil.getCellData(RowNumber, 0);
        String password = excelUtil.getCellData(RowNumber, 1);
        firstname = excelUtil.getCellData(RowNumber, 2);
        //lastname = excelUtil.getCellData(RowNumber, 3);

        infinityLoginPage.login(username, password);

    }

    @Then("the user should be able to log in and see their name")
    public void the_user_should_be_able_to_log_in_and_see_their_name() {
        String actualFullName = infinityDashboard.fullname.getText();
        Assert.assertTrue(actualFullName.contains(firstname));


    }
}
