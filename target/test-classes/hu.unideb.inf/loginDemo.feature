Feature: Homepage login page test

  Background:
    Given the homepage is opened

    Scenario Outline:
      Given the '<field1>' is filled with '<parameter1>'
      And  the '<field2>' is filled with <parameter2>
      When the login button is clicked
      Then the '<msg>' error message is shown
      Examples:
      | field1   | field2   | parameter1       | parameter2      | msg                                                                      |
      | username | password |                  |                 | Epic sadface: Username is required                                       |
      | username | password | randomUserName   |                 | Epic sadface: Password is required                                       |
      | username | password | validUserName    | inValidPassword | Epic sadface: Username and password do not match any user in this service|
      | username | password | inValidUserName  | validPassword   | Epic sadface: Username and password do not match any user in this service|