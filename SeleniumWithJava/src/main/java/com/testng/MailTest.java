package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MailTest {
	
		
		WebDriver driver;
		WebDriverWait wait;

		@BeforeMethod
		public void setUp() {
		//System.setProperty("webdriver.gecko.driver", "/home/omni/.local/share/gecko_driver/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/home/omni/.local/share/crome_driver/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		 wait = new WebDriverWait(driver,50);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@Test(priority=2,groups="maling")
		public void loginGmail() {
			driver.get("https://accounts.google.com/");
			 driver.findElement(By.id("identifierId")).sendKeys("madhavi.cse34@gmail.com");
			driver.findElement(By.id("identifierNext")).click();
			driver.findElement(By.name("password")).sendKeys("madhucse34");
			//driver.findElement(By.id("passwordNext")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Next']")));
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
	        driver.findElement(By.xpath("//span[text()='Next']")).click();
	        System.out.println("Successfully Login");
			
		}
		
		@Test(priority=1,groups="google")
		public void googleSearch() {
			driver.manage().window().maximize();
	        driver.get("http://www.google.com");
	
	        System.out.println("The webpage name is :"+ driver.getTitle());
	        WebElement text =driver.findElement(By.name("q"));
	        text.sendKeys("Big Basket");
	        text.submit();
		}
		
		@Test(priority=3,groups="google")
		public void getTitle() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		@AfterMethod
		public void tearDown() {
			System.out.println("after method");
		}
		
		
	
}
