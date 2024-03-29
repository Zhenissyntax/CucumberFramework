package com.orangehrm.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\resources\\features\\Login.feature"
		,glue="com\\orangehrm\\steps"
		,dryRun=false
		,monochrome=true
		,tags= {"@smoke"} //~  =excluding
		,plugin = {"pretty", "html:target/cucumber-default-reports","json:target/cucumber.json"}
		)








public class TestRunner {

}
