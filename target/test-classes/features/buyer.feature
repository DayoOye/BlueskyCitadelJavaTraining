Feature: Buyer Registration

  Scenario: Valid Buyer Registration
    Given  I  navigate to giftrete.org/giftshop/
    When I select My Account
    And I select register
    And I enter in first name
    And I enter in last name
    And I enter in email
    And i enter telephone
    And I enter a password
    And I enter password confirmation
    And I select yes to subscribe top newsletter
    And I select no to become a seller
    And I tick the Privacy policy box
    And I click continue