Feature: This is to test google search function
@Positive
Scenario: Positive scenario
Given user enters the google website
When user enters the search term "Geetha"
And press the enter button
Then user should see the search results

@Negative
Scenario: Negative Scenario
Given user enters the google website
When user enters the search term "Geetha"
And press the enter button
Then user should see the search results