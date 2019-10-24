package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RetailEditInfoPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class RetailEditInfoRTTC_005 {
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
		screenShot = new ScreenShot(driver);
		driver.get(baseUrl);
		 }
	
  @Test
  public void validLoginTest() throws InterruptedException {
	  
	  RetailEditInfoPOM login = new RetailEditInfoPOM(driver);
	  
	  login.sendUserName("jenifer@gmail.com");
	  login.sendPassword("retaildemo");
	  login.clickLoginBtn(); 
	  login.clickeditInfo();
	  login.editfirstName("jenifer");
	  login.editlastName("jenifer");
	  login.editemail("jenifer@gmail.com");
	  login.editTelephone("1234567890");
	  login.clickContinuebutton();
	  screenShot.captureScreenShot("Infoeditedsuccessfully");
	  Thread.sleep(3000);
	  driver.close(); 	  
}
}
