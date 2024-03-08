package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario_001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Define chrome driver properties for java program
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
		
		// Create object for webdriver
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testing.ustadmobile.com:8085/umapp/#/LoginView");

	}

}
