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


    @When("user logs in as {string}")
    public void user_logs_in_as(String userType) {
        loginPage.login(userType);
    }

    @Then("user should be able to see {string} as page title")
    public void userShouldLandOnHomePageWith(String title) {
        BrowserUtils.verifyTitleContains(title);
    }

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

    }

    @When("user enters Human Resource username")
    public void user_enters_human_resource_username() {

        loginPage.txtBox_userName.sendKeys(ConfigurationReader.getProperty("HR_username"));

    }

    @When("user enters Human Resource password")
    public void user_enters_human_resource_password() {
        loginPage.txtBox_password.sendKeys(ConfigurationReader.getProperty("HR_password") + Keys.ENTER);

    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

    }

    @When("user enters helpdesk username")
    public void user_enters_helpdesk_username() {
        loginPage.txtBox_userName.sendKeys(ConfigurationReader.getProperty("Helpdesk_username"));

    }

    @When("user enters helpdesk password")
    public void user_enters_helpdesk_password() {
        loginPage.txtBox_password.sendKeys(ConfigurationReader.getProperty("Helpdesk_password") + Keys.ENTER);


    }

    @When("user enters marketing username")
    public void user_enters_marketing_username() {
        loginPage.txtBox_userName.sendKeys(ConfigurationReader.getProperty("Marketing_username"));


    }

    @When("user enters marketing password")
    public void user_enters_marketing_password() {
        loginPage.txtBox_password.sendKeys(ConfigurationReader.getProperty("Marketing_password") + Keys.ENTER);


    }


    @When("user logged in with username as {string} and password as {string}")
    public void userLoggedInWithUsernameAsAndPasswordAs(String username, String password) {

        loginPage.txtBox_userName.sendKeys(username);
        loginPage.txtBox_password.sendKeys(password);
        loginPage.btn_login.click();

    }

    @Then("user should be able to see error message {string}")
    public void userShouldBeAbleToSeeErrorMessage(String expectedMessage) {

        loginPage.errMessage.isDisplayed();

        String actualMessage = loginPage.errMessage.getText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }


}
