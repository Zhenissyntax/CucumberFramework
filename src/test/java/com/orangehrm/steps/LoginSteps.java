package com.orangehrm.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage2;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginSteps extends CommonMethods{

	LoginPage2 login;
//	@Given("I navigated to OrangeHRM")
//	public void i_navigated_to_OrangeHRM() {
//		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://ismagambetov-trials65.orangehrmlive.com");
//	}
	@Given("I see OrangeHRM logo")
	public void i_see_OrangeHRM_logo() {
	 login=new LoginPage2();
	  boolean isDisplayed=login.Logo.isDisplayed();
	  Assert.assertTrue(isDisplayed);
	}

	@When("I entered valid username and password")
	public void i_entered_valid_username_and_password() {
	    sendText(login.userName, ConfigsReader.getProperty("username"));
	    sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@When("I click login button")
	public void i_click_login_button() {
	    click(login.loginBtn);
	}

	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
		HomePage home=new HomePage();
		Assert.assertTrue(home.dashboardText.isDisplayed());
	}
	
	@Then("I close browser")
	public void i_close_browser() {
	    tearDown();
	}
	
	@When("I enter invalid username and password")
	public void i_enter_invalid_username_and_password() {
	    sendText(login.userName, "Test");
	    sendText(login.password, "Test123");
	}

	@Then("I see error message")
	public void i_see_error_message() {
	    Assert.assertTrue(login.error.isDisplayed());
	    String errorText=login.error.getText().trim();
	    Assert.assertEquals("Invalid Credentials", errorText);
	}
	
	
	@When("I enter invalid username and password I see errorMessage")
	public void i_enter_invalid_username_and_password_I_see_errorMessage(DataTable dataTable) {
		List<Map<String, String>> map = dataTable.asMaps(String.class, String.class);
		for (int i = 0; i < map.size(); i++) {
			sendText(login.userName, map.get(i).get("userName"));
			sendText(login.password, map.get(i).get("Password"));
			login.loginBtn.click();
			String text = login.error.getText().trim();
			Assert.assertEquals(text, map.get(i).get("errorMessage"));
			System.out.println(map.get(i).get("userName"));
			System.out.println(map.get(i).get("Password"));
			System.out.println(map.get(i).get("errorMessage"));
			System.out.println("----------------------------");
		}
	}
}
