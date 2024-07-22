Feature: Adding link in messages
  Background: User is already in the log in page
    Given the user is on the login page

  Scenario Outline: Verify that <userType> user can log in with valid credentials and land on the home page after
  successful login
    When user logs in as "<userType>"
    And user clicks "Message" in activity stream
    And user navigates to the link button
    And user click on the link button
    Then user attaches a link to the specified text
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

    Scenario Outline: Verify that user can navigate to the correct url
      Given user logs in as "<userType>"
      And user clicks "Message" in activity stream
      And user navigates to the link button
      And user click on the link button
      Then user saved a link
      Then user should be navigated to the correct url

      Examples:
        | userType  |
        | hr        |
        | helpdesk  |
        | marketing |

      Scenario Outline: Link opens in a new tab
        Given user logs in as "<userType>"
        When user clicks on message tab
        And user added a link to the message
        And user click on the link button
        Examples:
          | userType  |
          | hr        |
          | helpdesk  |
          | marketing |




