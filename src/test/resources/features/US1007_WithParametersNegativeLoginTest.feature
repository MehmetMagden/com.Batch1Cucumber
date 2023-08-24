

Feature: User should not be able to login with invalid username or password

  Scenario: TC13 Negative login Test with valid userName and invalid password

    Given User goes "qdUrl" webpage
    When User clicks on homepage LoginButton
    And User will enter an "qdValidEmail" to email box
    And User will enter a "qdInValidPassword" to password box
    And User will click on loginPage LoginButton
    Then Test that user could not be login
    And User will wait for 3 sec
    And User closes the page

  @p2
  Scenario: TC14 Negative login Test with invvalid userName and valid password

    Given User goes "qdUrl" webpage
    When User clicks on homepage LoginButton
    And User will enter an "qdInValidEmail" to email box
    And User will enter a "qdValidPassword" to password box
    And User will click on loginPage LoginButton
    Then Test that user could not be login
    And User will wait for 3 sec
    And User closes the page

  @p4
  Scenario: TC15 Negative login Test with invalid userName and invalid password

    Given User goes "qdUrl" webpage
    When User clicks on homepage LoginButton
    And User will enter an "qdInValidEmail" to email box
    And User will enter a "qdInValidPassword" to password box
    And User will click on loginPage LoginButton
    Then Test that user could not be login
    And User will wait for 3 sec
    And User closes the page