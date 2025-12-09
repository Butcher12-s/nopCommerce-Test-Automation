@all

Feature: User Registration
  Validate user registration functionality
  @Register
  Scenario Outline: valid Registration
    Given user in the homepage and click on Register button
    When user enters valid registration "<firstName>" and "<lastName>" and "<email>" and "<password>" and "<confirmPassword>"

    Then Status "<message>" Apperd

    Examples:
      | firstName | lastName | email                      | password | confirmPassword | message                            |
      | Butcher   | abdo     | omarbutcher59@gmail.com    | 123456   | 123456          | The specified email already exists |
      | Butcher   | abdo     | omarbutc5hhker59@gmail.com | 1234563  | 1234563         | Your registration completed        |
