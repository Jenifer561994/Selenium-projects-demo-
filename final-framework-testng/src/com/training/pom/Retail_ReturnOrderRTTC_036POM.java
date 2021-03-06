package com.training.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Retail_ReturnOrderRTTC_036POM {
	
private WebDriver driver; 
	
	public Retail_ReturnOrderRTTC_036POM(WebDriver driver) {
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
	
	@FindBy(xpath="//a[2]//i[1]")
	private WebElement Return;
	
	@FindBy(xpath="//div[@class='col-sm-10']//div[1]//label[1]//input[1]")
	private WebElement Reason;
	
	@FindBy(xpath="//body[@class='account-return-add-892 tb_width_1200 tb_lang_ltr tb_page_account_return_add is_logged head_glob_intro_glob_cont_glob_foot_glob_ar_head_glob_ar_intro__def_ar_cont__def_ar_col_l_glob_ar_foot_glob_en-gb_733d2 no_touch']/div[@id='wrapper']/section[@id='content']/div[@class='row tb_separate_columns tb_ip_50']/div[@class='main col col-xs-12 col-sm-fill col-md-fill']/div[@class='row_8rjbB row-wrap lazyloaded']/div[@class='row tb_gut_xs_30 tb_gut_sm_30 tb_gut_md_50 tb_gut_lg_50']/div[@class='col_hJRg2 col col-xs-12 col-sm-12 col-md-12 col-lg-12 col-align-default col-valign-top tb_pt_0 tb_pr_0 tb_pb_0 tb_pl_0']/div[@id='System_s3bhXNDb']/form[@id='return_request_form']/fieldset/div[@class='form-group required']/div[@class='col-sm-10']/label[1]")
	private WebElement Yes;
	
	@FindBy(xpath="//textarea[@id='input-comment']")
	private WebElement Comment;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement Submit;
	
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
	
	public void clickReturn() { 
	 this.Return.click(); 
	}
	
	public void clickReason(){ 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400 )");
		 this.Reason.click(); 
		}
	
	public void clickYes(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400 )");
		 this.Yes.click(); 
		}
	
	public void enterComment(String Comment) {
		this.Comment.clear(); 
		this.Comment.sendKeys(Comment); 
	}
	
	public void clickSubmit() { 
		 this.Submit.click(); 
		}
}
