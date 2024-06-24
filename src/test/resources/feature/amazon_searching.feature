@AmazonSearching
Feature: Search on the Amazon website
  As a Customer when I search for Alexa, I want to see if the third option on the second page is
  available for purchase and can be added to the cart.

  @Case1
  Scenario: Search for Alexa on the Amazon web site
    Given the user navigates to Amazon website
    When Searches for Alexa
    And navigates to the second page
    And selects the third item
    Then assert that the item would be available for purchase