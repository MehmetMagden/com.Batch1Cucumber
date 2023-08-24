Feature: User Should be able to register

  Scenario: TC21 User should be able to enter personal information and register

    Given  User goes "autoUrl" webpage
    And clicks the user sign in link
    And user enters email address in Create and account section
    And clicks the Create an Account button
    And user enters personal and contact information
    And the user clicks the Register button
    Then verify account creation





#    Let's go to https://automationexercise.com/
#Let's do the following test with Cucumber
# Given  User goes the website
#  And clicks the user sign in link
#And user enters email address in Create and account section
#And clicks the Create an Account button
#  And user enters personal and contact information
#  And the user clicks the Register button
#  Then verify account creation