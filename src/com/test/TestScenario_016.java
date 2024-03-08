package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class TestScenario_016 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "C:\\Selenium_Rogersoft\\drivers\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		
		//Headless browser execution run by firefox browser
		FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(true);
		WebDriver driver = new FirefoxDriver(options);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
