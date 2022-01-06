package tests;
import java.io.FileInputStream;
import org.openqa.selenium.JavascriptExecutor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;	
import java.util.Properties;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CustomerPortal.Home.AccountSetting;
import CustomerPortal.Home.Address;
import ManagementPortal.Catalog.Catalog;
import  CustomerPortal.Home.ChangePassword;
import CustomerPortal.Home.CommonFunctions;
import ManagementPortal.Customers.Customer;
import CustomerPortal.Home.Domains;
import CustomerPortal.Home.EditProfilePage;
import CustomerPortal.Home.ForgetPswdPage;
import CustomerPortal.Home.Header;
import CustomerPortal.Home.HomePage;
import CustomerPortal.Insights.Insight;
import CustomerPortal.Insights.Reports.auditlog;
import CustomerPortal.Insights.Reports.billine;
import CustomerPortal.Insights.Reports.bills;
import CustomerPortal.Insights.Reports.orders;
import CustomerPortal.Insights.Reports.signedagreements;
import CustomerPortal.Insights.Reports.subscriptions;
import CustomerPortal.Home.LoginPage;
import CustomerPortal.Manage.Manage;
import CustomerPortal.Manage.Calender.Calendar;
import CustomerPortal.Manage.Subscriptions.Subscriptions;
import CustomerPortal.MarketPlace.CTAEstimate;
import CustomerPortal.MarketPlace.PDPCCM;
import CustomerPortal.MarketPlace.Payment;
import CustomerPortal.MarketPlace.Procurement;
import CustomerPortal.MarketPlace.Applications.Applications;
import CustomerPortal.MarketPlace.Discover.Discover;
import CustomerPortal.Home.MyProfilePage;
import CustomerPortal.Home.Footer;
import CustomerPortal.Home.NotificationPage;
import ManagementPortal.Catalog.Providers.Provider;
import CustomerPortal.Home.RegisterationPage;
import CustomerPortal.Home.Role;
import CustomerPortal.Home.SearchResult;
import CustomerPortal.Home.Users;
import resources.base;
import tests.LatestRegressionSuite_2;

public class LatestRegressionSuite_6 extends base  {

	public HomePage hp;
	public Header hd;
	public CommonFunctions cf;
	public Users us;
	public RegisterationPage rp;
	SearchResult srp;
	public WebDriver driver;
	WebDriverWait wait;
	FileInputStream fis;
	String url_cust;
	LoginPage lp;
	public  Properties prop;
	String a ;
	Footer ft ;
	HomePage hm;
	PDPCCM pp;
	Procurement pr;
	Subscriptions sr;
	Discover  dc;
	Applications ap;
	Manage mn;
	CTAEstimate es;
	Calendar cl;
	Insight in;
	bills bill;
	auditlog al;
	billine bline;
	orders or;
	signedagreements  sagree;
	subscriptions sub;
	MyProfilePage mpp;
	Payment pay;
	ChangePassword cp;

public LatestRegressionSuite_6() throws IOException, InterruptedException , ClassNotFoundException, SQLException {

		prop=new Properties();
		fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		//driver = initializeDriver();
		driver=getdriver();
		lp= new LoginPage(driver);
		us= new Users(driver);
		cf= new CommonFunctions(driver);
		rp=new RegisterationPage(driver);
	    pr = new Procurement(driver);
		hd=new Header(driver);
		srp=new SearchResult(driver);
		rp=new RegisterationPage(driver);
		hm = new HomePage(driver);
		ft=new Footer(driver);
		pp=new PDPCCM(driver);
		sr=new Subscriptions(driver);
		ap=new Applications(driver);
		mn=new Manage(driver);
	    es=new CTAEstimate(driver);
	    cl=new Calendar(driver);
	    in=new Insight(driver);
	    bill=new bills(driver);
	    pay=new Payment(driver);

 cp = new ChangePassword(driver);
	
		 al=new auditlog(driver);
		 bline=new billine(driver);;
		 or=new orders(driver);
		 sagree=new signedagreements(driver);
		 sub=new subscriptions(driver);
	    
		 mpp=new MyProfilePage(driver);
	    
	    
	}

@Parameters({"username3","pswd3","url","dburl","dbun","dbpswd"})
@Test(priority = 50, enabled =true)
public void Validate_acctettings_52(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
try {	
	prop=new Properties();
	fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	//driver = initializeDriver();
	driver=getdriver();
	lp= new LoginPage(driver);
	us= new Users(driver);
	cf= new CommonFunctions(driver);
	rp=new RegisterationPage(driver);
    pr = new Procurement(driver);
	hd=new Header(driver);
	srp=new SearchResult(driver);
	rp=new RegisterationPage(driver);
	hm = new HomePage(driver);
	ft=new Footer(driver);
	pp=new PDPCCM(driver);
	sr=new Subscriptions(driver);
	ap=new Applications(driver);
	mn=new Manage(driver);
    es=new CTAEstimate(driver);
    cl=new Calendar(driver);
    in=new Insight(driver);
    bill=new bills(driver);
    pay=new Payment(driver);

cp = new ChangePassword(driver);

	 al=new auditlog(driver);
	 bline=new billine(driver);;
	 or=new orders(driver);
	 sagree=new signedagreements(driver);
	 sub=new subscriptions(driver);
    
	 mpp=new MyProfilePage(driver);
    
	
	
	
	wait = new WebDriverWait(driver, 120);
	Thread.sleep(2000);
	
	
	
driver.get(url);
	lp.getusername().sendKeys(username);
	
	lp.getpassword().sendKeys(pswd);
	lp.getloginbtn().click();
	
	Thread.sleep(5000);
	String email11=username;
	String query = "select two_factor_code from users where email='" +email11+  "';";	            
	Class.forName("com.mysql.jdbc.Driver");				
	Connection con = DriverManager.getConnection(dburl,dbun,dbpwd);
	Statement stmt = con.createStatement();					
	ResultSet rs= stmt.executeQuery(query);	
	System.out.println("code ="+query);
	String a3=null;
	Thread.sleep(5000);
	while (rs.next())
	{
		 a3 = rs.getString(1);								        

		System.out.println("code ="+a3);
	}
	
	Thread.sleep(5000);
	lp.getsecretcode().sendKeys(a3);
	Thread.sleep(5000);
	lp.getcompAuth().click();
	

	
	
	
	Thread.sleep(5000);

		
	Actions an = new Actions(driver);

	Thread.sleep(10000);
	an.moveToElement(hd.getAccountMenu()).perform();
	Thread.sleep(10000);
	hd.getAccountSettings().click();
	Thread.sleep(15000);
Assert.assertEquals(driver.getTitle(), "Account Settings - CCM",
		"User not able to land to the info page");
		
		By show1=By.xpath("//input[@id='settings_default_admin']");
		By show2=By.xpath("//label[contains(text(),'Allow Request for Access and New Accounts')]");
		By show3=By.xpath("//label[contains(text(),'Allow New Accounts, Do Not Allow Requests for Acce')]");
		By show4=By.xpath("//label[contains(text(),'Allow Access Requests, Do Not Allow New Accounts')]");
		
		
		By banner1=By.xpath("//input[@id='account_settings_1_1']");

		
		
		

		
		if(cf.isElementPresent(banner1))
		{
			boolean  b=driver.findElement(banner1).isSelected();
			
			if (b==true)
				System.out.print("b"+b );
		}
		
		
		
			if(cf.isElementPresent(show2))
			{
				

		       }
			if(cf.isElementPresent(show3))
			{
				

		       }
			if(cf.isElementPresent(show4))
			{
				System.out.print("pass 52");

		       }


}catch(org.openqa.selenium.ElementClickInterceptedException e) {
	String 	title6= driver.getTitle();
	e.printStackTrace();

	Thread.sleep(5000);	
     Assert.assertTrue(false, "Failed" + e.getMessage());
}
catch (org.openqa.selenium.TimeoutException e) {
	String 	title6= driver.getTitle();
	e.printStackTrace();

	Thread.sleep(5000);	
     Assert.assertTrue(false, "Failed" + e.getMessage());
}
catch (org.openqa.selenium.StaleElementReferenceException e) {
	String 	title6= driver.getTitle();
	e.printStackTrace();

	
	Thread.sleep(5000);	
     Assert.assertTrue(false, "Failed" + e.getMessage());
}
catch (org.openqa.selenium.NoSuchElementException e) {
	String 	title6= driver.getTitle();
	e.printStackTrace();


	Thread.sleep(5000);	
     Assert.assertTrue(false, "Failed" + e.getMessage());
}
}

@Test(priority = 51, enabled =true)
public void Validate_addressofuse_53() throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	try { wait = new WebDriverWait(driver, 120);
		Thread.sleep(2000);

		
		Actions an = new Actions(driver);

		Thread.sleep(10000);
		an.moveToElement(hd.getAccountMenu()).perform();
		Thread.sleep(5000);
		hd.getAddressOfUse().click();
		Thread.sleep(15000);
	Assert.assertEquals(driver.getTitle(), "Address of Use - CCM",
			"User not able to land to the page");
		
	

		By show5=By.xpath("//p[contains(text(),'756 Concho Ln Houston, TX, 77084, TX, 77084')]");
	//By show4=By.xpath("//a[contains(text(),'Request Address of Use Change')]");
		
		Thread.sleep(5000);

	
		
		

				

		    
			if(cf.isElementPresent(show5))
			{
			

		    
			
			}
	}
	catch(org.openqa.selenium.ElementClickInterceptedException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
	catch (org.openqa.selenium.TimeoutException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
	catch (org.openqa.selenium.StaleElementReferenceException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();

		
		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}

	catch (org.openqa.selenium.NoSuchElementException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
	

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}

}


@Test(priority = 52, enabled =true)
public void Validate_catalogrestrictions_54() throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	try {	 wait = new WebDriverWait(driver, 120);
		Thread.sleep(2000);

		

			
			Actions an = new Actions(driver);

			Thread.sleep(10000);
			an.moveToElement(hd.getAccountMenu()).perform();
			Thread.sleep(5000);
			hd.getCatalog_Restriction().click();
			Thread.sleep(15000);
		Assert.assertEquals(driver.getTitle(), "Catalog Restrictions - CCM",
				"User not able to land to the page");
		
		By show1=By.xpath("//select[@id='select_filter']");
		By show2=By.xpath("//select[@id='view_all']");
		By show3=By.xpath("//input[@id='CatalogRestrictions']");
		By show4=By.xpath("//a[contains(text(),'Unrestricted')]");
		By show5=By.xpath("//a[contains(text(),'Restricted')]");
		
		
		By banner1=By.xpath("//label[contains(text(),'Select All')]");
		By banner2=By.xpath("//span[contains(text(),'Corp. CSP Microsoft 365 E3')]");
		By banner3=By.xpath("//span[contains(text(),'$29.2')]");
		By banner4=By.xpath("//div[5]//div[1]//div[1]//div[1]//div[3]//div[1]//p[1]//span[2]//a[1]");
		
		By banner5=By.xpath("//div[contains(@class,'pagination-total')]//span[contains(text(),'12')]");
		By chkbox=By.xpath("//div[5]//div[1]//div[1]//div[1]//div[1]//div[1]//span[1]//label[1]");
	

		
		By Restrict= By.xpath("//a[contains(@class,'btn btn-primary')]' and text()='Restrict']");
		By cancel = By.xpath("//a[contains(@class,'btn btn-primary')]' and text()='Cancel']");
		
		if(cf.isElementPresent(banner1))
		{

			if(cf.isElementPresent(banner2))
			{

				if(cf.isElementPresent(banner3))
				{

					if(cf.isElementPresent(banner4))
					{

						if(cf.isElementPresent(banner5))
						{
						  driver.findElement(chkbox).click();
						  if(cf.isElementPresent(Restrict))
							{
							  if(cf.isElementPresent(cancel))
								{
								
								}
							  
							  
							}
						  
						}
					}
				}
			}
			System.out.print("pass 54");
		}
		
		
		if(cf.isElementPresent(show1))
		{		System.out.print("pass 541");
			if(cf.isElementPresent(show2))
			{
				
				System.out.print("pass 542");
		       }
			if(cf.isElementPresent(show3))
			{
				System.out.print("pass 543");

		       }
			if(cf.isElementPresent(show4))
			{
				System.out.print("pass 544");
				if(cf.isElementPresent(show5))
				{
					
					System.out.print("pass 545");
			       }
		       }
			
			
	
}
		Thread.sleep(3000);
		  hd.logout();
		  Thread.sleep(5000);

	}
	catch(org.openqa.selenium.ElementClickInterceptedException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
		  hd.logout();
		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
	catch (org.openqa.selenium.TimeoutException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
		  hd.logout();
		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
	catch (org.openqa.selenium.StaleElementReferenceException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();

		  hd.logout();
		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}	catch (org.openqa.selenium.NoSuchElementException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
	

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
}


@Parameters({"username8","pswd8","url","dburl","dbun","dbpswd"})@Test(priority = 53, enabled =true)
public void Validate_changepassword_55(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
		try { 
   
			lp.getusername().sendKeys(username);
			
			lp.getpassword().sendKeys(pswd);
		Thread.sleep(6000);
		lp.getloginbtn().click();
		
		Thread.sleep(5000);
		String email11=username;
		String query = "select two_factor_code from users where email='" +email11+  "';";	            
		Class.forName("com.mysql.jdbc.Driver");				
		Connection con = DriverManager.getConnection(dburl,dbun,dbpwd);
		Statement stmt = con.createStatement();					
		ResultSet rs= stmt.executeQuery(query);	
		System.out.println("code ="+query);
		String a3=null;
		Thread.sleep(5000);
		while (rs.next())
		{
			 a3 = rs.getString(1);								        

			System.out.println("code ="+a3);
		}
		
		Thread.sleep(5000);
		lp.getsecretcode().sendKeys(a3);
		Thread.sleep(5000);
		lp.getcompAuth().click();
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, 120);
	
		String title5 = driver.getTitle();
		String expectedTitle = "Marketplace - CCM";
	
		Assert.assertEquals(title5, expectedTitle);
		
			Actions an = new Actions(driver);

			Thread.sleep(20000);
			an.moveToElement(hd.getAccountMenu()).perform();
		
			Thread.sleep(5000);
		
		boolean ChangePswd_present;

			hd.getChangePassword().click();
			 wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.titleContains("Change Password - CCM"));
		
			Thread.sleep(5000);
			
			cp.getSaveBtn().click();
			Thread.sleep(5000);
			Assert.assertEquals(cp.getalertmsg().getText(), "The Current Password field is required", "alert text not match");
			Thread.sleep(5000);
			cp.cancelchangepwd(driver).click();
			Thread.sleep(5000);
			cp.getCurrentPswd().sendKeys("Connection1234");			
			Thread.sleep(3000);
			
			cp.getNewPswd().sendKeys("Connection124");
			Thread.sleep(3000);
			
			cp.getCnfrm_pswd().sendKeys("Connection124");
			Thread.sleep(3000);
			cp.getSaveBtn().click();
			Thread.sleep(7000);
			Assert.assertEquals(cp.getalertmsg().getText(), "The provided current password is incorrect, please try again", "alert text not match");
			
			Thread.sleep(3000);
			cp.cancelchangepwd(driver).click();
			Thread.sleep(3000);
			cp.getCurrentPswd().sendKeys("Connection123");			
			Thread.sleep(4000);
			
			cp.getNewPswd().sendKeys("abcd");
			Thread.sleep(300);
			
			cp.getCnfrm_pswd().sendKeys("abcd1");
			Thread.sleep(5000);
			
			cp.getSaveBtn().click();
	
			Thread.sleep(4000);
			
			Assert.assertEquals(cp.getalertmsg().getText(), "Password must have at least 8 characters and contain uppercase, lowercase letters and numbers. New Password does not match the Confirm Password", "alert text not match");
			Thread.sleep(3000);
			cp.cancelchangepwd(driver).click();
			Thread.sleep(3000);
			cp.getCurrentPswd().sendKeys("Test*123");			
			Thread.sleep(3000);
			
			cp.getNewPswd().sendKeys("Connection123");
			Thread.sleep(3000);
			
			cp.getCnfrm_pswd().sendKeys("Connection123");
			Thread.sleep(3000);
			
			cp.getSaveBtn().click();
	
			Thread.sleep(4000);
			
			Assert.assertEquals(cp.getalertmsg().getText(), "The provided current password is incorrect, please try again", "alert text not match");
		


			cp.cancelchangepwd(driver).click();
			
			cp.getCurrentPswd().sendKeys("Connection123");			
			Thread.sleep(3000);
			
			cp.getNewPswd().sendKeys("Connection124");
			Thread.sleep(3000);
			
			cp.getCnfrm_pswd().sendKeys("Connection124");
			Thread.sleep(3000);
			
			cp.getSaveBtn().click();
	
			Thread.sleep(20000);
	
			
			//Assert.assertEquals(cp.getalertmsg().getText(), "Your password is updated successfully", "alert text not match");
			
			
		
			
	
			
			
			Thread.sleep(10000);
			
			
			
			lp.getusername().sendKeys("a6721588@jj67j88.com");
			lp.getpassword().sendKeys("Connection124");
			lp.getloginbtn().click();
			Thread.sleep(20000);
				
			
			
			
			
			
			
			
			
			an.moveToElement(hd.getAccountMenu()).perform();
			

			Thread.sleep(10000);

				hd.getChangePassword().click();
				 wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.titleContains("Change Password - CCM"));
			
				Thread.sleep(5000);
			
				cp.getCurrentPswd().sendKeys("Connection124");			
				Thread.sleep(3000);
				
				cp.getNewPswd().sendKeys("Connection123");
				Thread.sleep(3000);
				
				cp.getCnfrm_pswd().sendKeys("Connection123");
				Thread.sleep(3000);
				
				cp.getSaveBtn().click();
		

				
				
				Thread.sleep(3000);
			
		}
		catch(org.openqa.selenium.ElementClickInterceptedException e) {
			String 	title6= driver.getTitle();
			e.printStackTrace();
	
			Thread.sleep(5000);	
		     Assert.assertTrue(false, "Failed" + e.getMessage());
		}
		catch (org.openqa.selenium.TimeoutException e) {
			String 	title6= driver.getTitle();
			e.printStackTrace();
		
			Thread.sleep(5000);	
		     Assert.assertTrue(false, "Failed" + e.getMessage());
		}
		catch (org.openqa.selenium.StaleElementReferenceException e) {
			String 	title6= driver.getTitle();
			e.printStackTrace();

	
			Thread.sleep(5000);	
		 
		}
		catch (org.openqa.selenium.NoSuchElementException e) {
			String 	title6= driver.getTitle();
			e.printStackTrace();
		

			Thread.sleep(5000);	
		     Assert.assertTrue(false, "Failed" + e.getMessage());
		}
				
			
		}
@Parameters({"username3","pswd3","url","dburl","dbun","dbpswd"})
@Test(priority = 54, enabled =true)
public void Validate_myprofileEditprof_56(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	
	

		 wait = new WebDriverWait(driver, 120);
		Thread.sleep(2000);

		lp.getusername().sendKeys(username);
		
		lp.getpassword().sendKeys(pswd);
		lp.getloginbtn().click();
		Thread.sleep(5000);
		String email11=username;
		String query = "select two_factor_code from users where email='" +email11+  "';";	            
		Class.forName("com.mysql.jdbc.Driver");				
		Connection con = DriverManager.getConnection(dburl,dbun,dbpwd);
		Statement stmt = con.createStatement();					
		ResultSet rs= stmt.executeQuery(query);	
		System.out.println("code ="+query);
		String a3=null;
		Thread.sleep(5000);
		while (rs.next())
		{
			 a3 = rs.getString(1);								        

			System.out.println("code ="+a3);
		}
		
		Thread.sleep(5000);
		lp.getsecretcode().sendKeys(a3);
		Thread.sleep(5000);
		lp.getcompAuth().click();
		Thread.sleep(5000);
		Actions an = new Actions(driver);

		Thread.sleep(10000);
		an.moveToElement(hd.getAccountMenu()).perform();
		Thread.sleep(5000);

		hd.getMyProfile().click();
		
		
		//div[@class='user-details-container clearfix']//li[1]
		//div[@class='user-container clearfix']//div[@class='right']//ul//li
			
		WebElement resultSet = driver.findElement(By.xpath("//div[@class='user-container clearfix']//div[@class='right']//ul"));
			
		List<WebElement>	options = resultSet.findElements(By.tagName("li"));


		for (WebElement li : options) {
				   System.out.println(li.getText());}
			
			
		


WebElement resultSet1 = driver.findElement(By.xpath("//div[@class='info-section profile-det']//ul"));
	
List<WebElement>	options1 = resultSet1.findElements(By.tagName("li"));


for (WebElement li1 : options1) {
		   System.out.println(li1.getText());}
	
mpp.getEditProfile_btn().click();
By show77=By.xpath("//input[@id='FirstName']");
By show88=By.xpath("//input[@id='LastName']");

By show99=By.xpath("//input[@id='Phone']");


driver.findElement(show77).sendKeys("tst");
driver.findElement(show88).sendKeys("tst");

driver.findElement(show99).sendKeys("921.749.8256");
JavascriptExecutor js1 = (JavascriptExecutor)driver;

js1.executeScript("window.scrollBy(0,200)");
Thread.sleep(5000);

mpp.getsave().click();

Thread.sleep(5000);
mpp.getEditProfile_btn().click();
Thread.sleep(5000);
driver.findElement(show77).sendKeys(Keys.CONTROL);
Thread.sleep(3000);
driver.findElement(show77).sendKeys(Keys.BACK_SPACE);
Thread.sleep(3000);
driver.findElement(show77).clear();
Thread.sleep(3000);
driver.findElement(show77).sendKeys("saima tab");
Thread.sleep(3000);
driver.findElement(show88).sendKeys(Keys.CONTROL);
Thread.sleep(3000);
driver.findElement(show88).sendKeys(Keys.BACK_SPACE);
Thread.sleep(3000);
driver.findElement(show88).clear();
Thread.sleep(3000);
driver.findElement(show99).sendKeys("saima tab");
Thread.sleep(3000);

js1.executeScript("window.scrollBy(0,200)");
Thread.sleep(5000);

mpp.getsave().click();

Thread.sleep(5000);











wait.until(ExpectedConditions.titleContains("My Profile - CCM"));
mpp.getEditProfile_btn().click();
Thread.sleep(5000);
mpp.getcancel().click();
Thread.sleep(5000);
wait.until(ExpectedConditions.titleContains("My Profile - CCM"));
Thread.sleep(3000);
hd.logout();
Thread.sleep(5000);
}
@Parameters({"username3","pswd3","url","dburl","dbun","dbpswd"})@Test(priority = 55, enabled =true)
public void Validate_notifmgmt_57(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	try { wait = new WebDriverWait(driver, 120);
		Thread.sleep(2000);

	 driver.get(url);

		lp.getusername().sendKeys(username);
		
		lp.getpassword().sendKeys(pswd);
		lp.getloginbtn().click();
		Thread.sleep(5000);
		String email11=username;
		String query = "select two_factor_code from users where email='" +email11+  "';";	            
		Class.forName("com.mysql.jdbc.Driver");				
		Connection con = DriverManager.getConnection(dburl,dbun,dbpwd);
		Statement stmt = con.createStatement();					
		ResultSet rs= stmt.executeQuery(query);	
		System.out.println("code ="+query);
		String a3=null;
		Thread.sleep(5000);
		while (rs.next())
		{
			 a3 = rs.getString(1);								        

			System.out.println("code ="+a3);
		}
		
		Thread.sleep(5000);
		lp.getsecretcode().sendKeys(a3);
		Thread.sleep(5000);
		lp.getcompAuth().click();
		Thread.sleep(5000);
		Actions an = new Actions(driver);

		Thread.sleep(10000);
		an.moveToElement(hd.getAccountMenu()).perform();
		Thread.sleep(5000);


		wait.until(ExpectedConditions.elementToBeClickable(hd.getNotification_mgmt()));
		Thread.sleep(10000);
		hd.getNotification_mgmt().click();
		Thread.sleep(5000);
		 WebElement element = driver.findElement(By.xpath("//body//div[2]//div[2]//div[2]//fieldset[1]//label[1]"));
		    Actions toolAct = new Actions(driver);
		    toolAct.moveToElement(element).build().perform();
		    WebElement toolTipElement = driver.findElement(By.xpath("//span[@id='1']//div[@class='tooltip tt-text'][contains(text(),'You are not allowed to opt out of the email.')]"));
		    String toolTipText = toolTipElement.getText();
		    System.out.println(toolTipText);
			Assert.assertEquals(toolTipText, "You are not allowed to opt out of the email.", "alert text not match");
					

		    
			 WebElement element1 = driver.findElement(By.xpath("//div[8]//div[2]//div[2]//fieldset[1]//label[1]//span[1]"));
				Thread.sleep(5000);
	element1.click();
	Thread.sleep(5000);
	hd.getnotifsave().click();
	Thread.sleep(5000);
	Assert.assertEquals(cp.getalertmsg().getText(), "Changes saved successfully", "alert text not match");
	hd.getnotifcancel().click();
	Thread.sleep(3000);
	  hd.logout();
	  Thread.sleep(5000);}
	catch (org.openqa.selenium.NoSuchElementException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
	

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
}

@Parameters({"username3","pswd3","url","dburl","dbun","dbpswd"})@Test(priority = 56, enabled =true)
public void Validate_payment_58(String username , String password , String url ,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	try { wait = new WebDriverWait(driver, 300);
		Thread.sleep(2000);

	// reject  net terms rquest from mgmnt portal for saimaqa user on qa

		lp.getusername().sendKeys(username);
		lp.getpassword().sendKeys(password);
		lp.getloginbtn().click();
		Thread.sleep(5000);
		String email11=username;
		String query = "select two_factor_code from users where email='" +email11+  "';";	            
		Class.forName("com.mysql.jdbc.Driver");				
		Connection con = DriverManager.getConnection(dburl,dbun,dbpwd);
		Statement stmt = con.createStatement();					
		ResultSet rs= stmt.executeQuery(query);	
		System.out.println("code ="+query);
		String a3=null;
		Thread.sleep(5000);
		while (rs.next())
		{
			 a3 = rs.getString(1);								        

			System.out.println("code ="+a3);
		}
		
		Thread.sleep(5000);
		lp.getsecretcode().sendKeys(a3);
		Thread.sleep(5000);
		lp.getcompAuth().click();
		Thread.sleep(5000);
		Actions an = new Actions(driver);

		Thread.sleep(10000);
		an.moveToElement(hd.getAccountMenu()).perform();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(hd.getPayment_Plan()));
		Thread.sleep(10000);
		hd.getPayment_Plan().click();
		Thread.sleep(5000);
		pay.getChangeBtn().click();
		Thread.sleep(5000);
		pay.getAddCreditBtn().click();
		Thread.sleep(5000);
		pay.getccid().sendKeys("saima tabasum");
		Thread.sleep(5000);
		driver.switchTo().frame("eProtect-iframe");
		Thread.sleep(5000);
		pay.getcardno().sendKeys("4111 1111 1111 1111");
		Thread.sleep(7000);
		pay.getcardmonthexpiry().click();
		
		//Select Se = new Select(pay.getcardmonthexpiry());
		Thread.sleep(5000);
	WebElement options =driver.findElement(By.xpath("//option[contains(@value, '02')]"));
	
		        options.click();
		   
	
		    	Thread.sleep(7000);
				pay.getcardyearexpiry().click();
				
				//Select Se = new Select(pay.getcardmonthexpiry());
				Thread.sleep(5000);
			WebElement options1 =driver.findElement(By.xpath("//option[contains(@value, '20')]"));
			
				        options1.click();    
	
		Thread.sleep(5000);
		pay.getcvv().sendKeys("1234");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		pay.getsave().click();
		Thread.sleep(5000);
		//Assert.assertEquals(cp.getalertmsg().getText(), "Credit card details saved successfully", "alert text not match");
		pay.getcanecl().click();
		Thread.sleep(20000);
		pay.getChangeBtn().click();
		Thread.sleep(10000);

		
		Thread.sleep(10000);
	
		pay.getreqNet().click();
		Thread.sleep(3000);
		pay.getdunsno().sendKeys("213456786");
		Thread.sleep(3000);
		pay.getsavecont().click();
		Thread.sleep(10000);
		
	Actions an1 = new Actions(driver);

	//Thread.sleep(10000);
	//an1.moveToElement(pay.Checbox()).perform();
	
	WebElement u=driver.findElement(By.xpath("//input[@id='billing-copyFormBusiness']"));
	an1.moveToElement(u).click().build().perform();
	
	
	
	
	   By alert =By.xpath("//p[contains(text(),'A request for Net Terms is pending for this account. Please Contact Us for assistance.')]");;
	
		//pay.Checbox().click();
		Thread.sleep(3000);
		pay.getdsubreq().click();
		Thread.sleep(10000);
		
		driver.navigate().back();
		//wait.until(ExpectedConditions.presenceOfElementLocated(alert));
		Thread.sleep(10000);
		//System.out.println(pay.alertpending().getText());
		
		String count = driver.findElement(By.xpath("//div[@class='ccp-form-info']/p")).getText();
		WebElement count1 = driver.findElement(By.xpath("//div[@class='ccp-form-info']/p/a"));
				System.out.println(count1); 
		Assert.assertEquals(count, "A request for Net Terms is pending for this account. Please Contact Us for assistance.", "alert text not match");
		count1.click();
		Thread.sleep(3000);
	
		pay.desc().sendKeys("aaaa");
		Thread.sleep(3000);
		pay.submitcontact().click();
	//	Thread.sleep(3000);
		
	//	WebElement  w=driver.findElement(By.id("loadingMask"));
	 //   wait.until(ExpectedConditions.invisibilityOf(w));
			Thread.sleep(10000);
			Assert.assertEquals(count, "A request for Net Terms is pending for this account. Please Contact Us for assistance.", "alert text not match");
				
		pay.getChangeBtn().click();
		Thread.sleep(3000);
		pay.chckbtndisabled();
		Thread.sleep(3000);
		//after approval from mgmtportal , loggin and go to payment screen
		
		
		//Assert.assertEquals(pay.alertpending1().getText(), "Your payment method cannot be changed from Net Ter ", "alert text not match");
		Thread.sleep(3000);
		  hd.logout();
		  Thread.sleep(5000);}
	catch (org.openqa.selenium.NoSuchElementException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
	

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
		
}

@Parameters({"username3","pswd3","url","dburl","dbun","dbpswd"})@Test(priority = 57, enabled =true)
public void Validate_UM_and_Login_Logout_59_61(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
		try { wait = new WebDriverWait(driver, 120);
		 driver.get(url);
			Thread.sleep(10000);
			lp.getusername().sendKeys(username);
			
			lp.getpassword().sendKeys(pswd);
			lp.getloginbtn().click();
			Thread.sleep(5000);
			String email11=username;
			String query = "select two_factor_code from users where email='" +email11+  "';";	            
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con = DriverManager.getConnection(dburl,dbun,dbpwd);
			Statement stmt = con.createStatement();					
			ResultSet rs= stmt.executeQuery(query);	
			System.out.println("code ="+query);
			String a3=null;
			Thread.sleep(5000);
			while (rs.next())
			{
				 a3 = rs.getString(1);								        

				System.out.println("code ="+a3);
			}
			
			Thread.sleep(5000);
			lp.getsecretcode().sendKeys(a3);
			Thread.sleep(5000);
			lp.getcompAuth().click();
			Thread.sleep(5000);
			Actions an = new Actions(driver);

			
			an.moveToElement(hd.getAccountMenu()).perform();
			Thread.sleep(5000);
			hd.getUsers().click();
		 
			wait.until(ExpectedConditions.titleContains("User Management - CCM"));
			Thread.sleep(5000);
	
		String Users_Titleact = driver.getTitle().trim();
		String Users_Titlexp = "User Management - CCM";
		Assert.assertEquals(Users_Titleact, Users_Titlexp, "User not being able to reach page");
		 
		us.getUserTab().click();		
		Thread.sleep(6000);
		us.getuseractive().click();
		Thread.sleep(3000);
		us.getsaveuserbtn().click();
		Thread.sleep(5000);
		hd.logout();
		Thread.sleep(3000); lp= new LoginPage(driver);
		//	lp.getusername().sendKeys("qunootahmed92+021@gmail.com");
			
			
			lp.getusername().sendKeys(prop.getProperty("userroleemail_UM"));
			Thread.sleep(3000);
			lp.getpassword().sendKeys(prop.getProperty("pswd_userrole_UM"));
			Thread.sleep(3000);
			lp.getloginbtn().click();
			Thread.sleep(10000);
			Assert.assertEquals(us.getaleretdanger().getText(), "This user has been marked inactive by the account administrator. You can contact the account administrator on a6721574@jj67j74.com", "alert text not match");
		
			Thread.sleep(3000);
			
			
			driver.navigate().back();
			Thread.sleep(3000);
			lp.getusername().clear();
			Thread.sleep(3000);
			lp.getpassword().clear();
			Thread.sleep(3000);
			
			lp.getusername().sendKeys("a6721574@jj67j74.com");
			lp.getpassword().sendKeys("Connection123");
			lp.getloginbtn().click();
			Thread.sleep(5000);
			an.moveToElement(hd.getAccountMenu()).perform();
			Thread.sleep(5000);
			hd.getUsers().click();		Thread.sleep(3000);
			us.getUserTab().click();			Thread.sleep(3000);	
			us.getuseractive().click();Thread.sleep(3000);
			us.getsaveuserbtn().click();Thread.sleep(3000);
			hd.logout();
			
			
			
			lp.getusername().sendKeys("a6721574@jj67j74.com");
			lp.getpassword().sendKeys("Connection123");
				lp.getloginbtn().click();
				Thread.sleep(5000);
				an.moveToElement(hd.getAccountMenu()).perform();
				Thread.sleep(5000);
				hd.getUsers().click();		Thread.sleep(3000);
				us.getUserTab().click();			Thread.sleep(3000);
		us.getSearchBox().sendKeys("saima.tabassum+0953" + Keys.ENTER);
		Thread.sleep(10000);
		
		

		WebElement web=driver.findElement(By.xpath("//select[contains(@id,'Users_Rights')]"));
		Thread.sleep(3000);
			Select Se1 = new Select(web);
			Thread.sleep(5000);
			Se1.selectByValue("Administrator");
			Thread.sleep(3000);
			us.getsaveuserbtn().click();
			Thread.sleep(3000);
			Assert.assertEquals(cp.getalertmsg().getText(), "The user has been updated successfully", "alert text not match");
			Actions action =new Actions(driver);
			Thread.sleep(3000);
us.getSearchBox().sendKeys(Keys.CONTROL);

us.getSearchBox().sendKeys(Keys.BACK_SPACE);
			Thread.sleep(5000);

			//boolean b=us.getdisabledrole().isEnabled();
			//System.out.print("b="+b);
			
			hd.logout();
			Thread.sleep(5000);
			

			Actions an2 = new Actions(driver);

			
			lp.getusername().sendKeys(prop.getProperty("userroleemail_UM"));
			Thread.sleep(3000);
			lp.getpassword().sendKeys(prop.getProperty("pswd_userrole_UM"));
			Thread.sleep(3000);
			lp.getloginbtn().click();

		Thread.sleep(5000);
		an2.moveToElement(hd.getAccountMenu()).perform();
		Thread.sleep(5000);
		hd.getUsers().click();
		Thread.sleep(5000);
		us.getSearchBox().sendKeys("saima tab" + Keys.ENTER);
		Thread.sleep(10000);
		Select Se3 = new Select(us.getrole1());
		Se3.selectByValue("User");
		Thread.sleep(3000);
		us.getsaveuserbtn().click();
		Thread.sleep(3000);
		Assert.assertEquals(cp.getalertmsg().getText(), "To change the role of this admin please define another default admin on Account Settings screen", "alert text not match");
	    Thread.sleep(5000);
	    
		Select Se4 = new Select(us.getrole1());
		Se4.selectByValue("User");
		Thread.sleep(3000);
		
	
		
		//WebElement web2=driver.findElement(By.xpath("//li[2]//div[1]//div[1]//div[5]//span[1]//fieldset[1]//label[1]//span[1]"));
		//Thread.sleep(3000);
		
		//web2.click();
		us.getuseractive().click();
		Thread.sleep(5000);
		us.getsaveuserbtn().click();
		Thread.sleep(3000);
		Assert.assertEquals(cp.getalertmsg().getText(), "To change the role and status of this admin please define another default admin on Account Settings screen", "alert text not match");
		Thread.sleep(3000);
		hd.logout();
		Thread.sleep(5000);
		lp.getusername().sendKeys("a6721574@jj67j74.com");
		lp.getpassword().sendKeys("Connection123");
			lp.getloginbtn().click();
			Thread.sleep(5000);
			an2.moveToElement(hd.getAccountMenu()).perform();
			Thread.sleep(5000);
			hd.getUsers().click();
			Thread.sleep(5000);
			WebElement web1=driver.findElement(By.xpath("(//select[contains(@id,'Users_Rights')])[1]"));
			Thread.sleep(3000);
				//Select Se1 = new Select(web1);
			Select Se5 = new Select(web1);
			Se5.selectByValue("User");
			Thread.sleep(3000);
			us.getsaveuserbtn().click();
		
			Thread.sleep(3000);
			  hd.logout();
			  Thread.sleep(5000);}
				catch (org.openqa.selenium.NoSuchElementException e) {
					String 	title6= driver.getTitle();
					e.printStackTrace();
				

					Thread.sleep(5000);	
				     Assert.assertTrue(false, "Failed" + e.getMessage());
				}
}

@Parameters({"username3","pswd3","url","dburl","dbun","dbpswd"})@Test(priority = 58, enabled =false)
public void Validate_loginspecificcase_61(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
		 wait = new WebDriverWait(driver, 120);
		 LoginPage lp= new LoginPage(driver);
		 
		 String 	OldTab=driver.getWindowHandle();
		 
		 ((JavascriptExecutor) driver).executeScript("window.open()");
		 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		 driver.switchTo().window(tabs.get(1));
		 driver.get(prop.getProperty("url_cust"));
		 
		 Set<String> abc=driver.getWindowHandles();
		 
			driver.switchTo().window(OldTab);
			//lp.getusername().sendKeys(prop.getProperty("userroleemail_UM"));
			//lp.getpassword().sendKeys(prop.getProperty("pswd_userrole_UM"));
			lp.getloginbtn().click();
			
			Thread.sleep(5000);
		
			
			
	
			Iterator<String> it=abc.iterator();
			while(it.hasNext())
			{
			driver.switchTo().window(it.next());
			}

			 Thread.sleep(5000);
				lp.getusername().sendKeys(username);
				
				lp.getpassword().sendKeys(pswd);
			lp.getloginbtn().click();
		
			Thread.sleep(5000);
			Assert.assertEquals(us.getaleretdanger().getText(), "Your session has expired. Please refresh the page to login", "alert text not match");
			Thread.sleep(3000);
			  hd.logout();
			  Thread.sleep(5000);

}
		
		









}

