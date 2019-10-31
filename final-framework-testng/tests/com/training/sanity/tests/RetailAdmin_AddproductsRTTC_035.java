package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.RetailAdmin_AddproductsRTTC_035POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RetailAdmin_AddproductsRTTC_035 {private WebDriver driver;
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
	baseUrl = properties.getProperty("baseURL1");
	driver.get(baseUrl);
	screenShot = new ScreenShot(driver);
  }

@Test
public void validLoginTest() throws InterruptedException {
  
	RetailAdmin_AddproductsRTTC_035POM login = new RetailAdmin_AddproductsRTTC_035POM(driver);
  
  login.sendUserName("admin");
  login.sendPassword("admin@123");
  login.clickLoginBtn();
  login.clickCatelog();
  login.ClickProducts();
  login.clickAddnew();
  login.enterProductname("Finger Ring");
  Thread.sleep(3000);
  login.enterMetatag("Finger Ring for ladies");
  Thread.sleep(2000);
  login.clickData();
  login.enterModel("SKU-012");
  Thread.sleep(3000);
  login.enterPrice("500");
  login.enterQuantity("50");
  Thread.sleep(3000);
  login.clickLinks();
  login.selectCategory("ORNAMENTS");
  login.clickORNAMENTS();
  login.clickDiscount();
  login.clickAddnewDiscount();
  login.enterAddQuantity("1");
  login.enterAddPrice("50");
  login.clickcalendar();
  login.clickcalendardate();
  login.clickenddate();
  login.clickcalendarenddate();
  login.clickrewards();
  login.enterpoints("20");
  login.clicksave();
  
  
  
//  Thread.sleep(3000);
//  driver.close();
}
}
