package CustomerPortal.MarketPlace;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class PDPCCM {
	
	public WebDriver driver ;
	//public Select Se1;
	
	
	public PDPCCM(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	By emaillink = By.xpath("//a[@class='action-icon icon-mail']");
	By emailbox =By.xpath("//input[@name='email_addresses']");
	By SendBtn=By.xpath("//button[contains(text(),'Send')]");
	By emailpopup=By.xpath("//div[@class='white-popup popup-small zoom-anim-dialog mfp-show email-modal']");
    By marketplacelink=By.xpath("//span[@class='back-link' and text()='Back to Marketplace']");
	By getnow=By.xpath("//a[@class='add_to_cart btn btn-primary show-for-tablet modal-btn hide-for-print']");
	By getnow1=By.xpath("//a[@class='btn btn-primary hide-for-print']");
	By createestimate=By.xpath("//a[@class='btn btn-to-cart modal-btn hide-for-print']");
	
	By contactus=By.xpath("//div[@class='cost-calculator']//a[contains(text(),'Contact Us')]");
	By ctapopupheading=By.xpath("//h2[contains(text(),'Create Estimate')]");
	By ctapopupuname=By.xpath("//p[contains(text(),'saima2025 saima2025')]");
	By ctapopupemail=By.xpath("//p[contains(text(),'saima.tabassum+2025@arpatech.com')]");
	
	By ctapopupsearchtext=By.id("searchedText");
	By ctapopupsearchbyemailuser=By.xpath("//label[contains(text(),'saima tabassum, saima.tabassum+310@arpatech.com,User')]");
	By ctapopupsearchbyfirstnameadmin=By.xpath("//label[contains(text(),'saima2025 saima20251, saima.tabassum+2025@arpatech.com,Admin')]");
	By ctapopupsearchbylastnameadmin=By.xpath("//span[@class='control__indicator']");
	By ctapopupsearchbyuser=By.xpath("//label[contains(text(),'saima2025 saima20251, saima.tabassum+2025@arpatech.com,Admin')]");
	
 //$x("//div[@id='marketplace-content']//div[@id='pdp-main-wrapper']//div[@class='modal-content']//input[@id='searchedText']")
	//$x("//div[@id='marketplace-content']//div[@id='pdp-main-wrapper']//div[@class='modal-content']//div[@class='refine-section-content']//li[1]")	public void ctapopupsearchtext(String text)
	 By ctapopupcancel=By.xpath("//button[contains(text(),'Cancel')]");
	 By ctapopupcont=By.xpath("//button[contains(text(),'Continue')]");
		
	//By APCRow=By.xpath("(//span[@class='control__indicator'])[1]");
		//By row=By.xpath("//label[contains(text(),'APPLE')]");
	 By prodQty=By.xpath("//input[@name='productQty']");
	 By submitorder=By.xpath("//a[contains(text(),'Submit Order')]");
	 By pdf=By.xpath("//img[@class='pdf_download']");
	 By createestimate1=By.xpath("//a[@class='btn' and @id='estimates']");
	 By viewestimate=By.xpath("//a[@class='action-icon icon-estimates']");
	By priorestinvalid=By.xpath("//span[contains(text(),'This change will invalidate any prior Estimates.')]"); 
		
	
	
	 By us=By.xpath("//a[@id='updateSubscription']");
	 By cu=By.xpath("//button[contains(text(),'Cancel Update')]");
	By contup=By.xpath("//button[contains(text(),'Continue with Update')]"); 
		
	
	
	
	public WebElement updatesub()
	{
		 return driver.findElement(us);
		
	}
	
	
	public WebElement cancelupdate()
	{
		 return driver.findElement(cu);
		
	}
	
	public WebElement contupdate()
	{
		 return driver.findElement(contup);
		
	}
	//a[@class='action-icon icon-estimates']
	 
	public void ctapopupsearching(String text, String[] Dropdown) throws IOException, InterruptedException , ClassNotFoundException
	
	{
		  int cnt=0;
		
			Actions action =new Actions(driver);
			
			 driver.findElement(ctapopupsearchtext).sendKeys(Keys.CONTROL,"a");
			Thread.sleep(3000);
			 driver.findElement(ctapopupsearchtext).sendKeys(Keys.DELETE);
			Thread.sleep(3000);
	
		  
		  
		  
		 driver.findElement(ctapopupsearchtext).sendKeys(text);
		 
		 
		 WebElement menu =  driver.findElement(By.xpath("//div[@id='marketplace-content']//div[@id='pdp-main-wrapper']//div[@class='modal-content']//div[@class='refine-section-content']"));
	
		    List<WebElement> elems = menu.findElements(By.tagName("li"));
		      for (WebElement ddlList : elems)
		      {
		     	Assert.assertEquals(ddlList.getText().trim(), Dropdown[cnt],"The Options appearing are not same as expected");
		      		cnt++;	

		          }
       }
		
	
	
	
	
	public WebElement ctapopupcancel()
	{
		 return driver.findElement(ctapopupcancel);
		
	}
	public WebElement ctasubmitorder()
	{
		 return driver.findElement(submitorder);
		
	}
	public WebElement ctapdf()
	{
		 return driver.findElement(pdf);
		
	}
	public WebElement ctaviewestimate()
	{
		 return driver.findElement(viewestimate);
		
	}
	public WebElement ctaprodQty()
	{
		 return driver.findElement(prodQty);
		
	}
	
	public WebElement ctapopupcheck()
	{
		return driver.findElement(ctapopupsearchbylastnameadmin);
		
	}
	public WebElement ctapopupcontinue()
	{
		 return driver.findElement(ctapopupcont);
		
	}
	
	public void ctapopupvalidation()
	{
		 driver.findElement(ctapopupheading).getText();
		
	}
	
		public WebElement getmplink()
	{
		return driver.findElement(marketplacelink);
		
	}
	
		public WebElement getnow()
		{
			return driver.findElement(getnow);
		}
	
		public WebElement getnow1()
		{
			return driver.findElement(getnow1);
		}
	
		public WebElement createEstimate()
		{
			return driver.findElement(createestimate);
		}
		public WebElement createEstimate1()
		{
			return driver.findElement(createestimate1);
		}

		public WebElement contactus()
		{
			return driver.findElement(contactus);
		}
	
		public WebElement getemaillink()
		{
			return driver.findElement(emaillink);
		}
		public WebElement getemailpopup()
		{
			return driver.findElement(emailpopup);
		}
		
		public WebElement getSendBtn()
		{
			return driver.findElement(SendBtn);
		}
		public WebElement getemailbox()
		{
			return driver.findElement(emailbox);
		}
	
	
		public WebElement getctainvalidatepriorestimate()
		{
			return driver.findElement(priorestinvalid);
		}
	
	
}
