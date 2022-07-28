# Author:
# Feature ID:
# Description:
# Purpose:
Feature: Create Customer and Delete Customer functionality
Description: Verify or validate Create Customer and Delete Customer functionality
Scenario: Verify Login functionality
Given I launch the chrome browser
And I navigate the URL of the application
When I enter the usename in username text field
And  I enter the password in password text field
And I click on Login button
Then I find the Home Page

Scenario: Create Customer
Given I find the Tasks button
Then I add new customer
And I enter customer name and create customer

Scenario: Delete Customer
Given I select customer 
And I Delete customer

Scenario: Verify Logout functionality
Given I find the logout link in Home Page
When I click on Logout link
Then I find the login page
And I close Application