Feature: Gabung Jadi Mitra Page
  Background:
    Given User open browser with Chrome

  Scenario: User show product carousel
    Given User open Gravel Homepage
    And User click Gabung Jadi Mitra at Navigation Bar
    When User scroll to Join Komunitas Sedulur Gravel section
    Then User can see carousel about "Komunitas Sedulur Gravel"

  Scenario: User click `Daftar Sekarang` button
    Given User open Gravel Homepage
    And User click Gabung Jadi Mitra at Navigation Bar
    When User click Join Now button
    Then User redirected to Play Store Dulur page




