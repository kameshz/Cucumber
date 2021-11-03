Feature: To validate login functionality of facebook

Background:
Given The user should launch the chrome browser
When The user should type the url
And The user should maximize the window

Scenario: Validate with invalid username and invalid password
And The user should type invalid username and passwords
					|kam|kam@123|
And The user should click the login button
And The user should get the title of the incorrect page
Then  The user should navigate to incorrect credential page


Scenario Outline: Validate with invalid username and valid password

And The user should type invalid username "<username>" and valid password "<password>"
And The user should click the login button
And The user should get the title of the incorrect page
Then  The user should navigate to incorrect credential page 

Examples:
|username |password|
|suresh|7894562|

