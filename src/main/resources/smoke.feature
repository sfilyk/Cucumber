Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check to add more than one item to the cart
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User checks first product visibility
    And User clicks on first product
    And User clicks 'Add to Cart' button
    And User performs a second search for the keyword '<keyword2>'
    And User clicks search button
    And User checks first product visibility
    And User clicks on first product
    And User clicks 'Add to Cart' button
    Then User checks that add to cart popup header is '<amountOfProducts>'
    And User clicks 'Home Page' button

    Examples:
      | homePage             | amountOfProducts | keyword | keyword2 |
      | https://www.ebay.com | 2                | battery | modem    |

  Scenario Outline: Checking add product to cart from search
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User checks first product visibility
    And User clicks on first product
    And User checks 'Add to Cart' visibility button
    And User clicks 'Add to Cart' button
    Then User checks that add to cart popup header is '<amountOfProducts>'
    And User clicks 'Home Page' button

    Examples:
      | homePage             | amountOfProducts | keyword |
      | https://www.ebay.com | 1                | casio   |

 Scenario Outline:Customer service check
   Given User opens '<homePage>' page
   When User clicks Help and contact button
   And User checks visibility Customer Service page
   And User clicks Buying button
   And User checks visibility page, and return help page
   And User clicks Selling button
   And User checks visibility page, and return help page
   And User clicks Account button
   And User checks visibility page, and return help page
   And User clicks Returns & Refunds button
   And User checks visibility page, and return help page
   And User clicks Shipping & Tracking button
   And User checks visibility page, and return help page
   And User clicks Fees & billing button
   Then User clicks 'Home Page' button
   Examples:
     | homePage             |
     | https://www.ebay.com |

  Scenario Outline: Checking add product to cart from menu
    Given User opens '<homePage>' page
    And User clicks button 'Shop by category'
    And User checks 'Drop-down'  menu  'Shop by category'
    And User clicks 'See all categories' button
    And User clicks 'Laptops & Netbooks' button
    And User checks first product visibility
    And User clicks on first product
    When User clicks 'Add to Cart2' button
    Then User checks that add to cart popup header is '<amountOfProducts>'

    Examples:
      | homePage             | amountOfProducts |
      | https://www.ebay.com | 1                |

  Scenario Outline: Check site main functions
    Given User opens '<homePage>' page
    And User checks header visibility
    And User checks menu visibility
    And User checks top carouse visibility
    And User checks bottom carouse visibility
    And User checks search field visibility
    And User checks notification icon visibility
    And User checks 'Drop-down' menu button visibility
    And User checks cart icon visibility
    And User checks help and contact button visibility
    And User checks register button visibility
    And User checks sign in button visibility
    And User checks ship to button visibility
    When User clicks 'Ship to' button
    And User checks ship to popup visible
    Then User closes ship to popup

    Examples:
      | homePage              |
      | https://www.ebay.com  |

   Scenario Outline:Check Daily Deals
    Given User opens '<homePage>' page
    When User clicks Daily Deals button
    And User checks Daily Deals visibility
    Then The user then verifies that the offer list has the value '<amountOfProducts>'
    Examples:
      | homePage             | amountOfProducts |
      | https://www.ebay.com | 75               |

  Scenario Outline: Checking search field
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    Then User checks whether the search '<result>' matches
    And User clicks 'Home Page' button


    Examples:
      | homePage             | result           | keyword  |
      | https://www.ebay.com | samsung          | samsung  |
      | https://www.ebay.com | iphone           | iphone   |
      | https://www.ebay.com | motorola         | motorola |

  Scenario Outline: Checking wrong word in the search field
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    Then The user checks to see if the search matches the wrong word

    Examples:
      | homePage             |  keyword  |
      | https://www.ebay.com |  q        |

  Scenario Outline: Checking an empty shopping cart
    Given User opens '<homePage>' page
    When User clicks icon shopping cart
    Then User checks to see if the empty shopping cart "<header>"

    Examples:
      | homePage             | header                                 |
      | https://www.ebay.com | You don't have any items in your cart. |


  Scenario Outline: Check remove product from the cart
    Given User opens '<homePage>' page
    And User checks search field visibility
    When User makes search by keyword '<keyword>'
    And User clicks search button
    And User checks first product visibility
    And User clicks on first product
    And User clicks 'Add to Cart' button
    And User clicks remove 'Remove' button
    Then User checks to see if the empty shopping cart "<header>"

    Examples:
      | homePage             |  keyword |header                                 |
      | https://www.ebay.com |  modem   |You don't have any items in your cart. |