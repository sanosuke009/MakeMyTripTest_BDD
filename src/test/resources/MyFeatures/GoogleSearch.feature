#Author: sanosuke009@gmail.com

Feature: Book A Trip in MakeMyTrip
    
   Scenario: Book A Trip And Validate Review Page Title
    Given Google Home Page is Open in Browser
    And Validate "Google Search" Field
    When Click on "Google Search" Field
    And Type "searchWord" on "Google Search" Field
    And Type Enter on "Google Search" Field
    Then Validate "First Search Result" Link
    

