package com.orangehrm.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public static WebDriver driver;
	

	

   
	public static void setUp() {
		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		 String browser =ConfigsReader.getProperty("browser");
		 String url=ConfigsReader.getProperty("url");
		 
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.IEDriverServer.driver", "src/test/resources/drivers/geckodriver.exe");

		
	        }else  {
			System.out.println("browser given is wrong");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		driver.get(url);
		driver.manage().window().maximize();

	}

	
	public static  void tearDown() {
		driver.quit();
	}
   
 

}
