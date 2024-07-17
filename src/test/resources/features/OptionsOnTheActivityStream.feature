Feature: As a user, I should be able to see all the options on the Activity stream page

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario Outline: Verify that <userType> views the following options on the Activity stream page.
    When user logs in as "<userType>"
    And user clicks "Activity Stream"
    Then user should be to see the following options on the Activity Stream page
      | MESSAGE |
      | TASK    |
      | EVENT   |
      | POLL    |
      | MORE    |
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |