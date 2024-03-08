package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario_015 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
	}

}
