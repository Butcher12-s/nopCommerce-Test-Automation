@all
Feature: Site Settings Functionality
  @Cart
  Scenario: Change Currency to US Dollar
    Given I am on the home page
    When I change the currency to "US Dollar"
    Then the URL should not contain error
  @Cart
  Scenario: Change Language
    Given I am on the home page
    When I change the language to "العربية"
    Then the page should refresh