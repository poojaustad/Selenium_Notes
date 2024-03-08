package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScenario_011 {

	public static void main(String[] args) throws InterruptedException {
	

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/buttons");
		
		WebElement dobleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		
		Actions action = new Actions(driver);
		
		action.doubleClick(dobleClickBtn).perform();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
