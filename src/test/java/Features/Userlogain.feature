@all

Feature: User login
  validate user login functionality
  @login
  Scenario Outline: valid login
    When    user in the homepage and click on login button
    Given   user enter valid "<email>" and "<password>"
    Then    user should login successfully
    Examples:
      | email                    | password |
      | omarbutcher59@gmail.com  | 1234563  |
      | omarbutcheer59@gmail.com | 1234562  |

#  @login
#  Scenario: invalid login
#    When    user in the homepage and click on login button
#    Given   user enter invalid creds
#    Then    user should login unsuccessfully