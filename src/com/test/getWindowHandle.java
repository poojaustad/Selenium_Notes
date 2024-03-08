package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","location of cherom.exe");
		WebDriver driver = new ChromeDriver();
		
		
		String parentid = driver.getWindowHandle();
		
		Set<String> childhandles = driver.getWindowHandles();
		Iterator<String> itr = childhandles.iterator();
		
		while(itr.hasNext()) {
			
			String childid = itr.next();
			
			if(!childid.equalsIgnoreCase(parentid)) {
				driver.switchTo().window(childid);
			}
		}

	}

}
