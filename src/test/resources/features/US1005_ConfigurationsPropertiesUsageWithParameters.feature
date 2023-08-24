@smoke
Feature: User uses parameters in Configurations.Properties file

#  Create 3 Scenario, and visit Amazon, qualitydemy, Walmart homepages
#  test that you reached the pages
#  we can use values dynamically from the feature file
#  we can also use values from configurations.file
#  we need to send key value to configurations.file then we will recive and use value of this key
  @p4
  Scenario: TC09 User should be able to visit Amazon

    Given User goes "amazonUrl" webpage
    Then Test that url has "amazon" in it
    Then User closes the page
  @p2
  Scenario: TC10 User should be able to visit qualitydemy page
    
    Given User goes "qdUrl" webpage
    Then Test that url has "demy" in it
    Then User closes the page
  @p4
  Scenario: TC11 User should be able to visit walmart page

    Given User goes "walmartUrl" webpage
    Then Test that url has "walmart" in it
    Then User closes the page



