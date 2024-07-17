Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page
  @login
  Scenario Outline: Verify that <userType> user can log in with valid credentials and land on the home page after
  successful login.
    When user logs in as "<userType>"
    Then user should be able to see "Portal" as page title
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  Scenario Outline: verify that " Verify that "Incorrect login or password" error message is displayed for invalid credentials.

    When user logged in with username as "<username>" and password as "<password>"
    Then user should be able to see error message "Incorrect login or password"

    Examples:
      | username                   | password |
      | hr1@cybertekschool.com     | invalid  |
      | invalid@cybertekschool.com | UserUser |
      | invalid@cybertekschool.com | invalid  |


  Scenario: Verify that the "Remember me on this computer" link exists
    Then user should be able to see remember me box

  Scenario: Verify that the "Remember me on this computer"  is clickable
    When user clicks Remember me checkbox
    Then user should be able to see Remember me checkbox clicked

  Scenario: Verify that the password is in bullet signs by default.
    Then user should be able to see password is in bullet signs by default

  Scenario Outline: Verify that the "Please fill out this field" error message is displayed if the password or username is empty.
    When user is logged with username as "<username>" and password as "<password>"
    Then user should be able to see error  "Please fill out this field" message
    Examples:
      | username       | password |
      | hr1@cydeo.com. |          |

    Examples:
      | password | username |
      | UserUser |          |








