package com.PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPO extends BasePO {

	public RegisterPO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public RegisterPO setEmail(String emailid)  {
		
		driver.findElement(By.id("email")).sendKeys(emailid);
		return new RegisterPO(driver);
	}
	
	public RegisterPO setRegister() {
		List<WebElement> list=driver.findElements(By.name("userExists"));
		System.out.println(list.size());
	list.get(1).click();
		return new RegisterPO(driver);
	}
	public RegisterPO setConfirmEmail(String confirmemailid) {
		driver.findElement(By.id("email-confirm")).sendKeys(confirmemailid);
		return new RegisterPO(driver);
	}
	public RegisterPO setPassword(String password) {
		driver.findElement(By.id("register-password")).sendKeys(password);
		return new RegisterPO(driver);
	}
	public RegisterPO setConfirmPassword(String cfrmpasswd) {
		driver.findElement(By.id("register-password-confirm")).sendKeys(cfrmpasswd);
		return new RegisterPO(driver);
	}
	public RegisterPO setMarketingOption() {
		driver.findElement(By.xpath("//input[@t-id='auth-form-marketing']")).click();
		return new RegisterPO(driver);
	}
	public AccountPO submitForm() {
		driver.findElement(By.xpath("//button[@t-id='auth-form-button-register']")).click();
		return new AccountPO(driver);
	}
	
	public AccountPO fillFormAndSubmit() {
		setEmail("kunal1@kunal1.com");
		setRegister();
		setConfirmEmail("kunal1@kunal1.com");
		setPassword("kunal1");
		setConfirmPassword("kunal1");
		setMarketingOption();
		submitForm();
		return new AccountPO(driver);
	}
	
	
	public boolean checkRegisterTitle() {
	
		
		boolean bo= driver.getPageSource().contains("Login or Register");
		System.out.println("value is :"+bo);
		return bo;
	}
	
	

}
