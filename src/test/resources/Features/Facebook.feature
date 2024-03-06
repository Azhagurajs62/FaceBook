Feature: FacebookAccount
  I want to use this template for my feature file
 
  Background:
  Given user launches facebook applications
 
  Scenario: CucumberTask
    And user able to create Account
    Then User able to signup 
    And User choose DOB
    Then user validate confirmation message

  Scenario: CucumberTaskextend   
    And user able to create Account
    When Users able to signup by one dim list
    |Prem|kumar|ajay.ajith5396@gmail.com|ajithkumar@0123|
    And User choose DOB
    Then user validate confirmation message 
    
  