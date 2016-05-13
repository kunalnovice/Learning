package com.PageObjects;

import org.openqa.selenium.WebDriver;

public class BasePO {
	protected WebDriver driver;

	public BasePO(WebDriver driver) {
		this.driver = driver;
	}

	public HomePO navigateToHomePage() {
		driver.get("https://www.picsolve.com/");
		return new HomePO(driver);
		
	}
	 
	public void closeDriver() {
		driver.quit();
	}
}
