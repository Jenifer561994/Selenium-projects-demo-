package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.RetailAddtoCartRTTC_034POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Retail_AddtoCartRTTC_034 {
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	//private ScreenShot screenShot;
	
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
		//screenShot = new ScreenShot(driver);
		
	  }
	
  @Test
  public void validLoginTest() throws InterruptedException {
	  
	  RetailAddtoCartRTTC_034POM login = new RetailAddtoCartRTTC_034POM(driver);
	  
	  	  
	  login.clickSearchButton();
	  login.typeproductname("lacinia congue");
	  login.clickImage();
	  Thread.sleep(3000);
	  login.clickAddtocart();	
	  Thread.sleep(5000);
	  login.clickcart();
	  login.clickviewcart();
	  login.clickchcekout();
	  login.clickguest();
	  login.clickContinue();
	  login.firstName("Jenifer");
	  login.lastName("Jenifer");
	  login.email("jenifer123@gmail.com");
	  login.Telephone("1234567890");
	  login.address1("Bangalore address");
	  login.City("Bangalore");
	  login.Postalcode("560001");
	  login.Country();
	  login.State();
	  login.clickContinueguest();
	  login.entercomment("Guest order");
	  login.clickContinuecomment();
	  login.entercomments1("Guest order");
	  login.clickAgree();
	  login.clickContinuepayment();
	  login.clickConfirmOrder();
	  Thread.sleep(3000);
	  login.hoverovercart();  
	  
  }
}
