package com.orangehrm.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleSearchSteps {
	public  String item="iphone";
	WebDriver driver;
	@Given("I navigated to the Google")
	public void i_navigated_to_the_Google() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zhenis\\eclipse-workspace\\SeleniumBasics\\src\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().fullscreen();
		driver.get("https://www.google.com/");
		
	  System.out.println("I am on Google page");
	}

	@When("I type search item")
	public void i_type_search_item() {
		driver.findElement(By.cssSelector("input.gLFyf ")).sendKeys(item);
		
		
	    System.out.println("I search for item");
	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	    System.out.println("Click search button");
	    
	    driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/div[2]/center/input[1]")).sendKeys(Keys.ENTER);
	}

	@Then("I see search results are displayed")
	public void i_see_search_results_are_displayed() throws InterruptedException {
		WebElement exp=driver.findElement(By.cssSelector("div#appbar"));
		if(exp.isDisplayed()) {
			System.out.println("Results are dispayed");
		}else {
			System.out.println("Cannot display results");
		}
	 System.out.println("Results are displayed");
	 Thread.sleep(4000);
	 driver.close();
	 
	 
	}



}
