Feature: OpClinic
Background:
Successful Login with Valid Credentials
 Given User is on Home Page
 When  User enters UserName and Password and Select Institution and Service Centre
 And login alert accept
 Then Message displayed Login Successfully
@opClinic
Scenario: Open op clinic
 Given User on op clinic
 When User is clicking op clinic
 Then goto op clinic dashboard