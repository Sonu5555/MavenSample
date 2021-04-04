package com.happyPath.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.happyPath.base.TestBase;

public class LoginPage extends TestBase  {

	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
		
	@FindBy(xpath ="//input[@type='submit']")
	WebElement loginBtn;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un,String pas) {
		username.sendKeys(un);
		password.sendKeys(pas);
		loginBtn.click();
		
		
	}
	
}
