package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario_002 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//get - get url
		driver.get("https://www.amazon.in/");
		
		//get title - get the title of the page
		String title= driver.getTitle();
		
		//get page source - get the page source of the website
		String pagesrc = driver.getPageSource();
		
		System.out.println("Title of page -  "+title);
		//System.out.println("Page source code - \n"+pagesrc);
		driver.navigate().refresh();
		//quit all the windows opened by webdriver
		driver.quit();
		
	}
	
}
