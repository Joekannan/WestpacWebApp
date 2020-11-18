@kiwisaver
Feature: KiwiSaver Retirement Calculator
  I want to check the information icon in the KiwiSaver calculator page to understand the type of input to feed in the fields

  @regression
  Scenario Outline: KiwiSaver - Information icon
    Given User is on KiwiSaver Calculator Page
    When User clicks Information icon next to "<Field>" field
    Then The message should be displayed for the user to enter the correct information in the "<Field>"

    Examples: 
      | Field                      |
      | Current Age                |
      | Employment status          |
      | Current KiwiSaver balance  |
      | Voluntary contributions    |
      | Risk profile               |
      | Savings goal at retirement |
    
  
    