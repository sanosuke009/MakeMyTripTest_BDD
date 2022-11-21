#Author: sanosuke009@gmail.com

Feature: Book A Trip in MakeMyTrip
    
   Scenario: Book A Trip And Validate Review Page Title
    Given Make My Trip Home Page is Open in Browser
    And Click on "Login Button Popup" Button
    And Search Button is visible
    When Select Destination City
    And Select A Date In Calendar
    And Click on "Search" Button
    Then Validate "Lock Price Pop Up" Button
    And Click on "Lock Price Pop Up" Button
    When Validate "View Price" Button
    And Click on "First View Price" Button
    Then Validate "Book Now" Button
    When Click on "Book Now" Button
    Then Validate Heading Review your booking
    

