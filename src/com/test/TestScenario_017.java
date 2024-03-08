package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScenario_017 {

	public static void main(String[] args) throws InterruptedException {



		System.setProperty("webdriver.edge.driver", "C:\\Selenium_Rogersoft\\drivers\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		
		//Headless execution by edge browser
		
		EdgeOptions options = new EdgeOptions();
        options.addArguments("headless");
		WebDriver driver = new EdgeDriver(options);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
