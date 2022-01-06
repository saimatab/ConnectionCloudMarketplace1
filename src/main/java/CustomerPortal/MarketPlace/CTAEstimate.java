package CustomerPortal.MarketPlace;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CTAEstimate {
	
	public WebDriver driver ;
	//public Select Se1;
	
	WebDriverWait wait;
	public CTAEstimate(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
    By marketplacelink=By.xpath("//span[@class='back-link' and text()='Back to Marketplace']");
	By getnow=By.xpath("//a[@class='add_to_cart btn btn-primary show-for-tablet modal-btn hide-for-print']");
	By createestimate=By.xpath("//a[@class='btn btn-primary btn-to-cart modal-btn hide-for-print']");
	
	By contactus=By.xpath("//div[@class='cost-calculator']//a[contains(text(),'Contact Us')]");
	By ctapopupheading=By.xpath("//h2[contains(text(),'Create Estimate')]");
	By ctapopupuname=By.xpath("//p[contains(text(),'saima2025 saima2025')]");
	By ctapopupemail=By.xpath("//p[contains(text(),'saima.tabassum+2025@arpatech.com')]");
	
	By ctapopupsearchtext=By.id("searchedText");
	By ctapopupsearchbyemailuser=By.xpath("//label[contains(text(),'saima tabassum, saima.tabassum+310@arpatech.com,User')]");
	By ctapopupsearchbyfirstnameadmin=By.xpath("//label[contains(text(),'saima2025 saima20251, saima.tabassum+2025@arpatech.com,Admin')]");
	By ctapopupsearchbylastnameadmin=By.xpath("//label[contains(text(),'saima tabassum, saima.tabassum+2025@arpatech.com,Admin')]");
	By ctapopupsearchbyuser=By.xpath("//label[contains(text(),'saima2025 saima20251, saima.tabassum+2025@arpatech.com,Admin')]");
	By alertmsg=By.xpath("//span[@class='alert-msg']"); //This change will invalidate any prior Estimates.

	By ctaorgnamel=By.xpath("//div[@class='half-box half-box-left']//p[1]");
	By SendBtnEmailpop=By.xpath("//button[@class='btn btn-primary'][contains(text(),'Send')]");
	By cancelBtnEmailpop=By.xpath("//button[@class='btn btn-secondary'][contains(text(),'Cancel')]");
	//div[@class='white-popup popup-small zoom-anim-dialog mfp-show schedule-report-modal clearfix']//div//button[@class='btn btn-secondary'][contains(text(),'Cancel')]
	By emailpopuplabelEstimate=By.xpath("//div[@class='white-popup popup-small zoom-anim-dialog mfp-show schedule-report-modal clearfix']//div//h2[contains(text(),'Estimate Document')]");
			
			
			
	By ctaactname=By.xpath("//div[@class='half-box half-box-left']//p[2]");
	By ctaAddressofuse=By.xpath("//div[@class='half-box half-box-right']//p[1]");
	By ctaAddressofuse1=By.xpath("//div[@class='half-box half-box-right']//p[3]");
	By ctausername=By.xpath("//div[@class='half-box half-box-left notes-ht']//p[1]");
	By ctauseremail=By.xpath("//div[@class='half-box half-box-left notes-ht']//p[2]");
	
	By ctanote=By.xpath("//div[@class='half-box half-box-right notes-ht']//p[2]");
	By ctasubmit=By.xpath("//a[@class='btn btn-primary btn-to-cart modal-btn hide-for-print' and text()='Submit']");
	
	By prodlogo=By.xpath("//a[@class='image-link']//img");

	
	By prodname1=By.xpath("//div[@class='invoice-detail-box']//div[@class='cart-item-container']//h2[contains(text(),'Corp. CSP Power BI Pro')]");
			By prodname2=By.xpath("//div[@class='invoice-detail-box']//div[@class='cart-item-container']//span[contains(text(),'Microsoft CSP')]");
	
					By prodname3=By.xpath("//div[@class='invoice-detail-box']//div[@class='cart-item-container']//span[contains(text(),'SKU ID: 33701663')]");
	
	
					By prodqty=By.xpath("//div[@class='invoice-detail-box']//div[@class='cart-item-container']//div[@class='col-sm-1 col-print-1 col-tprice show-for-tablet']//p[@class='price']//label[contains(text(),'1')]");
					By prodprice=By.xpath("//div[@class='invoice-detail-box']//div[@class='cart-item-container']//div[@class='col-sm-3 col-print-3 col-tprice show-for-tablet']//label[contains(text(),'$8.98')]");
					
					By prodpricesubtotal=By.xpath("//div[@class='invoice-detail-box']//div[@class='cart-item-container']//div[@class='col-sm-2 col-print-2 col-tprice show-for-tablet']//label[contains(text(),'$8.98')]");
						
				By subtotalsummary=By.xpath("//div[@class='invoice-detail-box']//p[@class='subtotal-text']//span[@class='padding-summary'][contains(text(),'$8.98')]");
				By taxsummary=By.xpath("//div[@class='invoice-detail-box']//p[@class='tax-text']//span[@class='padding-summary'][contains(text(),'$0.00')]");
				By shiptotal=By.xpath("//div[@class='invoice-detail-box']//p[@class='shipment-total']//span[@class='padding-summary'][contains(text(),'$8.98')]");
				By  costcalcontactus=By.xpath("//div[@class='cost-calculator']//a[contains(text(),'Contact Us')]");
				
				By  changeqty=By.xpath("//input[@name='productQty']");
				By viewEstimates =By.xpath("//a[@class='action-icon icon-estimates']//a[contains(text(),'View Estimate')]");
						
						//a[@class='action-icon icon-estimates']
						//div[@class='cost-calculator']//a[contains(text(),'Contact Us')]
				
						//span[@class='padding-summary'][contains(text(),'$8.98')]
				
				public void validateEmail() throws IOException, InterruptedException
				{

					Actions ab =new Actions(driver);
					 Thread.sleep(5000);
					ab.click(driver.findElement(By.xpath("//a[@class='action-icon icon-mail']"))).release().perform();
				
					 Thread.sleep(5000);

					WebElement download=driver.findElement(By.xpath("//div[@class='modal-mask']"));

					WebElement temp=download.findElement(By.xpath("(//div[@class='modal-content'])[4]//input[@type='text' and @name='email_addresses']"));

					temp.sendKeys("ffhhffh@k.com");
				
					
					
					
				}
				public void ctapopupsearching(String text, String[] Dropdown)
				
				{
					  int cnt=0;
					
					 driver.findElement(ctapopupsearchtext).sendKeys(text);
					 
					 
					 WebElement menu =  driver.findElement(By.xpath("//div[@id='marketplace-content']//div[@id='pdp-main-wrapper']//div[@class='modal-content']//div[@class='refine-section-content']"));
				
					    List<WebElement> elems = menu.findElements(By.tagName("li"));
					      for (WebElement ddlList : elems)
					      {
					     	Assert.assertEquals(ddlList.getText().trim(), Dropdown[cnt],"The Options appearing are not same as expected");
					      		cnt++;	

					          }
			       }
					
					public void ctadisclaimerestimates()
					{
						Actions action = new Actions(driver);
						WebElement we =driver.findElement(By.xpath("//img[@class='tooltip_img']"));
						action.moveToElement(we).perform();		
						
						  WebElement toolTipElement = driver.findElement(By.xpath("//div[@class='tooltip tt-text']"));
						    String toolTipText = toolTipElement.getText();
						    System.out.println(toolTipText);
						    //text for quote details dummynotimpelenetned
					}	
					
					
					public WebElement ctapopupcheck()
	{
		return driver.findElement(ctapopupsearchbylastnameadmin);
		
	}
					
	
	public void ctapopupvalidation()
	{
		 driver.findElement(ctapopupheading).getText();
		
	}
	public void visibilityofAlert(String text) throws IOException, InterruptedException
	{	
		wait = new WebDriverWait(driver, 180);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(alertmsg));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(alertmsg, text));
		Thread.sleep(5000);
	
	}
		public WebElement getmplink()
	{
		return driver.findElement(marketplacelink);
		
	}
	
		public WebElement getnow()
		{
			return driver.findElement(getnow);
		}
	

		public WebElement createEstimate()
		{
			return driver.findElement(createestimate);
		}
	

		public WebElement contactus()
		{
			return driver.findElement(contactus);
		}
	
	
		public WebElement cancel()
		{
			return driver.findElement(cancelBtnEmailpop);
		}
		public WebElement getctanote()
		{
			return driver.findElement(ctanote);
		}
		public WebElement getctasubmit()
		{
			return driver.findElement(ctasubmit);
		}
	
}
