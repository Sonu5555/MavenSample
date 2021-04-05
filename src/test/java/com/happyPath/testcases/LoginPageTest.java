package com.happyPath.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.happyPath.base.TestBase;
import com.happyPath.config.PropertyManager;
import com.happyPath.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	PropertyManager mgr;
	 public LoginPageTest() {
		super();
		
	}
	 
	@BeforeMethod
	public void SetUp() {
		initilization();
		 loginPage = new LoginPage();
		 mgr = new PropertyManager();
	}
	
	@Test
	public void LoginSuccessTest() {
		loginPage.login(mgr.username(),mgr.passwrd());
		 System.out.println("@Test "+mgr.username());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
