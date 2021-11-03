@sanity
Feature: To validate forget password feature in the facebook page
Scenario: Verify the forget password functionality
Given The user should launch the browser
When The user should load the url
And The user should maximize the window
And The user should click forgot passord link
And The user should navigate to find your account page
And The user should type registered mobile number or email-id
And The user should click the search button
Then The user should navigate to reset your password page 
 
