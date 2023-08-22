

Feature: US1008 Testing amazon search with a lot of different values

  Scenario Outline: TC16 Amazon search Test

    Given User goes "amazonUrl" webpage
    Then User searches for "<worldToSearch>"
    Then Test that resultText has "<worldToSearch>" in it
    And User closes the page





    Examples:
      | worldToSearch |
      | Nutella       |
      | Java          |
      | Samsung       |
      | Apple         |
      | Fire          |
      | Music         |
      | Art           |
      | on            |
