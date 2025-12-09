package StepDefinitions;

import Pages.Homepage;
import Pages.Registerpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class UserRegistertion {

    Homepage homepage;
    Registerpage registerpage;

    @Given("user in the homepage and click on Register button")
    public void user_in_the_homepage_and_click_on_Register_button() {
        homepage = new Homepage(Hooks.driver);
        homepage.Openregisteration();
    }

    @When("user enters valid registration {string} and {string} and {string} and {string} and {string}")
    public void user_enter_valid_registration(String firstName, String lastName, String email, String password, String confirmPassword) {
        registerpage = new Registerpage(Hooks.driver);
        registerpage.Registerationconfirm(firstName, lastName, email, password, confirmPassword);
    }


//    @When("user enter invalid register creds")
//    public void user_enter_invalid_creds() {
//        registerpage = new Registerpage(Hooks.driver);
//        registerpage.Registerationconfirm("Omaar", "Butcher", "omarbutcher59@gmail.com", "1238456", "123456");
//    }

    @Then("Status {string} Apperd")
    public void status_message_appeared(String expectedMessage) {

        String actualMessage = registerpage.getStatusMessage();


        Assert.assertTrue(actualMessage.contains(expectedMessage),
                "Expected message to contain: " + expectedMessage + " but got: " + actualMessage);
    }

}



//    @Then("user should register unsuccessfully")
//    public void user_should_register_unsuccessfully() {
//
//    }

