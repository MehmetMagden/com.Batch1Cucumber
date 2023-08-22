Feature: US1009 Negative Login Test

  Scenario Outline: TC17 User should not be able login with invalid data

    Given User goes "qdUrl" webpage
    When User clicks on homepage LoginButton
    And User will manually enter an "<qdEmail>" to email box
    And User will manually enter a "<qdPassword>" to password box
    And User will click on loginPage LoginButton
    Then Test that user could not be login
    And User will wait for 3 sec
    And User closes the page




    Examples:
      | qdEmail        | qdPassword   |
      | asdf@er.com    | Retfd456.    |
      | a@a.com        | reterT45.    |
      | aer@sdfa.cerom | Az.123123123 |
      | asdf           | asdf         |
