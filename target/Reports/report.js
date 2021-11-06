$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature%20files/FacebookLogin.feature");
formatter.feature({
  "name": "To validate login functionality of facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the url",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_type_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The user should type invalid username and passwords",
  "rows": [
    {
      "cells": [
        "kam",
        "kam@123"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_type_invalid_username_and_passwords(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should get the title of the incorrect page",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_get_the_title_of_the_incorrect_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_navigate_to_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Validate with invalid username and valid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user should type invalid username \"\u003cusername\u003e\" and valid password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "The user should click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "The user should get the title of the incorrect page",
  "keyword": "And "
});
formatter.step({
  "name": "The user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "suresh",
        "7894562"
      ]
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
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should launch the chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_launch_the_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type the url",
  "keyword": "When "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_type_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate with invalid username and valid password",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "The user should type invalid username \"suresh\" and valid password \"7894562\"",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_type_invalid_username_and_valid_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should get the title of the incorrect page",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_get_the_title_of_the_incorrect_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to incorrect credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_navigate_to_incorrect_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature%20files/ForgetPassword.feature");
formatter.feature({
  "name": "To validate forget password feature in the facebook page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.scenario({
  "name": "Verify the forget password functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "The user should launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "ForgetPasswordstepDefinition.the_user_should_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should load the url",
  "keyword": "When "
});
formatter.match({
  "location": "ForgetPasswordstepDefinition.the_user_should_load_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should maximize the window",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookLoginSteps.the_user_should_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click forgot passord link",
  "keyword": "And "
});
formatter.match({
  "location": "ForgetPasswordstepDefinition.the_user_should_click_forgot_passord_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to find your account page",
  "keyword": "And "
});
formatter.match({
  "location": "ForgetPasswordstepDefinition.the_user_should_navigate_to_find_your_account_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should type registered mobile number or email-id",
  "keyword": "And "
});
formatter.match({
  "location": "ForgetPasswordstepDefinition.the_user_should_type_registered_mobile_number_or_email_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "ForgetPasswordstepDefinition.the_user_should_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should navigate to reset your password page",
  "keyword": "Then "
});
formatter.match({
  "location": "ForgetPasswordstepDefinition.the_user_should_navigate_to_reset_your_password_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});