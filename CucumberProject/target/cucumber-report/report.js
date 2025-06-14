$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Login.feature");
formatter.feature({
  "name": "Login Feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have launched the simplilearn application",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.LoginStepDefinition.i_have_launched_the_simplilearn_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login Link",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.LoginStepDefinition.i_click_on_the_Login_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Failure Scenario using test data as parameter",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "I enter the Username \"abc@xyz.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.LoginStepDefinition.i_enter_the_Username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the Password \"Abc@12345\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.LoginStepDefinition.i_enter_the_Password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.LoginStepDefinition.i_click_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to see the error message \"The email address or password you have entered is invalid\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.LoginStepDefinition.i_should_be_able_to_see_the_error_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});