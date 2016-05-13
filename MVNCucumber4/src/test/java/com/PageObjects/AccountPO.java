package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPO extends BasePO {

	public AccountPO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean checkAccount() {
	
		
		boolean bo= driver.findElement(By.xpath("//span[@class='user-name ng-binding']")).getText().contains(RegisterPO.emailId);
		System.out.println("value is :"+bo);
		return bo;
	}

}
