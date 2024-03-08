package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScenario_006 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		//WebDriver driver = new ChromeDriver();

		driver.get("https://output.jsbin.com/osebed/2");
		Select sc = new Select(driver.findElement(By.id("fruits")));

		sc.selectByValue("banana");

		Thread.sleep(3000);
		sc.selectByVisibleText("Grape");
		Thread.sleep(3000);
		sc.selectByIndex(1);
		Thread.sleep(3000);

		boolean value = sc.isMultiple();
		System.out.println("Multiple dropdown or not? "+value);
		
		System.out.println("Options in the dropdown");
		List<WebElement> options = sc.getOptions();
		for(int i=0; i< options.size();i++)
		{
			//System.out.println(options.get(i).getText());
			System.out.println(options.get(i).getAttribute("value"));
		}
		
		System.out.println("Selected options");
		List<WebElement> opti = sc.getAllSelectedOptions();
		for(int i=0; i< opti.size();i++)
		{
			System.out.println(options.get(i).getText());
			//System.out.println(opti.get(i).getAttribute("value"));
		}
		
		System.out.println("First selected option");
		String element = sc.getFirstSelectedOption().getText();
		
				
				System.out.println(element);
		//sc.deselectAll();
		
		driver.quit();

	}

}
