package com.StepDefs;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.PageObjects.HomePO;
import com.PageObjects.RegisterPO;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register extends AbstractPageStepDef {
	WebDriver wd = getDriver();
	HomePO hp;
	RegisterPO rp;

	@Then("^Register Page is displayed$")
	public void register_Page_is_displayed()  {
		rp=new RegisterPO(wd);
		Assert.assertTrue(rp.checkRegisterTitle());
	   System.out.println("Register Page is displayed");
	   //rp.closeDriver();
	}

	@Given("^User is on Register page$")
	public void user_is_on_Register_page()  {
	    hp= new HomePO(driver);
	    hp.navigateToHomePage();
	    hp.navigatetoRegisterPage("Login / Register");
	}

	@When("^User submit RP form as unregistered user$")
	public void user_submit_RP_form_as_unregistered_user()  {
	  rp= new RegisterPO(driver);
	  rp.fillFormAndSubmit();
	}

	

	@When("^User submit RP form as FaceBook user$")
	public void user_submit_RP_form_as_FaceBook_user() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
