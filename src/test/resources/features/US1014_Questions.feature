Feature: US1014 Invalid Email Test

  Scenario: TC22 User should not be able to regester by an email without @ symbol

    Given User goes "autoUrl" webpage
    And clicks the user sign in link
    And writes the email address without the @ sign in the email box and clicks enter
    Then verify that user can not register




#    Let's go to https://automationexercise.com/
#     Let's do the following test with Cucumber
#- Given user goes to the page
#- And user clicks sign in link
#- And writes the email address without the @ sign in the email box and clicks enter
#- Then verify that the error message is “Invalid email address”