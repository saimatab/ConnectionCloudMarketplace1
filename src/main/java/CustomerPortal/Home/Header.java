package CustomerPortal.Home;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Header {
	
public WebDriver driver;

public Header(WebDriver driver ) 
{
	// TODO Auto-generated constructor stub
	this.driver=driver;

}

//By SearchTab= By.id("main-search");
By SearchTab= By.xpath("//input[@id='main-search']");

By Menu = By.xpath("//div[@class='account-menu']");

By Menu_List=By.xpath("//div[@class='account-menu']//li");

By Notification=By.xpath("//div[@class='shopping-cart']//a");	

By notif =By.xpath("//a[contains(text(),'Notification Management')]");
By show7=By.xpath("//button[contains(text(),'Help')]");
By CustNotification=By.xpath("(//a[@class='top-link' and text()='Notifications'])[1]");

By Payment_Plan=By.xpath("//a[text()='Payment Method']");
By addPM=By.xpath("//a[@class='btn btn-primary payment-method-button' and text()='Add Payment Method']");

By notifsave=By.xpath("//a[contains(text(),'Save')]");
By notifcancel=By.xpath("//a[contains(text(),'Cancel')]");


//By AccountMenu=By.xpath("(//span[@class='account-title' and text()='My Account '])[1]");

By AccountMenu=By.xpath("(//span[@class='account-title'])[1]");
 By AccountmenuMgmt=By.xpath("//a[@class='clearfix']//span[@class='account-title'][contains(text(),'My Account')]");

By Logout=By.xpath("(//a[text()='Logout'])[1]");

//By MyProfile=By.xpath("//div[@class='account-menu']//a[text()='My Profile']");

By MyProfile=By.xpath("//div[@class='account-menu']//a[contains(text(),'My Profile')]");

//By ChangePassword=By.xpath("//div[@class='account-menu']//a[text()='Change Password']");

By ChangePassword=By.xpath("(//a[text()='Change Password'])[1]");

//By SetNotifications=By.xpath("//div[@class='account-menu']//a[text()='Set Notifications']");

By SetNotifications=By.xpath("(//a[text()='Set Notifications'])[1]");

//By Address=By.xpath("//div[@class='account-menu']//a[text()='Address Of Use']");


By Address=By.xpath("(//a[text()='Address of Use'])[1]");

//By Users=By.xpath("//div[@class='account-menu']//a[text()='Users']");

By Users=By.xpath("(//a[text()='User Management'])[1]");

By RecordList=By.xpath("//div[@class='product-list-grid clearfix grid']");

By Domain = By.xpath("(//a[text()='Manage Domains'])[1]");
By acctDomain = By.xpath("(//a[text()='Account Domains'])[1]");

By AccountSettings=By.xpath("(//a[text()='Account Settings'])[1]");

By AddressOfUse=By.xpath("(//a[text()='Address of Use'])[1]");

By Catalog_Restriction=By.xpath("(//a[text()='Catalog Restrictions'])[1]");

By bellicon=By.xpath("//div[@class='shopping-cart']//a");
By aou=By.xpath("//p[contains(text(),'756 Concho Ln Houston, TX, 77084, TX, 77084')]");
By noaccessback=By.xpath("//div[@class='shopping-cart checkout-cart-header']//a[contains(text(),'Back')]");


By executive=By.xpath("//a[contains(text(),'Account Executive')]");
By connlogo=By.xpath("//img[@id='ccm_logo_id']");

By actinfo=By.xpath("//div[@class='account-menu']//a[contains(text(),'Account Information')]");

By contus=By.xpath("//p[contains(text(),'Organization and Account Information is displayed')]//a[contains(text(),'Contact Us')]");

By contussub=By.xpath("//a[contains(text(),'Submit')]");
By getdescripcontactus=By.xpath("//textarea[@id='_requestDetail']");
//div[@class='shopping-cart checkout-cart-header']//a[contains(text(),'Back')]

public WebElement getnoaccessback()
{
	return driver.findElement(noaccessback);
}
public WebElement getdescripcontactus()
{
	return driver.findElement(getdescripcontactus);
}
public WebElement getnotifsave()
{
	return driver.findElement(notifsave);
}
public WebElement getaddPM()
{
	return driver.findElement(addPM);
}
public WebElement getnotifcancel()
{
	return driver.findElement(notifcancel);
}
public WebElement getcontus()
{
	return driver.findElement(contus);
}
public WebElement getcontussubmit()
{
	return driver.findElement(contussub);
}
public WebElement getexecutive()
{
	return driver.findElement(executive);
}
public WebElement getlogo()
{
	return driver.findElement(connlogo);
}


public WebElement getPayment_Plan()
{
	return driver.findElement(Payment_Plan);
}

public WebElement getnoAccessback()
{
	return driver.findElement(noaccessback);
}

public WebElement getCatalog_Restriction()
{
	return driver.findElement(Catalog_Restriction);
}
public WebElement flgnotif()
{
	return driver.findElement(show7);
}
public WebElement getAccountmenu_mgmt()
{
	return driver.findElement(AccountmenuMgmt);
}
public WebElement getAddressOfUse()
{
	return driver.findElement(AddressOfUse);
}

public WebElement getAccountSettings()
{
	return driver.findElement(AccountSettings);
}

public WebElement getDomain()
{
	return driver.findElement(Domain);
}
public WebElement getAcctDomain()
{
	return driver.findElement(acctDomain);
}
public WebElement getAcctinfo()
{
	return driver.findElement(actinfo);
}
public WebElement getRecordList()
{
	return driver.findElement(RecordList);
}

public WebElement getSearchTab()
{
	return driver.findElement(SearchTab);
}

public WebElement getCustNotification()
{
	return driver.findElement(CustNotification);
}

public WebElement getMenu_List()
{
	return driver.findElement(Menu_List);
}

public WebElement getMenu()
{
	return driver.findElement(Menu);
}


public WebElement getUsers()
{
	return driver.findElement(Users);
}

public WebElement getAddress()
{
	return driver.findElement(Address);
}


public WebElement getSetNotifications()
{
	return driver.findElement(SetNotifications);
}

public WebElement getChangePassword()
{
	return driver.findElement(ChangePassword);
}


public WebElement getMyProfile()
{
	return driver.findElement(MyProfile);
}

public WebElement getLogout()
{
	return driver.findElement(Logout);
}

public WebElement getAccountMenu()
{
	return driver.findElement(AccountMenu);
}

public WebElement getNotification()
{
	return driver.findElement(Notification);
}
public WebElement getNotification_mgmt()
{
	return driver.findElement(notif);
}
public void logout() throws IOException, InterruptedException
{	WebDriverWait wait;
	 wait = new WebDriverWait(driver, 120);
		Thread.sleep(7000);
//	 wait.until(ExpectedConditions.elementToBeClickable(getAccountmenu_mgmt()));
	 WebElement web=driver.findElement(By.xpath("//a[@class='clearfix']//span[@class='account-title'][contains(text(),'My Account')]"));
	
	 Actions actions = new Actions(driver);
		actions.moveToElement(web);
		actions.perform();	 
 Thread.sleep(20000);
getLogout().click();
Thread.sleep(10000);
}


public WebElement getBellIcon()
{
	return driver.findElement(bellicon);
	
}
public WebElement getAddressofUse()
{
	return driver.findElement(aou);
	
}
/*
public WebElement getReports()
{
	return driver.findElement(Reports);
}

public WebElement getCalendar()
{
	return driver.findElement(Calendar);
}

public WebElement getPAnalysisBtn()
{
	return driver.findElement(PAnalysisBtn);
}

public WebElement getOrderBtn()
{
	return driver.findElement(OrderBtn);
}
public WebElement getHeadLogo()
{
	return driver.findElement(HeadLogo);
}

public WebElement getlogoutLinkLink()
{
	return driver.findElement(logoutLink);
}


public WebElement getMyProfileLink()
{
	return driver.findElement(MyProfileLink);
}

public WebElement getMyAccountLink()
{
	return driver.findElement(MyAccountLink);
}

public WebElement getShippingAddressLink()
{
	return driver.findElement(ShippingAddressLink);
}
public WebElement getsearchbox()
{
	return driver.findElement(Searchbox);
}

public WebElement getCartIcon()
{
	return driver.findElement(CartIcon);
}

public WebElement getFavrtIcon()
{
	return driver.findElement(FavrtIcon);
}

public List<WebElement> getFavrtIconCount()
{
	return driver.findElements(FavrtIcon);
}



public WebElement getTrackBtn()
{
	return driver.findElement(TrackBtn);
}

public WebElement getLogo()
{
	return driver.findElement(Logo);
	
}

public WebElement getStanCatalogLink()
{
	return driver.findElement(StanCatalogLink);
	
}

public WebElement getAllProductLink()
{
	return driver.findElement(AllProductLink);
	
}


public WebElement getResources()
{
	return driver.findElement(Resources);
	
}

public WebElement getSpecialOffers()
{
	return driver.findElement(SpecialOffers);
	
}

public WebElement getBellIcon()
{
	return driver.findElement(bellicon);
	
}


public WebElement getInternationalIcon()
{
	return driver.findElement(InternationalIcon);
	
}


public WebElement getCommunityIcon()
{
	return driver.findElement(CommunityIcon);
	
}


public WebElement getHelpIcon()
{
	return driver.findElement(HelpIcon);
	
}


public WebElement getLegacyLink()
{
	return driver.findElement(LegacyLink);
	
}


public WebElement getManage()
{
	return driver.findElement(LegacyLink);
	
}


*/
}
