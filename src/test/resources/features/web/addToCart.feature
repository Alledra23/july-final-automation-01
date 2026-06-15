@web
Feature: Add Product To Cart

  Scenario: Add one product to cart

    Given user login successfully
    When user adds product to cart
    Then cart badge should show 1 item