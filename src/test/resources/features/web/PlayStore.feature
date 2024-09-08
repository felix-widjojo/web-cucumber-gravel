Feature: Redirect Play Store
  Background:
    Given User open browser with Chrome

  Scenario: User click Play Store button from navigation bar at Home page
    Given User open Gravel Homepage
    When User click Play Store button from navigation bar
    Then User redirected to Play Store page

  Scenario: User click Play Store button from content at Home page
    Given User open Gravel Homepage
    When User scroll to Download section
    And User click Play Store button from content at Homepage
    Then User redirected to Play Store page

  Scenario: User click Play Store button from navigation bar at Gabung Jadi Mitra page
    Given User open Gravel Homepage
    And User click Gabung Jadi Mitra at Navigation Bar
    And User click Play Store button from navigation bar
    Then User redirected to Play Store Dulur page

  Scenario: User click Play Store button from content at Gabung Jadi Mitra page
    Given User open Gravel Homepage
    And User click Gabung Jadi Mitra at Navigation Bar
    And User click Play Store button from content at Gabung Jadi Mitra Page
    Then User redirected to Play Store Dulur page

  Scenario: User click Play Store button from navigation bar at Inspirasi page
    Given User open Gravel Homepage
    And User click Inspirasi at Navigation Bar
    And User click Play Store button from navigation bar
    Then User redirected to Play Store page












