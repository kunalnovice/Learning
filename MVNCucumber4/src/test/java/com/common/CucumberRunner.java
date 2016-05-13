package com.common;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/com/Features",glue = {"com/StepDefs/"},tags = {"@tagged"},plugin = {"pretty" , "html:target/cukes/mehta"})
public class CucumberRunner {

}
