package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TestScenario_004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();

		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");

		Boolean status = driver.findElement(By.name("submit")).isEnabled();
		System.out.println(status);

		driver.findElement(By.name("firstName")).sendKeys("Pooja");
		
		System.out.println(driver.findElement(By.name("firstName")).getTagName());
		System.out.println(driver.findElement(By.name("firstName")).getAttribute("Pooja"));
		
		driver.findElement(By.name("lastName")).sendKeys("Lakshmi");
		driver.findElement(By.name("phone")).sendKeys("9884576325");
		driver.findElement(By.id("userName")).sendKeys("pooja@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("kuryakottu");
				driver.findElement(By.name("city")).sendKeys("puranattukara");
		driver.findElement(By.name("state")).sendKeys("Kerala");
		driver.findElement(By.name("postalCode")).sendKeys("680551");
		driver.findElement(By.id("email")).sendKeys("pooj14");
		driver.findElement(By.name("password")).sendKeys("Pooja");
		driver.findElement(By.name("confirmPassword")).sendKeys("Pooja");
		driver.findElement(By.name("submit")).click();
		String text = driver.findElement(By.cssSelector(
				"body > div:nth-child(5) > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p:nth-child(3) > font > b"))
				.getText();
		System.out.println(text);
		driver.quit();

	}

}
