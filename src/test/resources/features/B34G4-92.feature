Feature: Users should be able to login
  User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.
  Accounts are: Human Resource, Helpdesk, Marketing


@wip
  Scenario Outline: Login with different users
    Given user is on the login page
    When the user login with given credentials from "<SheetName>" and <RowNumber>
    Then the user should be able to log in and see their name

    Examples:
      | SheetName     | RowNumber |
      | InfinityUsers | 1         |
      | InfinityUsers | 2         |
      | InfinityUsers | 3         |
      | InfinityUsers | 4         |
      | InfinityUsers | 5         |
      | InfinityUsers | 6         |
      | InfinityUsers | 7         |
      | InfinityUsers | 8         |
      | InfinityUsers | 9         |
      | InfinityUsers | 10        |
      | InfinityUsers | 11        |
      | InfinityUsers | 12        |
      | InfinityUsers | 13        |
      | InfinityUsers | 14        |
      | InfinityUsers | 15        |

 # Scenario: User uploads files and pictures as messages

 # Given: User is on the messaging page
 # When: User uploads a file with supported format pdf
 # And: User uploads a file with supported format txt
 # And: Use uploads an image with supported format jpeg
#And: Use uploads an image with supported format png
 # And: Use uploads an image with supported format docx
  #Then: The files and images are successfully uploaded

  #Scenario: User inserts files and images into the text
  #Given:  User is composing a message
  #When: User inserts a file into the text
  #And: User inserts an image into the text
  #Then: The files and images are displayed in the message text

  #Scenario: User removes files ina images before sending
  #Given: User has uploaded files and images
  #When: The user removes a file from the message
  #And: User removes an image from the message
  #Then: The files and images are no longer attached to the message
