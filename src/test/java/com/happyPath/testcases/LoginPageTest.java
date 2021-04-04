package com.happyPath.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.happyPath.base.TestBase;
import com.happyPath.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	
	 public LoginPageTest() {
		super();
		 System.out.println("Consturctor "+prop.getProperty("username"));
	}
	 
	@BeforeMethod
	public void SetUp() {
		initilization();
		 loginPage = new LoginPage();
		 System.out.println("Beforee "+prop.getProperty("username"));
	}
	
	@Test
	public void LoginSuccessTest() {
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		 System.out.println("@Test "+prop.getProperty("username"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
