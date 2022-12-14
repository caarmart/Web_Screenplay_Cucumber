@Scenarios
Feature: Automation scenarios with scrolls

  Background: Go to scrolls website
    Given go to the SCROLLS website

  @Case1
  Scenario: Scroll to page bottom
    When does the bottom scroll
    Then validate page bottom

  @Case2
  Scenario: Scroll to page middle
    When does the middle scroll
    Then validate page middle