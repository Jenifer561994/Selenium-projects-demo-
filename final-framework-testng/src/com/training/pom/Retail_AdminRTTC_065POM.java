package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Retail_AdminRTTC_065POM {private WebDriver driver; 
public Retail_AdminRTTC_065POM(WebDriver driver) {
	this.driver = driver; 
	PageFactory.initElements(driver, this);
	
}
@FindBy(id="input-username")
private WebElement userName; 

@FindBy(id="input-password")
private WebElement password;

@FindBy(xpath="//button[@class='btn btn-primary']")
private WebElement loginBtn;

@FindBy(xpath="//i[@class='fa fa-tags fw']")
private WebElement Catelog;

@FindBy(xpath="//li[@id='menu-catalog']//ul//li//a[contains(text(),'Products')]")
private WebElement Products;

@FindBy(xpath="//i[@class='fa fa-plus']")
private WebElement Addnew;

@FindBy(xpath="//input[@id='input-name1']")
private WebElement Productname;

@FindBy(xpath="//input[@id='input-meta-title1']")
private WebElement Metatag;

@FindBy(xpath="//a[contains(text(),'Data')]")
private WebElement Data;

@FindBy(xpath="//input[@id='input-model']")
private WebElement Model;

@FindBy(xpath="//input[@id='input-price']")
private WebElement Price;

@FindBy(xpath="//input[@id='input-quantity']")
private WebElement Quantity;

@FindBy(xpath="//a[contains(text(),'Links')]")
private WebElement Links;

@FindBy(xpath="//input[@id='input-category']")
private WebElement Category;

@FindBy(xpath="//div[@id='product-category']")
private WebElement ORNAMENTS;


@FindBy(xpath="//div[@class='pull-right']//button[@class='btn btn-primary']")
private WebElement Save;

@FindBy(xpath="//span[@class='hidden-xs hidden-sm hidden-md']")
private WebElement logout;

@FindBy(id="input-email")
private WebElement loginuserName; 

@FindBy(id="input-password")
private WebElement loginpassword;

@FindBy(xpath="//input[@class='btn btn-primary']")
private WebElement login; 

@FindBy(xpath="//a[@id='search_button']")
private WebElement SearchButton; 

@FindBy(xpath="//input[@id='filter_keyword']")
private WebElement Keyword; 

@FindBy(xpath="//div[@class='tb_listing tb_compact_view tb_compact_view-search-results']//div[1]//div[1]//div[1]//a[1]//strong[1]")
private WebElement image; 

public void sendUserName(String userName) {
	this.userName.clear();
	this.userName.sendKeys(userName);
}

public void sendPassword(String password) {
	this.password.clear(); 
	this.password.sendKeys(password); 
}

public void clickLoginBtn() {
	this.loginBtn.click();
}

public void clickCatelog() {
	Actions action=new Actions(driver);
	action.moveToElement(Catelog).build().perform(); 
}

public void ClickProducts() {
	Actions action = new Actions(driver);
	action.moveToElement(Products).click(Products).build().perform();
}

public void clickAddnew() {
	this.Addnew.click();
}

public void enterProductname(String Productname) {
	this.Productname.sendKeys(Productname); 
}

public void enterMetatag(String Metatag) {
	this.Metatag.sendKeys(Metatag); 
}

public void clickData() {
	this.Data.click();
}

public void enterModel(String Model) {
	this.Model.sendKeys(Model); 
}

public void enterPrice(String Price) {
	JavascriptExecutor js=(JavascriptExecutor)driver ;
	js.executeScript("window.scrollBy(0,400 )");
	this.Price.sendKeys(Price); 
}

public void enterQuantity(String Quantity) {
	this.Quantity.clear(); 
	this.Quantity.sendKeys(Quantity); 
}

public void clickLinks() {
	this.Links.click();
}

public void selectCategory(String Category) {
	this.Category.clear(); 
	this.Category.sendKeys(Category);
	}
public void clickORNAMENTS() {
	this.ORNAMENTS.click();
}
public void clicksave() {
	this.Save.click();
}
public void clicklogout() {
	this.logout.click();
}

public void enterloginuserName(String loginuserName) {
	this.loginuserName.clear(); 
	this.loginuserName.sendKeys(loginuserName); 
}
public void enterloginpassword(String loginpassword) {
	this.loginpassword.clear(); 
	this.loginpassword.sendKeys(loginpassword); 
}

public void clicklogin() {
	this.login.click();
}
public void clickSearchButton() {
	this.SearchButton.click();		
}

public void typeproductname(String productname) {
	this.Keyword.click();
	this.Keyword.sendKeys(productname);
	this.Keyword.click();
		}

public void clickKeyword() {
	this.Keyword.click();
	
}
public void clickImage() {
	Actions action = new Actions(driver);
	action.moveToElement(image).click(image).build().perform();	
}

}



//username: admin
//password: admin@123
