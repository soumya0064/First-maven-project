package com.test.jenkins.JenkinsTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class App 
{
	
	WebDriver driver; 	
	
	
	
	@Test
	
	public void test()
	{
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\soumyas\\workspace\\JenkinsTest\\Drivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		
	}
}
