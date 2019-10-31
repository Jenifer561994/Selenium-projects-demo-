package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RetailMyOrderslinkPOM;
import com.training.pom.Retail_ReturnOrderRTTC_036POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Retail_ReturnOrderRTTC_036 {
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
	  
	  Retail_ReturnOrderRTTC_036POM login = new Retail_ReturnOrderRTTC_036POM(driver);
	  
	  login.sendUserName("jenifer@gmail.com");
	  login.sendPassword("retaildemo");
	  login.clickLoginBtn(); 
	  login.MouseHoverovertoIcon();
	  login.ClickMyorders();
	  login.clickViewButton();
	  login.clickReturn();
	  login.clickReason();
	  login.clickYes();
	  login.enterComment("Product is faulty");
	  login.clickSubmit();
	  
	  Thread.sleep(3000);
	  driver.close();
	  
  }
}
