Feature: Euro

  Scenario: Prices in Euro
    Given  I  navigate to giftrete.org/giftshop/
    When I click on currency
    And I select Euro
    Then prices displays in Euro