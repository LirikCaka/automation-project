package com.automation_project.step_definitions;

import com.automation_project.pages.ActivityStreamPage;
import com.automation_project.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FileUploadStepDefs {
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("user clicks {string} in activity stream")
    public void user_clicks_in_activity_stream(String string) {

        activityStreamPage.messageBtn.click();

    }
    @And("user clicks Upload area")
    public void userClicksUploadArea() {
        activityStreamPage.uploadFileBtn.click();
    }

    @When("user upload the files {string}")
    public void user_upload_the_files(String fileName) {
        activityStreamPage.uploadFile(fileName);
    }
    @Then("user should be able to see {string} in the uploaded files")
    public void user_should_be_able_to_see_in_the_uploaded_files(String fileName) {
        BrowserUtils.sleep(3);
        String uploadedFileText = activityStreamPage.uploadFileBtn.getText();
        System.out.println("uploadFileText = " + uploadedFileText);
        Assert.assertTrue(uploadedFileText.contains(fileName.substring(0,fileName.indexOf("."))));

    }


    @And("user clicks Insert text with exact class {string}")
    public void userClicksInsertTextWithExactClass(String arg0) {
    }

    @Then("user should be able to see {string} in the message")
    public void userShouldBeAbleToSeeInTheMessage(String arg0) {

    }

    @And("user clicks Delete Icon with exact class {string}")
    public void userClicksDeleteIconWithExactClass(String arg0) {
        
    }

    @Then("user should not be able to see {string} in the uploaded files")
    public void userShouldNotBeAbleToSeeInTheUploadedFiles(String arg0) {

    }

    @When("user navigates to the Activity Stream page")
    public void userNavigatesToTheActivityStreamPage() {
    }


}

       /* CharSequence fileName = null;
        if (fileName.contains("png") || fileName.contains("jpg")){
            String actualSource = activityStreamPage.getPictureSrcFromMessage();
            Assert.assertTrue(actualSource.contains(fileName.substring(0,fileName.indexOf("."))));
            System.out.println(actualSource);
        }else {
            String actualMessage = activityStreamPage.getMessageContent();
            Assert.assertTrue(actualMessage.contains(fileName));
        }
    }

    @And("user clicks Delete Icon with exact class {string}")
    public void userClicksDeleteIconWithExactClass(String arg0) {
    }

    @Then("user should not be able to see {string} in the uploaded files")
    public void userShouldNotBeAbleToSeeInTheUploadedFiles(String ignoredWord) {

            Assert.assertTrue(activityStreamPage.uploadedFileList.size()==0);
    }
}
*/

