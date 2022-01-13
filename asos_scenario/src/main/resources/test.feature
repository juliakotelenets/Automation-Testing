Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check that network buttons is enabled
    Given User opens '<homePage>' page
    Then User checks that Facebook button is enabled
    Then User checks that Instagram button is enabled
    Then User checks that Snapchat button is enabled

    Examples:
      |homePage             |
      |https://www.asos.com/|

  Scenario Outline: Check that items add to wish list
    Given User opens '<homePage>' page
    And User clicks on women clothes button
    And User waiting for the women clothes page to load
    And User moves mouse to shoes category
    And User clicks on heels category button
    And User waiting for the heels page to load
    And User chooses the shoes and click on it
    And User waiting for the product page to load
    And User clicks on add to wish list button
    And User clicks on wish list page
    And User waiting for the wish list page to load
    Then User checks that count of products in wish list are '<countOfProducts>'

    Examples:
      |homePage             |countOfProducts|
      |https://www.asos.com/|1 item         |

  Scenario Outline: Check the product article
      Given User opens '<homePage>' page
      And User clicks on women clothes button
      And User waiting for the women clothes page to load
      And User moves mouse to shoes category
      And User clicks on heels category button
      And User waiting for the heels page to load
      Then User checks the product article with '<expectedArticle>'

      Examples:
        | homePage            |expectedArticle                           |
        |https://www.asos.com/|ASOS DESIGN Nero square toe mules in clear|

  Scenario Outline: Check that error message is displayed when don't fill necessary field
    Given User opens '<homePage>' page
    And User moves mouse to account button
    And User clicks on sign up button
    And User waiting for the register page to load
    And User fills the email field with '<email>'
    And User fills the name field with '<name>'
    And User fills the last name field with '<lastName>'
    And User fills the password field with '<password>'
    And User clicks on submit button
    Then User checks that error message is displayed


    Examples:
      | homePage            |email           |name |lastName  |password   |
      |https://www.asos.com/|lalala@gmail.com|Julia|Kotelenets|12345678910|

  Scenario Outline: Check that error message is displayed when fill the wrong data
    Given User opens '<homePage>' page
    And User moves mouse to account button
    And User clicks on sign up button
    And User waiting for the register page to load
    And User fills the email field with '<email>'
    And User fills the name field with '<name>'
    And User fills the last name field with '<lastName>'
    And User fills the password field with '<password>'
    And User fills the birthday data
    And User clicks on submit button
    And User checks that error about incorrectly filled data is displayed

    Examples:
      | homePage            |email           |name |lastName  |password|
      |https://www.asos.com/|lalala@gmail.com|Julia|Kotelenets|12345678|

  Scenario Outline: Check the title of search results
    Given User opens '<homePage>' page
    And User search the '<searchInput>'
    And User waiting for the search result page to load
    Then User checks the title of '<searchTitle>'

    Examples:
      | homePage             |searchInput|searchTitle|
      | https://www.asos.com/|heels      |"Heels"    |

   Scenario Outline: Check that size sort work correctly
     Given User opens '<homePage>' page
     And User clicks on women clothes button
     And User waiting for the women clothes page to load
     And User moves mouse to clothing category
     And User clicks on dresses category
     And User waiting for the dresses page to load
     And User clicks on size button
     And User choose the size of dress
     And User choose dress product
     And User waiting for the product page to load
     And User clicks on select size button
     Then User checks that all sizes contains expected '<size>'

     Examples:
       | homePage            |size |
       |https://www.asos.com/|UK 16|

   Scenario Outline: Check that select size error is displayed
     Given User opens '<homePage>' page
     And User search the '<searchInput>'
     And User waiting for the search result page to load
     And User choose the hoodie product
     And User waiting for the product page to load
     And User clicks on buy button
     Then User checks that select size error is displayed

     Examples:
       | homePage            |searchInput|
       |https://www.asos.com/|hoodies    |

  Scenario Outline: Check that number of items increased
    Given User opens '<homePage>' page
    And User clicks on men clothes category
    And User waiting for the men clothes page to load
    And User moves mouse to sportswear button
    And User clicks on shorts category button
    And User waiting for the shorts page to load
    And User choose the shorts product
    And User waiting for the product page to load
    And User clicks on select size button
    And User choose the size in select size menu
    And User clicks on buy button
    Then User checks that '<number>' of items changed

    Examples:
      | homePage            |number|
      |https://www.asos.com/|1     |

  Scenario Outline: Check that items deletes from cart
    Given User opens '<homePage>' page
    And User clicks on men clothes category
    And User waiting for the men clothes page to load
    And User moves mouse to sportswear button
    And User clicks on shorts category button
    And User waiting for the shorts page to load
    And User choose the shorts product
    And User waiting for the product page to load
    And User clicks on select size button
    And User choose the size in select size menu
    And User clicks on buy button
    And User deletes item from cart
    Then User checks that cart is empty

    Examples:
      | homePage            |
      |https://www.asos.com/|