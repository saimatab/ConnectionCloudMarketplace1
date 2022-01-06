package CustomerPortal.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer {
	
	
	public WebDriver driver;

	public Footer(WebDriver driver ) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;

	}

		//By FootLogo = By.xpath("html/body/footer/section[1]/a/div/img[1]");
	By FootLogo = By.xpath("//img[@class='footer-logo']");
		
	By FShop=By.xpath("//html/body/footer/section[1]/div[2]/ul[1]/li[1]/h3/a");
  
	//By FTrack=By.xpath("//html/body/footer/section[1]/div[2]/ul[2]/li[1]/h3/a");
	//By FStandCatalog=By.xpath("//html/body/footer/section[1]/div[2]/ul[1]/li[2]/a");
	
	By FStandCatalog=By.linkText("Standards Catalog");
	
	By FStandCatalogFF=By.xpath("(//a[text()='Standards Catalog'])[3]");
	
	
	//By FAllPrdct=By.xpath("//html/body/footer/section[1]/div[2]/ul[1]/li[3]/a");
	
	By FAllPrdct=By.linkText("All Products");
	By FAllPrdctFF=By.xpath("(//a[text()='All Products'])[3]");
	
	//By FResources=By.xpath("//html/body/footer/section[1]/div[2]/ul[1]/li[4]/a");
	
	By FResources=By.linkText("Resources");
	
	By FResourcesFF=By.xpath("(//a[text()='Resources'])[3]");
	//By FSpecialOffers=By.xpath("//html/body/footer/section[1]/div[2]/ul[1]/li[5]/a");
	
	By FSpecialOffers=By.linkText("Special Offers");
	
	By FSpecialOffersFF=By.xpath("(//a[text()='Special Offers'])[2]");
	
	
	//By FFavorites=By.xpath("//html/body/footer/section[1]/div[2]/ul[1]/li[6]/a");
	
	By FFavorites=By.linkText("Favorites");
	
	By FFavoritesFF=By.xpath("(//a[text()='Favorites'])[3]");
	
	
	By FTrack=By.xpath("//html/body/footer/section[1]/div[2]/ul[2]/li[1]/h3/a");
	By FCalendar=By.xpath("//html/body/footer/section[1]/div[2]/ul[2]/li[2]/a");
	By FOrder=By.xpath("//html/body/footer/section[1]/div[2]/ul[2]/li[3]/a']");
	By FPurchaseAnalysis=By.xpath("//html/body/footer/section[1]/div[2]/ul[2]/li[4]/a");
	By FSavedReports=By.xpath("//html/body/footer/section[1]/div[2]/ul[2]/li[5]/a");
	By FAboutus=By.xpath("//html/body/footer/section[1]/div[2]/ul[3]/li[1]/a");
	By FContactUs=By.xpath("//html/body/footer/section[1]/div[2]/ul[3]/li[2]/a");
	By FCustomerSupport= By.xpath("//html/body/footer/section[1]/div[2]/ul[3]/li[3]/a");
	By FTerms=By.xpath("//html/body/footer/section[1]/div[2]/ul[3]/li[4]/a");
	By FPrivacyP=By.xpath("//html/body/footer/section[1]/div[2]/ul[3]/li[5]/a");
	By FHelp=By.xpath("html/body/footer/section[1]/div[2]/ul[3]/li[6]/a");
	By socialIcon=By.xpath("//p[contains(text(),'© 2020 Connection Cloud MarkITplace')]");
    By marketplace=By.xpath("//div[@class='footer-top-right clearfix']//a[contains(text(),'Marketplace')]");
    
    By marketplace1=By.xpath("//div[@class='footer-top-left']//a//img");
    By getdiscover=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Discover')]");
    By getapps=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Applications')]");
    By getinfrastruc=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Infrastructure')]");
    By getplat=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Platforms')]");
    By getconsulting=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Consulting')]");
    By getmanage=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'MANAGE')]");
    By getsubscriptions=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Subscriptions')]");
    By getusage=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Usage')]");
    By getcalender=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Calendar')]");
    By getinsight=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Insights')]");
    
    By getspendana=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Spend Analysis')]");
    By getauditlog=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Audit Log')]");
    By getorders=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Orders')]");
    By getsignedagreement=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Signed Agreement')]");
    By getsubscription=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Subscriptions')]");
    By getbilllines=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Bill Lines')]");
    By getbills=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Bills')]");
    
    By getabtccm=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='two-col-mobile col-sm-3 col-xs-3 clearfix']//a[contains(text(),'About CCM')]");
    By getabtconn=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='two-col-mobile col-sm-3 col-xs-3 clearfix']//a[contains(text(),'About Connection')]");
    By getcontact=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='two-col-mobile col-sm-3 col-xs-3 clearfix']//a[contains(text(),'Contact Us')]");
    By gettermsofuse=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='two-col-mobile col-sm-3 col-xs-3 clearfix']//a[contains(text(),'Terms of Use')]");
    By getprivacypolicy=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='two-col-mobile col-sm-3 col-xs-3 clearfix']//a[contains(text(),'Privacy Policy')]");
    By getaccess=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='two-col-mobile col-sm-3 col-xs-3 clearfix']//a[contains(text(),'Accessibility')]");
    By gethelp=By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='two-col-mobile col-sm-3 col-xs-3 clearfix']//a[contains(text(),'Help')]");
  

	public WebElement gethelp()
	{
		return driver.findElement(gethelp);
	}

	public WebElement getaccess()
	{
		return driver.findElement(getaccess);
	}

	public WebElement getprivacypolicy()
	{
		return driver.findElement(getprivacypolicy);
	}
    

	public WebElement gettermsofuse()
	{
		return driver.findElement(gettermsofuse);
	}

	
	public WebElement getcontact()
	{
		return driver.findElement(getcontact);
	}

	public WebElement getabtccm()
	{
		return driver.findElement(getabtccm);
	}
    
	public WebElement getabtconn()
	{
		return driver.findElement(getabtconn);
	}
	  
    
	public WebElement getbills()
	{
		return driver.findElement(getbills);
	}
    
	public WebElement getbilllines()
	{
		return driver.findElement(getbilllines);
	}
	
	
	public WebElement getsignedagreement()
	{
		return driver.findElement(getsignedagreement);
	}
	
	
	public WebElement getorders()
	{
		return driver.findElement(getorders);
	}
	
	
	public WebElement getauditlog()
	{
		return driver.findElement(getauditlog);
	}
	
	public WebElement getspendana()
	{
		return driver.findElement(getspendana);
	}
    
    
    
	public WebElement getFStandCatalogFF()
	{
		return driver.findElement(FStandCatalogFF);
	}
	


	public WebElement getdiscover()
	{
		return driver.findElement(getdiscover);
	}
	public WebElement getapps()
	{
		return driver.findElement(getapps);
	}
	public WebElement getinfrastruc()
	{
		return driver.findElement(getinfrastruc);
	}
	public WebElement getmarketplace()
	{
		return driver.findElement(marketplace);
	}
	public WebElement getmarketplace1()
	{
		return driver.findElement(marketplace1);
	}
	public WebElement getplatform()
	{
		return driver.findElement(getplat);
	}
	public WebElement getcosulting()
	{
		return driver.findElement(getconsulting);
	}
	public WebElement getmanage()
	{
		return driver.findElement(getmanage);
	}
	public WebElement getsubscriptions()
	{
		return driver.findElement(getsubscriptions);
	}
	
	public WebElement getusage()
	{
		return driver.findElement(getusage);
	}
	public WebElement getcalender()
	{
		return driver.findElement(getcalender);
	}
	public WebElement getinsights()
	{
		return driver.findElement(getinsight);
	}
	
	public WebElement getconsulting()
	{
		return driver.findElement(getconsulting);
	}
	
	
	
	public WebElement getFAllPrdctFF()
	{
		return driver.findElement(FAllPrdctFF);
	}
	public WebElement getsocialIcon()
	{
		return driver.findElement(socialIcon);
	}
	
	public WebElement getFResourcesFF()
	{
		return driver.findElement(FResourcesFF);
	}
	
	public WebElement getFSpecialOffersFF()
	{
		return driver.findElement(FSpecialOffersFF);
	}
	
	public WebElement getFFavoritesFF()
	{
		return driver.findElement(FFavoritesFF);
	}
	

	public WebElement getFootLogo()
	{
		return driver.findElement(FootLogo);
	}


	public WebElement getFStandCatalog()
	{
		return driver.findElement(FStandCatalog);
	}

	public WebElement getFAllPrdct()
	{
		return driver.findElement(FAllPrdct);
	}

	public WebElement getFResources()
	{
		return driver.findElement(FResources);
	}

	public WebElement getFSpecialOffers()
	{
		return driver.findElement(FSpecialOffers);
	}

	public WebElement getFFavorites()
	{
		return driver.findElement(FFavorites);
		
	}

	public WebElement getFTrack()
	{
		return driver.findElement(FTrack);
		
	}

	public WebElement getFCalendar()
	{
		return driver.findElement(FCalendar);
		
	}


	public WebElement getFOrder()
	{
		return driver.findElement(FOrder);
		
	}

	public WebElement getFPurchaseAnalysis()
	{
		return driver.findElement(FPurchaseAnalysis);
		
	}

	public WebElement getFSavedReports()
	{
		return driver.findElement(FSavedReports);
		
	}


	public WebElement getFAboutus()
	{
		return driver.findElement(FAboutus);
		
	}


	public WebElement getFContactUs()
	{
		return driver.findElement(FContactUs);
		
	}


	public WebElement getFCustomerSupport()
	{
		return driver.findElement(FCustomerSupport);
		
	}


	public WebElement getFTerms()
	{
		return driver.findElement(FTerms);
		
	}

	
	public WebElement getFPrivacyP()
	{
		return driver.findElement(FPrivacyP);
		
	}
	
	
	
	
	public WebElement getFHelp()
	{
		return driver.findElement(FHelp);
	}

}
