@all
Feature: login functinality

  Scenario: login with valid credentials
    Given User navigates to login page
    When User enters valid email id "sagarrsajjan@gmail.com" into email textfield
    And User enters the password "Dboss@2456" into password textfield
    And User cliks on login button
    Then User should get successfully logged in

  Scenario: login with invalid credentials
    Given User navigates to login page
    When User enters invalid email id "sagarasajjan@gmail.com" into email textfield
    And User enters the in correct password "Dboss@2456" into password textfield
    And User cliks on login button
    Then User should get warning messgae

  Scenario: login with invalid email and valid password
    Given User navigates to login page
    When User enters invalid email id "sagarasajjan@gmail.com" into email textfield
    And User enters the password "Dboss@2456" into password textfield
    And User cliks on login button
    Then User should get warning messgae

  Scenario: login with valid email and invalid password
    Given User navigates to login page
    When User enters valid email id "sagarrasajjan@gmail.com" into email textfield
    And User enters the password "Dbos@2456" into password textfield
    And User cliks on login button
    Then User should get warning messgae

  Scenario: login without providing any credenils
    Given User navigates to login page
    When User does not enter valid email id  into email textfield
    And User  does not enter the password  into password textfield
    And User cliks on login button
    Then User should get warning messgae
