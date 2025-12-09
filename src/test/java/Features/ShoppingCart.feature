@all
Feature: Shopping Cart Functionality

  Scenario: Verify empty cart message
    Given I am on the home page
    When I click on the shopping cart link
    Then I should see a message "Your Shopping Cart is empty!"