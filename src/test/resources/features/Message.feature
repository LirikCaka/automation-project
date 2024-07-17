@B34G4-84
Feature: Users should be able to send message

  Background: User is already in the log in page
    Given the user is on the login page

  @B34G4-147
  Scenario Outline: Verify that <userType> user can log in with valid credentials and land on the home page after
  successful login
    When user logs in as "<userType>"
    And user clicks on message tab
    Then user should be able to send message

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  @B34G4-148
  Scenario Outline: Verify that <userType> will see the error message if title is blank
    When user logs in as "<userType>"
    Then user clicks on message tab
    Then user clicks the Send button
    Then Then user should see error message displayed "The message title is not specified"


    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  @B34G4-150
  Scenario Outline: Verify that <userType> user will se the error message if no recipient is selected
    When user logs in as "<userType>"
    Then user clicks on message tab
    Then user leave recipient blank
    Then user clicks the Send button
    Then Then user should se error message "Please specify at least one person."


    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

  @B34G4-149

  Scenario Outline: Verify that <userType> will see all employees set by default
    When user logs in as "<userType>"
    Then user clicks on message tab
    Then all employees should be set by default

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


    @B34G4-151
    Scenario Outline: Verify that <userType> user can cancel message
      When user logs in as "<userType>"
      Then user clicks on message tab
      Then user enter message
      Then user should be able to cancel message

      Examples:
        | userType  |
        | hr        |
        | helpdesk  |
        | marketing |