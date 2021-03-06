package com.happyPath.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class TestBase {

	public static WebDriver driver;
	
//	public static Properties prop;
//	
//	
//	public TestBase()  {
//		try {
//			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\\\src\\\\main\\\\java\\\\com\\\\happyPath\\\\config\\\\config.properties");   
//			System.out.println(System.getProperty("user.dir")+"\\src\\main\\java\\com\\happyPath\\config\\config.properties");
//			prop = new Properties();
//			
//			prop.load(ip);
//			
//		}
//		 catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

public static void initilization() {
	String browserName = "Chrome";
	if(browserName.equals("Chrome"))
{
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\\\chrome\\\\chromedriver.exe");		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); 
		driver = new ChromeDriver(options);
		 
		
}
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://qa.socxo.net/login");

}
}