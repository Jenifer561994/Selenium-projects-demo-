package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.pom.Retail_AdminRTTC_065POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Retail_AdminRTTC_065 {
	private WebDriver driver;
	private String baseUrl;
	private Retail_AdminRTTC_065POM login;
	private static Properties properties;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}
	  @Test(dataProvider = "excel-inputs", dataProviderClass = LoginDataProviders.class) 
	  public void loginExcel(String userName, String password,String Productname ,String Metatag,String Model,String Price, String Quantity, String Category,String loginuserName, String loginpassword,String productname) 
	  { 
		  driver = DriverFactory.getDriver(DriverNames.CHROME); 
		  login = new Retail_AdminRTTC_065POM(driver); 
		  baseUrl = properties.getProperty("baseURL1"); 
		  driver.get(baseUrl);
	  login.sendUserName(userName); 
	  login.sendPassword(password);
	  login.clickLoginBtn(); 
	  login.clickCatelog(); 
	  login.ClickProducts();
	  login.clickAddnew(); 
	  login.enterProductname(Productname);
	  login.enterMetatag(Metatag); 
	  login.clickData(); 
	  login.enterModel(Model);
	  login.enterPrice(Price); 
	  login.enterQuantity(Quantity); 
	  login.clickLinks();
	  login.selectCategory(Category); 
	  login.clickORNAMENTS(); 
	  login.clicksave();
	  login.clicklogout(); 
	  driver.close(); 
	  driver = DriverFactory.getDriver(DriverNames.CHROME);
		login = new Retail_AdminRTTC_065POM(driver);
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
		login.enterloginuserName(loginuserName);
		login.enterloginpassword(loginpassword);
		login.clicklogin();
		login.clickSearchButton();
		login.typeproductname(productname);
		login.clickKeyword();
		login.clickImage();
	  } 
}
