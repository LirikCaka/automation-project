@rukan
Feature: Company page
  Agile story : As a user, I should be able to access to the Company page.

  Scenario Outline: User can access to Company page
    Given user logs in as "<userType>"
    Then user clicks on Company button
    Then user can see the following modules on the Company page shown as design.
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News(RSS)   |
      | More                 |

    Examples:
      | userType  |
      | hr        |
      | helpdesk  |
      | marketing |