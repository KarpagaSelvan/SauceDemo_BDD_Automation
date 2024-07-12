@LoginPage
Feature: Verifying the login page functionalities of SwagLabs web application

  Scenario Outline: Verify the login functionality with valid credentials
    Given User is on SwagLabs home page
    When User perfroms login using the "<username>" and "<password>"
    Then User verify the success message "Products"

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario Outline: Verify the login functionality with invalid credentials
    Given User is on SwagLabs home page
    When User perfroms login using the "<username>" and "<password>"
    Then User verify the invalid credentials error message "Epic sadface: Username and password do not match any user in this service"

    Examples: 
      | username         | password        |
      | standard_user001 | secret_sauce002 |

  Scenario Outline: Verify the login functionality with empty credentials
    Given User is on SwagLabs home page
    When User perfroms login using the "<username>" and "<password>"
    Then User verify the empty credentials error message "Epic sadface: Username is required"

    Examples: 
      | username | password |
      |          |          |
