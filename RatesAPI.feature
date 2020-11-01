Feature: to test ratesAPI

Scenario: to test that the api povides a valid response code
Given I set rates API endpoint
When I set the request header
Then I receive valid Response code 200

Scenario: to test that the api povides a valid response
Given I set rates API endpoint
When I set the request header
Then I receive valid Response

Scenario: to test that api provides an invalid response with incorrect url
Given I set rates API endpoint
When An incorrect url is provided
Then I receive invalid response supplied by the call

Scenario: to test that api provides an invalid response with incomplete url
Given I set rates API endpoint
When An incomplete url is provided
Then I receive invalid response supplied by the call

Scenario: to test that if specific date api call then should receive valid response code
Given I set rates API endpoint for Specific date
When I set the request header
Then I receive valid Response code 200

Scenario: to test that if specific date api call then should receive valid response
Given I set rates API endpoint for Specific date
When I set the request header
Then I receive valid Response

Scenario: to test that if future date api called then the response should match for current date
Given I set rates API endpoint for Specific date
When A future date is provided in the url
Then I receive valid response that matches for the current date