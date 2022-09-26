package com.guru99.stepdef;


import java.awt.AWTException;
import java.io.IOException;
import java.util.Base64;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;

import com.guru99.dataFolder.propertiesFileReaderGuru99;
import com.guru99.pages.ImplementsGuru99;
import com.guru99.pages.LoginPageGuru;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class guru99StepDef extends PageObject {
	
	propertiesFileReaderGuru99 pr;
	@Steps()
	LoginPageGuru Login;
	ImplementsGuru99 implPage;
	
	@Before()
	public void initialize_driver() {
		pr = new propertiesFileReaderGuru99();
	}
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		getDriver().navigate().to("https://demo.guru99.com/V4/");
		getDriver().manage().window().maximize();
		//getDriver().navigate().refresh();
		//getDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		Thread.sleep(3000);
	    
	}
	@When("user enter username and password")
	public void user_enter_username_and_password() throws InterruptedException {
		//System.out.println(pr.getUsername());
		//System.out.println(pr.getPassword());
		
		String decryptdata=pr.getUsername();
        byte[] decodebytes=Base64.getDecoder().decode(decryptdata.getBytes());
        Login.enterUsername(new String(decodebytes));
		
        String decryptdata2=pr.getPassword();
        byte[] decodebytes2=Base64.getDecoder().decode(decryptdata2.getBytes());
        Login.enterPassword(new String(decodebytes2));
	    
	    Thread.sleep(5000);
	    
	}
	@When("user clicks on submit")
	public void user_clicks_on_submit() throws InterruptedException {
		Login.clickLogin();
		Thread.sleep(3000);
	    
	}
	@Then("user is on same page")
	public void user_is_on_same_page() {
		String expectedTitle="Guru99 Bank Manager HomePage";
        String actualTitle;
        actualTitle =getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        System.out.println("Title is: "+actualTitle);
         Assert.assertTrue(actualTitle.contains("Guru99 Bank Manager HomePage"));
         System.out.println("Page title is verified");
	    
	}

	@Given("user should be logged in")
	public void user_should_be_logged_in() throws InterruptedException {
	    Thread.sleep(2000);
	}
	@When("click on selenium and select RadioButton")
	public void click_on_selenium_and_select_radio_button() throws InterruptedException {
		implPage.selectSelenium();
		Thread.sleep(3000);
		
		//implPage.popUpWindwHandle();    
	}
	
	/*@Then("user is on the same page")
	public void user_is_on_the_same_page() {
		String expectedTitleone="Guru99 Bank Manager HomePage";
        String actualTitleone;
        actualTitleone =getDriver().getTitle();
        Assert.assertEquals(expectedTitleone,actualTitleone);
        System.out.println("Title is: "+actualTitleone);
         Assert.assertTrue(actualTitleone.contains("Guru99 Bank Manager HomePage"));
         System.out.println("Page title is verified");
	    
	}

	@When("user navigate to RadioButton page")
	public void user_navigate_to_radio_button_page() throws InterruptedException {
		getDriver().navigate().to("https://demo.guru99.com/test/radio.html");
		getDriver().manage().window().maximize();
		Thread.sleep(2000);
	    
	}*/
	@When("user click on RadioButton1")
	public void user_click_on_radio_button1() {
	    implPage.clickRadioBttn1();
	}
	@When("user click on RadioButton3")
	public void user_click_on_radio_button3() throws InterruptedException {
	   implPage.clickRadioBttn3();
	   Thread.sleep(2000);
	}
	@Then("user stays on same page")
	public void user_stays_on_same_page() {
		String expectedTitletwo="Radio Button & Check Box Demo";
        String actualTitletwo;
        actualTitletwo =getDriver().getTitle();
        Assert.assertEquals(expectedTitletwo,actualTitletwo);
        System.out.println("Title is: "+actualTitletwo);
         Assert.assertTrue(actualTitletwo.contains("Radio Button & Check Box Demo"));
         System.out.println("Page title is verified");
	    
	}
	
	@When("user navigate to drag and drop page")
	public void user_navigate_to_drag_and_drop_page() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
	       js.executeScript("window.scrollBy(0,450)", "");
		implPage.selectSeleniumsecond();
		Thread.sleep(3000);
		
		
	    
	}
	@Then("user perform drag and drop")
	public void user_perform_drag_and_drop() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
	       js.executeScript("window.scrollBy(0,350)", "");
		implPage.dragDropAction();
	    
	}
	
	@When("user navigate to uploadfile page")
	public void user_navigate_to_uploadfile_page() throws InterruptedException {
		//getDriver().navigate().to("https://demo.guru99.com/test/upload/");
		//getDriver().manage().window().maximize();
		implPage.selectSeleniumthird();
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
	       js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
	    
	}
	@Then("user perform uploadfile action using sendkeys")
	public void user_perform_uploadfile_action_using_sendkeys() throws InterruptedException {
		implPage.uploadFilesSendKeys();
		Thread.sleep(3000);
	    
	}
	
	@When("user perform Confirmation Alert action")
	public void user_perform_confirmation_alert_action() throws InterruptedException {
		implPage.selectSeleniumfourth();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
	       js.executeScript("window.scrollBy(0,350)", "");
		//getDriver().navigate().to("https://demo.guru99.com/test/delete_customer.php");
		//getDriver().manage().window().maximize();
		implPage.ConfirmationAlert();
	    
	}
	@Then("user is on the same page")
	public void user_is_on_the_same_page() throws InterruptedException {
		Thread.sleep(2000);
	    
	}
	
	@Given("user navigates to Cookie handling page")
	public void user_navigates_to_cookie_handling_page() {
	    getDriver().navigate().to("https://demo.guru99.com/test/cookie/selenium_cookie.php");
	}
	
	
	@When("user stores the cookie details in file")
	public void user_stores_the_cookie_details_in_file() throws IOException, InterruptedException {
	   Thread.sleep(3000);
	   getDriver().navigate().refresh();
		implPage.getCookies();
	   
	}
	
	@Then("user delete all cookies")
	public void user_delete_all_cookies() throws InterruptedException {
		Thread.sleep(2000);
		implPage.delCookies();
	   
	}
	
	



}
