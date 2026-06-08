@api
Feature: Update User

  Scenario: Update Existing User

    Given user has existing user id
    When user sends PUT request
    Then response status code should be 200
    And user firstName should be updated