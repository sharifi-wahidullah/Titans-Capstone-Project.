@retailpage
Feature: Retail Page

  Background: 
    Given User is on Retail websitee
    When User click  on MyAccount
    And User click on Login
    And User enter username 'haroonsadiq1@gmail.com' and password 'sadiq123'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @retailpage1
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on 'Register for an Affiliate Account' link
    And User fill affiliate form with below information
      | company | website          | taxID | paymentMethod | payee Name |
      | Alkozia | www.sadiq123.com |  2021 | Cheque        | Haroon     |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  @retailpage2
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on 'Edit your affiliate information' links
    And User click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName    | abaNumber | swiftCode | accountName | accountNumber |
      | Wells Fargo |     12345 |      1234 | Sadiq       |      91612345 |
    And User click on Continue button
    Then User should see a success message

  @retailpage3
  Scenario: Edit your account Information
    When User click on 'Edit your account information' link12
    And User modify below information
      | firstname | lastName | email               | telephone |
      | sadiq     | lala     | sadiqlala@gmail.com |  93838292 |
    And User click on continue button
    Then User should see a message 'Success: Your account has been successfully updated'
