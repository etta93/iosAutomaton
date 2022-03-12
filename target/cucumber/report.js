$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/Task.feature");
formatter.feature({
  "name": "Task Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "create new task",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@app"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User in to do homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "TaskStep.user_in_to_do_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User create new task \"New Task\"",
  "keyword": "When "
});
formatter.match({
  "location": "TaskStep.user_create_new_task(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User tap submit button",
  "keyword": "And "
});
formatter.match({
  "location": "TaskStep.user_tap_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User see new task added",
  "keyword": "Then "
});
formatter.match({
  "location": "TaskStep.user_see_new_task_added()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});