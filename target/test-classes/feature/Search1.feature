@all
Feature: search functionality

  Scenario: User search for valid product
    Given User enters the url of application
    When User enters the "HP" into search textfield
    And User clicks on search icon for next
    Then User should get displayed on search results page

  Scenario: User search for invalid product
    Given User enters the url of application
    When User enters the "honda" into search textfield for inavlid product
    And User clicks on search icon for next step
    Then User should get displayed proper error message for inalid product

  Scenario: User searchs without any product
    Given User enters the url of application
    When User  does not enter the  into search textfield
    And User clicks on search icon for execution
    Then User should get displayed proper error message for empty search textfield
