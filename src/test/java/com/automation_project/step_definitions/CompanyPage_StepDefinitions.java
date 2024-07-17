package com.automation_project.step_definitions;

import com.automation_project.pages.CompanyPage;
import com.automation_project.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

import java.util.List;

public class CompanyPage_StepDefinitions {

    CompanyPage page = new CompanyPage();

    @Then("user clicks on Company button")
    public void user_clicks_on_company_button() {
        page.CompanyPageButton.click();
    }

    @Then("user can see the following modules on the Company page shown as design.")
    public void user_can_see_the_following_modules_on_the_company_page_shown_as_design(List<String> modules) {
        String actualModule = page.InformationModule.getText();
        String expected = modules.get(0);
        Assert.assertEquals(actualModule,expected);

        actualModule = page.InformationModule.getText();
        expected = modules.get(0);
        Assert.assertEquals(actualModule,expected);

        actualModule = page.OurLifeModule.getText();
        expected = modules.get(0);
        Assert.assertEquals(actualModule,expected);

        actualModule = page.AboutModule.getText();
        expected = modules.get(0);
        Assert.assertEquals(actualModule,expected);

        actualModule = page.PhotoModule.getText();
        expected = modules.get(0);
        Assert.assertEquals(actualModule,expected);

        actualModule = page.VideoModule.getText();
        expected = modules.get(0);
        Assert.assertEquals(actualModule,expected);

        actualModule = page.CareerModule.getText();
        expected = modules.get(0);
        Assert.assertEquals(actualModule,expected);

        actualModule = page.NewsModule.getText();
        expected = modules.get(0);
        Assert.assertEquals(actualModule,expected);

        actualModule = page.MoreModule.getText();
        expected = modules.get(0);
        Assert.assertEquals(actualModule,expected);








    }

}
