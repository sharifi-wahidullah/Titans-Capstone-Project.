@home
Feature: Retail Test Environment

  Background: 
    Given User is on retail Website
    When User click on myAccount
    And User click on Login option

  @login
  Scenario: login to Test Environment
    And User enter userName "cali.titans@tekschool.us" and password "cali123"
    And User click on login button
    Then User should be logged into myAccount page

  @threeinOne
  Scenario Outline: login with multipul users
    And User enter location "<userName>" and account "<password>"
    And User click on login button
    Then User should be logged into myAccount page

    Examples: 
      | userName                 | password |
      | cali.titans@tekschool.us | cali123  |
      | test.test@yahoo.com      |   123456 |
      | test.test@gmail.com      |   123456 |
