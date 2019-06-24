package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;
import com.orangehrm.utils.CommonMethods;

public class LoginPage2 extends BaseClass {
	
@FindBy(id="txtUsername")
public WebElement userName;

@FindBy(name="txtPassword")
public WebElement password;


@FindBy(css="div.toast-message")
public WebElement error;



@FindBy(xpath="//*[@id='divLogo']/img")
public WebElement Logo;


@FindBy(id="btnLogin")
public WebElement loginBtn;

public LoginPage2() {
	PageFactory.initElements(driver, this);
}

public void login(String uname,String pwd) {
	CommonMethods.sendText(userName, uname);
	CommonMethods.sendText(password, pwd);
	CommonMethods.click(loginBtn);
}

}
