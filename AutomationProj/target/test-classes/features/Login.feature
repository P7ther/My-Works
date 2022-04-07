Feature: Application Login

@SmokeTest
Scenario: Home page default login
Given User is on landing Page
When User login into application with "Satyajit" and password "123asd"
Then Home page is populated
And cards displayed "True"

@RegTest
Scenario: Home page default login
Given User is on landing Page
When User login into application with "Panther" and password "asd123"
Then Home page is populated
And cards displayed "false"

@WebTest
Scenario: Home page default login
Given User is on landing Page
When User login into application with following details
|Jit|patra|p7ther@gmail.com|kolkata|700040|
Then Home page is populated
And cards displayed "false"

@MobileTest
Scenario Outline: Home page default login
Given User is on landing Page
When User login into the application with <Username> and password <password>
Then Home page is populated
And cards displayed "True"
Examples:
|Username|password|
|user1   |pass1   |
|user2   |pass2   |
|user3   |pass3   |
|user4   |pass4   |
