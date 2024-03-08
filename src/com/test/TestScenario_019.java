package com.test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScenario_019 {

	public static void main(String[] args) throws InterruptedException {
		
		
		//HAndle SSL certification error - chrome
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Rogersoft\\chrome\\chromedriver.exe");
	
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
    WebDriver driver = new ChromeDriver(options);
    
  //HAndle SSL certification error - Firefox
	/*
	 * FirefoxOptions options = new FirefoxOptions();
	 * options.setAcceptInsecureCerts(false); 
	 *  WebDriver driver = new FirefoxDriver(options);
	 */
    
    
  //HAndle SSL certification error - Edge
	/*
	 * EdgeOptions options = new EdgeOptions();
	 * options.setAcceptInsecureCerts(true); WebDriver driver = new
	 * EdgeDriver(options);
	 */
	
    //IMPLICIT WAIT or Non-Conditional Wait
    
   // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
    driver.get("https://expired.badssl.com/");
    
    //Explicit Wait
    
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    
    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#content > h1")));
    
    String h1=driver.findElement(By.cssSelector("#content > h1")).getText();
	System.out.println(h1);
    
    driver.quit();
		
	}

}
