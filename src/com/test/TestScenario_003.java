package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario_003 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		// If url is already open then use navigate() to open another url
		driver.navigate().to("https://www.facebook.com/");
		
		//navigate().back - to navigate back 
		driver.navigate().back();
		
		//navigate().forward - to navigate forward
		driver.navigate().forward();
		
		//navigate().refresh - to refresh the page
		driver.navigate().refresh();
		
		driver.quit();
	}

}
