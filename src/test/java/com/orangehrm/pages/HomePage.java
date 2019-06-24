package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;

public class HomePage extends BaseClass {
  @FindBy (xpath="//li[text()='Dashboard']")
  public WebElement dashboardText;
  
  @FindBy (xpath="//span[text()='PIM']")
  public WebElement PIM;
  
  @FindBy(xpath = "//span[text()='Add Employee']")
	public WebElement addEmp;
  
  
  @FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/a/span[2]")
  public  WebElement admin;
  
  @FindBy(xpath="//span[text()='Organization']")
  public  WebElement organization;
  
  @FindBy(xpath="//span[text()='Locations']")
  public  WebElement location ;
  
  @FindBy(xpath="//i[text()='add']")
  public  WebElement addLocation;
  
  public HomePage() {
	  PageFactory.initElements(driver, this);
  }
}
