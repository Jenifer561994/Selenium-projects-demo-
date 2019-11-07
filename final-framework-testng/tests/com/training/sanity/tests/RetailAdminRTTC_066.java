package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.GenericMethods;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RetailAdminRTTC_066POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RetailAdminRTTC_066 {
	private WebDriver driver;
	private String baseUrl;
	private RetailAdminRTTC_066POM login;
	private static Properties properties;
	private ScreenShot screenShot;
	private GenericMethods genericMethods; 
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String userName, String password) {
		// for demonstration 
//		genericMethods.getElement("login", "id"); 
		
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		login = new RetailAdminRTTC_066POM(driver);
		baseUrl = properties.getProperty("baseURL1");
		screenShot = new ScreenShot(driver);
		genericMethods = new GenericMethods(driver); 
		// open the browser
		driver.get(baseUrl);
		login.sendUserName(userName);
		login.sendPassword(password);
		login.clickLoginBtn(); 
		screenShot.captureScreenShot(userName);
		login.clickCatelog();
		login.ClickCategories();
		login.clickAddnew();

	}
	@Test(dataProvider = "db-inputs", dataProviderClass = LoginDataProviders.class)
	public void loginDBTest(String Categoryname, String CategoryDescription, String MetaTagTitle, String MetaTagDescription) {
		login.enterCategoryname(Categoryname);
		login.enterCategoryDescription(CategoryDescription);
		login.enterMetaTagTitle(MetaTagTitle);
		login.enterMetaTagDescription(MetaTagDescription);
		login.clickSave();
}

}