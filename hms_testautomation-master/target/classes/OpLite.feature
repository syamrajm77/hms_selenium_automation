Feature: Op Lite
@opLite
 Scenario: Create new opLite
 Given User is on opLite
 When User select patient
 And  User submit op details
 Then Op successfullfy
 