Feature: feature to test login functionality

Scenario: Test Login functionality with valid credential

    Given user is on login page
    When  user enters username and password
    And   click on login button
    Then  User navigated to home page
    
     