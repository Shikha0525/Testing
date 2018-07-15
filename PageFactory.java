package com.qait.automation.Selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory {

	@FindBy(id="users") WebElement listusers;
	@FindBy(id="users-single") WebElement singleusers;
	@FindBy(id="users-single-not-found") WebElement userssinglenotfound;
	@FindBy(id="unknown") WebElement unknown;
	@FindBy(id="unknown-single") WebElement unknownsingle;
	@FindBy(id="unknown-single-not-found") WebElement unknownsinglenotfound;
	@FindBy(id="post") WebElement post;
	@FindBy(id="put") WebElement put;
	@FindBy(id="patch") WebElement patch;
	@FindBy(id="delete") WebElement delete;
	@FindBy(id="register-successful") WebElement registersuccessful;
	@FindBy(id="register-unsuccessful") WebElement registerunsuccessful;
	@FindBy(id="login-successful") WebElement loginsuccessful;
	@FindBy(id="login-unsuccessful") WebElement loginunsuccessful;
	@FindBy(id="delay") WebElement delay;
	
	public void listusers(){
		
		listusers.click();
	}
	
	public void singleusers(){
		
		singleusers.click();
	}
	
	public void userssinglenotfound(){
		
		userssinglenotfound.click();
	}
	
	public void unknown(){
		
		unknown.click();
	}
	
	public void unknownsingle(){
		
		unknownsingle.click();
	}
	
	public void unknownsinglenotfound(){
		
		unknownsinglenotfound.click();
	}
	
	public void post(){
		
		post.click();
	}
	
	public void put(){
		
		put.click();
	}
	
	public void patch(){
		
		patch.click();
	}
	
	public void delete(){
		
		delete.click();
	}
	
	public void registersuccessful(){
		
		registersuccessful.click();
	}
	
	public void registerunsuccessful(){
		
		registerunsuccessful.click();
	}
	
	public void loginsuccessful(){
		
		loginsuccessful.click();
	}
	
	public void loginunsuccessful(){
		
		loginunsuccessful.click();
	}
	
	public void delay(){
		
		delay.click();
	}
	
}
