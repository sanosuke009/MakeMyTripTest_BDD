#Author: sanosuke009@gmail.com

Feature: Book A Trip in MakeMyTrip
    
   Scenario Outline: Book A Trip And Validate Review Page Title
    Given Google Home Page is Open in "<BrowserName>" Browser
    And Validate "Google Search" Field
    When Click on "Google Search" Field
    And Type "searchWord" on "Google Search" Field
    And Type Enter on "Google Search" Field
    Then Validate "First Search Result" Link

   Examples:
   |     BrowserName |
   |     Google      |
   |     Firefox     |
   |     Edge        |
    

