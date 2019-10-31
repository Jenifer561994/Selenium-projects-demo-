package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RetailAddtoCartRTTC_034POM {
private WebDriver driver; 
	
	public RetailAddtoCartRTTC_034POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		
}
	@FindBy(id="input-email")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//span[contains(text(),'Home')]")
	private WebElement HomeButton; 
	
	@FindBy(xpath="//a[@id='search_button']")
	private WebElement SearchButton; 
	
	@FindBy(xpath="//input[@id='filter_keyword']")
	private WebElement Keyword; 
	
	@FindBy(xpath="//div[@class='tb_item_info']//p[@class='price']")
	private WebElement Image;
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement Addtocart;
	
	@FindBy(xpath="//i[@class='tb_icon ico-linea-ecommerce-bag']")
	private WebElement hovercart;
	
	@FindBy(xpath="//a[contains(text(),'View Cart')]")
	private WebElement viewcart;
	
	@FindBy(xpath="//div[@id='collapse-checkout-option']//div[2]//label[1]//input[1]")
	private WebElement Guest;
	
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement chcekout;
	
	
	@FindBy(xpath="//input[@id='button-account']")
	private WebElement Continue;
		
	@FindBy(id="input-payment-firstname")
	private WebElement inputfirstName;
	
	@FindBy(id="input-payment-lastname")
	private WebElement inputlastName;
	
	@FindBy(id="input-payment-email")
	private WebElement inputemail;
	
	@FindBy(id="input-payment-telephone")
	private WebElement inputTelephone;
	
	@FindBy(id="input-payment-address-1")
	private WebElement inputAddress1;
	
	@FindBy(id="input-payment-city")
	private WebElement inputCity;
	
	@FindBy(id="input-payment-postcode")
	private WebElement inputpostal;
	
	@FindBy(id="input-payment-country")
	private WebElement SelectCountry;
	
	@FindBy(id="input-payment-zone")
	private WebElement Selectstate;
	
	@FindBy(xpath="//input[@id='button-guest']")
	private WebElement Continueguest;	
	
	@FindBy(xpath="//textarea[@name='comment']")
	private WebElement Comments;
	
	@FindBy(xpath="//input[@id='button-shipping-method']")
	private WebElement continuecomments;
	
	@FindBy(xpath="//div[@id='collapse-payment-method']//textarea[@name='comment']")
	private WebElement comments1;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement Agree;
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	private WebElement Continuepayment;	
	
	@FindBy(xpath="//input[@id='button-confirm']")
	private WebElement ConfirmOrder;	
	
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

	public void ClickHomeButton() {
		Actions action = new Actions(driver);
		action.moveToElement(HomeButton).click(HomeButton).build().perform();
		
	}
	public void clickSearchButton() {
		this.SearchButton.click();		
	}
	
	public void typeproductname(String productname) {
		this.Keyword.sendKeys(productname);
		this.Keyword.click();
		
	}
	
	public void clickImage() {
		Actions action = new Actions(driver);
		action.moveToElement(Image).click(Image).build().perform();	
	}
	
	public void clickAddtocart() {
		this.Addtocart.click();
		
		}
	public void clickcart() {
		Actions action = new Actions(driver);
		action.moveToElement(hovercart).build().perform();	
	}
	public void clickviewcart() {	
		this.viewcart.click();
	}
	public void clickchcekout() {
		this.chcekout.click();
	}
	
	public void clickguest() {
		this.Guest.click();
	}
	public void clickContinue() {
		this.Continue.click();
	}
	public void firstName(String inputfirstName) {
		this.inputfirstName.sendKeys(inputfirstName);
	}
	
	public void lastName(String inputlastName) {
		this.inputlastName.sendKeys(inputlastName);
	}
	
	public void email(String inputemail) {
		this.inputemail.sendKeys(inputemail);
	}
	
	public void Telephone(String inputTelephone) {
		this.inputTelephone.sendKeys(inputTelephone);
	}
	
	public void address1(String inputAddress1) {
		this.inputAddress1.sendKeys(inputAddress1);
	}
	
	public void City(String inputCity) {
		this.inputCity.sendKeys(inputCity);
	}
	
	public void Postalcode(String inputpostal) {
		this.inputpostal.clear();
		this.inputpostal.sendKeys(inputpostal);
	}
	
	public void Country() {
		Select Country = new Select(SelectCountry);
		Country.selectByVisibleText("India");
	}
	public void State() {
		Select State = new Select(Selectstate);
		State.selectByVisibleText("Karnataka");
	}
	public void clickContinueguest() {
		this.Continueguest.click();
	}
	
	public void entercomment(String inputcomment) {
		this.Comments.sendKeys(inputcomment);
	}
	public void clickContinuecomment() {
		this.continuecomments.click();
	}
	public void clickAgree() {
		this.Agree.click();
	}
	public void clickContinuepayment() {
		this.Continuepayment.click();
	}

	public void clickConfirmOrder() {
		this.ConfirmOrder.click();
	}

	public void hoverovercart() {
		Actions action = new Actions(driver);
		action.moveToElement(hovercart).build().perform();	
	}
	
	public void entercomments1(String inputcomment) {
		this.comments1.clear();
		this.comments1.sendKeys(inputcomment);
	}
	
}






