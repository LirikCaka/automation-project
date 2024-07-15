@B34G4-135
Feature: Default


  @B34G4-121
  Scenario Outline: Verify profile page functionality
    When user logs in as "<userType>"
    And user clicks on profile dropdown
    And user clicks on My Profile option
    Then user should see below options on my Profile Page
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

@B34G4-130
  Scenario Outline: Verify email under General tab
    Given user logs in as "<userType>"
    When user clicks on profile dropdown
    And user clicks on My Profile option
    And user selects the "General" tab
    Then the email displayed should match "<expected_email>"

    Examples:
      | userType  | expected_email       |
      | hr        | hr1@cydeo.com        |
      | helpdesk  | helpdesk1@cydeo.com  |
      | marketing | marketing1@cydeo.com |