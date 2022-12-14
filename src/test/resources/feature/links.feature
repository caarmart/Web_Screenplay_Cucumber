@Scenarios
Feature: Automation scenarios with links

  Background: Go to links website
    Given go to the LINKS website

  @Case1
  Scenario: Link by content
    When go to linkByContent tittle
    Then validate the form

  @Case2
  Scenario: Link by html
    When go to linkByHtml tittle
    Then validate the form