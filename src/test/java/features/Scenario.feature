Feature: Example Scenario
    Background:
    Given setting driver

  Scenario: scroll right in Featured And Recommended
    Given go to main page
    And get Featured And Recommended product name
    And scroll right
    When get Featured And Recommended product name
    Then confirm name different beetwen pages to page scroll right

  Scenario: scroll down and click product
    Given scroll down
    And select product
    # there is a assertion for product name
    And scroll down
    And add product to card
    When click continue shopping button
    Then confirm to product added into basket and displayed

  Scenario: Remove product in basket
    Given scroll up
    Given click basket icon
    When click remove button
    Then confirm to cart is empty