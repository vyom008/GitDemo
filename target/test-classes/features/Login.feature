@tag
Feature: Application Login

#  @tag1
  Scenario: Home page default login
    Given User is on NetBanking landing page
     When User login into application with "jin" and "1234"
     Then Home page is displayed
      And Cards displayed are "true"
  
  Scenario: Home page default login
    Given User is on NetBanking landing page
     When User login into application with "john" and "4321"
     Then Home page is displayed
      And Cards displayed are "false"

#  @tag2
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step

#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
