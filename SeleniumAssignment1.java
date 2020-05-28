package com.seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumAssignment1 {

	public static void main(String[] args) {
		
		// Chrome Driver Definition
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishwanath\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// FireFox Driver Definition
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vishwanath\\Web Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/  
		
		// Internet Explorer Driver Definition
	    /*System.setProperty("webdriver.ie.driver", "C:\\Users\\Vishwanath\\Web Drivers\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();*/ 
		
		System.out.println("Welcome to Amazon");
		driver.get("https://amazon.in");
		System.out.println("Landing on Home");
		System.out.println(driver.getTitle());
		//driver.findElement(By.linkText("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&")).click();
	
		driver.findElement(By.id("nav-link-accountList")).click();
		//driver.findElement(By.linkText("https://www.amazon.in/ap/register?")).click();
		driver.findElement(By.xpath("//*[@id='createAccountSubmit']")).click();
		driver.findElement(By.name("customerName")).sendKeys("Vishwanath");
		//driver.findElement(By.className("a-input-text a-span12 a-spacing-micro auth-required-field auth-require-phone-validation")).sendKeys("1234567890");
		driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("1234567890");
		driver.findElement(By.cssSelector("#ap_email")).sendKeys("vishu.test@gmail.com");
		driver.findElement(By.name("password")).sendKeys("vishtest123");
		driver.findElement(By.className("a-button-input")).click();
	
		driver.quit();
	}
	

}
