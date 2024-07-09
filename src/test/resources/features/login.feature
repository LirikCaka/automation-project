Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @HR
  Scenario: Login as Human Resource
    When user enters Human Resource username
    And user enters Human Resource password
    Then user should see the dashboard

  @helpdesk
  Scenario: Login as helpdesk
    When user enters helpdesk username
    And user enters helpdesk password
    Then user should see the dashboard

  @marketing
  Scenario: Login as marketing
    When user enters marketing username
    And user enters marketing password
    Then user should see the dashboard

@message
Scenario Outline: verify that " Verify that "Incorrect login or password" error message is displayed for invalid credentials.

  When user logged in with username as "<username>" and password as "<password>"
  Then user should be able to see error message "Incorrect login or password"

  Examples:
  | username                    |password|
  |hr1@cybertekschool.com       |invalid |







