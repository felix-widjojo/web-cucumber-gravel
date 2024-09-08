Feature: Change Language Page
  Background:
    Given User open browser with Chrome

  Scenario: User change language to Indonesia at Home page
    Given User open Gravel Homepage
    When User click language select dropdown
    Then User click "Indonesia" language at Homepage

  Scenario: User change language to English at Home page
    Given User open Gravel Homepage
    When User click language select dropdown
    Then User click "English" language at Homepage

  Scenario: User change language to Indonesia at Gabung Jadi Mitra page
    Given User open Gravel Homepage
    And User click Gabung Jadi Mitra at Navigation Bar
    When User click language select dropdown
    Then User click "Indonesia" language at Gabung Jadi Mitra Page

  Scenario: User change language to English at Gabung Jadi Mitra page
    Given User open Gravel Homepage
    And User click Gabung Jadi Mitra at Navigation Bar
    When User click language select dropdown
    Then User click "English" language at Gabung Jadi Mitra Page

  Scenario: User change language to Indonesia at Inspirasi page
    Given User open Gravel Homepage
    And User click Inspirasi at Navigation Bar
    When User click language select dropdown
    Then User click "Indonesia" language at Inspirasi Page

  Scenario: User change language to English at Inspirasi page
    Given User open Gravel Homepage
    And User click Inspirasi at Navigation Bar
    When User click language select dropdown
    Then User click "English" language at Inspirasi Page








