

Feature: US1004 User can use background feature for repeated steps at the beginning

#  Background steps will be executed before each scenario.
  Background: For all scenarios, first step will be this one
    Given User goes amazon webpage

  Scenario:  TC06 User searches for Nutella with parameter


    Given User searches for "Nutella"
    Then Test that resultText has "Nutella" in it
    Then User closes the page

    Scenario: TC07 User searches for Java with parameter


      And User searches for "Java"
      Then Test that resultText has "Java" in it
      Then User closes the page

    Scenario: TC08 Users Searches for Cucumber with parameter


      And User searches for "Cucumber"
      Then Test that resultText has "Cucumber" in it
      Then User closes the page

