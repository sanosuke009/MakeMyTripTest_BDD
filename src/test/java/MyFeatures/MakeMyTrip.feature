#Author: sanosuke009@gmail.com

Feature: Book A Trip in MakeMyTrip
    
   Scenario: Book A Trip And Validate Review Page Title
    Given Make My Trip Home Page is Open in Browser
    And Search Button is visible
    When Select Destination City
    And Select A Date In Calendar
    And Click on "Search" Button
    Then Validate "View Price" Button
    When Click on "First View Price" Button
    Then Validate "Book Now" Button
    When Click on "Book Now" Button
    Then Validate Heading Review your booking
    

