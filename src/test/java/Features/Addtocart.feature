Feature: Test 3
Background: Scenario: 1. Navigate to sauceDemo

Given the user navigate to "https://www.saucedemo.com/"
When the user enter "standard_user" in username
And the user enter "secret_sauce" in password
When  the user click on login button
Then the user should see "product"

Scenario Outline 1: verify add to cart is working or not

  When User click on Sauce Labs Backpack
  Then  the user select "<product>" from the list
Then the user click on   Add to cart Button
  Then the user can see "<expectedtext>" text on the page

  Examples:
    |product  |           expectedtext|
    |sauce Labs Backpack |Remove      |

