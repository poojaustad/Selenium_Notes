package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TestScenario_018 {

	public static void main(String[] args) {
		
		HtmlUnitDriver driver = new HtmlUnitDriver();

//		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
//		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("headless");
//		WebDriver driver = new ChromeDriver(options);
		
		
	
		
		driver.get("https://www.facebook.com/");
	
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
