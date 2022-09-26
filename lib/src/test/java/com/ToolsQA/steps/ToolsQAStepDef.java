package com.ToolsQA.steps;

import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import com.ToolsQA.page.uploadFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;

public class ToolsQAStepDef extends PageObject {
	
	@Steps
	uploadFile tqaImpl;
	
	@Given("user should be on the same page")
	public void user_should_be_on_the_same_page() throws InterruptedException {
		getDriver().navigate().to("https://www.naukri.com/registration/createAccount"); //https://www.naukri.com/registration/createAccount
		getDriver().manage().window().maximize();
		Thread.sleep(2000);
	    
	}
	
	@When("user scrolls")
	public void user_scrolls() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
	       js.executeScript("window.scrollBy(0,350)", "");
	       
	    
	}
	
	
	@When("user perform uploadfile action using robot keys")
	public void user_perform_uploadfile_action_using_robot_keys() throws AWTException, InterruptedException {
		Thread.sleep(3000);
		getDriver().navigate().refresh();
		tqaImpl.uploadFileRobotClass();	
		Thread.sleep(3000);
	    
	}
	
	@Then("user stays on the page")
	public void user_stays_on_the_page() {
		String expectedTitletwo="Register on Naukri.com: Apply to Millions of Jobs Online";
        String actualTitletwo;
        actualTitletwo =getDriver().getTitle();
        Assert.assertEquals(expectedTitletwo,actualTitletwo);
        System.out.println("Title is: "+actualTitletwo);
         Assert.assertTrue(actualTitletwo.contains("Register on Naukri.com: Apply to Millions of Jobs Online"));
         System.out.println("Page title is verified");
	    
	}
	
	@Given("user should be on the home page")
	public void user_should_be_on_the_home_page() throws InterruptedException {
		getDriver().navigate().to("https://demoqa.com/");
		getDriver().manage().window().maximize();
		Thread.sleep(2000);
	    
	}
	
	
	@When("user scrolls and click Alerts and Frame")
	public void user_scrolls_and_click_alerts_and_frame() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
	       js.executeScript("window.scrollBy(0,350)", "");
	       tqaImpl.selectAlertandFrames();
	}
	
	@When("user scroll again")
	public void user_scroll_again() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
	       js.executeScript("window.scrollBy(0,350)", "");
	   	   
	   	}
	    
	
	@When("user click Alerts")
	public void user_click_alerts() throws InterruptedException {
		Thread.sleep(3000);
		tqaImpl.clickAlerts();
	    
	}
	@When("user perform Alert actions")
	public void user_perform_alert_actions() throws InterruptedException {
		Thread.sleep(3000);
		tqaImpl.clickSimpleAlert();
		tqaImpl.clickPromptAlert();
		
	   
	}

	@Then("user stays on the same page")
	public void user_stays_on_the_same_page() {
		String expectedTitletwo="ToolsQA";
        String actualTitletwo;
        actualTitletwo =getDriver().getTitle();
        Assert.assertEquals(expectedTitletwo,actualTitletwo);
        System.out.println("Title is: "+actualTitletwo);
         Assert.assertTrue(actualTitletwo.contains("ToolsQA"));
         System.out.println("Page title is verified");
	    
	}


}
