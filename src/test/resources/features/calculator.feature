Feature: Calculator - As a user I want to use a calculate
  So that I don't need to calculate myself


  Background:
    Given I have a calculator
  @Igor1
  Scenario: Add two number
    When I add 2 and 3
    Then the result should be 5
