@RunScenario
Feature: ToDo List Management TestCases

Scenario: ToDo page visible
Given I am on my todo manage page
Then I should see todos header displayed

Scenario Outline: Enter ToDO items
When I input my "<toDoItems>" and enter
Then I should see "<toDoItems>" added to the list
And toDo count incremented
Examples:
| toDoItems |
| Haircut |
| Shopping |
| Meeting |
| Cleaning |

Scenario: ToDo item mark as complete
When I click a toDoItem checkbox and enter
Then I should see toDoItem marked as completed
And toDo count updated

Scenario: Filter Test Cases
When I click on Active filter
Then I should see only not completed items
When I click on Completed filter
Then I should see only completed items
When I click on All filter
Then I should see all items in toDo list

Scenario: Mark All as Complete
When I click on Mark all as Complete
Then I should not see any active items
And I should see all items completed

Scenario: Clear Completed
When I click on Clear Completed
Then I should not see completed items
