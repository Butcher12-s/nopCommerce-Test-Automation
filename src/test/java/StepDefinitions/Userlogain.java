package StepDefinitions;

import Pages.Homepage;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Userlogain {
    Homepage homepage;
    LoginPage loginpage;

            @When("user in the homepage and click on login button")
            public void user_in_the_homepage_and_click_on_login_button() {
                homepage=  new Homepage(Hooks.driver);
                homepage.Openloginpage();
            }

            @Given("user enter valid {} and {}")
            public void user_enter_valid_creds(String email, String password) {
                loginpage= new LoginPage(Hooks.driver);
                loginpage.loginconfirm(email,password);

            }
//           @Given("user enter invalid creds")
//           public void user_enter_invalid_creds() {
//           loginpage= new LoginPage(Hooks.driver);
//           loginpage.loginconfirm("omarbutcher5999@gmail.com","123456");
//
//    }

           @Then("user should login successfully")
           public void user_should_login_successfully() {
            System.out.println("login successfully");
    }
            @Then("user should login unsuccessfully")
            public void user_should_login_unsuccessfully() {
                System.out.println("login unsuccessfully");
            }
        }


