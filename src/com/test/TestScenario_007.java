package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScenario_007 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@data-toggle='tab'and @href='#OKTab']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert simplealert = driver.switchTo().alert();
		Thread.sleep(3000);
		simplealert.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert confirmalert = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmalert.dismiss();
		Thread.sleep(3000);
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		if(text.equals("You Pressed Cancel")) {
		driver.findElement(By.xpath("//a[@href='#Textbox']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert prompt = driver.switchTo().alert();
		Thread.sleep(3000);
		prompt.sendKeys("POOJA");
		Thread.sleep(3000);
		prompt.accept();
		text =driver.findElement(By.id("demo1")).getText();
		System.out.println(text);
		}
		driver.quit();
	}

}
