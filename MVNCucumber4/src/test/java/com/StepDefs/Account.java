package com.StepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PageObjects.AccountPO;
import com.PageObjects.RegisterPO;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class Account extends AbstractPageStepDef {
	WebDriver wd = getDriver();
AccountPO apo; 
	@Then("^an user account is created$")
	public void an_user_account_is_created() {
	    // Write code here that turns the phrase above into concrete actions
		apo=new AccountPO(wd);
		
		Assert.assertTrue(apo.checkAccount());
	   System.out.println("Account Page is displayed");
	   //apo.closeDriver();
	}
}
