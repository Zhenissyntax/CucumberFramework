package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.orangehrm.utils.BaseClass;
import com.orangehrm.utils.CommonMethods;

public class NegativeTest extends BaseClass {
	
	public void NegativeLogin()  {
		
		LoginPage login=new LoginPage();
		
		CommonMethods.sendText(login.username, "Admin123");
		CommonMethods.sendText(login.password, "@JoaQsV8E1123");
		CommonMethods.click(login.btnLogin);
	
		WebElement error=driver.findElement(By.cssSelector("div.toast-message"));
		if(error.isDisplayed()) {
			System.out.println("Unable to LOG IN");
		} else {
			System.out.println("Logged in");
		}
	
}
	
}

