Feature: Wishlist

  Scenario: WIshlist Creation
    Given  I  navigate to giftrete.org/giftshop/
    When I select My Account
    And  i select login
    And  I enter in email
    And  I enter a password
    And  I click on login
    And I click on desktop
    And I select all desktop
    And I click on add to wish list on Macbook product
    And I click add to wish list on iphone
    And I click on wishlist
    And I remove iphone
    And I clicked on continue
    Then My account homepage displays