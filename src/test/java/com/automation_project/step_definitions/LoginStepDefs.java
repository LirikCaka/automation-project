package com.automation_project.step_definitions;


import com.automation_project.pages.LoginPage;
import com.automation_project.utilities.BrowserUtils;
import com.automation_project.utilities.ConfigurationReader;
import com.automation_project.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

    }

    @When("user logs in as {string}")
    public void user_logs_in_as(String userType) {
        loginPage.login(userType);
    }

    @Then("user should be able to see {string} as page title")
    public void userShouldLandOnHomePageWith(String title) {

        BrowserUtils.verifyTitleContains(title);
    }


    @When("user logged in with username as {string} and password as {string}")
    public void userLoggedInWithUsernameAsAndPasswordAs(String username, String password) {

       loginPage.login(username,password);

    }

    @Then("user should be able to see error message {string}")
    public void userShouldBeAbleToSeeErrorMessage(String expectedMessage) {

        Assert.assertEquals(expectedMessage, loginPage.errMessage.getText());

    }

    @Then("user should be able to see remember me box")
    public void userShouldBeAbleToSeeRememberMeBox() {
        Assert.assertTrue(loginPage.checkBox_rememberMe.isDisplayed());
    }

    @When("user clicks Remember me checkbox")
    public void userClicksRememberMeCheckbox() {
        loginPage.checkBox_rememberMe.click();

    }

    @Then("user should be able to see Remember me checkbox clicked")
    public void userShouldBeAbleToSeeRememberMeCheckboxClicked() {
        Assert.assertTrue(loginPage.checkBox_rememberMe.isSelected());
    }

    @Then("user should be able to see password is in bullet signs by default")
    public void userShouldBeAbleToSeePasswordIsInBulletSignsByDefault() {
        Assert.assertEquals("password", BrowserUtils.getAttributeValue(loginPage.txtBox_password, "type"));
    }

    @When("user is logged with username as {string} and password as {string}")
    public void userIsLoggedWithUsernameAsAndPasswordAs(String username, String password) {
        loginPage.login(username,password);
    }
    @Then("user should be able to see error  {string} message")
    public void usersShouldBeAbleToSeeErrorMessage(String expectedMessage) {

        if (loginPage.actualMassage.isDisplayed()){

            System.err.println(expectedMessage + " is not displayed");
        }




    }
}
