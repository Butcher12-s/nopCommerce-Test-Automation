package StepDefinitions;

import Pages.Homepage;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class SettingsSteps {

    Homepage homepage;

    @When("I change the currency to {string}")
    public void i_change_the_currency_to(String currencyName) {
        homepage = new Homepage(Hooks.driver);
        homepage.changeCurrency(currencyName);
    }

    @Then("the URL should not contain error")
    public void the_url_should_not_contain_error() {

    }

    @When("I change the language to {string}")
    public void i_change_the_language_to(String languageName) {
        homepage = new Homepage(Hooks.driver);
        homepage.changeLanguage(languageName);
    }

    @Then("the page should refresh")
    public void the_page_should_refresh() {

    }
}