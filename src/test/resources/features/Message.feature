Feature: Users should be able to send message

  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Verify that <userType> user can log in with valid credentials and land on the home page after
  successful login
    When user logs in as "<userType>"
    And user clicks on message tab
    Then user should see the message table open
    Then all employees should be set by default
    Then user should be able to send message
    Then user should se error message if title is not specified
    Then user should see error if recipient is not selected
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

