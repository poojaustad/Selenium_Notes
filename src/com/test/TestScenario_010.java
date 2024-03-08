package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario_010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		/*
		 * WebElement framePath =
		 * driver.findElement(By.xpath("//iframe[@src='/sample' and @id='frame1']"));
		 * driver.switchTo().frame(framePath);
		 */
		String txt = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(txt);
		
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
