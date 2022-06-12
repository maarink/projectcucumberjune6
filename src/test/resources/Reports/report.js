$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "To validate the postoffice funtionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate Login Funtionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user should be open the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Postoffice.the_user_should_be_open_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click the register button",
  "keyword": "When "
});
formatter.match({
  "location": "Postoffice.the_user_has_to_click_the_register_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to fill the username,dob and passing year",
  "keyword": "And "
});
formatter.match({
  "location": "Postoffice.the_user_has_to_fill_the_username_dob_and_passing_year()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user has to click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "Postoffice.the_user_has_to_click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The should navigate the function",
  "keyword": "Then "
});
formatter.match({
  "location": "Postoffice.the_should_navigate_the_function()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.BaseClass.BaseClass.quit(BaseClass.java:65)\r\n\tat org.stepdefinition.Postoffice.the_should_navigate_the_function(Postoffice.java:60)\r\n\tat ✽.The should navigate the function(file:src/test/resources/Feature/Login.feature:8)\r\n",
  "status": "failed"
});
});