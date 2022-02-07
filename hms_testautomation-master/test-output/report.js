$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OpClinic.feature");
formatter.feature({
  "line": 1,
  "name": "OpClinic",
  "description": "",
  "id": "opclinic",
  "keyword": "Feature"
});
formatter.before({
  "duration": 22056100,
  "status": "passed"
});
formatter.before({
  "duration": 264000,
  "status": "passed"
});
formatter.before({
  "duration": 1144900,
  "status": "passed"
});
formatter.before({
  "duration": 242200,
  "status": "passed"
});
formatter.before({
  "duration": 275900,
  "status": "passed"
});
formatter.before({
  "duration": 109900,
  "status": "passed"
});
formatter.before({
  "duration": 208400,
  "status": "passed"
});
formatter.before({
  "duration": 57300,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "Successful Login with Valid Credentials",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters UserName and Password and Select Institution and Service Centre",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "login alert accept",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 11242636100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.user_enters_UserName_and_Password_and_Select_Institution_and_Service_Centre()"
});
formatter.result({
  "duration": 2010398000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.login_alert_accept()"
});
formatter.result({
  "duration": 1022756400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.message_displayed_Login_Successfully()"
});
formatter.result({
  "duration": 75800,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Open op clinic",
  "description": "",
  "id": "opclinic;open-op-clinic",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@opClinic"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User on op clinic",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User is clicking op clinic",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "goto op clinic dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "OpClinicStep.user_on_op_clinic()"
});
formatter.result({
  "duration": 4041094600,
  "status": "passed"
});
formatter.match({
  "location": "OpClinicStep.user_is_clicking_op_clinic()"
});
formatter.result({
  "duration": 31300,
  "status": "passed"
});
formatter.match({
  "location": "OpClinicStep.goto_op_clinic_dashboard()"
});
formatter.result({
  "duration": 45300,
  "status": "passed"
});
formatter.uri("OpLite.feature");
formatter.feature({
  "line": 1,
  "name": "Op Lite",
  "description": "",
  "id": "op-lite",
  "keyword": "Feature"
});
formatter.before({
  "duration": 61200,
  "status": "passed"
});
formatter.before({
  "duration": 48800,
  "status": "passed"
});
formatter.before({
  "duration": 49600,
  "status": "passed"
});
formatter.before({
  "duration": 41800,
  "status": "passed"
});
formatter.before({
  "duration": 46400,
  "status": "passed"
});
formatter.before({
  "duration": 40200,
  "status": "passed"
});
formatter.before({
  "duration": 40900,
  "status": "passed"
});
formatter.before({
  "duration": 40200,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Create new opLite",
  "description": "",
  "id": "op-lite;create-new-oplite",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@opLite"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on opLite",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User select patient",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User submit op details",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Op successfullfy",
  "keyword": "Then "
});
formatter.match({
  "location": "OpLiteStepDef.user_is_on_opLite()"
});
formatter.result({
  "duration": 7039796700,
  "status": "passed"
});
formatter.match({
  "location": "OpLiteStepDef.user_select_patient()"
});
formatter.result({
  "duration": 10097086900,
  "status": "passed"
});
formatter.match({
  "location": "OpLiteStepDef.user_submit_op_details()"
});
formatter.result({
  "duration": 38500,
  "status": "passed"
});
formatter.match({
  "location": "OpLiteStepDef.op_successfullfy()"
});
formatter.result({
  "duration": 32900,
  "status": "passed"
});
});