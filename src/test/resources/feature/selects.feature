@Scenarios
Feature: Automation scenarios with selects

  Background: Go to selects website
    Given go to the SELECTS website

  @Case1
  Scenario: Selects by click
    When select the first option
    Then validate select first text

  @Case2
  Scenario: Selects by visibleText
    When select the second option
    Then validate select second text

  @Case3
  Scenario: Selects by index
    When select the third option
    Then validate select third text

  @Case4
  Scenario: Selects by value
    When select the third option by value
    Then validate select fourth text

  @Case5
  Scenario: Selects by sendKeys
    When select the fifth option
    Then validate select fifth text