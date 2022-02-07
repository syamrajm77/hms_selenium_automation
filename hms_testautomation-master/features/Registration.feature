Feature: Quick Registration
@registration
 Scenario: Create new registration
 Given User is on new registration
 When User submit registration
 Then Registered successfullfy
 