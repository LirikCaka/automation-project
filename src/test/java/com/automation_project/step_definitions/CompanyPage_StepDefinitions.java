package com.automation_project.step_definitions;

import com.automation_project.pages.CompanyPage;
import com.automation_project.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class CompanyPage_StepDefinitions {

    CompanyPage page = new CompanyPage();

    @Then("user clicks on Company button")
    public void user_clicks_on_company_button() {
        page.CompanyPageButton.click();
    }

    @Then("user can see the following modules on the Company page shown as design.")
    public void user_can_see_the_following_modules_on_the_company_page_shown_as_design(List<String> modules) {
        List<WebElement> elements = Arrays.asList(
                page.InformationModule,
                page.OurLifeModule,
                page.AboutModule,
                page.PhotoModule,
                page.VideoModule,
                page.CareerModule,
                page.NewsModule,
                page.MoreModule
        );

        for (int i = 0; i < elements.size(); i++) {
            String actualModule = elements.get(i).getText();
            String expected = modules.get(i);
            Assert.assertEquals(actualModule, expected);
        }
    }

}
