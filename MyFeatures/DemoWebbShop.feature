Feature: Checking Features of DemoWebShop

  Scenario: user access the website and do registration
    Given DemoWebShop website is launched
    And user clicks on register link
    When user enters the deatils
    Then Clicks on register button for account creation

  Scenario Outline: Registered user log into DemoWebShop
    Given Registered user clicks on Login link
    Then user enters the required credentials
    And Clicks on Login button to access the website

    Examples: 
      | uname             | pswd   |
      | siddhi@gmail.com  | sid123 |
      | shivani@gmail.com | sid222 |

  Scenario: user access to website and search for item
    Given Registered user is successfully logged in DemoWebShop
    When user enters name of particular item in the search bar
    And Click on search button
    Then Details of searched item is displayed

  Scenario: user adds the searched product to cart
    Given user verifies the details mentioned of product
    Then user clicks on Add to Cart button
