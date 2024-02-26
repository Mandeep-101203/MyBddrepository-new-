Feature: Test 2 feature

  Background: Scenario: 1. Navigate to sauceDemo
    Given the user navigate to "https://www.saucedemo.com/"
    When the user enter "standard_user" in username
    And the user enter "secret_sauce" in password
    When  the user click on login button
    Then the use should see 4 option in the dropdown
@SmokeTest5
    Scenario Outline:6. Verify the user can select an option from dropdown list


      When the user select "<option>" option from the dropdown list
      Then the user can see "<option>" text on the page
      Examples:
  |option|
  |Name (A to Z)|
  |Name (Z to A) |
  |Price (low to high)|
  |Price (high to low)|