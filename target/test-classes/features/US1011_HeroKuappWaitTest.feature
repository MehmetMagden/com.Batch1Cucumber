Feature: US1011 User tests buttons
  @smoke @p1
  Scenario: TC19 User tests buttons by waiting

  Given User goes "heroUrl" webpage
  When Click the Add Element button
  And Wait until the Delete button is visible
  Then Test that the Delete button is visible
  And Delete the button by pressing the Delete button
  Then Test that the delete button is not visible
  And User closes the page




#    Let's create a new test method
#Go to https://the-internet.herokuapp.com/add_remove_elements/
#1)	Click the "Add Element" button
#2) 	Wait until the "Delete" button is visible
#3)	Test that the "Delete" button is visible
#4)	Delete the button by pressing the Delete button
#5	)	Test that the delete button is not visible