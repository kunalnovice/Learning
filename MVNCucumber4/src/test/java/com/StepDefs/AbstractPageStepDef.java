package com.StepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbstractPageStepDef {
protected static WebDriver driver ;

protected  WebDriver getDriver() {
	if (driver == null) {
		driver = new FirefoxDriver();
		 driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		
	}
	return driver;
}
}
