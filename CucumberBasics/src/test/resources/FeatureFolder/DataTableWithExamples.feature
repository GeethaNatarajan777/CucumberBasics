Feature:  This is Login feature for orange HRM Website
Scenario Outline: Login scenario for Examples
Given You are in the orange HRM website login page
When user enters the username "<UserName>" and password "<PassWord>"
And enters login Orange HRM button

Examples:
|UserName||PassWord|
|Admin||admin123|
|Admin||admin103|
