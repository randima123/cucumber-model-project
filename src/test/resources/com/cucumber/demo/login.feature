Feature: Existing user login to the application

Scenario: Verifying existing user login

Given User is in the login page
When User enter username as "randima" and password as "abc"
And Click on login button
Then User should be logged in