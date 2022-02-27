$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("todo.feature");
formatter.feature({
  "line": 2,
  "name": "ToDo List Management TestCases",
  "description": "",
  "id": "todo-list-management-testcases",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@RunScenario"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "ToDo page visible",
  "description": "",
  "id": "todo-list-management-testcases;todo-page-visible",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on my todo manage page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I should see todos header displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ToDoTestCases.i_am_on_my_todo_manage_page()"
});
formatter.result({
  "duration": 169352515,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.i_should_see_todos_header_displayed()"
});
formatter.result({
  "duration": 29066172,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Enter ToDO items",
  "description": "",
  "id": "todo-list-management-testcases;enter-todo-items",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "I input my \"\u003ctoDoItems\u003e\" and enter",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see \"\u003ctoDoItems\u003e\" added to the list",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "toDo count incremented",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "todo-list-management-testcases;enter-todo-items;",
  "rows": [
    {
      "cells": [
        "toDoItems"
      ],
      "line": 13,
      "id": "todo-list-management-testcases;enter-todo-items;;1"
    },
    {
      "cells": [
        "Haircut"
      ],
      "line": 14,
      "id": "todo-list-management-testcases;enter-todo-items;;2"
    },
    {
      "cells": [
        "Shopping"
      ],
      "line": 15,
      "id": "todo-list-management-testcases;enter-todo-items;;3"
    },
    {
      "cells": [
        "Meeting"
      ],
      "line": 16,
      "id": "todo-list-management-testcases;enter-todo-items;;4"
    },
    {
      "cells": [
        "Cleaning"
      ],
      "line": 17,
      "id": "todo-list-management-testcases;enter-todo-items;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Enter ToDO items",
  "description": "",
  "id": "todo-list-management-testcases;enter-todo-items;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@RunScenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I input my \"Haircut\" and enter",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see \"Haircut\" added to the list",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "toDo count incremented",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Haircut",
      "offset": 12
    }
  ],
  "location": "ToDoTestCases.i_input_my_and_enter(String)"
});
formatter.result({
  "duration": 212209131,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Haircut",
      "offset": 14
    }
  ],
  "location": "ToDoTestCases.i_should_see_toDoItems_added_to_the_list(String)"
});
formatter.result({
  "duration": 25474296,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.todo_count_incremented()"
});
formatter.result({
  "duration": 37967671,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Enter ToDO items",
  "description": "",
  "id": "todo-list-management-testcases;enter-todo-items;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@RunScenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I input my \"Shopping\" and enter",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see \"Shopping\" added to the list",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "toDo count incremented",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping",
      "offset": 12
    }
  ],
  "location": "ToDoTestCases.i_input_my_and_enter(String)"
});
formatter.result({
  "duration": 61890947,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Shopping",
      "offset": 14
    }
  ],
  "location": "ToDoTestCases.i_should_see_toDoItems_added_to_the_list(String)"
});
formatter.result({
  "duration": 23391743,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.todo_count_incremented()"
});
formatter.result({
  "duration": 28455671,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Enter ToDO items",
  "description": "",
  "id": "todo-list-management-testcases;enter-todo-items;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@RunScenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I input my \"Meeting\" and enter",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see \"Meeting\" added to the list",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "toDo count incremented",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Meeting",
      "offset": 12
    }
  ],
  "location": "ToDoTestCases.i_input_my_and_enter(String)"
});
formatter.result({
  "duration": 66716388,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Meeting",
      "offset": 14
    }
  ],
  "location": "ToDoTestCases.i_should_see_toDoItems_added_to_the_list(String)"
});
formatter.result({
  "duration": 24918745,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.todo_count_incremented()"
});
formatter.result({
  "duration": 29247432,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Enter ToDO items",
  "description": "",
  "id": "todo-list-management-testcases;enter-todo-items;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@RunScenario"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I input my \"Cleaning\" and enter",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see \"Cleaning\" added to the list",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "toDo count incremented",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Cleaning",
      "offset": 12
    }
  ],
  "location": "ToDoTestCases.i_input_my_and_enter(String)"
});
formatter.result({
  "duration": 67817696,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cleaning",
      "offset": 14
    }
  ],
  "location": "ToDoTestCases.i_should_see_toDoItems_added_to_the_list(String)"
});
formatter.result({
  "duration": 23594609,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.todo_count_incremented()"
});
formatter.result({
  "duration": 27055464,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "ToDo item mark as complete",
  "description": "",
  "id": "todo-list-management-testcases;todo-item-mark-as-complete",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I click a toDoItem checkbox and enter",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I should see toDoItem marked as completed",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "toDo count updated",
  "keyword": "And "
});
formatter.match({
  "location": "ToDoTestCases.i_click_a_toDoItem_checkbox_and_enter()"
});
formatter.result({
  "duration": 57845097,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.i_should_see_toDoItem_marked_as_completed()"
});
formatter.result({
  "duration": 25595922,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.todo_count_updated()"
});
formatter.result({
  "duration": 28840723,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Filter Test Cases",
  "description": "",
  "id": "todo-list-management-testcases;filter-test-cases",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "I click on Active filter",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "I should see only not completed items",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "I click on Completed filter",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "I should see only completed items",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "I click on All filter",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I should see all items in toDo list",
  "keyword": "Then "
});
formatter.match({
  "location": "ToDoTestCases.i_click_on_Active_filter()"
});
formatter.result({
  "duration": 97399786,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.i_should_see_only_not_completed_items()"
});
formatter.result({
  "duration": 3078505256,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.i_click_on_Completed_filter()"
});
formatter.result({
  "duration": 3069176568,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.i_should_see_only_completed_items()"
});
formatter.result({
  "duration": 3022710093,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.i_click_on_All_filter()"
});
formatter.result({
  "duration": 3087893392,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.i_should_see_all_items_in_toDo_list()"
});
formatter.result({
  "duration": 3066535982,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Mark All as Complete",
  "description": "",
  "id": "todo-list-management-testcases;mark-all-as-complete",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "I click on Mark all as Complete",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "I should not see any active items",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "I should see all items completed",
  "keyword": "And "
});
formatter.match({
  "location": "ToDoTestCases.i_click_on_Mark_all_as_Complete()"
});
formatter.result({
  "duration": 3022230216,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.i_should_not_see_any_active_items()"
});
formatter.result({
  "duration": 30034856987,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.i_should_see_all_items_completed()"
});
formatter.result({
  "duration": 48522917,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "Clear Completed",
  "description": "",
  "id": "todo-list-management-testcases;clear-completed",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 38,
  "name": "I click on Clear Completed",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "I should not see completed items",
  "keyword": "Then "
});
formatter.match({
  "location": "ToDoTestCases.i_click_on_Clear_Completed()"
});
formatter.result({
  "duration": 3055549885,
  "status": "passed"
});
formatter.match({
  "location": "ToDoTestCases.i_should_not_see_completed_items()"
});
formatter.result({
  "duration": 30054526466,
  "status": "passed"
});
});