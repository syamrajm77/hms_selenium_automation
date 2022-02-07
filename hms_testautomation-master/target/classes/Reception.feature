Feature: Reception
Background:
Successful Login with Valid Credentials
 Given User is on Home Page
 When  User enters UserName and Password and Select Institution and Service Centre
 And login alert accept
 Then Message displayed Login Successfully
@reception
Scenario: Open Reception
 Given User on reception
 When User is clicking reception
 Then goto reception dashboard
 