Feature: US_002As a visitor, I want the functions in the header section of the Home page to be visible and active.

  Scenario: TC01 Logo Should be visible and active

    Given Visitor goes to the "homePage"
    Then Tests that logo is visible
    Then Test that logo is active


  Scenario: TC02 Cart link Should be visible and active

    Given Visitor goes to the "homePage"
    Then Tests that Cart link is visible
    Then Test that Cart link is active


  Scenario: TC03 Tests the Cart Symbol is visible

    Given Visitor goes to the "homePage"
    Then Tests that Cart Symbol is visible
    Then Test that Cart Symbol is active


  Scenario: TC04 Sign in link Should be visible and active

  Given Visitor goes to the "homePage"
  Then Tests that Sign in link is visible
  Then Tests that Sign in link is active


