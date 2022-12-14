@Scenarios
Feature: Automation scenarios with clicks

  Background: Go to clicks website
    Given go to the POP_UP_WINDOWS website

  @Case1
  Scenario: Calculator
    When use the calculator
    Then validate calculator has opened