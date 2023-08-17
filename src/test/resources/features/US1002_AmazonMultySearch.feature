
Feature: Searches for multi products in amazon  webpage

  Scenario: TC02 User should be able to search for products in amazon

    Given User goes amazon webpage
    And User searches for Nutella
    Then Test that resultText has Nutella in it
    Then User closes the page

    Given User goes amazon webpage
    And User searches for Samsung
    And Test that resultText has Samsung in it
    And User closes the page

    Given User goes amazon webpage
    And User searches for Apple
    And Test that resultText has Apple in it
    And User closes the page