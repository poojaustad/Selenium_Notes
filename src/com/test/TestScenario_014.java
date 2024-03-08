package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestScenario_014 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		Actions action = new Actions(driver);

		WebElement accountListBtn = driver.findElement(By.xpath("//span[text() ='Account & Lists']"));
		WebElement yourAccBtn = driver.findElement(By.xpath("//span[text()='Your Account']"));
		action.moveToElement(accountListBtn).perform();
		yourAccBtn.click();
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
