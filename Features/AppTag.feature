Feature: Free CRM Application Testing 

@SmokeTest
Scenario: Login with correct username and password
Given This is valid login Test

@SystemTest
Scenario: Login with incorrect username and password
Given This is invalid login Test

@RegressionTest
Scenario: create a contact
Given This is contact test case

@EndToEndTest
Scenario: create a deal
Given This is deal test case

@SystemTest
Scenario: create a tasks
Given This is tasks test case

@SmokeTest
Scenario: create a case
Given This is create case test case

@EndToEndTest
Scenario: Verify left panel links 
Given Click on left panel link

@EndToEndTest
Scenario: search a deal
Given This is serach deal test 

@SmokeTest
Scenario: search a contact
Given This is serach contact test 

@RegressionTest
Scenario: search a doc
Given This is doc search test 

@SystemTest
Scenario: search a forms
Given This is search form test 

@SystemTest
Scenario: validate a report 
Given This is report test 