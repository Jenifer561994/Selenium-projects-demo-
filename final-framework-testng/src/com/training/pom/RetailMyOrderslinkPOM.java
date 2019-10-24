package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetailMyOrderslinkPOM {
	
private WebDriver driver; 
	
	public RetailMyOrderslinkPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
}
	@FindBy(id="input-email")
	private WebElement userName; 
	
	@FindBy(id="input-password")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//li[@class='tb_link dropdown tb_menu_system_account_account tb_selected']")
	private WebElement Mousehoverover; 
	
	@FindBy(xpath="//span[contains(text(),'MY ORDERS')]")
	private WebElement Myorders; 
	
	@FindBy(xpath="//i[@class='fa fa-eye']") 
	private WebElement viewButton;
	 
	
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
	
	  public void MouseHoverovertoIcon() { 
		  Actions action=new Actions(driver);
	  action.moveToElement(Mousehoverover).build().perform(); 
	  }
	 	
	public void ClickMyorders() {
		Actions action = new Actions(driver);
		action.moveToElement(Myorders).click(Myorders).build().perform();
	}
		
	 public void clickViewButton() { 
		  this.viewButton.click(); 
		  }
	 
}
//username : jenifer@gmail.com
//password: retaildemo