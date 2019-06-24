package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;

public class AddLocation extends BaseClass {
	/*Test Case: Add Location
	1. Login to OrangeHRM
	2. From Admin --> Organization select Locations
	3. Add 5 different locations by providing complete required details (Use data provider)
	4. Save location and verify it has been successfully saved.
	 */
 @FindBy(xpath="//*[@id='menu_admin_viewAdminModule']/a/span[2]")
 public  WebElement admin;
 
 @FindBy(xpath="//span[text()='Organization']")
 public  WebElement organization;
 
 @FindBy(xpath="//span[text()='Locations']")
 public  WebElement location ;
 
 @FindBy(xpath="//i[text()='add']")
 public  WebElement addLocation;
 
 @FindBy(id="name")
 public  WebElement Name;
 

 
 @FindBy(id="city")
 public  WebElement city;
 
 
 @FindBy(xpath="//div[@id='countryCode_inputfileddiv']/div/input")
 public WebElement country;
 
 @FindBy(xpath="//div[@id='countryCode_inputfileddiv']//ul")
public  WebElement countryList;
 
 @FindBy(xpath="//div[@id='time_zone_inputfileddiv']/div/input")
 public WebElement timeZone;
 
 @FindBy(xpath="//*[@id='select-options-232a5705-102b-8880-04ee-3256d7dc076a']")
 public WebElement timezoneList;
 
 
 
 
 @FindBy(id="zipCode")
 public  WebElement zipCode;
 
 @FindBy(id="phone")
 public  WebElement phone;
 
 @FindBy(id="fax")
 public  WebElement fax;
 
 @FindBy(id="address")
 public  WebElement address;
 
 
 @FindBy(xpath="//*[@id='state_inputfileddiv']/div/input")
  public WebElement province;
 
 @FindBy(xpath="//*[@id='state']/option[2]")
 public  WebElement provinceList;
 
 @FindBy(xpath="//*[@id='locationAddModal']/form/div[2]/a[1]")
 public  WebElement Save;
 
	public AddLocation() {
		PageFactory.initElements(driver, this);

	}
}

 
 
 
 
 




	