
@wip
Feature: US_003 As a visitor, I want the functions in the body of the Home page to be visible and active.

  Scenario: TC01 Search box sould be visible and active

    Given Visitor goes to the "homePageUrl"
    Then Tests that Search box is visible
    Then that Search box is active

    Scenario: TC_002 Tests that when an address entered, it takes us the regarding page

      Given Visitor goes to the "homePageUrl"
      Then Visiters searches "London" in the search box
      Then Tests that visiter can see restourant regarding to the address