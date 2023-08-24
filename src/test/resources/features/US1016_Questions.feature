Feature: User should see the product in first page

  Scenario: User should be able to see Nutella Hazelnut product in first page

    Given User goes amazon webpage
    When User searches for "Nutella"
    Then Test that the products at first page has Nutella Hazelnut