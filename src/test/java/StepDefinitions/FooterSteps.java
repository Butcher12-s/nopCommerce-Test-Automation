package StepDefinitions;

import Pages.FooterPage;
import Pages.Homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class FooterSteps {

    FooterPage footerPage;
    Homepage homepage;

    @Given("user scrolls down to the footer")
    public void user_scrolls_down_to_the_footer() {

        homepage = new Homepage(Hooks.driver);
        footerPage = new FooterPage(Hooks.driver);

    }

    // --- Newsletter Steps ---
    @When("user enters valid email {string} and clicks subscribe")
    public void user_enters_valid_email_and_clicks_subscribe(String email) {
        // Generating a unique email to avoid "Already Subscribed" errors
        String uniqueEmail = System.currentTimeMillis() + email;
        footerPage.subscribeToNewsletter(uniqueEmail);
    }

    @Then("the newsletter success message should be {string}")
    public void the_newsletter_success_message_should_be(String expectedMsg) throws InterruptedException {

        Thread.sleep(2000);

        String actualMsg = footerPage.getNewsletterMessage();
        Assert.assertEquals(actualMsg, expectedMsg, "Newsletter success message mismatch!");
    }

    // --- Footer Links Steps ---
    @When("user clicks on {string} link")
    public void user_clicks_on_link(String linkName) {
        footerPage.openFooterLink(linkName);
    }

    @Then("the user should be redirected to a page with title containing {string}")
    public void the_user_should_be_redirected_to_page(String expectedTitlePart) {
        String actualTitle = Hooks.driver.getTitle();
        System.out.println("Current Page Title: " + actualTitle);

        // Verifying that the page title contains the expected keyword
        Assert.assertTrue(actualTitle.contains(expectedTitlePart),
                "Title mismatch! Expected part: " + expectedTitlePart + " but found: " + actualTitle);
    }
}