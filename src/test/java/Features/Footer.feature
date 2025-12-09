@all

Feature: Footer Functionality

  @FooterNewsletter
  Scenario: Subscribe to Newsletter successfully
    Given user scrolls down to the footer
    When user enters valid email "testuseer@test.com" and clicks subscribe
    Then the newsletter success message should be "Thank you for signing up! A verification email has been sent. We appreciate your interest."

  @FooterWithLinks
  Scenario Outline: Validate Footer Links Navigation
    Given user scrolls down to the footer
    When user clicks on "<linkName>" link
    Then the user should be redirected to a page with title containing "<expectedTitle>"

    Examples:
      | linkName           | expectedTitle    |
      | Sitemap            | Sitemap          |
      | Shipping & returns | Shipping         |
      | Privacy notice     | Privacy          |
      | Conditions of Use  | Conditions       |
      | About us           | About us         |