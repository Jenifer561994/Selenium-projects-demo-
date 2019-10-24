package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetailEditInfoPOM {

private WebDriver driver; 
	
	public RetailEditInfoPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}
	@FindBy(id="input-email")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[contains(text(),'Edit your account information')]")
	private WebElement editInfo;
	
	@FindBy(id="input-firstname")
	private WebElement inputfirstName;
	
	@FindBy(id="input-lastname")
	private WebElement inputlastName;
	
	@FindBy(id="input-email")
	private WebElement inputemail;
	
	@FindBy(id="input-telephone")
	private WebElement inputTelephone;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement clickContinue; 
	
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
	
	public void clickeditInfo() {
		this.editInfo.click();
	}
	public void editfirstName(String inputfirstName) {
		this.inputfirstName.clear();
		this.inputfirstName.sendKeys(inputfirstName);
	}
	
	public void editlastName(String inputlastName) {
		this.inputlastName.clear();
		this.inputlastName.sendKeys(inputlastName);
	}
	
	public void editemail(String inputemail) {
		this.inputemail.clear();
		this.inputemail.sendKeys(inputemail);
	}
	
	public void editTelephone(String inputTelephone) {
		this.inputTelephone.clear();
		this.inputTelephone.sendKeys(inputTelephone);
	}
	
	public void clickContinuebutton() {
		this.clickContinue.click();
	}
}
