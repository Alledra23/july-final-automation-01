@web
Feature: Login

  Scenario: Login with valid credential
    Given user is on login page
    When user login with valid credential
    Then user should be redirected to products page