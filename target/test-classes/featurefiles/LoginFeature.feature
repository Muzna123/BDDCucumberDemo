Feature: Testing the Login feature of Actitime Application

Background: Launch the browser and load the application
Given the browser is launched
And the application is loaded 


Scenario: Testing the Login Feature with Valid data
When the user enters the valid username
And the user enters the valid password
And the user clicks on the login Button
Then dashboard should be displayed


Scenario: Testing the forgotten password link
When user clicks on Forgot your password link
Then forgot your passsword component should be displayed