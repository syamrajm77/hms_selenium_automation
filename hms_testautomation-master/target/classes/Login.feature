Feature: Login 
@login 
Scenario Outline: Successful Login with Valid Credentials
 Given User is on Home Page
 When  User enters UserName "<userName>" and Password "<password>" and Select Institution "<hospitalId>" and Service Centre "<deptId>"
 And login alert accept
 Then Message displayed Login Successfully
 
 Examples:
 |userName|password|hospitalId|deptId|
 |10000T14|10000T14|35|80|
 