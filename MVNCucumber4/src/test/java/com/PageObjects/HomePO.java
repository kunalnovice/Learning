package com.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePO extends BasePO{
	protected final String loginRegister = "Login / Register";
public HomePO(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
public RegisterPO navigatetoRegisterPage() {
	driver.findElement(By.linkText(loginRegister)).click();
	return new RegisterPO(driver);
}

}
