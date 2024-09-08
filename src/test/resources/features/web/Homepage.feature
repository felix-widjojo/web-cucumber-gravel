Feature: Home Page
  Background:
    Given User open browser with Chrome

  Scenario: User show product carousel
    Given User open Gravel Homepage
    When User scroll to Project section
    Then User can see carousel about "LRT Jakarta"

  Scenario: User click `Gabung Jadi Mitra` link category
    Given User open Gravel Homepage
    When User click Gabung Jadi Mitra at Navigation Bar
    Then User redirected to Gabung Jadi Mitra Page

  Scenario: User click `Inspirasi` link category
    Given User open Gravel Homepage
    When User click Inspirasi at Navigation Bar
    Then User redirected to Inspirasi Page

  Scenario: User click `Karir` link category
    Given User open Gravel Homepage
    When User click Karir at Navigation Bar
    Then User redirected to Karir Page



