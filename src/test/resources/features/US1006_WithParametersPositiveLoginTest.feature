@wip
Feature: US1006 User should be able to login with valid data

  Scenario: TC12 With valid username and password User should be able to login

    Given User goes "qdUrl" webpage
    When User clicks on homepage LoginButton
    And User will enter an "qdValidEmail" to email box
    And User will enter a "qdValidPassword" to password box
    And User will click on loginPage LoginButton
    Then Test that User can see MyCourse link
    And User closes the page
