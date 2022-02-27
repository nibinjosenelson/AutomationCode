package com.toDo.stepdefs;

import org.junit.Assert;

import com.settings.TestRunner;
import com.toDo.pages.ToDoPages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ToDoTestCases extends TestRunner {
	 @Given("^I am on my todo manage page$")
     public void i_am_on_my_todo_manage_page(){
		 ToDoPages pages = new ToDoPages(driver);
		 Assert.assertTrue("User is not on To DO page",pages.confirmPageUrl());
       
     }
     @Then("^I should see todos header displayed$")
     public void i_should_see_todos_header_displayed() {
    	 ToDoPages pages = new ToDoPages(driver);
		 Assert.assertTrue("todos header is not displayed",pages.header.isDisplayed());
         
     }
     @When("^I input my \"([^\"]*)\" and enter$")
     public void i_input_my_and_enter(String arg1) {
    	 ToDoPages pages = new ToDoPages(driver);
    	 pages.enterToDOItems(arg1);
     }
     @Then("^I should see \"([^\"]*)\" added to the list$")
     public void i_should_see_toDoItems_added_to_the_list(String arg1)  {
    	 ToDoPages pages = new ToDoPages(driver);
    	 Assert.assertTrue("Todo items  are not added to list",pages.confirmToDOItemsAdded(arg1));
     }
     @Then("^toDo count incremented$")
     public void todo_count_incremented() {
    	 ToDoPages pages = new ToDoPages(driver);
    	 Assert.assertTrue("Todo count is not incremented",pages.confirmToDOCount());
     }
     
     @When("^I click a toDoItem checkbox and enter$")
     public void i_click_a_toDoItem_checkbox_and_enter() {
    	 ToDoPages pages = new ToDoPages(driver);
    	 pages.clickCheckBox();
     }
     
     @Then("^I should see toDoItem marked as completed$")
     public void i_should_see_toDoItem_marked_as_completed(){
    	 ToDoPages pages = new ToDoPages(driver);
    	 Assert.assertTrue("ToDo Item not marked as complete",pages.displayCompleted());
     }
     @Then("^toDo count updated$")
     public void todo_count_updated() {
    	 ToDoPages pages = new ToDoPages(driver);
    	 Assert.assertTrue("ToDo count not updated",pages.confirmToDOCount());
        
     }
     @When("^I click on Active filter$")
     public void i_click_on_Active_filter(){
    	 ToDoPages pages = new ToDoPages(driver);
    	 pages.clickActiveFilter();
     }
     @Then("^I should see only not completed items$")
     public void i_should_see_only_not_completed_items() throws InterruptedException {
    	 ToDoPages pages = new ToDoPages(driver);
    	 Assert.assertTrue("Active filter not working",pages.displayActiveItems()); 
    	 Thread.sleep(3000);
     }
     @When("^I click on Completed filter$")
     public void i_click_on_Completed_filter() throws InterruptedException {
    	 ToDoPages pages = new ToDoPages(driver);
    	 pages.clickCompletedFilter();
    	 Thread.sleep(3000);
     }
     @Then("^I should see only completed items$")
     public void i_should_see_only_completed_items() throws InterruptedException{
    	 ToDoPages pages = new ToDoPages(driver);
    	 Assert.assertTrue("Completed filter not working properly", pages.displayCompleted());
    	 Thread.sleep(3000);
     }
     @When("^I click on All filter$")
     public void i_click_on_All_filter() throws InterruptedException {
     	 ToDoPages pages = new ToDoPages(driver);
     	 pages.clickAllFilter();
     	Thread.sleep(3000);
       
     }
     @Then("^I should see all items in toDo list$")
     public void i_should_see_all_items_in_toDo_list() throws InterruptedException {
    	 ToDoPages pages = new ToDoPages(driver);
    	 Assert.assertTrue("All filter not working properly", pages.displayAll());
    	 Thread.sleep(3000);
         
     }
    
     @When("^I click on Mark all as Complete$")
     public void i_click_on_Mark_all_as_Complete() throws InterruptedException {
    	 ToDoPages pages = new ToDoPages(driver);
    	 pages.clickMarkAllAsCompleted();
    	 Thread.sleep(3000);
     }
     @Then("^I should not see any active items$")
     public void i_should_not_see_any_active_items() {
    	 ToDoPages pages = new ToDoPages(driver);
    	 Assert.assertTrue("Mark all as completed not working properly, displaying active items",pages.confirmAllCompleted());
     }
     @And("^I should see all items completed$")
     public void i_should_see_all_items_completed() {
    	 ToDoPages pages = new ToDoPages(driver);
    	 Assert.assertTrue("Mark all as completed not working properly",pages.displayCompleted());
    	 
     }
     @When("^I click on Clear Completed$")
     public void i_click_on_Clear_Completed() throws InterruptedException {
    	 ToDoPages pages = new ToDoPages(driver);
     	 pages.clickClearCompleted();
     	 Thread.sleep(3000);
     }
     @Then("^I should not see completed items$")
     public void i_should_not_see_completed_items() {
    	 ToDoPages pages = new ToDoPages(driver);
    	 Assert.assertTrue("Clear Completed is not working properly", pages.confirmClearCompleted());
     }
     
}
