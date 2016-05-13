$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Register.feature");
formatter.feature({
  "line": 1,
  "name": "Proof of concept tha framework works",
  "description": "",
  "id": "proof-of-concept-tha-framework-works",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "# Scenario: Below scenario verifies that Register Page is displayed"
    },
    {
      "line": 4,
      "value": "#  Given User is on Home page"
    },
    {
      "line": 5,
      "value": "#  When User Request to Register"
    },
    {
      "line": 6,
      "value": "#  Then Register Page is displayed"
    }
  ],
  "line": 9,
  "name": "Below scenario verifies that an Unregistered user can creat an Account",
  "description": "",
  "id": "proof-of-concept-tha-framework-works;below-scenario-verifies-that-an-unregistered-user-can-creat-an-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@tagged"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User is on Register page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User submit RP form as unregistered user",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "an user account is created",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.user_is_on_Register_page()"
});
formatter.result({
  "duration": 22825266151,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_submit_RP_form_as_unregistered_user()"
});
formatter.result({
  "duration": 6366234993,
  "status": "passed"
});
formatter.match({
  "location": "Account.an_user_account_is_created()"
});
formatter.result({
  "duration": 161723070,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.StepDefs.Account.an_user_account_is_created(Account.java:21)\r\n\tat ✽.Then an user account is created(Register.feature:12)\r\n",
  "status": "failed"
});
});