# Author:carlos
@stories
Feature: create user Utest.com for choucair login test
  as a user, I want to learn how to automate in screenplay

  @scenario1
  Scenario: Create new user in Utest.com
    Given than Carlos wants to create user in utest
    | strFirstName   | strLastName | strEmailAddress         | month | day | year | lang    |
    | Carlos Alberto | Lopez Mazo  | dwalshp_j832c@pebih.com | July  | 14  | 1997 | spanish |
    When assignee city and password continue use
    | strPassword | strConfirmPassword | strCity | strZip |
    | 1357Carl+   | 1357Carl+          | Armenia | 630001 |
    Then he finds the page init
    | strConfirmPage |
    | Aun no lo se   |