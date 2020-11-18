@applitools
Feature: KiwiSaver Retirement Calculator
  I want to integrate this test to sauce labs and applitools to confirm integration to third party tool works with this framework 
 
  Scenario: KiwiSaver - Information icon - UI validation using Applitools
    Given I setup Applitools
    And User is on KiwiSaver Calculator Page
    And I Capture the screen
    When User clicks Information icon next to "Current Age" field
    Then The message should be displayed for the user to enter the correct information in the "Current Age"
		And I tear down Applitools
		
  Scenario: KiwiSaver Calculation at retirement for Employed Users
  	Given I setup Applitools
    And User is on KiwiSaver Calculator Page   
    And I Capture the screen 
    When User enters age "30" employment status "Employed" salary "82000" kiwiSaverPercent "4%" risk profile "Defensive"
    Then Projected Balance at retirement should be displayed
    And I tear down Applitools
    
    