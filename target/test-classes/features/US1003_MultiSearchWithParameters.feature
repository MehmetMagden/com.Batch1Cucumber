
Feature: US1003 User searches for the product which is entered as an parameter
  @p1
  Scenario: TC03 User searches for Nutella with parameter

    Given User goes amazon webpage
    Then User searches for "Nutella"
    And Test that resultText has "Nutella" in it
    Then User closes the page

  @p2
  Scenario: TC04 User searches for Java with parameter

    Given User goes amazon webpage
    Then User searches for "Java"
    And Test that resultText has "Java" in it
    Then User closes the page

  @p1
  Scenario: TC05 User searches for Cucumber with parameter

    Given User goes amazon webpage
    And User searches for "Cucumber"
    Then Test that resultText has "Cucumber" in it
    Then User closes the page

