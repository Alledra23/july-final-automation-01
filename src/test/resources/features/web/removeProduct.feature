@web
Feature: Remove Product

  Scenario: Remove product from cart

    Given user already added product to cart
    When user removes product from cart
    Then cart badge should disappear