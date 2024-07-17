package com.automation_project.step_definitions;

import com.automation_project.pages.InfinityLoginPage;
import com.automation_project.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class B34G4_128_StepDef {
    InfinityLoginPage infinityLoginPage = new InfinityLoginPage();

//    @When("Helpdesk and Marketing users being on Company Structure under Employee menu")
//    public void helpdeskAndMarketingUsersBeingOnCompanyStructureUnderEmployeeMenu() {
//        Assert.assertTrue(infinityLoginPage.pageTitle.isDisplayed());
//    }

    @Then("user should not see ADD DEPARTMENT button")
    public void user_should_not_see_add_department_button() {
        try{
            Driver.getDriver().findElement(By.partialLinkText("Add department"));
          }
        catch(NoSuchElementException e){

//            return true;
//        }
//            return true;
//        }
    }
}}

        //return true
    //}findelement

    //    try {
    //        Thread.sleep(second);
     //   } catch (InterruptedException e) {

//
//catch{NoSuchElementException}
//            return false


//return Driver.getDriver().findElements(By.xpath("//span[@class='webform-small-button-text']")).isEmpty();


//
//        public bool CheckPresenceAddDepartment(){
//





