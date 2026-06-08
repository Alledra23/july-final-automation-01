@api
Feature: Get User

  Scenario: Get User By ID

    Given user has valid user id
    When user sends GET request
    Then response status code should be 200
    And response contains firstName