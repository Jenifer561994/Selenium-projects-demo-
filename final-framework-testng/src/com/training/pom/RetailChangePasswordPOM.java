package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetailChangePasswordPOM {
	
private WebDriver driver; 
	
	public RetailChangePasswordPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}
	@FindBy(id="input-email")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//a[contains(text(),'Change your password')]")
	private WebElement changePassword;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement newPassword;
	
	@FindBy(id="input-confirm")
	private WebElement confirmPassword;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement continuebutton;

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
	
	public void clickchangePassword() {
		this.changePassword.click();
	}
	
	public void updatePassword(String password) {
		this.newPassword.sendKeys(password); 
	}

	public void confirmnewPassword(String password) {
		this.confirmPassword.sendKeys(password); 
	}
	
	public void clickContinue() {
		this.continuebutton.click();
	}

}
