Feature: Test 1 feature

  Background: Scenario: 1. Navigate to sauceDemo
    Given the user navigate to "https://www.saucedemo.com/"
    When the user enter "standard_user" in username
    And the user enter "secret_sauce" in password


  Scenario: 2.verify login credentials with valid username and password


    When the user click on login button
    Then the user should see "Products" text on page


  Scenario: 3.verify login credentials with invalid username and valid password


    When  the user click on login button
    Then the user should see "Epic sadface: Username and password do not match any user in this service"

  Scenario: 4.verify login credentials with valid username and invalid password


    And the user click on login button
    Then the user should see "Epic sadface: Username and password do not match any user in this service"

  Scenario: 5.invalid Username and Invalid password


    And the user click on login button
    Then the user should see "Epic sadface: Username and password do not match any user in this service"



@SmokeTest3
  Scenario Outline: 6.data
    When the user login with "<username>" username and "<password>" password
    Then the user should see "<expected text>" on the page

    Examples:
      | username      | password     | expected text                                                              |
      | standard_user | secret_sauce | login page                                                                |
      | Standard_user | secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | standard_user | Secret_sauce | Epic sadface: Username and password do not match any user in this service |
      | Standard_user | Secret_sauce | Epic sadface: Username and password do not match any user in this service |




  Scenario: verify login credentials in login page
    When the user enter "locked_out_user" in username
    And the user enter "secret_sauce" in password
    Then the user click on login button
    Then the user should see "Epic sadface: Sorry, this user has been locked out."







