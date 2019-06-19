package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("Set up system properties for crome ");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("login");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("launch crome browser");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	}
	
	@Test
	public void googleTitle() {
		System.out.println("Google Title Test");
	}
	
	@AfterMethod
	public void logOut() {
		System.out.println("Logout method");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("close crome browser");
	}
	
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("Delete all cookies");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("Generate Test Report");
	}
	
	
}
