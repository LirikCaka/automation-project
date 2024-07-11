Feature: Default


  @B34G4-121
  Scenario Outline: Verify profile page functionality
    When user logs in as "<userType>"
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |
    Then user should see the dashboard
    And user clicks on profile dropdown
    And user clicks on My Profile option
    Then user should see below options on my Profile Page
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |