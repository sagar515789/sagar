@all
Feature: register functionality

  Scenario: User creates account with only mandatory fields
    Given User navigates into register page
    When User enters the details into below mentioned text field
      | firstname | sagar               |
      | lastname  | sajjan              |
      | email     | sassaajjan@gmail.com |
      | telephone |          8095187515 |
      | password  | Dboss@2456          |
    And User selects on privacy policy
    And User clicks on continue button for execution
    Then User account should get created successfully

  Scenario: User creates account with all fields
    Given User navigates into register page
    When User enters the details into below mentioned text field
      | firstname | sagar                  |
      | lastname  | sajjan                 |
      | email     | agarrsajjan@gmail.com |
      | telephone |             8095187515 |
      | password  | Dboss@2456             |
    And User selects yes for news letter
    And User selects on privacy policy
    And User clicks on continue button for next step execution
    Then User account should get created successfully

  Scenario: User creates duplicate account
    Given User navigates into register page
    When User enters the details into below mentioned text field
      | firstname | sagar                  |
      | lastname  | sajjan                 |
      | email     | sagarrsajjan@gmail.com |
      | telephone |             8095187515 |
      | password  | Dboss@2456             |
    And User selects yes for news letter
    And User selects on privacy policy
    And User clicks on continue button for next step
    Then User account should get proper error message of dupliacte email

  Scenario: User creates an account without fiiling into filelds
    Given User navigates into register page
    When User does not enter into any fields
    Then User clicks on continue button
    Then User should get proper error message of reqired fields
