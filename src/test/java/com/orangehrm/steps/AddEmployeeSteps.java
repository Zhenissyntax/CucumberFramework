package com.orangehrm.steps;

import org.junit.Assert;

import com.orangehrm.pages.AddEmployee;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage2;
import com.orangehrm.utils.CommonMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeSteps extends CommonMethods {
	public static HomePage home;
	public static LoginPage2 login;
	public static AddEmployee emp;

	@When("I logged in")
	public void i_logged_in() {
		login=new LoginPage2();
		login.login("Admin", "@JoaQsV8E1");
		
	}

	@And("I click on PIM")
	public void i_click_on_PIM() {
		home=new HomePage();
		click(home.PIM);
	}

	@And("I add employee details")
	public void i_add_employee_details() {
		emp=new AddEmployee();
		click(emp.addEmp);
	}

	@And("I provide employee details")
	public void i_provide_employee_details() {
		emp=new AddEmployee();
		emp.firstName.sendKeys("Elon");
		emp.lastName.sendKeys("Mask");
		emp.location.click();
		CommonMethods.selectList(emp.locationList, "Tesla");
	}

	@And("I click on save button")
	public void i_click_on_save_button() {
		emp=new AddEmployee();
		emp.saveBtn.click();
	}

	@Then("I see employee is added successfully")
	public void i_see_employee_is_added_successfully() {
		waitForElementBeClickable(emp.empCheck,20);
		String text=emp.empCheck.getText();
		System.out.println(text);
		Assert.assertEquals(text,"Elon Mask");
	}

}
