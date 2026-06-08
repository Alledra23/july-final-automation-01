@api
Feature: Delete User

  Scenario: Delete Existing User

    Given user has existing user id for deletion
    When user sends DELETE request
    Then response status code should be 200