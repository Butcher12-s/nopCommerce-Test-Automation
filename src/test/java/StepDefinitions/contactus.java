package StepDefinitions;

import Pages.ContactUsPage;
import Pages.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert; // Assuming you are using TestNG for assertions

public class contactus {

    Homepage homepage;
    ContactUsPage contactUsPage;

    @Given("user in the homepage and click on contact us button")
    public void user_in_the_homepage_and_click_on_contact_us_button() {
        homepage = new Homepage(Hooks.driver);
        homepage.openContactUsPage();
    }


    @When("user enters contact details {string} and {string} and {string} then click submit")
    public void user_enter_valid_details(String fullname, String email, String enquiry) {
        contactUsPage = new ContactUsPage(Hooks.driver);
        contactUsPage.Set_data_to_contact(fullname, email, enquiry);
    }


    @Then("the success message should be {string}")
    public void the_success_message_should_be(String expectedMessage) {

        String actualMessage = contactUsPage.getmassege();


        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "Success message mismatch! Found: " + actualMessage);

        System.out.println("Message Verified: " + actualMessage);
    }

    @Then("the error message {string} should be displayed")
    public void the_error_message_should_be_displayed(String expectedError) {

        String actualError = contactUsPage.getmassegeerroremail();

        Assert.assertTrue(actualError.contains(expectedError),
                "Error message mismatch! Expected: " + expectedError + " But found: " + actualError);

        System.out.println("Verified Error Message: " + actualError);
    }
}