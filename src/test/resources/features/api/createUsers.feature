@api
Feature: Create User

  Scenario: Create New User

    Given user prepares new user data
    When user sends POST request
    Then response status code should be 200
    And created user firstName should be Ardella