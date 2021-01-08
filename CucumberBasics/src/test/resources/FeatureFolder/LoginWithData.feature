Feature: This is the login feature for orange HRM
Scenario: This is login scenario
Given user is on the orange HRM login page
When user enters the valid credentials "Admin" and "admin123"
And clicks the login button
Then user should see the home page


