Feature: Redirect App Store
  Background:
    Given User open browser with Chrome

  Scenario: User click App Store button from navigation bar at Home page
    Given User open Gravel Homepage
    When User click App Store button from navigation bar
    Then User redirected to App Store page


  Scenario: User click App Store button from content at Home page
    Given User open Gravel Homepage
    When User scroll to Download section
    And User click App Store button from content
    Then User redirected to App Store page


  Scenario: User click App Store button from navigation bar at Inspirasi page
    Given User open Gravel Homepage
    And User click Inspirasi at Navigation Bar
    And User click App Store button from navigation bar
    Then User redirected to App Store page












