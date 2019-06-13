$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/LoginFeatures.feature");
formatter.feature({
  "name": "1st Feature User able to login with valid password",
  "description": "  User should be able to login to the site",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User login to the website with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Positive"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has already navigated to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_has_already_navigated_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"darthvader\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"Selenium12#\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User reaches the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_reaches_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User login to the website with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Negative"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User has already navigated to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_has_already_navigated_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters username as \"darthvad\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters password as \"Selenium12#\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_clicks_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User reaches the home pa",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});