@Scenarios
Feature: Automation scenarios with clicks

  Background: Go to clicks website
    Given go to the CLICKS website

  @Case1
  Scenario: Realize a simple click
    When click an option
    Then validate the text after simple click

  @Case2
  Scenario: Realize a double click
    When  double click an option
    Then validate the text after double click

  @Case3
  Scenario: Realize a right click
    When  right click an option
    Then validate the text after right click