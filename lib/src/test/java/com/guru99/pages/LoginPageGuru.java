package com.guru99.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPageGuru extends PageObject {

	@FindBy(xpath = "//input[@name='uid']")
	public WebElementFacade username;
	
	@FindBy(xpath = "//input[@name='password']")
	public WebElementFacade password;
	
	@FindBy(xpath = "//input[@name='btnLogin']")
	public WebElementFacade LoginBttn;
	
	public void enterUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLogin() {
		LoginBttn.click();
	}
	
	
	
	
	
}
