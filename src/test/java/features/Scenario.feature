Feature: Example Scenario
  Scenario: scroll down and click product
    Given go to main page
    And scroll down
    And select product
    And scroll down again
    And add product to card
    When click continue shopping button
    Then confirm to product added into basket and displayed