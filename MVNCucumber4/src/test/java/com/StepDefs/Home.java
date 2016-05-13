package com.StepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PageObjects.HomePO;
import com.PageObjects.RegisterPO;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Home extends AbstractPageStepDef  {
	
	WebDriver wd = getDriver();
	HomePO homepo;
	RegisterPO  registerpo;
	
	@Given("^User is on Home page$")
	public void user_is_on_Home_page() {
		
		homepo = new HomePO(wd);
		homepo.navigateToHomePage();
	  System.out.println("User is on Home page");
	
	  
	   
	}
	
	@When("^User Request to Register$")
	public void user_Request_to_Register()  {
		  System.out.println("User Request to Register");
		//  driver.findElement(By.linkText("Login / Register")).click();
		  homepo.navigatetoRegisterPage("Login / Register");
		  System.out.println("User is on Register page");
	   
	}
}
