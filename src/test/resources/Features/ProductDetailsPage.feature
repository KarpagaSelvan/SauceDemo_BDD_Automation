@ProductPage
Feature: Verifying the product page functionalities of SwagLabs web application

  Scenario Outline: Verify the application response when the user clcikng the any of the product
    Given User is on SwagLabs home page
    When User perfroms login using the "<username>" and "<password>"
    Then User verify the success message "Products"
    And User clicks on the products from the products page list
    Then User verify the product details page success message "Back to products"

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
