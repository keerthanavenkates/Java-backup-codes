#Author: your.email@your.domain.com

@tag
Feature: FridgePurchase
  I want to use this template for my feature file

  @tag1
  Scenario: FridgePurchase
    Given LaunchBrowser
    When User search for Fridge
    And User choose the fridge and doing payments
    Then user receive order confimation
    And Takes screenshot

 