Feature: US1001 User Nutella Test

  Scenario: TC01 User searches for Nutella in Amazon

    Given User goes amazon webpage
    When User searches for Nutella
    Then Test that resultText has Nutella in it
    Then User closes the page