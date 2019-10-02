Feature: Buyer Login

  Scenario: Buyer Valid Login
    Given  I  navigate to giftrete.org/giftshop/
    When I select My Account
    And  i select login
    And  I enter in email
    And  I enter a password
    And  I click on login
    Then user is logged in