package com.orangehrm.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;

public class AddEmployee extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	public WebElement PIM;

	@FindBy(id = "middleName")
	public WebElement middleName;

	@FindBy(xpath = "//span[text()='Add Employee']")
	public WebElement addEmp;

	@FindBy(xpath = "//div[@id='location_inputfileddiv']//ul")
	public WebElement locationList;

	@FindBy(xpath = "//span[@id='pim.navbar.employeeName']")
	public WebElement empCheck;

	@FindBy(id = "systemUserSaveBtn")
	public WebElement saveBtn;

	@FindBy(css = "input#firstName")
	public WebElement firstName;

	@FindBy(css = "input#lastName")
	public WebElement lastName;

	@FindBy(id = "employeeId")
	public WebElement idEmp;

	@FindBy(xpath = "//div[@id='location_inputfileddiv']//input")
	public WebElement location;
	
	@FindBy(xpath = "//div[@id='location_inputfileddiv']//ul")
	public WebElement select;
	@FindBy(id = "systemUserSaveBtn")
	public WebElement save;
	@FindBy(xpath = "//*[@id='pim.navbar.employeeName']")
	public WebElement verifyTxt;
	@FindBy(xpath = "//form[@id='pimAddEmployeeForm']//label")
	public List<WebElement> dataTable;
	@FindBy(xpath = "//label[text()='Create Login Details']")
	public WebElement loginDetails;
	@FindBy(id = "username")
	public WebElement userName;
	@FindBy(id = "password")
	public WebElement password;
	@FindBy(id = "confirmPassword")
	public WebElement confirmPassword;
	@FindBy(xpath = "//div[@id='essRoleId_inputfileddiv']//input")
	public WebElement clickEss;
	@FindBy(xpath = "//div[@id='essRoleId_inputfileddiv']//ul")
	public WebElement selectEss;
	@FindBy(xpath = "//div[@id='supervisorRoleId_inputfileddiv']//input")
	public WebElement clickSupervisor;
	@FindBy(xpath = "//div[@id='supervisorRoleId_inputfileddiv']//ul")
	public WebElement selectSupervisor;

	public AddEmployee() {
		PageFactory.initElements(driver, this);

	}
}
