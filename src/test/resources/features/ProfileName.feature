Feature: Verify the "log out" functionality

  #User Story
  #1. Verify that the user can log out from the app after clicking the “Log out” button.
  #2. Verify that the user can see 5 options under the profile name.

  #My Profile
  #Edit Profile Settings
  #Themes
  #Configure notifications
  #Log out

  @CRM-1
  Scenario Outline: Verify profile name functionality
    When user logs in as "<userType>"
    And user clicks profile dropdown
    And user clicks "Log out" option from profile option
    Then user should be able to see "Authorization" as page title
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

    And user click on profile name
    Then user click log out button

  @CRM-2
  Scenario Outline: Verify profile name functionality
    When user logs in as "<userType>"
    Then user should be able to see "Portal" as page title
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

    And user click on profile name
    Then user should see under the on my Profile name
      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |

