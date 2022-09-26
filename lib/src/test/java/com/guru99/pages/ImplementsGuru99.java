package com.guru99.pages;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ImplementsGuru99 extends PageObject {
	
	@FindBy(xpath="//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li")
	public List<WebElement> selDropDown;
	
	@FindBy(xpath="//*[@id=\"vfb-7-1\"]")
	public WebElementFacade radioBttn1;
	
	@FindBy(xpath="//*[@id=\"vfb-7-3\"]")
	public WebElementFacade radioBttn3;
	
	@FindBy(xpath="//*[@id=\"fourth\"]/a")
	public WebElement From;
	
	@FindBy(xpath="//*[@id=\"amt7\"]")
	public WebElement To;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div[1]/form/div[2]/div[1]/div/div/input")
	public WebElement uploadFile;
	
	@FindBy(xpath="//input[@id='terms']")
	public WebElementFacade acceptTerm;
	
	@FindBy(xpath="//*[@id='submitbutton']")
	public WebElementFacade submitBttn;
	
	//@FindBy(xpath="/html/body")
	//public WebElementFacade ad;
	
	
	/*public void selectSel() {
		Select drpdwns6 = new Select(selDropDown);
		List <WebElement> sels6 = drpdwns6.getOptions();
		sels6.size();
		for(int s6=0;s6<sels6.size();s6++) {
		    drpdwns6.selectByVisibleText("Radio & Checkbox Demo");
		    System.out.println("selected value"+s6);

		    Select drpdwns7 = new Select(selDropDown);
		    List <WebElement> sels7 = drpdwns7.getOptions();
		    sels7.size();
		    for(int s7=0;s7<sels7.size();s7++) {
		        drpdwns7.selectByVisibleText("Drag and Drop Action");
		        System.out.println("selected value"+s7);
		    }
		}
	}*/
	
	public void selectSelenium() throws InterruptedException 
	{
	        WebElement option_dropdown=getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[1]"));
	        option_dropdown.click();
	        Thread.sleep(3000);
	        for(WebElement element: selDropDown) 
	        {
	        	
	            if (element.getText().equals("Radio & Checkbox Demo")) 
	                {
	                System.out.println(element.getText());
	                element.click();
	                Thread.sleep(2000);
	                break;
	                }
	        }
	           
	}
	           
	public void selectSeleniumsecond() throws InterruptedException 
	{
		
		 {
	        WebElement dropdown=getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[1]"));
	        dropdown.click();
	        Thread.sleep(3000);
	        for(WebElement element: selDropDown) 
	        {
	            if (element.getText().equals("Drag and Drop Action")) 
	                {
	                System.out.println(element.getText());
	                element.click();
	                Thread.sleep(5000);
	                break;
	                }
		
	         }
		 }
	  }
	
	public void selectSeleniumthird() throws InterruptedException 
	{
		
		 {
	        WebElement dropdown=getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[1]"));
	        dropdown.click();
	        Thread.sleep(3000);
	        for(WebElement element: selDropDown) 
	        {
	            if (element.getText().equals("File Upload")) 
	                {
	                System.out.println(element.getText());
	                element.click();
	                Thread.sleep(5000);
	                break;
	                }
		
	         }
		 }
	  }
	
	public void selectSeleniumfourth() throws InterruptedException 
	{
		
		 {
	        WebElement dropdown=getDriver().findElement(By.xpath("/html/body/div[1]/div[2]/nav/div/div/ul/li[1]"));
	        dropdown.click();
	        Thread.sleep(3000);
	        for(WebElement element: selDropDown) 
	        {
	            if (element.getText().equals("Delete Customer Form")) 
	                {
	                System.out.println(element.getText());
	                element.click();
	                Thread.sleep(5000);
	                break;
	                }
		
	         }
		 }
	  }
	
	
	public void clickRadioBttn1() {
		radioBttn1.click();
	}
	
	public void clickRadioBttn3() {
		radioBttn3.click();
	}
	
	
	public void dragDropAction() throws InterruptedException {
		Actions act=new Actions(getDriver());
		act.dragAndDrop(From, To).build().perform();
		Thread.sleep(3000);
	}

	public void uploadFilesSendKeys() {
		uploadFile.sendKeys("C:\\Users\\jayibane\\Downloads\\fileuploadtest.docx");
		acceptTerm.click();
		submitBttn.click();
	}
	
	public void ConfirmationAlert() throws InterruptedException {
		getDriver().findElement(By.xpath("//input[@name='cusid']")).sendKeys("abcde");
		Thread.sleep(2000);
		getDriver().findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		//getDriver().findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
        Thread.sleep(3000);
           Alert confirmationAlert = getDriver().switchTo().alert();
           confirmationAlert.accept();
	}
	
	    public void getCookies() throws IOException {
	    	// create file named Cookies to store Login Information		
	        File file = new File("Cookies.data");
	        file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter BufferWrite = new BufferedWriter(fileWrite);
         // loop for getting the cookie information 		
            for(Cookie ck : getDriver().manage().getCookies())							
            {			
                BufferWrite.write(("Cookie Name:"+ck.getName()+";"+"Cookie Value:"+ck.getValue()+";"+"Cookie Domain:"+ck.getDomain()+";"+"Cookie Path:"+ck.getPath()));																									
                BufferWrite.newLine();             
            }			
            BufferWrite.close();			
            fileWrite.close();	
            Set<Cookie> beforeDel = getDriver().manage().getCookies();
            System.out.println("Cookie count before deletion:" + beforeDel.size());
        }
	    
	    public void delCookies() {
	    	getDriver().manage().deleteAllCookies();
	    	Set<Cookie> afterDel = getDriver().manage().getCookies();
	    	System.out.println("Cookie count after deletion: " + afterDel.size());
	    }

}




