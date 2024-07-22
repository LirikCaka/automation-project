@B34G4-125
Feature: Default

	#{color:#ff0000}*User Story :* {color}
	#
	#As a user, I should be able to log out
	#
	#*{color:#FF0000}AC1.{color}* Verify that the user can log out from the app after clicking the “Log out” button.
  @B34G4-123
  Scenario Outline: Verify the "log out" functionality on the page
    When user logs in as "<userType>"
    And user clicks on profile dropdown
    And user clicks "Log out" option from profile option
    Then user should be able to see "Authorization" as page title
    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

	#{color:#ff0000}*User Story :* {color}
	#
	#As a user, I should be able to log out
	#
	# 
	#*{color:#FF0000}AC2.{color}* Verify that the user can see 5 options under the profile name.
	#
	#My Profile
	#Edit Profile Settings
	#Themes
	#Configure notifications
	#Log out
	#
	#
	#h3.
  @B34G4-124
  Scenario Outline: Verify user can see 5 options under the profile name
    When user logs in as "<userType>"
    And user clicks on profile dropdown
    Then user should see 5 option under the on my profile name

      | My Profile              |
      | Edit Profile Settings   |
      | Themes                  |
      | Configure notifications |
      | Log out                 |

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |

