Feature: Inspirasi Page
  Background:
    Given User open browser with Chrome

  Scenario: User search Inspirasi with test data `Gravel`
    Given User open Gravel Homepage
    And User click Inspirasi at Navigation Bar
    When User type test data "Gravel" in the search bar
    Then User see search result that contains "Gravel"

  Scenario: User search Inspirasi with test data `%ap%`
    Given User open Gravel Homepage
    And User click Inspirasi at Navigation Bar
    When User type test data "%ap%" in the search bar
    Then User see search result that contains "%ap%"

  Scenario: User search Inspirasi with test data `_emakin`
    Given User open Gravel Homepage
    And User click Inspirasi at Navigation Bar
    When User type test data "_emakin" in the search bar
    Then User see search result that contains "_emakin"

  Scenario: User search Inspirasi with test data `update%20%`
    Given User open Gravel Homepage
    And User click Inspirasi at Navigation Bar
    When User type test data "update%20%" in the search bar
    Then User see search result that contains "update%20%"

  Scenario: User search Inspirasi with test data `Test`
    Given User open Gravel Homepage
    And User click Inspirasi at Navigation Bar
    When User type test data "Test" in the search bar
    Then User see search result that contains "Test"

  Scenario: User search Inspirasi without searchbar
    Given User open Gravel Homepage
    And User click Inspirasi at Navigation Bar
    When User scroll to Inspirasi section
    Then User see Inspirasi

  Scenario: User click `Muat lebih banyak` text to show up more Inspirasi
    Given User open Gravel Homepage
    And User click Inspirasi at Navigation Bar
    When User click Muat Lebih Banyak text
    Then User will see more Inspirasi

  Scenario: User click Inspirasi to see the details
    Given User open Gravel Homepage
    And User click Inspirasi at Navigation Bar
    When User scroll to Inspirasi section
    And User click one of the Inspirasi
    Then User see details of the Inspirasi




