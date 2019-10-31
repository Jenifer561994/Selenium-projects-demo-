package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RetailAdmin_AddproductsRTTC_035POM {
	
	private WebDriver driver; 
	public RetailAdmin_AddproductsRTTC_035POM(WebDriver driver) {
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
	
	@FindBy(xpath="//a[contains(text(),'Discount')]")
	private WebElement Discount;
	
	@FindBy(xpath="//table[@id='discount']//i[@class='fa fa-plus-circle']")
	private WebElement AddnewDiscount;
	
	@FindBy(xpath="//td[@class='text-right']//input[@placeholder='Quantity']")
	private WebElement AddQuantity;
	
	@FindBy(xpath="//td[@class='text-right']//input[@placeholder='Price']")
	private WebElement AddPrice;
	
	@FindBy(xpath="//td[5]//div[1]//span[1]//button[1]//i[1]")
	private WebElement calendar;
	
	@FindBy(css="div.bootstrap-datetimepicker-widget.dropdown-menu.bottom.picker-open:nth-child(5) div.datepicker div.datepicker-days table.table-condensed tbody:nth-child(2) tr:nth-child(5) > td.day.new:nth-child(7)")
	private WebElement calendardate;
	
	@FindBy(xpath="//td[6]//div[1]//span[1]//button[1]//i[1]")
	private WebElement enddate;
		
	@FindBy(css="div.bootstrap-datetimepicker-widget.dropdown-menu.bottom.pull-right.picker-open:nth-child(6) div.datepicker div.datepicker-days table.table-condensed tbody:nth-child(2) tr:nth-child(6) > td.day.new:nth-child(6)")
	private WebElement calendarenddate;
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Reward Points')]")
	private WebElement rewards;
		
	@FindBy(xpath="//input[@id='input-points']")
	private WebElement points;
	
	
	@FindBy(xpath="//div[@class='pull-right']//button[@class='btn btn-primary']")
	private WebElement Save;
	
	
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
	
	public void clickDiscount() {
	this.Discount.click();
}
	
	public void clickAddnewDiscount() {
		this.AddnewDiscount.click();
	}
	
	
	public void enterAddQuantity(String AddQuantity) {
		this.AddQuantity.clear(); 
		this.AddQuantity.sendKeys(AddQuantity);
	}
	
	public void enterAddPrice(String AddPrice) {
		this.AddPrice.clear(); 
		this.AddPrice.sendKeys(AddPrice);
	}
	
	public void clickcalendar() {
		this.calendar.click();
	}
	
	public void clickcalendardate() {
	this.calendardate.click(); 
}
	
	public void clickenddate() {
	this.enddate.click();
	}
	
	public void clickcalendarenddate() {
		this.calendarenddate.click();
		}
	
	public void clickrewards() {
		this.rewards.click();
		}
	
	public void enterpoints(String points) {
		this.points.clear();
		this.points.sendKeys(points);
		}
	
	public void clicksave() {
		this.Save.click();
	}
		
}



//username: admin
//password: admin@123
