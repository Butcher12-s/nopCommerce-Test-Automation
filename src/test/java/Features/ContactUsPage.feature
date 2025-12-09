@all
Feature: Contact Us Functionality

  @Contact
  Scenario Outline: Send Enquiry successfully
    Given user in the homepage and click on contact us button

    When user enters contact details "<fullname>" and "<email>" and "<enquiry>" then click submit
    Then the success message should be "Your enquiry has been successfully sent to the store owner."

    Examples:
      | fullname | email                    | enquiry        |
      | omar     | omarbutcher59@gmail.com  | i have problem |
      | tony     | omarbutcheer59@gmail.com | help me        |
  @ContactNegative
  Scenario: User enters invalid email format
    Given user in the homepage and click on contact us button

    When user enters contact details "Omar" and "wrong-email-format" and "This is a test" then click submit
    Then the error message "Please enter a valid email address." should be displayed