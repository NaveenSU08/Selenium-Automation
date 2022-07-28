# Author:
# Feature ID:
# Description:
# Purpose:
Feature: Create User,Modify user and Delete user functionality
Description: Verify or validate Create User,Modify user  and Delete User functionality
Scenario: Verify Login functionality
Given I launch the chrome browser
And I navigate the URL of the application
When I enter the usename in username text field
And  I enter the password in password text field
And I click on Login button
Then I find the Home Page

Scenario: Create User
Given I find User link button
And I enter User Details
And I click on CreateUser

Scenario: Modify User
Given I find the user
Then I modify the user

Scenario: Delete User
Given I find User Name
And I click Delete button

Scenario: Verify Logout functionality
Given I find the logout link in Home Page
When I click on Logout link
Then I find the login page
And I close Application