Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Verify that <userType> user can log in with valid credentials and land on the home page after
  successful login.
    When user logs in as "<userType>"
    Then user should be able to see "Portal" as page title
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |



  @message
  Scenario Outline: verify that " Verify that "Incorrect login or password" error message is displayed for invalid credentials.

    When user logged in with username as "<username>" and password as "<password>"
    Then user should be able to see error message "Incorrect login or password"

    Examples:
      | username               | password |
      | hr1@cybertekschool.com | invalid  |







