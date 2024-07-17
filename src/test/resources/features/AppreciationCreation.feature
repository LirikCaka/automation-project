@B34G4-136
Feature: Send Appreciation in Activity Stream

  @B34G4-131
  Scenario Outline: Send appreciation with mandatory fields
    Given user logs in as "<userType>"
    When user navigates to the Activity Stream page
    And  user clicks on More dropdown option
    And user clicks on the Appreciation tab
    And the user enters "Great job!" in the Message content field
    And the user selects "All employees" in the To field
    And the user clicks the Send button
    Then the appreciation should appear in the Activity Stream


    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

@B34G4-132
  Scenario Outline: Verify error messages for empty mandatory fields
    Given user logs in as "<userType>"
    When user navigates to the Activity Stream page
    And  user clicks on More dropdown option
    And user clicks on the Appreciation tab
    And user clicks the Send button without entering any data
    Then the system should display "The message title is not specified"
    And  user cancel the selected receiver
    And user clicks the Send button without selecting receiver
    Then the system should display following error message "Please specify at least one person."


    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |


@B34G4-133
  Scenario Outline: Verify default delivery option
    Given user logs in as "<userType>"
    When user navigates to the Activity Stream page
    And  user clicks on More dropdown option
    And user clicks on the Appreciation tab
    Then the delivery option should be set to "All employees" by default

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

@B34G4-134
  Scenario Outline:  Cancel sending appreciation
    Given user logs in as "<userType>"
    When user navigates to the Activity Stream page
    And  user clicks on More dropdown option
    And user clicks on the Appreciation tab
    And the user enters "Great work!" in the Message content field
    And the user selects "All employees" in the To field
    And the user clicks the Cancel button and appreciation cancelled
    Then the user should be returned to the "Activity Stream" page



    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

