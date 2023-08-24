Feature: US1012 Window Test
   @smoke @p4
  Scenario:  TC20 User should be able to test new tab

    Given User goes "webUrl" webpage
    Then Scroll down to Login Portal
    And Click Login Portal
    And Switch to other window
    And Write values in the "username" and "password" boxes
    And Press the login button
    Then Test that the popup text is "validation failed"
    And Close the Popup by saying Ok
    And Go back to the first page
    Then  Test that the first page is returned
    And User closes all pages






#    1. Go to "http://webdriveruniversity.com/"
#2. Scroll down to "Login Portal"
#3. Click "Login Portal"
#4.Switch to other window
#5. Write values in the "username" and "password" boxes
#6.Press the "login" button
#7. Test that the popup text is "validation failed"
#8. Close the Popup by saying Ok
#9. Go back to the first page
#10. Test that the first page is returned