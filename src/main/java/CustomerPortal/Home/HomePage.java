package CustomerPortal.Home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
public WebDriver driver;

By DFP_Banner = By.xpath("//section[@class='featured-ads container clearfix']");
	By Application_Link=By.xpath("//a[@class='top-link' and text()='Applications']");
	By Infrastructure_Link=By.xpath("//a[@class='top-link' and text()='Infrastructure']");
	By Platform_Link=By.xpath("//a[@class='top-link' and text()='Platforms']");
	By Service_Link=By.xpath("//a[@class='top-link' and text()='Service Discovery']");
	By header=By.xpath("//div[@class='top-shadow-container']");
	By Manage_Link=By.xpath("//a[@class='track   ' and text()='Manage']");
	
	By Manage=By.xpath("//body/nav[3]/div[1]/div[1]/a[2]");

	By Manage_Link1=By.xpath("//a[@class='track  active ' and text()='Manage']");
	//By Insight_Link=By.xpath("//a[(@class,'insights')]");
	
	By Insight_Link=By.xpath("//a[@class='insights ']");
	By MarketPlace_Link=By.xpath("//a[text()='Marketplace']");
	By CustomersTab=By.xpath("//a[@class='shop ' and text()='Customers']");
	By CatalogTab=By.xpath("//a[@class='track ' and text()='Catalog']");
	By FullfillmentTab=By.xpath("//a[@class='insights ' and text()='FULFILLMENT']");
	By ReportsTab=By.xpath("//a[@class='reports ' and text()='Reports']");
	By UsersTab=By.xpath("//a[@class='users ' and text()='SETUP']");
	By Main_Search=By.xpath("//input[@id='main-search']");
	By Consulting=By.xpath("//a[@class='top-link' and text()='Consulting']");
	By Discover=By.xpath("//a[@class='top-link' and text()='Discover']");
	By Discover1=By.xpath("//body/nav[4]/div[2]/ul[1]/li[1]/a[1]");
	
	
	By FAccount = By.xpath("(//a[text()='Accounts'])[3]");
	By FSubs = By.xpath("(//a[text()='Subscriptions'])[3]");
	By FooterLogo = By.xpath("//img[@class='footer-logo']");
	By Domain = By.xpath("(//a[@class='top-link' and text()='Domains'])[1]");
	//By Domain0=By.xpath("//li[@class='top-item']//a[@class='top-link'][contains(text(),'Domains')]");
	
	//By Domain1=By.xpath("//li[@class='top-item active']//a[@class='top-link'][contains(text(),'Domains')]");
	By Featured_Services=By.xpath("//h1[text()='Featured Services']");
	By ShopSection=By.xpath("//h1[text()='Shop by Vendor']");
	By ServiceSection=By.xpath("//h1[text()='My Recent Subscriptions']");
	By P_GetBtn=By.xpath("//a[@class='btn btn-primary btn-to-cart show-for-tablet modal-btn hide-for-print']");
	By GetBtn=By.xpath("(//a[@tabindex='0' and text()='Get it Now'])[3]");
	By Service_type=By.xpath("//span[@class='selection']");
	By Products=By.xpath("//a[@alt='product-detail']");
	By connLogo=By.xpath("//img[@id='ccm_logo_id']");
	By connLogo1=By.xpath("//img[@class='ccp-logo']");
	
	
    By  globalSearch =By.xpath("//input[@id='main-search']");
    By acctinitials=By.xpath("//div[@class='menu-account']//span[@class='acount-intials']");
    
  //div[@class='menu-account']//span[@class='acount-intials'][contains(text(),'ST')]
    By acctnamemarkplace=By.xpath("//span[@class='header-account-name']");
  //h2[contains(text(),'CSP Power BI Premium P1 Monthly')]
    
	By prod1name=By.xpath(" //h2[contains(text(),'CSP Power BI Premium P1 Monthly')]");
	By RecentlyViewed = By.xpath("//div[@class='list-item-container clearfix']//article");
	By getnow = By.xpath("//a[@class='btn btn-primary' and text()='Get it Now']");
	By getnow1 = By.xpath("//a[@class='btn btn-primary' and text()='Get it Now'][1]");
	By Marketplacetabselected = By.xpath("//a[@class='shop active']");
	By countgetnow = By.xpath("//a[@class='btn btn-primary' and text()='Get it Now']");
	By countmanagebtn= By.xpath("//a[@class='btn btn-primary btngreen' and text()='Manage']");
	By getsearchgetitnow= By.xpath("//a[@class='btn btn-primary' and text()='Get it Now']");
	By companalysis= By.xpath("//a[@class='btn btn-primary' and text()='Get it Now']");
	

	//a[@class='shop active']
	public List<WebElement> getrecentlyviewcount()
	{
		return driver.findElements(RecentlyViewed);
	}
	
	public WebElement getMplacetabselected()
	{
		return driver.findElement(Marketplacetabselected);
	}
	
	public List<WebElement> countGetnowbtn()
	{
		

		return driver.findElements(countgetnow);
	}
	public List<WebElement> countmanagebtn()
	{

		return driver.findElements(countmanagebtn);
	}
	public WebElement getnowtbn()
	{
		return driver.findElement(getnow);
	}
	public WebElement getnowtbn1()
	{
		return driver.findElement(getnow1);
	}
	
	public WebElement getprodname()
	{
		return driver.findElement(prod1name);
	}
	public WebElement getRecentlyViewed()
	{
		return driver.findElement(RecentlyViewed);
		
	}
    public List<WebElement> getProducts()
	{
		return driver.findElements(Products);
	}
	public WebElement getglobalSearch()
	{
		return driver.findElement(globalSearch);
	}
	public WebElement getacctinitials()
	{
		return driver.findElement(acctinitials);
	}
	public WebElement getconn_logo()
	{
		return driver.findElement(connLogo);
	}
	public WebElement getconn_logo1()
	{
		return driver.findElement(connLogo1);
	}
	
	public WebElement getService_type()
	{
		return driver.findElement(Service_type);
	}
	
	public WebElement getP_GetBtn()
	{
		return driver.findElement(P_GetBtn);
	}
	
	public WebElement getBtn()
	{
		return driver.findElement(GetBtn);
	}
	public WebElement getManage_Link1()
	{
		return driver.findElement(Manage_Link1);
	}
	public WebElement getsearchgetitnow()
	{
		return driver.findElement(getsearchgetitnow);
	}
	public WebElement getServiceSection()
	{
		return driver.findElement(ServiceSection);
	}
	
	public WebElement getShopSection()
	{
		return driver.findElement(ShopSection);
	}
	
	public WebElement getFeatured_Services()
	{
		return driver.findElement(Featured_Services);
	}
	public WebElement getDFP_Banner()
	{
		return driver.findElement(DFP_Banner);
	}
	

	public WebElement getDomain()
	{
		return driver.findElement(Domain);
	}
	
	public WebElement getFooterLogo()
	{
		return driver.findElement(FooterLogo);
	}
	public WebElement getFSubs()
	{
		return driver.findElement(FSubs);
	}
	
	public WebElement getFAccount()
	{
		return driver.findElement(FAccount);
	}
	
	public WebElement getDiscover()
	{
		return driver.findElement(Discover);
	}
	public WebElement getDiscover1()
	{
		return driver.findElement(Discover1);
	}
	public WebElement getConsulting()
	{
		return driver.findElement(Consulting);
	}
	
	public WebElement getMain_Search()
	{
		return driver.findElement(Main_Search);
	}
	
	public WebElement getUsersTab()
	{
		return driver.findElement(UsersTab);
	}
	
	public WebElement getReportsTab()
	{
		return driver.findElement(ReportsTab);
	}
	
	public WebElement getFullfillmentTab()
	{
		return driver.findElement(FullfillmentTab);
	}
	
	public WebElement getCatalogTab()
	{
		return driver.findElement(CatalogTab);
	}
	
	public WebElement getCustomersTab()
	{
		return driver.findElement(CustomersTab);
	}
	
	
	public WebElement getInsight_Link()
	{
		return driver.findElement(Insight_Link);
	}
	
	public WebElement getManage_Link()
	{
		return driver.findElement(Manage_Link);
		
	}
	public WebElement getman()
	{
		return driver.findElement(Manage);
		
	}
	
	public WebElement getMarketPlace_Link()
	{
		return driver.findElement(MarketPlace_Link);
		
	}
	public WebElement getMarketplaceaccountname()
	{
		return driver.findElement(acctnamemarkplace);
		
	}



	
	public WebElement getheader()
	{
		return driver.findElement(header);
		
	}

	
	
	public WebElement getApplication_Link()
	{
		return driver.findElement(Application_Link);
		
	}

	public HomePage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getInfrastructure_Link()
	{
		return driver.findElement(Infrastructure_Link);
	}
	
	public WebElement getPlatform_Link()
	{
		return driver.findElement(Platform_Link);
	}
	
	public WebElement getService_Link()
	{
		return driver.findElement(Service_Link);
	}


}
