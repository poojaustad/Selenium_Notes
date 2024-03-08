package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScenario_005 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/register.php");

		// SINGLE DROPDOWN
Select oselect = new Select(driver.findElement(By.name("country")));
oselect.selectByIndex(1);
Thread.sleep(3000);

oselect.selectByValue("BANGLADESH");
Thread.sleep(3000);

oselect.selectByVisibleText("CANADA");
Thread.sleep(3000);

driver.quit();
		

	}

}
