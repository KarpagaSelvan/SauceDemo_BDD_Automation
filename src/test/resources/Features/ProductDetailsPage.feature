@ProductPage
Feature: Verifying the product page functionalities of SwagLabs web application

  Scenario Outline: Verify the application response when the user clcikng the any of the product
    Given User is on SwagLabs home page
    When User perfroms login using the "<username>" and "<password>"
    Then User verify the success message "Products"
    And User clicks on the products from the products page list
    Then User verify the product details page success message "Back to products"
    And User perfrom logout
    Then User verify the login page success message "Swag Labs"

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
      
  Scenario Outline: Verify the application response when the user clcikng the cart button of the product page
    Given User is on SwagLabs home page
    When User perfroms login using the "<username>" and "<password>"
    Then User verify the success message "Products"
    And User clicks on the products from the products page list
    Then User verify the product details page success message "Back to products"
    And User clicks on the cart button
    Then User verify the cart details page success message "Your Cart"
    And User perfrom logout
    Then User verify the login page success message "Swag Labs"

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
