@rukan
Feature: Drive Page

  Agile story : As a user, I should be able to access the Drive page


  Scenario Outline: User access to Drive page
    Given user logs in as "<userType>"
    Then user clicks on Drive button
    Then user can see the following modules on the Drive page.
      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management's documents |
      | Drive Cleanup              |


    Examples:
      | userType  |
      | hr        |

      #| helpdesk  |
      #| marketing |