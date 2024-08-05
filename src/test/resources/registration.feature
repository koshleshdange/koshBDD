
@Registration
Feature: Registration
  Scenario: Registration

    Scenario Outline:
      Given I am on the landing page
      When I click on the registration button
      And User fills the registration form with valid data "<gender>" "<firstname>" "<lastname>" "<DOBDay>" "<DOBMonth>" "<DOBYear>" "<email>"
      And I click on the Register button and continue button
      Then I should be on the home page

      Examples:
        | gender  |firstname | lastname | DOBDay | DOBMonth | DOBYear | email |
      | Male    | Max      | test     |25      | April    |1990     | test.km@gmail.com |
