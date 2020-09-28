@Registration
Feature: To validate login application
Scenario: To test login with valid credentials
Given I navigate to "http://elearningm1.upskills.in/" 
And I click on SignUp button
And I enter Firstname the value "abc"
And I enter Lastname the value "abc"
And I enter Email the value "abc12@gmail.com"
And I enter Username the value "abc12"
And I enter Password the value "abc"
And I enter ConfirmPassword the value "abc"
When I click on Register button
Then SignUp success message should be present
And I click on Profile button
Then Registered email should be present
And I click on Inbox button
And I click on Compose button
And I enter SendTo the value "naveen"
And I click on SendersName link
And I enter Subject the value "This is for testing"
#And I enter Message the value "Hi, This is for testing"
And I click on SendMessage button
Then Email sent success message should be present