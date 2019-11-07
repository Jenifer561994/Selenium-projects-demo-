package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Retail_AdminAddCategoryRTTC_064POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Retail_AdminAddCategoryRTTC_064 {
	
	private WebDriver driver; 
	private String baseUrl; 
	private Retail_AdminAddCategoryRTTC_064POM login; 
	private static Properties properties; 
	private ScreenShot screenShot; 
  

	@DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] {
			{"admin", "admin@123"}			
		};
	}
	
	@DataProvider(name="Categoryinputs")
	public Object[][] getData1() {
		return new Object[][] {
			{"Electronic", "Electronic","Electronic","Electronic"}
		};	
	}
		
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		
	}

	
		
	@Test(dataProvider="inputs")
	public void testMethod1(String userName, String password) {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		login = new Retail_AdminAddCategoryRTTC_064POM(driver);
		baseUrl = properties.getProperty("baseURL1");
		driver.get(baseUrl);
		screenShot = new ScreenShot(driver);
		login.sendUserName(userName);
		login.sendPassword(password);
		login.clickLoginBtn(); 
		screenShot.captureScreenShot(userName);
		login.clickCatelog();
		login.ClickCategories();
		login.clickAddnew();
	}
	
	@Test(dataProvider="Categoryinputs")
		public void testMethod2(String Categoryname, String CategoryDescription, String MetaTagTitle, String MetaTagDescription) {
			login.enterCategoryname(Categoryname);
			login.enterCategoryDescription(CategoryDescription);
			login.enterMetaTagTitle(MetaTagTitle);
			login.enterMetaTagDescription(MetaTagDescription);
			login.clickSave();
	}
}
