package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RetailAdminRTTC_066POM {private WebDriver driver; 
public RetailAdminRTTC_066POM(WebDriver driver) {
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

@FindBy(xpath="//a[contains(text(),'Categories')]")
private WebElement Categories;

@FindBy(xpath="//div[@class='pull-right']//a[@class='btn btn-primary']")
private WebElement Addnew;

@FindBy(xpath="//input[@id='input-name1']")
private WebElement Categoryname;

@FindBy(xpath="//div[@class='note-editable panel-body']")
private WebElement CategoryDescription;

@FindBy(xpath="//input[@id='input-meta-title1']")
private WebElement MetaTagTitle;

@FindBy(xpath="//textarea[@id='input-meta-description1']")
private WebElement MetaTagDescription;

@FindBy(xpath="//i[@class='fa fa-save']")
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
public void ClickCategories() {
	Actions action = new Actions(driver);
	action.moveToElement(Categories).click(Categories).build().perform();
}
public void clickAddnew() {
	this.Addnew.click();
}

public void enterCategoryname(String Categoryname) {
	this.Categoryname.clear();
	this.Categoryname.sendKeys(Categoryname);
}

public void enterCategoryDescription(String CategoryDescription) {
	this.CategoryDescription.clear();
	this.CategoryDescription.sendKeys(CategoryDescription);
}

public void enterMetaTagTitle(String MetaTagTitle) {
	this.MetaTagTitle.clear();
	this.MetaTagTitle.sendKeys(MetaTagTitle);
}

public void enterMetaTagDescription(String MetaTagDescription) {
	this.MetaTagDescription.clear();
	this.MetaTagDescription.sendKeys(MetaTagDescription);
}

public void clickSave() {
	this.Save.click();
}
}

