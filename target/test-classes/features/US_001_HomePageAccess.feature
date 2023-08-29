
Feature: US_001 As a visitor, I must be able to access the website in order to use the site

  @US001_TC01
  Scenario: TC01 Url should be verified

    Given Visitor goes to the "homePage"
    Then Tests the "homePageUrl"

  @US001_TC02
  Scenario: TC02 Title should be verified

    Given Visitor goes to the "homePage"
    Then Tests the title "title"

  @US001_TC03
  Scenario: TC03 Logo should be visible

    Given Visitor goes to the "homePage"
    Then Tests that logo is visible

  @US001_TC04
  Scenario: TC04 Search box should be visible

    Given Visitor goes to the "homePage"
    Then Tests that SearchTextBox is visible
