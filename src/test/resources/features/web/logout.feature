@web
Feature: Logout

  Scenario: Logout successfully

    Given user login successfully
    When user clicks logout button
    Then user should be redirected to login page