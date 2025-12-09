package StepDefinitions;

import Pages.Homepage;
import Pages.ShoppingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ShoppingCartSteps {

    Homepage homepage;
    ShoppingCartPage shoppingCartPage;

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        homepage = new Homepage(Hooks.driver);
    }

    @When("I click on the shopping cart link")
    public void i_click_on_the_shopping_cart_link() {
        homepage.OpenShoppingCartpage();
    }

    @Then("I should see a message {string}")
    public void i_should_see_a_message(String expectedMessage) {
        shoppingCartPage = new ShoppingCartPage(Hooks.driver);
        String actualMessage = shoppingCartPage.getMessageText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
    }
}