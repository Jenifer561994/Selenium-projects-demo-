package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RetailMyOrderslinkPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class RetailMyOrderslinkRTTC_004 {
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private ScreenShot screenShot;
		
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	 
	@BeforeMethod
	  public void setUp() {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
		screenShot = new ScreenShot(driver);
	  }
	
  @Test
  public void validLoginTest() throws InterruptedException {
	  
	  RetailMyOrderslinkPOM login = new RetailMyOrderslinkPOM(driver);
	  
	  login.sendUserName("jenifer@gmail.com");
	  login.sendPassword("retaildemo");
	  login.clickLoginBtn(); 
	  //screenShot.captureScreenShot("loggedinsuccessfully");
	  login.MouseHoverovertoIcon();
	  login.ClickMyorders();
	  login.clickViewButton();
	  //screenShot.captureScreenShot("Vieworderdetails");
	  Thread.sleep(3000);
	  driver.close();	  
		}
  

}
