Feature: Product purchase

 @Buy
 Scenario: Buying Product From Demoblaze
    Given user views the list of product
    When user views details of product
    And user adds product to cart
    Then user checkout and makes payment for the product
