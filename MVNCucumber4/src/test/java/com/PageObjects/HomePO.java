package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePO extends BasePO{
	
public HomePO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public RegisterPO navigatetoRegisterPage(String linktext) {
	driver.findElement(By.linkText("Login / Register")).click();
	return new RegisterPO(driver);
}

}
