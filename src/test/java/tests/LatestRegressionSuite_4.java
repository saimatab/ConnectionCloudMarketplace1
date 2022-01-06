package tests;
import java.io.FileInputStream;
import org.openqa.selenium.JavascriptExecutor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;
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
import org.testng.asserts.SoftAssert;

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

public class LatestRegressionSuite_4 extends base  {

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
	String dburl, dbun, dbpswd;
	String email;

public LatestRegressionSuite_4() throws IOException, InterruptedException , ClassNotFoundException, SQLException {

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
	    dc=new Discover(driver);
	
		 al=new auditlog(driver);
		 bline=new billine(driver);;
		 or=new orders(driver);
		 sagree=new signedagreements(driver);
		 sub=new subscriptions(driver);
	    
			auditlog al=new auditlog(driver);
	    
	    
	}

@Parameters({"username3","pswd3","url","dburl","dbun","dbpswd"})
@Test(priority = 17,enabled=true)
public void Validate_DiscoverCase_No_1_19_20_FORAPP(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
   	  //   driver = initializeDriver();
	try {	
		driver=getdriver();
		prop=new Properties();
		fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
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
	    dc=new Discover(driver);
	
		 al=new auditlog(driver);
		 bline=new billine(driver);;
		 or=new orders(driver);
		 sagree=new signedagreements(driver);
		 sub=new subscriptions(driver);
	    
			auditlog al=new auditlog(driver);
		Thread.sleep(3000);
		
		
	    cf.gotoURL(url);
		Thread.sleep(3000);
	//	lp.getusername().sendKeys("a6721527@jj67j27.com");
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
		hm.getDiscover1().click();
		Thread.sleep(2000);
		 wait = new WebDriverWait(driver, 400);
		wait.until(ExpectedConditions.titleContains("Discover - CCM"));
	Assert.assertEquals(driver.getTitle(), "Discover - CCM", "User not able to reach Discover page when clicking on discover link from the marketplace section");
	dc.getExpectedUserLink().sendKeys("100");
	Thread.sleep(5000);
	//Thread.sleep(10000);
	//wait.until(ExpectedConditions.elementToBeClickable(dc.getContinueBtn()));


	
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
    js1.executeScript("window.scrollBy(0,200)");
	Thread.sleep(5000);
	dc.getContinueBtn().click();
	
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(dc.getCheckbox1()));
	dc.getCheckbox1().click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(dc.getCheckbox2()));
	dc.getCheckbox2().click();

  
	Thread.sleep(10000);
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	WebElement h= driver.findElement(By.xpath("//a[@class='btn btn-primary']"));

	jse.executeScript("arguments[0].scrollIntoView()", h); 
	Thread.sleep(3000);
	dc.getContinueBtn1().click();
	Thread.sleep(10000);

	dc.getCheckbox11().click();
	
	

	
	
	
	
	
	
	
	
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(dc.getCheckbox22()));
	dc.getCheckbox22().click();
	Thread.sleep(3000);

	Thread.sleep(3000);
    js1.executeScript("window.scrollBy(0,200)");
	Thread.sleep(3000);
	dc.getContinueBtn1().click();
	Thread.sleep(3000);
	wait.until(ExpectedConditions.elementToBeClickable(dc.getedit()));
	Thread.sleep(3000);
	dc.getedit().click();
	Thread.sleep(3000);

	Thread.sleep(3000);
    js1.executeScript("window.scrollBy(0,100)");
	Thread.sleep(6000);
	dc.getContinueBtn1().click();
	Thread.sleep(3000);
	//wait.until(ExpectedConditions.elementToBeClickable(dc.getbtype()));
	Thread.sleep(3000);	//dc.getbtype().click();
    js1.executeScript("window.scrollBy(0,100)");
	Thread.sleep(3000);
	Select Se = new Select(dc.getbtype());
	Thread.sleep(5000);
	 js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
	Se.selectByValue("Monthly");
	Thread.sleep(3000);

	dc.getscBtn().click();
	Thread.sleep(3000);

	dc.getreqpurpoe().click();
	
	dc.getreqpurpBtn().click();
	dc.gettextarea().sendKeys("adasf");
	dc.getbtnprimaryreqpurposal().click();
	
	WebElement  w=driver.findElement(By.id("loadingMask"));
    wait.until(ExpectedConditions.invisibilityOf(w));
		Thread.sleep(30000);
		dc.getitemviewed().getText();

		//Assert.assertEquals(dc.getitemviewed().getText(), "Items you viewed", "Items you viewed not diplayed");
		Thread.sleep(30000);
		WebElement h1= driver.findElement(By.xpath("//span[contains(text(),'COMPLEMENTARY DISCOVERY SERVICES')]"));

		jse.executeScript("arguments[0].scrollIntoView()", h1); 
		Thread.sleep(5000);
		dc.getCOMPSERVICES().getText();
		Thread.sleep(10000);
		SoftAssert  s=new SoftAssert();
		
	s.assertEquals(dc.getCOMPSERVICES().getText(), "COMPLEMENTARY DISCOVERY SERVICES", "COMPLEMENTARY DISCOVERY SERVICES SECTION NOT DISPLAYED");
	Thread.sleep(3000);
	//a[@class='clearfix']//span[@class='account-title'][contains(text(),'My Account')]
	//WebElement web = wait.until(
			//ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='clearfix']//span[@class='account-title'][contains(text(),'My Account')]")));
	// Actions actions = new Actions(driver);
	//	actions.moveToElement(web);
	//	actions.perform();	 
Thread.sleep(8000);


js1 = (JavascriptExecutor)driver;

js1.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
Thread.sleep(5000);
hd.logout();
Thread.sleep(3000);

	
}
	catch (org.openqa.selenium.NoSuchElementException e) {
		
		  e.printStackTrace();
			hd.logout();
	    Thread.sleep(5000);	
	 
	     Assert.assertTrue(false, "Failed" + e.getMessage());

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
		hd.logout();
		e.printStackTrace();
	
		
		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
	

}
	
@Parameters({"username3","pswd3","url","dburl","dbun","dbpswd"})
@Test(priority = 18,enabled=false)
public void Validate_DiscoverCase_No_2_20_FORINFRA(String username , String pswd, String url,String dburl, String dbun, String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
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
	
	wait = new WebDriverWait(driver, 120);
		Thread.sleep(2000);
	
		hm.getDiscover().click();
		Thread.sleep(2000);

		wait.until(ExpectedConditions.titleContains("Discover - CCM"));
	Assert.assertEquals(driver.getTitle(), "Discover - CCM", "User not able to reach Discover page when clicking on discover link from the marketplace section");
	dc.getExpectedUserLink().sendKeys("100");
	Thread.sleep(5000);
	//Thread.sleep(10000);
	//wait.until(ExpectedConditions.elementToBeClickable(dc.getContinueBtn()));


	
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
    js1.executeScript("window.scrollBy(0,200)");
	Thread.sleep(5000);

	dc.getContinueBtn1().click();
	Thread.sleep(3000);
	dc.getCheckbox111().click();
	Thread.sleep(3000);
	dc.getCheckbox222().click();
	Thread.sleep(5000);

    js1.executeScript("window.scrollBy(0,200)");
	Thread.sleep(3000);
	dc.getContinueBtn1().click();
	
	
	Select Se1 = new Select(dc.getinstance());
	Thread.sleep(5000);

	Se1.selectByValue("Reserved Instance");

	
	
	Select Se3 = new Select(dc.getduration());
	Thread.sleep(5000);

	Se3.selectByValue("2 Years");
	Thread.sleep(3000);
	
	
	
  
	
 
	
	
	dc.getLB().sendKeys("2");
	
	Thread.sleep(3000);
 js1.executeScript("window.scrollBy(0,200)");

	Thread.sleep(3000);
	dc.getshowres().click();

	Thread.sleep(5000);
	dc.getreqpurcheck().click();
	dc.getreqpurpBtn().click();

	dc.gettextarea().sendKeys("adasf");
	dc.getbtnprimaryreqpurposal().click();
	
	WebElement  w=driver.findElement(By.id("loadingMask"));
    wait.until(ExpectedConditions.invisibilityOf(w));
		Thread.sleep(10000);
		dc.getitemviewed().getText();
		Assert.assertEquals(dc.getitemviewed().getText(), "Items you viewed", "Items you viewed not diplayed");
		dc.getCOMPSERVICES().getText();
		
	Assert.assertEquals(dc.getCOMPSERVICES().getText(), "COMPLEMENTARY DISCOVERY SERVICES", "COMPLEMENTARY DISCOVERY SERVICES SECTION NOT DISPLAYED");
	
	}
@Parameters({"username3","pswd3","url","dburl","dbun","dbpswd"})
@Test(priority = 19,enabled=true)
public void Validate_catalog_Application_21(String username , String pswd, String url,String dburl, String dbun, String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	try {	HomePage hm = new HomePage(driver);
		 wait = new WebDriverWait(driver, 120);
		Thread.sleep(5000);
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
		
		boolean Application_present;
		try {
			hm.getApplication_Link().click();
			Thread.sleep(2000);
			 wait = new WebDriverWait(driver, 120);
				wait.until(ExpectedConditions.titleContains("Applications - CCM"));
			Application_present = true;
			Log.info("User has Clicked on the Application tab from the MarketPlace Page");

		} catch (NoSuchElementException e) {
			Application_present = false;
			Log.error("User not able to find Application Link on the Marketplace Page");
			Log.error(e.getMessage());
		}
	
		Assert.assertEquals(driver.getTitle(), "Applications - CCM", "User not able to reach Shop page when clicking on Application link from the marketplace section");
  int  getnow=ap.getcountgetnow();
 int mange = ap.getcountmanage();
  
  
  System.out.println("mange"+mange);
  System.out.println("getnow"+getnow);
	//SoftAssert  s=new SoftAssert();
	//dc.getitemviewed().getText();
	//s.assertEquals(dc.getitemviewed().getText(), "Items you viewed", "Items you viewed not diplayed");
	
	
	
}catch (org.openqa.selenium.NoSuchElementException e) {
	
	  e.printStackTrace();

  Thread.sleep(5000);	

   Assert.assertTrue(false, "Failed" + e.getMessage());

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
	
	
	}

@Test(priority = 20,enabled=true)
public void Validate_catalog_infra_22() throws IOException, InterruptedException , ClassNotFoundException, SQLException{

	HomePage hm = new HomePage(driver);

	boolean Infrastructure_present;
	try {
		hm.getInfrastructure_Link().click();
		Thread.sleep(2000);
		 wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.titleContains("Infrastructure - CCM"));
		Infrastructure_present = true;
		Log.info("User has Clicked on the Infrastructure tab from the MarketPlace Page");
		Assert.assertEquals(driver.getTitle(), "Infrastructure - CCM", "User not able to reach Infrastructure page when clicking on Infrastructure link from the marketplace section");

		int  getnow=ap.getcountgetnow();
		int mange = ap.getcountmanage();


		System.out.println("mange"+mange);
		System.out.println("getnow"+getnow);
		///dc.getitemviewed().getText();
		//Assert.assertEquals(dc.getitemviewed().getText(), "Items you viewed", "Items you viewed not diplayed");

	}catch (org.openqa.selenium.NoSuchElementException e) {
		
		  e.printStackTrace();

	  Thread.sleep(5000);	

	   Assert.assertTrue(false, "Failed" + e.getMessage());

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
	
	

}
@Test(priority = 21,enabled=true)
public void Validate_catalog_platform_23() throws IOException, InterruptedException , ClassNotFoundException, SQLException{

	HomePage hm = new HomePage(driver);

	boolean Infrastructure_present;
	try {
		hm.getPlatform_Link().click();
		Thread.sleep(2000);
		 wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.titleContains("Platforms - CCM"));
	
			Assert.assertEquals(driver.getTitle(), "Platforms - CCM", "User not able to reach platform");

			int  getnow=ap.getcountgetnow();
			int mange = ap.getcountmanage();


			System.out.println("mange"+mange);
			System.out.println("getnow"+getnow);
			Thread.sleep(6000);
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(5000);
			dc.getitemviewed().getText();
			Assert.assertEquals(dc.getitemviewed().getText(), "Items you viewed", "Items you viewed not diplayed");


	 }catch (org.openqa.selenium.NoSuchElementException e) {
		
		  e.printStackTrace();

	  Thread.sleep(5000);	

	   Assert.assertTrue(false, "Failed" + e.getMessage());

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
	

}

@Test(priority =22,enabled=true)
public void Validate_catalog_consulting_24() throws IOException, InterruptedException , ClassNotFoundException, SQLException{

	HomePage hm = new HomePage(driver);

	boolean Infrastructure_present;
	try {
		hm.getConsulting().click();
		Thread.sleep(2000);
		 wait = new WebDriverWait(driver, 180);
			wait.until(ExpectedConditions.titleContains("Consulting - CCM"));
			Assert.assertEquals(driver.getTitle(), "Consulting - CCM", "User not able to reach consulting");

			int  getnow=ap.getcountgetnow();
			int mange = ap.getcountmanage();


			System.out.println("mange"+mange);
			System.out.println("getnow"+getnow);
			JavascriptExecutor js1 = (JavascriptExecutor)driver;
				
			js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");

			wait.until(ExpectedConditions.visibilityOf(dc.getitemviewed()));


			Thread.sleep(10000);


			Assert.assertEquals(dc.getitemviewed().getText(), "Items you viewed", "Items you viewed not diplayed");

			Thread.sleep(5000);
			hd.logout();
			Thread.sleep(10000);
	

	} 
	
	catch (org.openqa.selenium.NoSuchElementException e) {
		
		  e.printStackTrace();

	  Thread.sleep(5000);	
	  hd.logout();
	   Assert.assertTrue(false, "Failed" + e.getMessage());

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
	
	










}
@Parameters({"username3","pswd3","url","dburl","dbun","dbpswd"})
@Test(priority = 23,enabled=true)
public void Validate_manage_tab_25(String username1 , String pswd1, String url,String dburl, String dbun, String dbpswd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
try {
	LatestRegressionSuite_2  suite2=new LatestRegressionSuite_2();
	//email=suite2.email;
	
	//lp.getusername().sendKeys("a67215100@jj67j100.com");
	
	//lp.getusername().sendKeys(email);
	driver.get(url);
	HomePage hm = new HomePage(driver);

	
//	lp.getun().sendKeys("a6721527@jj67j27.com");
	lp.getusername().sendKeys(username1);
	
	lp.getpassword().sendKeys(pswd1);
	lp.getloginbtn().click();
	
	

Thread.sleep(5000);
			String email11=username1;
			String query = "select two_factor_code from users where email='" +email11+  "';";	            
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
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
	boolean Manage_present;
	try {
		hm.getManage_Link().click();
		Thread.sleep(5000);
		 wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.titleContains("Service Provisioning - CCM"));


	} catch (NoSuchElementException e) {

	}
	
	
	
	
	
	String Manage_Titleact = driver.getTitle().trim();
	String Manage_Titlexp = "Service Provisioning - CCM";
	Assert.assertEquals(Manage_Titleact, Manage_Titlexp, "Manage Page is not getting open");


	Manage Mn = new Manage(driver);

	boolean Subs_present;
	try {
		Mn.getSubscription();
		

	} catch (NoSuchElementException e) {
		Subs_present = false;
		
	}

	boolean Calendar_present;
	try {
		Mn.getCalendar();


	} catch (NoSuchElementException e) {
	
	}
	

	boolean Usage_present;
	try {
		Mn.getUsage_Link();
	

	} catch (NoSuchElementException e) {
	
	}

	//String  emailsuite21="a6721527@jj67j27.com";
	
	
	String  emailsuite21="a6721574@jj67j74.com";

//	String  emailsuite21=	suite2.email();

	String ac=null;

    int status=0;
	//String dbUrl = "jdbc:mysql://localhost:3306/database_sensitive";					
	//String username = "homestead";	
	//String password = "secret";		
	
	




// for pending cases
	
	
	
	// for active cases
	  // const STATUS_PENDING = 0;
	   // const STATUS_ACTIVE = 1;
	   // const STATUS_SUSPENDED = 2;
	  //  const STATUS_TERMINATED = 3;
	  //  const STATUS_EXPIRED = 4;
	 //   const STATUS_CANCELLED = 5;
	  //  const STATUS_FREEZE = 6;
	
	
	//for suspended


		

	Thread.sleep(3000);
hd.logout();

Thread.sleep(10000);


}catch (org.openqa.selenium.NoSuchElementException e) {
	
	  e.printStackTrace();
	  hd.logout();
Thread.sleep(5000);	

 Assert.assertTrue(false, "Failed" + e.getMessage());

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











}

@Parameters({"username4","pswd4","url","dburl","dbun","dbpswd"})
@Test(priority = 24,enabled=true)
public void Validate_product_mgmt_page_26(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{

	try{HomePage hm = new HomePage(driver);
	
	//email=suite2.email;requried
	Thread.sleep(5000);
	lp.getusername().sendKeys(username);
	
	lp.getpassword().sendKeys(pswd);

	lp.getloginbtn().click();
	

Thread.sleep(5000);
			String email11=username;
			String query = "select two_factor_code from users where email='" +email11+  "';";	            
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
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
	hm.getManage_Link().click();
	Thread.sleep(5000);
	mn.getSubscription().click();
	Thread.sleep(5000);
	sr.getmngsubsCTA().click();
	String TitleHome2=driver.getTitle();

	By a=By.xpath("//a[@class='btn btn-primary disabled' and @id='updateSubscription']");
    By b=By.xpath("//a[@class='btn disabled' and @id='estimates']");
	

if(mn.isElementPresent(a) && mn.isElementPresent(b))
	
	
{
	
	System.out.println("expected CTA not present  and expected to not present ");	
}
	
Actions action =new Actions(driver);

pp.ctaprodQty().sendKeys(Keys.CONTROL);

pp.ctaprodQty().sendKeys(Keys.BACK_SPACE);
Thread.sleep(10000);

pp.ctaprodQty().sendKeys("2");
Thread.sleep(5000);

By a1=By.xpath("//a[@class='btn btn-primary' and @id='updateSubscription']");
By b1=By.xpath("//a[@class='btn' and @id='estimates']");
Thread.sleep(5000);
if(mn.isElementPresent(a1) && mn.isElementPresent(b1))
	
	
{
	
	System.out.println("expected CTA present  and expected to  present ");	
}
Thread.sleep(5000);
	pp.createEstimate1().click();
	Thread.sleep(20000);
	//WebElement element = driver.findElement(By.xpath("//span[@class='control__indicator']"));
	WebDriverWait wait1 = new WebDriverWait(driver, 400);
	WebDriverWait wait = new WebDriverWait(driver, 400);
	WebElement element1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='control__indicator'])[2]")));
	element1.click();
	Thread.sleep(3000);
//	pp.ctapopupcheck().click();
	
	Thread.sleep(5000);
pp.ctapopupcontinue().click();
//loading mask
Thread.sleep(20000);

wait1.until(ExpectedConditions.titleContains("Estimate Details - CCM"));
	Assert.assertEquals(driver.getTitle(), "Estimate Details - CCM",
			"User not able to land reach estiamte ccm page");
	
  //sr.getback().click();
	Thread.sleep(20000);
	driver.navigate().back();
	Thread.sleep(3000);
  pp.ctaviewestimate().click();

	String TitleHome3=driver.getTitle();
	wait.until(ExpectedConditions.titleContains("Estimate Details - CCM"));
	Assert.assertEquals(TitleHome3, "Estimate Details - CCM", "User is not being able to reach  estimatedetails");


    driver.navigate().back();

	Thread.sleep(3000);
	pp.ctaprodQty().sendKeys(Keys.CONTROL);

	pp.ctaprodQty().sendKeys(Keys.BACK_SPACE);
    Thread.sleep(3000);

    pp.ctaprodQty().sendKeys("3");
	Thread.sleep(3000);
By updatesubscription= By.xpath("//a[@id='updateSubscription']");
if(!mn.isElementDisabled(updatesubscription));
	
{System.out.print("enabled");
	
}
By createestimate=By.xpath("//a[@class='btn' and @id='estimates']");

//By createestimate=By.xpath("//a[@class='btn btn-primary btn-to-cart modal-btn hide-for-print']");
if(!mn.isElementDisabled(createestimate));
	
{System.out.print("enabled");
driver.findElement(createestimate).click();
Thread.sleep(7000);
es.cancel().click();
}

By goproviderportalCTA=By.xpath("//a[@class='btn'] and text()='Go to Provider Portal']");
if(mn.isElementPresent(goproviderportalCTA))
	
{
	String 	OldTab=driver.getWindowHandle();



String  title4=null;		
Thread.sleep(7000);
sr.getproviderportal1().click();
Thread.sleep(7000);
		Thread.sleep(3000);
		Set<String> abc=driver.getWindowHandles();
		Iterator<String> it=abc.iterator();
	
		while(it.hasNext())
		{
			Thread.sleep(5000);
		driver.switchTo().window(it.next());
		title4 = driver.getTitle();
		Thread.sleep(5000);
		Assert.assertEquals(title4, "Technology Products, Services & Solutions - Connection" , "user not reach to connection page");
		driver.switchTo().window(OldTab);
		}
}
By contactusCTA=By.xpath("//a[@class='btn buy-again' and text()='Contact Us']");
if(mn.isElementPresent(contactusCTA))
	
{	Thread.sleep(5000);
sr.getcontactCTA().click();
Thread.sleep(5000);
By contactCTA=By.xpath("//a[@class='btn btn-secondary margin-right-zero']");
driver.findElement(contactCTA).click();
}
By subhistory=By.xpath("//h2[@class='section-title']] and text()='Subscription History']");
Thread.sleep(5000);
if(mn.isElementPresent(subhistory))
	
{
	System.out.println("history table present");
		
}


Thread.sleep(3000);
hd.logout();

Thread.sleep(10000);
	}
	catch (org.openqa.selenium.NoSuchElementException e) {
		
		  e.printStackTrace();
		  hd.logout();
	  Thread.sleep(5000);	

	   Assert.assertTrue(false, "Failed" + e.getMessage());

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

}
@Parameters({"username5","pswd5","url","dburl","dbun","dbpswd"})
@Test(priority =25,enabled=true)
public void Validate_calendar_27(String username , String pswd, String url,String dburl, String dbun, String dbpswd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{

try {	HomePage hm = new HomePage(driver);
	wait = new WebDriverWait(driver, 120);
	Thread.sleep(2000);
	driver.navigate().to(url);
	lp.getusername().sendKeys(username);
	
	lp.getpassword().sendKeys(pswd);

	lp.getloginbtn().click();
	

Thread.sleep(5000);
			String email11=username;
			String query = "select two_factor_code from users where email='" +email11+  "';";	            
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
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
	hm.getManage_Link().click();
	
	mn.getCalendar().click();;
	String title=driver.getTitle();
	wait.until(ExpectedConditions.titleContains("Calendar Monthly View - CCM"));
	Assert.assertEquals(title, "Calendar Monthly View - CCM", "User is not being able to reach  calndar page");

	Thread.sleep(5000);
	cl.getsubscribecal().click();
	Thread.sleep(5000);
	cl.getexpsubs().click();
	Thread.sleep(5000);
	cl.getcont().click();
	Thread.sleep(5000);
	Thread.sleep(5000);
	cl.getcopyURL().click();
	Thread.sleep(5000);
	cl.getclose().click();
	Thread.sleep(5000);
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	
	// Select se = new Select(in.getdropddownprov1());
	 //se.selectByIndex(2);

	
    js1.executeScript("window.scrollBy(0,2000)");
	Thread.sleep(5000);
	//WebElement element2 = driver.findElement(By.xpath("//body/div[@id='manage-content']/div[1]/section[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]//a[1]"));
	WebElement element2 = driver.findElement(By.xpath("//body/div[@id='manage-content']/div[@class='clearfix']/section[@class='container']/div/div[@class='detail-calendar-conatiner clearfix']/div[@class='past']/ul[1]/li[10]/div[1]/a[1]"));
	
	//body/div[@id='manage-content']/div[@class='clearfix']/section[@class='container']/div/div[@class='detail-calendar-conatiner clearfix']/div[@class='past']/ul[1]/li[10]/div[1]/a[1]
	//a[contains(text(),'Monthly Charges')]
element2.click();
Thread.sleep(3000);
WebElement element3 = driver.findElement(By.xpath("//a[contains(text(),'Monthly Charges')]"));
Thread.sleep(3000);
element3.click();
	Thread.sleep(5000);
	//cl.getexpiry().click();
	//String TitleHome2=driver.getTitle();
	//wait.until(ExpectedConditions.titleContains("Calendar Monthly View - CCM"));
	//Assert.assertEquals(title, "Calendar Monthly View - CCM", "User is not being able to reach  calndar page");
	Thread.sleep(3000);
hd.logout();

Thread.sleep(10000);
}catch (org.openqa.selenium.NoSuchElementException e) {
	
	  e.printStackTrace();
	  hd.logout();
Thread.sleep(5000);	

Assert.assertTrue(false, "Failed" + e.getMessage());

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


}


@Parameters({"username6","pswd6","url","dburl","dbun","dbpswd"})

@Test(priority =26,enabled=true)
public void Validate_insight_28(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
///

	try{HomePage hm = new HomePage(driver);
	wait = new WebDriverWait(driver, 120);
	Thread.sleep(2000);

	Thread.sleep(2000);
	lp.getusername().sendKeys(username);
	
	lp.getpassword().sendKeys(pswd);
	lp.getloginbtn().click();

	Thread.sleep(5000);
	String email11=username;
	String query = "select two_factor_code from users where email='" +email11+  "';";	            
	Class.forName("com.mysql.jdbc.Driver");				
	Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
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
	Thread.sleep(7000);
	hm.getInsight_Link().click();
	Thread.sleep(3000);
	 wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("Spend Analysis - CCM"));



String Insight_Titleact = driver.getTitle().trim();
String Insight_Titlexp = "Spend Analysis - CCM";
Assert.assertEquals(Insight_Titleact, Insight_Titlexp, "Insight Page is not getting open");

Thread.sleep(5000);


in.getSp1();
in.getSp2();
in.getSp3();
in.getSp4();
in.getSp5();

int a= in.getcountexpand();
int b=in.getcountdrag();
 in.getexpand().click();
 in.getcollapse().click();
 
 Select se = new Select(in.getdropddownprov());
 Select se1 = new Select(in.getdropddowntype());
 Select se2 = new Select(in.getdropddowncat());
 Select se3 = new Select(in.getdropddownservice());
 String SizeDropdownExp[] = { "Last 12 Months", "Last 3 Months", "Previous Quarter", "Current Year","Previous Year","All Time" };

	for (int p = 0; p < 6; p++) {
		se.selectByIndex(p);
		Thread.sleep(12000);
		Assert.assertEquals(se.getFirstSelectedOption().getText().trim(), SizeDropdownExp[p],
				"The Options appearing in the  Dropdown are not same as expected");
	}

	
	

	for (int p = 0; p < 6; p++) {
		se1.selectByIndex(p);
		Thread.sleep(12000);
		Assert.assertEquals(se1.getFirstSelectedOption().getText().trim(), SizeDropdownExp[p],
				"The Options appearing in the  Dropdown are not same as expected");
	}

	
	

	for (int p = 0; p < 6; p++) {
		se2.selectByIndex(p);
		Thread.sleep(12000);
		Assert.assertEquals(se2.getFirstSelectedOption().getText().trim(), SizeDropdownExp[p],
				"The Options appearing in the  Dropdown are not same as expected");
	}


	for (int p = 0; p < 6; p++) {
		se3.selectByIndex(p);
		Thread.sleep(12000);
		Assert.assertEquals(se3.getFirstSelectedOption().getText().trim(), SizeDropdownExp[p],
				"The Options appearing in the  Dropdown are not same as expected");
	}

	Thread.sleep(5000);
	hd.logout();
	Thread.sleep(5000);
	
}catch (org.openqa.selenium.NoSuchElementException e) {
		
		  e.printStackTrace();
	
			hd.logout();
	    Thread.sleep(5000);	
	 
	     Assert.assertTrue(false, "Failed" + e.getMessage());

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
	}
}


@Test(priority =27,enabled=false)
public void Validate_spend_provider_29() throws IOException, InterruptedException , ClassNotFoundException, SQLException{

	try {
	prop= new Properties();

	FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	
	 LoginPage lp= new LoginPage(driver);
		lp.getusername().sendKeys("saima.tabassum+2027@arpatech.com");
		lp.getpassword().sendKeys("Connection123");
		lp.getloginbtn().click();
	
	
	
		hm = new HomePage(driver);
	hm.getInsight_Link().click();
	Thread.sleep(3000);
	 wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("Spend Analysis - CCM"));



String Insight_Titleact = driver.getTitle().trim();
String Insight_Titlexp = "Spend Analysis - CCM";
Assert.assertEquals(Insight_Titleact, Insight_Titlexp, "Insight Page is not getting open");

Thread.sleep(10000);

	//String XPATH="//body/div[@id='insights-content']/div[@class='purchase-analysis-body']/div[@class='page-container']/div[@id='purchase-analysis']/div[@id='spendByMfg-wrapper']/div[@class='track-grid-item']/div[@id='spendByMfg']/div/div/div/*[1]//path[@fill='#ec6c69']";
	String XPATH="//body/div[@id='insights-content']/div[@class='purchase-analysis-body']/div[@class='page-container']/div[@id='purchase-analysis']/div[@id='spendByMfg-wrapper']/div[@class='track-grid-item']/div[@id='spendByMfg']/div/div/div//*[local-name() = 'svg']//*[local-name() = 'g']//*[local-name() = 'g']//*[local-name() = 'circle']";
	
	WebElement svgObj = driver.findElement(By.xpath(XPATH));
	Thread.sleep(10000);
	Actions actionBuilder = new Actions(driver);
	actionBuilder.click(svgObj).build().perform();
	//driver.navigate().back();
	
	
	//String XPATH1="//body/div[@id='insights-content']/div[@class='purchase-analysis-body']/div[@class='page-container']/div[@id='purchase-analysis']/div[@id='savingsByMfg-wrapper']/div[@class='track-grid-item']/div[@id='savingsByMfg']/div/div/div//*[local-name() = 'svg']//*[local-name() = 'g']//*[local-name() = 'g']//*[local-name() = 'circle'][@cx='299.5']";
			
			
	
	
			
	
	//WebElement svgObj1 = driver.findElement(By.xpath(XPATH1));
	//

	//actionBuilder.click(svgObj1).build().perform();
	//driver.navigate().back();

	
	//String XPATH2="//body/div[@id='insights-content']/div[@class='purchase-analysis-body']/div[@class='page-container']/div[@id='purchase-analysis']/div[@id='yearOverYearSpend-wrapper']/div[@class='track-grid-item']/div[@id='yearOverYearSpend']/div/div/div//*[local-name() = 'svg']//*[local-name() = 'g']//*[local-name() = 'g']//*[local-name() = 'rect'][@x='297']";
	

	
			
	
	//WebElement svgObj2 = driver.findElement(By.xpath(XPATH2));
	

	//actionBuilder.click(svgObj2).build().perform();
	//driver.navigate().back();

//String XPATH3="//body/div[@id='insights-content']/div[@class='purchase-analysis-body']/div[@class='page-container']/div[@id='purchase-analysis']/div[@id='yearOverYearSpend2-wrapper']/div[@class='track-grid-item']/div[@id='yearOverYearSpend2']/div/div/div//*[local-name() = 'svg']//*[local-name() = 'g']//*[local-name() = 'g']//*[local-name() = 'rect'][@x='300']";
	

	
			
	
	//WebElement svgObj3 = driver.findElement(By.xpath(XPATH3));
	

	//actionBuilder.click(svgObj3).build().perform();
	//driver.navigate().back();
	
	
	
	
	
	
	Thread.sleep(10000);
	
	
	
	
	
	
	//
	
	//wait.until(ExpectedConditions.elementToBeClickable(cf.getColumn1stDropdown()));
	Thread.sleep(5000);
	cf.getColumn1stDropdown().click();
	Thread.sleep(5000);
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	
    js1.executeScript("window.scrollBy(0,150)");
	Thread.sleep(5000);
	WebDriverWait wt2 = new WebDriverWait(driver, 180);
	
	   Thread.sleep(20000);
	   By billRow1=By.xpath("//span[contains(text(),'Microsoft CSP')]");
	 WebElement billrow3=  driver.findElement(billRow1);
wait.until(ExpectedConditions.elementToBeClickable(billRow1));
	   Thread.sleep(5000);
         
	   billrow3.click();
	
	Thread.sleep(3000);
	cf.getApplyBtn().click();
	
	bill.getsprovsearch().sendKeys("Microsoft CSP");
	Thread.sleep(6000);
	cf.getfiltersearchicon().click();
	Thread.sleep(4000);
	cf.getresetall().click();
	Thread.sleep(4000);
	cf.getselectfeilds().click();
	Thread.sleep(4000);
	cf.getsearchDisplay().sendKeys("Provider");

	
	
	
	
	if(bill.getprovname().isSelected()) // if Checked 
	{
		if(bill.getprovid().isSelected()) // if Checked 
		{
			System.out.print("checked");
			
		}
	}
	      
		cf.getunselectall().click();
		
		if(!bill.getprovname().isSelected()) // if unChecked 
		{
			if(!bill.getprovid().isSelected()) // if unChecked 
			{
				System.out.print("unchecked");
				
			}
		}
		
		
		
		
	cf.getselectall().click();
	if(bill.getprovname().isSelected()) // if Checked 
	{
		if(bill.getprovid().isSelected()) // if Checked 
		{
			System.out.print("checked");
			
		}
	}
	
	cf.getunselectall().click();
	bill.getprovid().click();
	bill.getprovname().click();

	cf.getapply().click();
	By show0=By.xpath("//label[@class='drag-handle sort-arrow descend']");
	By show=By.xpath("//label[@class='drag-handle sort-arrow none'][contains(text(),'Provider ID')]");
	By show1=By.xpath("//label[@class='drag-handle sort-arrow none'][contains(text(),'Provider Name')]");
	if(cf.isElementPresent(show0))
	{
		System.out.print("Show sort");

       }
	if(cf.isElementPresent(show))
	{
		System.out.print("Show prov id");

       }
	if(cf.isElementPresent(show1))
	{
		System.out.print("Show prov name");

       }
	Thread.sleep(6000);
  cf.getresetall().click();
	Thread.sleep(6000);
  hd.logout();
	Thread.sleep(6000);
}catch(org.openqa.selenium.ElementClickInterceptedException e) {
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
	}
}

@Test(priority =28,enabled=false)
public void Validate_spend_service_30() throws IOException, InterruptedException , ClassNotFoundException, SQLException{

	try {
	
	 LoginPage lp= new LoginPage(driver);
	//	lp.getusername().sendKeys(prop.getProperty("username_cust3"));
		//lp.getpassword().sendKeys(prop.getProperty("pswd_cust3"));
		//lp.getloginbtn().click();	

		//FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
		//prop.load(fis);
		
		// LoginPage lp= new LoginPage(driver);
		lp.getusername().sendKeys("saima.tabassum+2027@arpatech.com");
		lp.getpassword().sendKeys("Connection123");
			lp.getloginbtn().click();
	
	
		hm = new HomePage(driver);
	hm.getInsight_Link().click();
	Thread.sleep(3000);
	 wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("Spend Analysis - CCM"));



String Insight_Titleact = driver.getTitle().trim();
String Insight_Titlexp = "Spend Analysis - CCM";
Assert.assertEquals(Insight_Titleact, Insight_Titlexp, "Insight Page is not getting open");

Thread.sleep(5000);

	//String XPATH="//body/div[@id='insights-content']/div[@class='purchase-analysis-body']/div[@class='page-container']/div[@id='purchase-analysis']/div[@id='spendByMfg-wrapper']/div[@class='track-grid-item']/div[@id='spendByMfg']/div/div/div/*[1]//path[@fill='#ec6c69']";
	//String XPATH="//body/div[@id='insights-content']/div[@class='purchase-analysis-body']/div[@class='page-container']/div[@id='purchase-analysis']/div[@id='spendByMfg-wrapper']/div[@class='track-grid-item']/div[@id='spendByMfg']/div/div/div//*[local-name() = 'svg']//*[local-name() = 'g']//*[local-name() = 'g']//*[local-name() = 'circle']";
	
	//WebElement svgObj = driver.findElement(By.xpath(XPATH));
	
	Actions actionBuilder = new Actions(driver);
	//actionBuilder.click(svgObj).build().perform();
	//driver.navigate().back();
	
	
	
	
	//String XPATH1="//body/div[@id='insights-content']/div[@class='purchase-analysis-body']/div[@class='page-container']/div[@id='purchase-analysis']/div[@id='savingsByMfg-wrapper']/div[@class='track-grid-item']/div[@id='savingsByMfg']/div/div/div//*[local-name() = 'svg']//*[local-name() = 'g']//*[local-name() = 'g']//*[local-name() = 'circle'][@cx='299.5']";
	String XPATH1y="//body/div[@id='insights-content']/div[@class='purchase-analysis-body']/div[@class='page-container']/div[@id='purchase-analysis']/div[@id='savingsByMfg-wrapper']/div[@class='track-grid-item']/div[@id='savingsByMfg']/div/div/div//*[local-name() = 'svg']//*[local-name() = 'g']//*[local-name() = 'g']//*[local-name() = 'circle' and @cx='299.5']";
	
			
	Thread.sleep(5000);
	

	
	WebElement svgObj1 = driver.findElement(By.xpath(XPATH1y));
	
	Thread.sleep(5000);
	actionBuilder.click(svgObj1).build().perform();
	Thread.sleep(5000);
//	driver.navigate().back();

	///////////////

	
	
	
	
	
	//
	Thread.sleep(5000);
	cf.getColumn1stDropdown().click();
	Thread.sleep(5000);
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	
    js1.executeScript("window.scrollBy(0,150)");
	Thread.sleep(5000);
	WebDriverWait wt2 = new WebDriverWait(driver, 180);
	
	   Thread.sleep(20000);

           
wait.until(ExpectedConditions.elementToBeClickable(cf.getbillRow()));
	   Thread.sleep(5000);
         
	cf.getbillRow().click();
	
	Thread.sleep(3000);
	cf.getApplyBtn().click();
	
	bill.getsprovsearch().sendKeys("Microsoft CSP");
	Thread.sleep(6000);
	cf.getfiltersearchicon().click();
	Thread.sleep(4000);
	cf.getresetall().click();
	Thread.sleep(4000);
	cf.getselectfeilds().click();
	Thread.sleep(4000);
	cf.getsearchDisplay().sendKeys("Provider");
	
	//
	

	
	if(bill.getprovname().isSelected()) // if Checked 
	{
		if(bill.getprovid().isSelected()) // if Checked 
		{
			System.out.print("checked");
			
		}
	}
	      
		cf.getunselectall().click();
		
		if(!bill.getprovname().isSelected()) // if unChecked 
		{
			if(!bill.getservname().isSelected()) // if unChecked 
			{
				System.out.print("unchecked");
				
			}
		}
		
		
		
		
	cf.getselectall().click();
	if(bill.getprovname().isSelected()) // if Checked 
	{
		if(bill.getprovid().isSelected()) // if Checked 
		{
			System.out.print("checked");
			
		}
	}
	
	cf.getunselectall().click();
	bill.getservname().click();
	bill.getprovname().click();

	cf.getapply().click();
	By show0=By.xpath("//label[@class='drag-handle sort-arrow descend']");
	By show=By.xpath("//label[@class='drag-handle sort-arrow none'][contains(text(),'Provider ID')]");
	By show1=By.xpath("//label[@class='drag-handle sort-arrow none'][contains(text(),'Provider Name')]");
	if(cf.isElementPresent(show0))
	{
		System.out.print("Show sort");

       }
	if(cf.isElementPresent(show))
	{
		System.out.print("Show prov id");

       }
	if(cf.isElementPresent(show1))
	{
		System.out.print("Show prov name");

       }
	Thread.sleep(6000);
  cf.getresetall().click();
	Thread.sleep(3000);
	  hd.logout();
	  Thread.sleep(5000);
}catch(org.openqa.selenium.ElementClickInterceptedException e) {
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
		}
}

@Test(priority =29,enabled=false)
public void Validate_spendtype_31() throws IOException, InterruptedException , ClassNotFoundException, SQLException{

try {
	 LoginPage lp= new LoginPage(driver);
	//	lp.getusername().sendKeys(prop.getProperty("username_cust3"));
		//lp.getpassword().sendKeys(prop.getProperty("pswd_cust3"));
		//lp.getloginbtn().click();	

		//FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		// LoginPage lp= new LoginPage(driver);
		lp.getusername().sendKeys("saima.tabassum+2027@arpatech.com");
		lp.getpassword().sendKeys("Connection123");
			lp.getloginbtn().click();

			hm = new HomePage(driver);
			hm.getInsight_Link().click();
			Thread.sleep(3000);
			 wait = new WebDriverWait(driver, 60);
				wait.until(ExpectedConditions.titleContains("Spend Analysis - CCM"));



		String Insight_Titleact = driver.getTitle().trim();
		String Insight_Titlexp = "Spend Analysis - CCM";
		Assert.assertEquals(Insight_Titleact, Insight_Titlexp, "Insight Page is not getting open");

		Thread.sleep(5000);
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		
	    js2.executeScript("window.scrollBy(0,1300)");
		Thread.sleep(10000);
	///////////////
	//String XPATH2="//body/div[@id='insights-content']/div[@class='purchase-analysis-body']/div[@class='page-container']/div[@id='purchase-analysis']/div[@id='yearOverYearSpend-wrapper']/div[@class='track-grid-item']/div[@id='yearOverYearSpend']/div/div/div//*[local-name() = 'svg']//*[local-name() = 'g']//*[local-name() = 'g']//*[local-name() = 'rect'][@x='193']";
		String XPATH21="//body/div[@id='insights-content']/div[@class='purchase-analysis-body']/div[@class='page-container']/div[@id='purchase-analysis']/div[@id='yearOverYearSpend-wrapper']/div[@class='track-grid-item']/div[@id='yearOverYearSpend']/div/div/div[1]//*[local-name()='svg']//*[local-name()='g']//*[local-name()='g'][1]//*[local-name() = 'rect'][@x='297']";
	
				
				Actions actionBuilder = new Actions(driver);
	
			
	
	WebElement svgObj2 = driver.findElement(By.xpath(XPATH21));
	

	actionBuilder.click(svgObj2).build().perform();
	//driver.navigate().back();


	
	
	
	
	
	
	Thread.sleep(10000);
	
	
	
	
	
	//
	
	
WebElement vv = driver.findElement(By.xpath("//th[6]//div[1]//div[3]"));
vv.click();
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	

    js1.executeScript("window.scrollBy(0,150)");
	Thread.sleep(5000);
	WebDriverWait wt2 = new WebDriverWait(driver, 180);
	
	   Thread.sleep(5000);

           

         
	cf.getbillRow1().click();
	
	Thread.sleep(10000);
	WebElement vv1 = driver.findElement(By.xpath("//th[6]//div[1]//div[3]//div[1]//div[1]//div[2]//a[2]"));
	
	vv1.click();
	
	bill.getsprovsearch().sendKeys("Microsoft CSP");
	Thread.sleep(6000);
	cf.getfiltersearchicon().click();
	Thread.sleep(4000);
	cf.getresetall().click();
	Thread.sleep(4000);
	cf.getselectfeilds().click();
	Thread.sleep(4000);
	cf.getsearchDisplay().sendKeys("Provider");

	
	
	
	
	if(bill.getprovname().isSelected()) // if Checked 
	{
		
			System.out.print("checked");
			
		
	}
	      
		cf.getunselectall().click();
		
		if(!bill.getprovname().isSelected()) // if unChecked 
		{
			
				System.out.print("unchecked");
				
			
		}
		
		
		
		
	cf.getselectall().click();
	if(bill.getprovname().isSelected()) // if Checked 
	{
		
			System.out.print("checked");
			
		
	}
	
	cf.getunselectall().click();

	bill.getprovname().click();

	cf.getapply().click();
	By show0=By.xpath("//label[@class='drag-handle sort-arrow descend']");
	//By show=By.xpath("//label[@class='drag-handle sort-arrow none'][contains(text(),'Provider ID')]");
	By show1=By.xpath("//label[@class='drag-handle sort-arrow none'][contains(text(),'Provider Name')]");
	if(cf.isElementPresent(show0))
	{
		System.out.print("Show sort");

       }

	if(cf.isElementPresent(show1))
	{
		System.out.print("Show prov name");

       }
	Thread.sleep(6000);
  cf.getresetall().click();
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
}
}

@Test(priority =30,enabled=false)
public void Validate_spendt_category_32() throws IOException, InterruptedException , ClassNotFoundException, SQLException{

	
	try { LoginPage lp= new LoginPage(driver);
		//	lp.getusername().sendKeys(prop.getProperty("username_cust3"));
			//lp.getpassword().sendKeys(prop.getProperty("pswd_cust3"));
			//lp.getloginbtn().click();	

			//FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
			
			// LoginPage lp= new LoginPage(driver);
			lp.getusername().sendKeys("saima.tabassum+2027@arpatech.com");
			lp.getpassword().sendKeys("Connection123");
				lp.getloginbtn().click();

				hm = new HomePage(driver);
				hm.getInsight_Link().click();
				Thread.sleep(3000);
				 wait = new WebDriverWait(driver, 60);
					wait.until(ExpectedConditions.titleContains("Spend Analysis - CCM"));



			String Insight_Titleact = driver.getTitle().trim();
			String Insight_Titlexp = "Spend Analysis - CCM";
			Assert.assertEquals(Insight_Titleact, Insight_Titlexp, "Insight Page is not getting open");

			Thread.sleep(5000);
			JavascriptExecutor js2 = (JavascriptExecutor)driver;
			
		    js2.executeScript("window.scrollBy(0,1300)");
			Thread.sleep(10000);

	///////////////
			//String XPATH21="//body/div[@id='insights-content']/div[@class='purchase-analysis-body']/div[@class='page-container']/div[@id='purchase-analysis']/div[@id='yearOverYearSpend-wrapper']/div[@class='track-grid-item']/div[@id='yearOverYearSpend']/div/div/div[1]//*[local-name()='svg']//*[local-name()='g']//*[local-name()='g'][1]//*[local-name() = 'rect'][@x='193']";
			String cc="//body[1]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/div[3]/div[1]/div[1]/div[1]/*[local-name()='svg'][1]/*[local-name()='g'][2]/*[local-name()='g'][1]/*[local-name()='g'][2]//*[local-name() = 'rect'][@x='294']";
			
			Actions actionBuilder = new Actions(driver);

		

WebElement svgObj2 = driver.findElement(By.xpath(cc));


actionBuilder.click(svgObj2).build().perform();
	
	



Thread.sleep(5000);
WebElement vv = driver.findElement(By.xpath("//th[6]//div[1]//div[3]"));
vv.click();
JavascriptExecutor js1 = (JavascriptExecutor)driver;


js1.executeScript("window.scrollBy(0,150)");
Thread.sleep(5000);
WebDriverWait wt2 = new WebDriverWait(driver, 180);

   Thread.sleep(5000);

       

     
cf.getbillRow1().click();

Thread.sleep(10000);
WebElement vv1 = driver.findElement(By.xpath("//th[6]//div[1]//div[3]//div[1]//div[1]//div[2]//a[2]"));

vv1.click();

bill.getsprovsearch().sendKeys("Microsoft CSP");
Thread.sleep(6000);
cf.getfiltersearchicon().click();
Thread.sleep(4000);
cf.getresetall().click();
Thread.sleep(4000);
cf.getselectfeilds().click();
Thread.sleep(4000);
cf.getsearchDisplay().sendKeys("Provider");





if(bill.getprovname().isSelected()) // if Checked 
{
	
		System.out.print("checked");
		
	
}
      
	cf.getunselectall().click();
	
	if(!bill.getprovname().isSelected()) // if unChecked 
	{
		
			System.out.print("unchecked");
			
		
	}
	
	
	
	
cf.getselectall().click();
if(bill.getprovname().isSelected()) // if Checked 
{
	
		System.out.print("checked");
		
	
}

cf.getunselectall().click();

bill.getprovname().click();

cf.getapply().click();
By show0=By.xpath("//label[@class='drag-handle sort-arrow descend']");
//By show=By.xpath("//label[@class='drag-handle sort-arrow none'][contains(text(),'Provider ID')]");
By show1=By.xpath("//label[@class='drag-handle sort-arrow none'][contains(text(),'Provider Name')]");
if(cf.isElementPresent(show0))
{
	System.out.print("Show sort");

   }

if(cf.isElementPresent(show1))
{
	System.out.print("Show prov name");

   }
Thread.sleep(6000);
cf.getresetall().click();
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
	}
}


@Test(priority =31,enabled=false)//need not to be aaded should be false
public void Validate_qreprots_auditlog_33() throws IOException, InterruptedException , ClassNotFoundException, SQLException{

	try {
	prop= new Properties();
	auditlog al=new auditlog(driver);
	FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);

	LoginPage lp= new LoginPage(driver);
	//	lp.getusername().sendKeys(prop.getProperty("username_cust3"));
		//lp.getpassword().sendKeys(prop.getProperty("pswd_cust3"));
		//lp.getloginbtn().click();	

		//FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		Thread.sleep(3000);
		// LoginPage lp= new LoginPage(driver);
			lp.getusername().sendKeys("qunoot.ahmed+000@arpatech.com");


			lp.getpassword().sendKeys("Test*123");
			lp.getloginbtn().click();



		hm = new HomePage(driver);
	hm.getInsight_Link().click();
	
	
	Actions action = new Actions(driver);
	
	
    WebElement btn = driver.findElement(By.xpath("//a[contains(text(),'Reports')]"));
    action.moveToElement(btn).perform();
	
	
	
	Thread.sleep(3000);
	
	
	al.getauditlog().click();
	
	 
String Insight_Titleact = driver.getTitle().trim();
String Insight_Titlexp = "Audit Log - CCM";
Assert.assertEquals(Insight_Titleact, Insight_Titlexp, "Insight Page is not getting open");

Thread.sleep(5000);
String SizeDropdownExp[] = { "//label[@class='drag-handle sort-arrow none'][contains(text(),'Date')]", "//label[@class='drag-handle sort-arrow none'][contains(text(),'Time')]", "//label[@class='drag-handle sort-arrow none'][contains(text(),'User')]", "//label[@class='drag-handle sort-arrow none'][contains(text(),'Action')]", "//label[@class='drag-handle sort-arrow none'][contains(text(),'Action Type')]", "//label[@class='drag-handle sort-arrow none'][contains(text(),'IP')]" ,"//label[@class='drag-handle sort-arrow none'][contains(text(),'Browser')]"};
cf.matchHeaders(SizeDropdownExp);

//cf.export();
//cf.email();
//cf.print();

	///////////////
	Actions actionBuilder = new Actions(driver);
	 wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.elementToBeClickable(al.getColumn1stDropdown()));
	
	al.getColumn1stDropdown().click();
	Thread.sleep(5000);
	WebDriverWait wt2 = new WebDriverWait(driver, 180);
	
	   Thread.sleep(7000);

           
//wait.until(ExpectedConditions.elementToBeClickable(al.gettimeperiod()));
	   //Thread.sleep(5000);
         
	   //al.gettimeperiod().click();
	   Select Se = new Select(al.gettimeperiod());
	   
		Se.selectByIndex(2);
	   
		
		   Select Se1 = new Select(al.getfrom());
		   
			Se1.selectByIndex(2);
			   Select Se2 = new Select(al.getto());
			   
				Se2.selectByIndex(2);
		
		
	Thread.sleep(10000);
	wait.until(ExpectedConditions.elementToBeClickable(al.getapply()));
	
	al.getapply().click();
	Thread.sleep(3000);
	cf.getresetall().click();
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
	}
}



@Parameters({"username6","pswd6","url","dburl","dbun","dbpswd"})
@Test(priority =33,enabled=true)
public void Validate_reprots_agreements_35(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{

	try{LoginPage lp= new LoginPage(driver);

	 wait = new WebDriverWait(driver, 60);
		hm = new HomePage(driver);
	//hm.getInsight_Link().click();
	Thread.sleep(3000);
	lp.getusername().sendKeys(username);
	
	lp.getpassword().sendKeys(pswd);

	lp.getloginbtn().click();
	
	Thread.sleep(5000);
	String email11=username;
	String query = "select two_factor_code from users where email='" +email11+  "';";	            
	Class.forName("com.mysql.jdbc.Driver");				
	Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
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
	hm = new HomePage(driver);
	Thread.sleep(10000);
	hm.getInsight_Link().click();
	
	Actions action = new Actions(driver);
   // WebElement btn = driver.findElement(By.xpath("//a[@class='top-link' and text()='Comparative Analysis']"));
    
    Thread.sleep(6000);
// btn.click();

 Thread.sleep(6000);
	
	Actions action1 = new Actions(driver);
    WebElement btn1 = driver.findElement(By.xpath("//a[contains(text(),'Reports')]"));
    action.moveToElement(btn1).perform();
    Thread.sleep(5000);
	sagree.getsa().click();
	
	

Thread.sleep(5000);
String SizeDropdownExp[] = { "//label[@class='drag-handle sort-arrow none'][contains(text(),'Agreement')]", "//label[@class='drag-handle sort-arrow none'][contains(text(),'Provider')]", "//label[@class='drag-handle sort-arrow none'][contains(text(),'Service')]"};
cf.matchHeaders(SizeDropdownExp);
Thread.sleep(7000);
cf.export();
Thread.sleep(5000);
cf.email();	Thread.sleep(5000);
//cf.print();

	///////////////
	Actions actionBuilder = new Actions(driver);
	Thread.sleep(5000);
	wait.until(ExpectedConditions.elementToBeClickable(sagree.getcolfirst()));
	Thread.sleep(60000);
	sagree.getcolfirst().click();
	Thread.sleep(10000);
	WebDriverWait wt2 = new WebDriverWait(driver, 180);
	
	   Thread.sleep(20000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
	    js1.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(5000);
	  
	   Thread.sleep(5000);
         
	sagree.getAPCRow().click();
	 Thread.sleep(5000);
	sagree.getapply().click();

         
	 Thread.sleep(5000);
	
cf.getselectfeilds().click();
Thread.sleep(5000);
	cf.getsearchDisplay().sendKeys("SKU");

	
	
	 Thread.sleep(5000);
	
	if(sagree.getsasku().isSelected()) // if Checked 
	{
		
	}
	Thread.sleep(5000);
		cf.getunselectall().click();
		
		if(!sagree.getsasku().isSelected()) // if unChecked 
		{
		
		}
		
		
		Thread.sleep(5000);
		
	cf.getselectall().click();
	if(sagree.getsasku().isSelected()) // if Checked 
	{
	
	}
	
	Thread.sleep(3000);
	cf.getunselectall().click();
	
	Thread.sleep(3000);
	sagree.getsasku().click();
	Thread.sleep(3000);

	cf.getapply().click();
	Thread.sleep(3000);
	By show=By.xpath("//label[@class='drag-handle sort-arrow none'][contains(text(),'SKU ID')]");

	Thread.sleep(3000);
	if(cf.isElementPresent(show))
	{
		

       }

	 Thread.sleep(10000);
	   
	cf.getresetall().click();
	Thread.sleep(5000);
	  hd.logout();
	  Thread.sleep(5000);
	}
	catch(org.openqa.selenium.ElementClickInterceptedException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
		Thread.sleep(5000);
		hd.logout();
		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
	catch (org.openqa.selenium.TimeoutException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
		Thread.sleep(5000);
		hd.logout();
		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
	catch (org.openqa.selenium.StaleElementReferenceException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
		Thread.sleep(5000);
		hd.logout();
		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}

}

@Parameters({"username6","pswd6","url","dburl","dbun","dbpswd"})
@Test(priority =34,enabled=true)
public void Validate_reprots_subscriptions_36(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{

try {
	LoginPage lp= new LoginPage(driver);

	 wait = new WebDriverWait(driver, 60);
		hm = new HomePage(driver);
	//hm.getInsight_Link().click();
		driver.get(url);
	Thread.sleep(6000);
	lp.getusername().sendKeys(username);
	
	lp.getpassword().sendKeys(pswd);
	lp.getloginbtn().click();
	
	Thread.sleep(5000);
	String email11=username;
	String query = "select two_factor_code from users where email='" +email11+  "';";	            
	Class.forName("com.mysql.jdbc.Driver");				
	Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
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
	
	hm = new HomePage(driver);
	Thread.sleep(10000);
	hm.getInsight_Link().click();
	
	Actions action = new Actions(driver);

	
	Actions action1 = new Actions(driver);
    WebElement btn1 = driver.findElement(By.xpath("//a[contains(text(),'Reports')]"));
    action.moveToElement(btn1).perform();
    Thread.sleep(5000);

	
	


	
	
	sub.getsub().click();
	
	 wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("Subscriptions - CCM"));

String Insight_Titleact = driver.getTitle().trim();
String Insight_Titlexp = "Subscriptions - CCM";
Assert.assertEquals(Insight_Titleact, Insight_Titlexp, "Insight Page is not getting open");

Thread.sleep(5000);
String SizeDropdownExp[] = { "//label[@class='drag-handle sort-arrow none'][contains(text(),'ID')]", "//label[@class='drag-handle sort-arrow none'][contains(text(),'Subscription ID')]"};
cf.matchHeaders(SizeDropdownExp);

cf.export();
Thread.sleep(5000);
cf.email();
//cf.print();
Thread.sleep(5000);
	///////////////
	Actions actionBuilder = new Actions(driver);

	wait.until(ExpectedConditions.elementToBeClickable(sub.getcolfirst()));
	Thread.sleep(30000);
	sub.getcolfirst().click();
	Thread.sleep(5000);
	WebDriverWait wt2 = new WebDriverWait(driver, 180);
	
	   Thread.sleep(20000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
	    js1.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(5000);
	  
	
	   wt2.until(ExpectedConditions.elementToBeClickable(sub.getAPCRow()));
	   Thread.sleep(5000);
         
	sub.getAPCRow().click();
	Thread.sleep(5000);
	sub.getapply().click();

         
	
	Thread.sleep(5000);
cf.getselectfeilds().click();
Thread.sleep(5000);
	cf.getsearchDisplay().sendKeys("SKU");

	
	Thread.sleep(5000);
	
	
	if(sub.getsasku().isSelected()) // if Checked 
	{
		
	}

		cf.getunselectall().click();
		
		if(!sub.getsasku().isSelected()) // if unChecked 
		{
		
		}
		
		
		Thread.sleep(5000);
		
	cf.getselectall().click();
	if(sub.getsasku().isSelected()) // if Checked 
	{
	
	}
	Thread.sleep(5000);
	cf.getunselectall().click();
	Thread.sleep(5000);
	sub.getsasku().click();
	Thread.sleep(5000);

	cf.getapply().click();

	By show=By.xpath("//label[@class='drag-handle sort-arrow none'][contains(text(),'SKU ID')]");

	
	if(cf.isElementPresent(show))
	{
		

       }


	Thread.sleep(5000);
	cf.getresetall().click();

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
}
catch (org.openqa.selenium.NoSuchElementException e) {
	
	  e.printStackTrace();

  
  Thread.sleep(5000);	

   Assert.assertTrue(false, "Failed" + e.getMessage());

}

}

@Parameters({"username6","pswd6","url","dburl","dbun","dbpswd"})
@Test(priority =35,enabled=true)
public void Validate_reprots_billine_37(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	try{LoginPage lp= new LoginPage(driver);

	 wait = new WebDriverWait(driver, 60);
		hm = new HomePage(driver);
	//hm.getInsight_Link().click();
	Thread.sleep(3000);
	lp.getusername().sendKeys(username);
	
	lp.getpassword().sendKeys(pswd);
	lp.getloginbtn().click();
	
	
	
	Thread.sleep(5000);
	String email11=username;
	String query = "select two_factor_code from users where email='" +email11+  "';";	            
	Class.forName("com.mysql.jdbc.Driver");				
	Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
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
	hm = new HomePage(driver);
	Thread.sleep(20000);
	hm.getInsight_Link().click();
	

	Actions action = new Actions(driver);
	   // WebElement btn = driver.findElement(By.xpath("//a[@class='top-link' and text()='Comparative Analysis']"));
	    
	    Thread.sleep(6000);

		
		Actions action1 = new Actions(driver);
	    WebElement btn1 = driver.findElement(By.xpath("//a[contains(text(),'Reports')]"));
	    action.moveToElement(btn1).perform();
	    Thread.sleep(5000);
	
	
	sub.getbillline().click();
	
	 wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("Bill Lines - CCM"));

String Insight_Titleact = driver.getTitle().trim();
String Insight_Titlexp = "Bill Lines - CCM";
Assert.assertEquals(Insight_Titleact, Insight_Titlexp, "Insight Page is not getting open");

Thread.sleep(5000);
String SizeDropdownExp[] = { "//label[@class='drag-handle sort-arrow none'][contains(text(),'Bill ID')]", "//label[@class='drag-handle sort-arrow none'][contains(text(),'Subscription Name')]"};
cf.matchHeaders(SizeDropdownExp);

cf.export();
Thread.sleep(5000);
cf.email();
//cf.print();
Thread.sleep(5000);
	///////////////
	Actions actionBuilder = new Actions(driver);
	WebDriverWait wt2 = new WebDriverWait(driver, 180);
	
	   Thread.sleep(20000);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		
	    js1.executeScript("window.scrollBy(0,200)");
	    Thread.sleep(5000);
	  

	wait.until(ExpectedConditions.elementToBeClickable(bline.getcolfirst()));
	
	bline.getcolfirst().click();
	Thread.sleep(5000);

	   Thread.sleep(20000);
	  

	   wt2.until(ExpectedConditions.elementToBeClickable(bline.getAPCRow()));
	   Thread.sleep(5000);
         
	   bline.getAPCRow().click();
		Thread.sleep(5000);
	sub.getapply().click();

         
	
	Thread.sleep(5000);
cf.getselectfeilds().click();
Thread.sleep(5000);
	cf.getsearchDisplay().sendKeys("sub");

	
	
	
	Thread.sleep(5000);
	if(bline.getsasku().isSelected()) // if Checked 
	{
		
	}
	  
		cf.getunselectall().click();
		
		if(!bline.getsasku().isSelected()) // if unChecked 
		{
		
		}
		
		
		Thread.sleep(5000);
		
	cf.getselectall().click();
	if(bline.getsasku().isSelected()) // if Checked 
	{
	
	}
	Thread.sleep(5000);
	cf.getunselectall().click();
	bline.getsasku().click();


	cf.getapply().click();

	By show=By.xpath("//label[@class='drag-handle sort-arrow none'][contains(text(),'sub')]");

	
	if(cf.isElementPresent(show))
	{
		

       }

	Thread.sleep(5000);
	   
	cf.getresetall().click();

	 WebElement h= driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[1]/i[1]"));
		wait.until(ExpectedConditions.elementToBeClickable(h));
	  
	     Actions ab =new Actions(driver);
	   ab.moveToElement(h).click().perform();
	    Thread.sleep(10000);
	     
	     
	  
	     
	    
		  // h1= driver.findElement(By.xpath("//div[@class='td-option-drop-wrapper show-for-tablet']//div[@class='td_option_drop reports-show-more']//div//a[contains(text(),'View Product Details')]"));
		 // WebElement h1= driver.findElement(By.xpath("//div[@class='td-option-drop-wrapper show-for-tablet']//div[@class='td_option_drop reports-show-more']//div//a[contains(text(),'View Asset Details')]"));
	      
		 ab.moveToElement(bill.getviewbill()).click().perform();
			
		
		 
		 Thread.sleep(5000);
		 

		 Assert.assertEquals(driver.getTitle(), "Bills - CCM",
				"User have not reached the Asset Detail Screen after selecting Asset Detail Option from Asset Report");
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
	}
	catch (org.openqa.selenium.NoSuchElementException e) {
		
		  e.printStackTrace();
	
	    
	    Thread.sleep(5000);	
	 
	     Assert.assertTrue(false, "Failed" + e.getMessage());

	}
}

@Parameters({"username6","pswd6","url","dburl","dbun","dbpswd"})
@Test(priority = 36,enabled=true)
public void Validate_reprots_bills_38(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{

	
	try{LoginPage lp= new LoginPage(driver);

	 wait = new WebDriverWait(driver, 60);
		hm = new HomePage(driver);
	//hm.getInsight_Link().click();
	Thread.sleep(3000);
	lp.getusername().sendKeys(username);
	
	lp.getpassword().sendKeys(pswd);
	lp.getloginbtn().click();
	
	
	
	Thread.sleep(5000);
	String email11=username;
	String query = "select two_factor_code from users where email='" +email11+  "';";	            
	Class.forName("com.mysql.jdbc.Driver");				
	Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
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
	hm = new HomePage(driver);
	Thread.sleep(20000);
	hm.getInsight_Link().click();
	

	Actions action = new Actions(driver);
	   // WebElement btn = driver.findElement(By.xpath("//a[@class='top-link' and text()='Comparative Analysis']"));
	    
	    Thread.sleep(10000);

		
		Actions action1 = new Actions(driver);
	    WebElement btn1 = driver.findElement(By.xpath("//a[contains(text(),'Reports')]"));
	    action.moveToElement(btn1).perform();
	    Thread.sleep(5000);
	
	sub.getbill().click();
	
	 wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("Bills - CCM"));

String Insight_Titleact = driver.getTitle().trim();
String Insight_Titlexp = "Bills - CCM";
Assert.assertEquals(Insight_Titleact, Insight_Titlexp, "Insight Page is not getting open");

Thread.sleep(5000);
String SizeDropdownExp[] = { "//label[@class='drag-handle sort-arrow none'][contains(text(),'Bill ID')]", "//label[@class='drag-handle sort-arrow none'][contains(text(),'Provider Name')]"};
cf.matchHeaders(SizeDropdownExp);

cf.export();
Thread.sleep(5000);
cf.email();
//cf.print();
Thread.sleep(5000);
	///////////////
Actions actionBuilder = new Actions(driver);
WebDriverWait wt2 = new WebDriverWait(driver, 180);

   Thread.sleep(20000);
	JavascriptExecutor js1 = (JavascriptExecutor)driver;
	
    js1.executeScript("window.scrollBy(0,200)");
    Thread.sleep(10000);

	wait.until(ExpectedConditions.elementToBeClickable(bill.getcolfirst()));
	Thread.sleep(5000);
	bill.getcolfirst().click();
	Thread.sleep(5000);

	
	   Thread.sleep(20000);

	   wt2.until(ExpectedConditions.elementToBeClickable(bill.getAPCRow1()));
	   Thread.sleep(5000);
         
	   bill.getAPCRow1().click();
	    Thread.sleep(5000);
	bill.getapply1().click();
    Thread.sleep(5000);

         
	
	
cf.getselectfeilds().click();
	
	cf.getsearchDisplay().sendKeys("billing month");

	
	
    Thread.sleep(5000);
	
	if(bill.getsasku().isSelected()) // if Checked 
	{
		
	}
	  
		cf.getunselectall().click();
		
		if(!bill.getsasku().isSelected()) // if unChecked 
		{
		
		}
		
	    Thread.sleep(5000);
		
		
	cf.getselectall().click();
	if(bill.getsasku().isSelected()) // if Checked 
	{
	
	}
	
	cf.getunselectall().click();
	bill.getsasku().click();

    Thread.sleep(5000);
	cf.getapply().click();

	By show=By.xpath("//label[@class='drag-handle sort-arrow none'][contains(text(),'Billing Month')]");

	
	if(cf.isElementPresent(show))
	{
		

       }


    Thread.sleep(5000);
	cf.getresetall().click();

    
	  WebElement h= driver.findElement(By.xpath("//tr[1]//td[1]//i[1]"));
	wait.until(ExpectedConditions.elementToBeClickable(h));
  
     Actions ab =new Actions(driver);
   ab.moveToElement(h).click().perform();
    Thread.sleep(3000);
     
     
  
     
    
	  // h1= driver.findElement(By.xpath("//div[@class='td-option-drop-wrapper show-for-tablet']//div[@class='td_option_drop reports-show-more']//div//a[contains(text(),'View Product Details')]"));
	 // WebElement h1= driver.findElement(By.xpath("//div[@class='td-option-drop-wrapper show-for-tablet']//div[@class='td_option_drop reports-show-more']//div//a[contains(text(),'View Asset Details')]"));
      
	 ab.moveToElement(bline.getviewbillline()).click().perform();
		
	
	 
	 Thread.sleep(5000);
	 

	 Assert.assertEquals(driver.getTitle(), "Bill Lines - CCM",
			"User have not reached the Asset Detail Screen after selecting Asset Detail Option from Asset Report");
	Thread.sleep(3000);
	  hd.logout();
		Thread.sleep(10000);
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
	}
	catch (org.openqa.selenium.NoSuchElementException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
	

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
}


}




