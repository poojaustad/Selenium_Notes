package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario_009 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement radio1 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		radio1.click();
		boolean radiocheck = radio1.isSelected();
		System.out.println(radiocheck);
		
		WebElement check1 = driver.findElement(By.id("vfb-6-0"));
		check1.click();
		
		boolean checkbox = check1.isSelected();
		System.out.println(checkbox);
		
		Thread.sleep(3000);
		
		check1.click();
		System.out.println(checkbox);
		driver.quit();

	}

}
