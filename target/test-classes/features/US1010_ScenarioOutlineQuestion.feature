Feature: US1010 Different information Test
  @p2
  Scenario Outline: TC18 Entering different values to different text boxes

    Given User goes "editorUrl" webpage
    Then clicks the new button
    And enters firstName "<firstName>"
    And enters lastName "<lastName>"
    And enters position "<position>"
    And enters office "<office>"
    And enters extension "<extension>"
    And enters startDate "<startDate>"
    And enters salary "<salary>"
    And clicks the Create button
    When user searches by "<firstName>"
    Then verifies that the "<firstName>" is in the name section
    And User closes the page


    Examples:
      | firstName | lastName | position  | office  | extension | startDate  | salary |
      | Hasan     | Can      | QA        | America | Space     | 2023-08-04 | 10000  |
      | Ali       | King     | QA Lead   | Turkey  | England   | 2022-08-04 | 8000   |
      | Murat     | Brown    | Test Lead | Italy   | Germany   | 2021-08-04 | 15000  |
      | Turgut    | White    | Scrum     | Manisa  | Turkey    | 2020-04-01 | 16000  |
      | Michael   | Gray     | QA        | USA     | -         | 2019-04-01  | 25000  |




#    Create a new feature file: user should be able to add US1007_user_data_
#   Create DataTableStepDefinition file and required step definitions and add 5 different records

#    When user goes to the address https://editor.datatables.net/
#   Then clicks the new button
#   And enters all information
#    And clicks the Create button
#   When user searches by first name
#   Then verifies that the name is in the name section