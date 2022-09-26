package com.ToolsQA.page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class uploadFile extends PageObject {
	
	@FindBy(xpath="//div[@class='card-body']")
	public WebElementFacade elements;
	
	/*@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/form/div")
	public WebElement uploadFile;*/
	
	//@FindBy(xpath="//*[@id=\"item-7\"]")
	//public WebElementFacade Upload_Download_bttn;
	//first demo git edit;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div/div[2]/div/div[3]/div/div[3]/h5")
	public WebElementFacade AlertandFrameBttn;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2]")
	public WebElementFacade Alerts;
	
	@FindBy(xpath="//*[@id='alertButton']")
	public WebElementFacade simpleAlert;
	
	/*@FindBy(xpath="//*[@id='promtButton']")
	public WebElement promtAlert;*/
	
	
	public void selectElements() {
		elements.click();
	}
	
	/*public void clickUploadDownload() {
	       Upload_Download_bttn.click();
	}*/
	
	/*public void clickChooseFile() {
		uploadFile.click();
	}*/
	
	public void uploadFileRobotClass() throws AWTException, InterruptedException {
		
		StringSelection sel = new StringSelection("C:\\Users\\jayibane\\Downloads\\fileuploadtest.docx");


        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
        System.out.println("selection" +sel);
       Thread.sleep(3000);
       //Click on upload resume button
       getDriver().findElement(By.xpath("//button[text()='Upload Resume']")).click(); //button[text()='Upload Resume']
        Thread.sleep(1000);

       // Create object of Robot class
        Robot robot = new Robot();
        Thread.sleep(1000);

         // Press Enter
        robot.keyPress(KeyEvent.VK_ENTER);

       // Release Enter
        robot.keyRelease(KeyEvent.VK_ENTER);

         // Press CTRL+V
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

       // Release CTRL+V
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);
        Thread.sleep(1000);

        //Press Enter 
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public void selectAlertandFrames() {
		AlertandFrameBttn.click();
	}
	
	public void clickAlerts() {
	       Alerts.click();
	}

	public void clickSimpleAlert() throws InterruptedException {
		
       simpleAlert.click();
       Thread.sleep(3000);
       Alert simpleAlert = getDriver().switchTo().alert();
       simpleAlert.accept();
       Thread.sleep(3000);
	}
	
	public void clickPromptAlert() throws InterruptedException {
		//promtAlert.click();
		WebElement element = getDriver().findElement(By.id("promtButton"));
		element.click();
		//((JavascriptExecutor) getDriver()).executeScript("arguments[0].click()", element);
		Thread.sleep(3000);
		Alert promptAlert  = getDriver().switchTo().alert();
		 String alertText = promptAlert.getText();
		   System.out.println("Alert text is " + alertText);
		 //Send some text to the alert
		   promptAlert.sendKeys("Test User");
		   Thread.sleep(2000);
		   promptAlert.accept();
		   Thread.sleep(3000);
		  
	}
}
