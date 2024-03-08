package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class TestScenario_008 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/browser-windows");

		driver.findElement(By.id("windowButton")).click();

		String parentwindowhandle = driver.getWindowHandle();
		System.out.println(parentwindowhandle);

		Set<String> childwindowhaldles = driver.getWindowHandles();

		Iterator<String> itr = childwindowhaldles.iterator();

		while (itr.hasNext()) {
			String child = itr.next();
			System.out.println(child);

			if (!child.equalsIgnoreCase(parentwindowhandle)) {

			driver.switchTo().window(child);
				System.out.println(driver.findElement(By.id("sampleHeading")).getText());

			}

		}

		driver.switchTo().window(parentwindowhandle);
		//driver.switchTo().defaultContent();
		driver.quit();
	}

}
