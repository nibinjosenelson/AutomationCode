package com.toDo.pages;

import java.util.Iterator;
import java.util.List;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToDoPages {
	public WebDriver driver;
	public ToDoPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath = "//h1[contains(text(),'todos')]")
	public WebElement header;

	@FindBy(xpath = "//input[contains(@placeholder,'What needs to be done?')]")
	public WebElement inputField;

	@FindBy(xpath = "//li[@class='todo']//label")
	public List<WebElement> toDoList;

	@FindBy(xpath = "//li[contains(@class,'todo')]//button")
	public WebElement deleteButton;

	@FindBy(xpath = "//li//input[contains(@type,'checkbox')]")
	public List<WebElement> checkbox;

	@FindBy(xpath = "//span[contains(@class,'todo-count')]/strong")
	public WebElement countValue;

	@FindBy(xpath = "//button[contains(@class,'clear-completed')]")
	public WebElement clearCompleted;

	@FindBy(xpath = "//a[contains(text(),'All')]")
	public WebElement allFilter;

	@FindBy(xpath = "//a[contains(text(),'Active')]")
	public WebElement activeFilter;

	@FindBy(xpath = "//a[contains(text(),'Completed')]")
	public WebElement completedFilter;

	@FindBy(xpath = "//li[contains(@class,'todo completed')]")
	public List<WebElement> toDoCompleted;

	@FindBy(xpath = "//li[@class='todo']")
	public List<WebElement> toDoNotCompleted;
	
	@FindBy(xpath = "//input[@id='toggle-all']")
	public WebElement markAllAsCompleted;
	
	public int toDOCount() {
		String toDOCountValue = countValue.getText().toString();
		int toDoCount =  Integer.parseInt(toDOCountValue);
		return toDoCount;
	}
	
	public boolean confirmPageUrl() {
		String toDoUrl = "https://todomvc.com/examples/vue/";
		String pageUrl = driver.getCurrentUrl();
		boolean confirmUrl = pageUrl.equalsIgnoreCase(toDoUrl);
		return confirmUrl;
	}

	public void enterToDOItems(String toDoItems) {
		inputField.sendKeys(toDoItems);
		inputField.sendKeys(Keys.RETURN);
	}
	public boolean confirmToDOItemsAdded (String toDOItems) {
		String dynamicXpathToDoItems = "//li[contains(@class,'todo')]//label[contains(text(),'"+toDOItems+"')]";
		boolean confirmtoDOItemsAdded = driver.findElement(By.xpath(dynamicXpathToDoItems)).isDisplayed();
		return confirmtoDOItemsAdded;
	}
	public boolean confirmToDOCount() {
		boolean retValue = false;
		int noOfToDoList = toDoList.size();
		int currentToDOCount = toDOCount();
		if (noOfToDoList==currentToDOCount) {
			retValue =  true;
		}
		return retValue;
		}
	public void clickCheckBox() {
		checkbox.get(0).click();
		}
	public boolean displayCompleted() {
		boolean retValue = false;
		Iterator<WebElement> itr = toDoCompleted.iterator();
		while (itr.hasNext()) {
			itr.next().isDisplayed();
			retValue = true;
		}
		return retValue;
		
	}
	public void clickActiveFilter() {
		Assert.assertTrue("Active filter is not displayed",activeFilter.isDisplayed());
		activeFilter.click();
	}
	public boolean displayActiveItems() {
		boolean retValue = false;
		Iterator<WebElement> itr = toDoNotCompleted.iterator();
		while(itr.hasNext()) {
			itr.next().isDisplayed();
			retValue = true;
		}
		return retValue;
	}	
	public void clickCompletedFilter() {
		Assert.assertTrue("Completed filter is not displayed",completedFilter.isDisplayed());
		completedFilter.click();
	}
	public void clickAllFilter() {
		Assert.assertTrue("All filter is not displayed",allFilter.isDisplayed());
		allFilter.click();
	}
	public boolean displayAll() {
		boolean retValue = false;
		boolean active = displayActiveItems();
		boolean completed = displayCompleted();
		if(active&&completed) {
			retValue = true;
		}
		return retValue;
	}
	public void clickClearCompleted() {
		Assert.assertTrue("Clear Completed is not displayed",clearCompleted.isDisplayed());
		clearCompleted.click();
	
	}
	public boolean confirmClearCompleted() {
		boolean retValue= false;
		int completedCount = toDoCompleted.size();
		if(completedCount==0) {
			retValue = true;
		}
		return retValue;
	}
	public void clickMarkAllAsCompleted() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", markAllAsCompleted);
	}
	public boolean confirmAllCompleted() {
		boolean retValue= false;
		int notcompletedCount = toDoNotCompleted.size();
		if(notcompletedCount==0) {
			retValue = true;
		}
		return retValue;
	}
	}
