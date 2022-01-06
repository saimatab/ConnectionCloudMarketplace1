package tests;
import java.io.FileInputStream;
import org.openqa.selenium.JavascriptExecutor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
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

public class LatestRegressionSuite_5 extends base  {

	public HomePage hp;
	public Header hd;
	public CommonFunctions cf;
	public Users us;
	public RegisterationPage rp;
	SearchResult srp;
	public WebDriver driver;
	WebDriverWait wait;
	FileInputStream fis;

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

	public LatestRegressionSuite_5() throws IOException, InterruptedException , ClassNotFoundException, SQLException {

		prop=new Properties();
		fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		//driver = initializeDriver();
		driver = getdriver();
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
@Test(priority = 37,enabled =true)
public void Validate_39_aboutccm(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	try{
		prop=new Properties();
		fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		//driver = initializeDriver();
		driver = getdriver();
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
		wait = new WebDriverWait(driver, 120);
	Thread.sleep(5000);
	driver.get(url);
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
//
		
		
		By show1=By.xpath("//a[contains(text(),'About CCM')]");
		By show2=By.xpath("//a[contains(text(),'About Connection')]");
		By show3=By.xpath("//a[contains(text(),'Contact Us')]");
		By show4=By.xpath("//a[contains(text(),'Terms of Use')]");
		By show5=By.xpath("//a[contains(text(),'Privacy Policy')]");
		By show6=By.xpath("//a[contains(text(),'Accessibility')]");
		By show7=By.xpath("//a[contains(text(),'Help')]");
		
		By banner1=By.xpath("//a[contains(text(),'MarketPlace')]");
		By banner2=By.xpath("//a[contains(text(),'Manage')]");
		By banner3=By.xpath("//a[contains(text(),'Insights')]");
		
		
		
		if(cf.isElementPresent(banner1))
		{	
			if(cf.isElementPresent(banner2))
			{	
				if(cf.isElementPresent(banner3))
				{
					

			       }

		       }
		}
		
		
		if(cf.isElementPresent(show1))
		{	
			if(cf.isElementPresent(show2))
			{
				
		       }
			if(cf.isElementPresent(show3))
			{

		       }
			if(cf.isElementPresent(show4))
			{
				
				
		       }
			if(cf.isElementPresent(show5))
			{
			

		       }
			if(cf.isElementPresent(show6))
			{
				
		       }
			
			if(cf.isElementPresent(show7))
			{
				
			
		       }
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
	
}


@Test(priority =38,enabled =true)
public void Validate_40_aboutconn() throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	try {	 wait = new WebDriverWait(driver, 120);
		Thread.sleep(2000);

		
		
		
		By show1=By.xpath("//a[contains(text(),'About CCM')]");
		By show2=By.xpath("//a[contains(text(),'About Connection')]");
		By show3=By.xpath("//a[contains(text(),'Contact Us')]");
		By show4=By.xpath("//a[contains(text(),'Terms of Use')]");
		By show5=By.xpath("//a[contains(text(),'Privacy Policy')]");
		By show6=By.xpath("//a[contains(text(),'Accessibility')]");
		By show7=By.xpath("//a[contains(text(),'Help')]");
		Thread.sleep(5000);
		driver.findElement(show2).click();
		Thread.sleep(5000);
		int counter=0;
		
		((JavascriptExecutor) driver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(5000);
		
		By learnmore=By.xpath("//div[4]//a[1]");
		if(cf.isElementPresent(learnmore))
		{
			 //driver.findElement(learnmore).click();
			 //driver.navigate().back();
			 List<WebElement> listImages=driver.findElements(By.tagName("img"));
		        System.out.println("No. of Images: "+listImages.size());
		        for(WebElement image:listImages)
		        {
		            if(image.isDisplayed())
		            {
		                counter++;
		                System.out.println(image.getAttribute("alt"));
		            }
		        }
		        System.out.println("No. of total displable images: "+counter);
		}
		
		
		if(cf.isElementPresent(show1))
		{  
			if(cf.isElementPresent(show2))
			{
			
		       }
			if(cf.isElementPresent(show3))
			{
			

		       }
			if(cf.isElementPresent(show4))
			{
			

		       }
			if(cf.isElementPresent(show5))
			{
				

		       }
			if(cf.isElementPresent(show6))
			{
		       }
			
			if(cf.isElementPresent(show7))
			{
			    System.out.println("df");

		       }
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
	
}


@Test(priority =39,enabled =true)
public void Validate_41_contactus() throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	try {
		 wait = new WebDriverWait(driver, 120);
		Thread.sleep(2000);

		
		
		
		By show1=By.xpath("//a[contains(text(),'About CCM')]");
		By show2=By.xpath("//a[contains(text(),'About Connection')]");
		By show3=By.xpath("//a[contains(text(),'Contact Us')]");
		By show4=By.xpath("//a[contains(text(),'Terms of Use')]");
		By show5=By.xpath("//a[contains(text(),'Privacy Policy')]");
		By show6=By.xpath("//a[contains(text(),'Accessibility')]");
		By show7=By.xpath("//a[contains(text(),'Help')]");
		Thread.sleep(10000);
		WebElement element =driver.findElement(show3);
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		
		Thread.sleep(5000);
		
		if(cf.isElementPresent(show1))
		{
			if(cf.isElementPresent(show2))
			{
				

		       }
			if(cf.isElementPresent(show3))
			{

		       }
			if(cf.isElementPresent(show4))
			{

		       }
			if(cf.isElementPresent(show5))
			{
			
		       }
			if(cf.isElementPresent(show6))
			{
				
		
		       }
			
			if(cf.isElementPresent(show7))
			{
			

		       }
	       }
		
		
		By show110=By.xpath("//a[contains(text(),'Customer.Support@connection.com')]");
		By show220=By.xpath("//a[contains(text(),'saleops@connection.com')]");
		By show330=By.xpath("//a[contains(text(),'Tech.Support@connection.com')]");
		By show440=By.xpath("//a[contains(text(),'030.680.3285')]");


		if(cf.isElementPresent(show110))
		{
			if(cf.isElementPresent(show220))
			{
			

		       }
			if(cf.isElementPresent(show330))
			{
			

		       }
			if(cf.isElementPresent(show440))
			{
			
		       }
		}
		
		By show11=By.xpath("//span[contains(text(),'saima3032B')]");
		//By show22=By.xpath("//div[@class='contact-detail col-sm-9 col-xs-12']//div[2]//div[2]//span[1]");
		By show33=By.xpath("//span[contains(text(),'756 Concho Ln Houston, TX, 77084')]");
		By show44=By.xpath("//span[contains(text(),'Houston')]");
		
		By show55=By.xpath("//span[contains(text(),'TX')]");
		By show66=By.xpath("//span[contains(text(),'77084')]");
		By show77=By.xpath("//input[@id='fname']");
		By show88=By.xpath("//input[@id='lname']");
		
		By show99=By.xpath("//input[@id='phone']");
		By show111=By.xpath("//input[@id='email']");
		
		By show222=By.xpath(" //select[@id='standard_catalog']");
		
		if(cf.isElementPresent(show11))
		{
		
			//if(cf.isElementPresent(show22))
			//{
				// driver.findElement(show22).getText();
//
		     //  }
			if(cf.isElementPresent(show33))
			{
	
		       }
			if(cf.isElementPresent(show44))
			{
			

		       }
			if(cf.isElementPresent(show33))
			{
				
			
		       }
			if(cf.isElementPresent(show44))
			{
				

		       }
			if(cf.isElementPresent(show33))
			{
				
			
		       }
			if(cf.isElementPresent(show44))
			{
			

		       }
			if(cf.isElementPresent(show55))
			{
				
		       }
			if(cf.isElementPresent(show66))
			{
			

		       }
			if(cf.isElementPresent(show77))
			{
				

		       }
			if(cf.isElementPresent(show88))
			{
				

		       }
			if(cf.isElementPresent(show77))
			{
				

		       }
			if(cf.isElementPresent(show88))
			{
				
			
		       }
			if(cf.isElementPresent(show99))
			{
				

		       }
			if(cf.isElementPresent(show111))
			{
			

		       }
			if(cf.isElementPresent(show222))
			{
				

		       }
		}
		
		
		By show551=By.xpath("//a[@id='contact-submit']");
		Thread.sleep(10000);
		 driver.findElement(show551).click();
		//span[contains(text(),'TX')]
		 
			By show552=By.xpath("//span[@class='alert-msg']");
			 
			 Assert.assertEquals(driver.findElement(show552).getText(), "The Message field is required", "msg not diplayed");
	
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
	
}



@Test(priority = 40,enabled =true)
public void Validate_42_termsofuse() throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	try {	 wait = new WebDriverWait(driver, 120);
		Thread.sleep(2000);

		
		
		
		By show1=By.xpath("//a[contains(text(),'About CCM')]");
		By show2=By.xpath("//a[contains(text(),'About Connection')]");
		By show3=By.xpath("//a[contains(text(),'Contact Us')]");
		By show4=By.xpath("//a[contains(text(),'Terms of Use')]");
		By show5=By.xpath("//a[contains(text(),'Privacy Policy')]");
		By show6=By.xpath("//a[contains(text(),'Accessibility')]");
		By show7=By.xpath("//a[contains(text(),'Help')]");
		
	
		Thread.sleep(10000);
		WebElement element =driver.findElement(show4);
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		
		Thread.sleep(5000);
		
		if(cf.isElementPresent(show1))
		{
			if(cf.isElementPresent(show2))
			{
				System.out.println("af");

		       }
			if(cf.isElementPresent(show3))
			{
				
				System.out.println("afgf");
		       }
			if(cf.isElementPresent(show4))
			{
				System.out.println("adgd");

		       }
			if(cf.isElementPresent(show5))
			{
				
				System.out.println("afhf");
		       }
			if(cf.isElementPresent(show6))
			{
				System.out.println("afhf");

		       }
			
			if(cf.isElementPresent(show7))
			{
				
System.out.println("gg");
		       }
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
	}	catch (org.openqa.selenium.NoSuchElementException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
	

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
	
}


@Test(priority =41,enabled =true)
public void Validate_43_privacypolicy() throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
		try { wait = new WebDriverWait(driver, 120);
		Thread.sleep(2000);

		
		
		
		By show1=By.xpath("//a[contains(text(),'About CCM')]");
		By show2=By.xpath("//a[contains(text(),'About Connection')]");
		By show3=By.xpath("//a[contains(text(),'Contact Us')]");
		By show4=By.xpath("//a[contains(text(),'Terms of Use')]");
		By show5=By.xpath("//a[contains(text(),'Privacy Policy')]");
		By show6=By.xpath("//a[contains(text(),'Accessibility')]");
		By show7=By.xpath("//a[contains(text(),'Help')]");
		
	
		
		Thread.sleep(10000);
		WebElement element =driver.findElement(show5);
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		
		Thread.sleep(5000);
		
		if(cf.isElementPresent(show1))
		{
		
			if(cf.isElementPresent(show2))
			{
			

		       }
			if(cf.isElementPresent(show3))
			{
			

		       }
			if(cf.isElementPresent(show4))
			{


		       }
			if(cf.isElementPresent(show5))
			{
				

		       }
			if(cf.isElementPresent(show6))
			{
			

		       }
			
			if(cf.isElementPresent(show7))
			{
		

		       }
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
	
}


@Test(priority =42,enabled =true)
public void Validate_44_Accessiblity() throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
		try { wait = new WebDriverWait(driver, 120);
		Thread.sleep(2000);

		By show6=By.xpath("//a[contains(text(),'Accessibility')]");

		
		String 	OldTab=driver.getWindowHandle();
		
		Thread.sleep(30000);
		WebElement element =driver.findElement(show6);
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		

		
		Thread.sleep(5000);

		driver.switchTo().window(OldTab);
	
				//Set<String> abc=driver.getWindowHandles();
				//Iterator<String> it=abc.iterator();
			
				//while(it.hasNext())
				//{
				//driver.switchTo().window(it.next());
				//wait.until(ExpectedConditions.titleContains("Our Accessibility Policy"));
				//Assert.assertEquals(driver.getTitle(), "Our Accessibility Policy", "User is not being able to reach  acc page");


				
				//driver.switchTo().window(OldTab);
				
		
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


@Test(priority =43,enabled =true)
public void Validate_45_help() throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
		try { wait = new WebDriverWait(driver, 120);
		Thread.sleep(2000);

		
		By show7=By.xpath("//a[contains(text(),'Help')]");
		Thread.sleep(30000);
		WebElement element =driver.findElement(show7);
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		
		Thread.sleep(5000);
		
		By show1=By.xpath("//h3[@class='break-h3-desktop']");
		By show2=By.xpath("//div[@class='help-detail col-sm-9 col-xs-12']//div[2]//div[1]//a[1]//h3[1]");
		By show3=By.xpath("//h3[contains(text(),'Reporting')]");
		By show4=By.xpath("//div[4]//div[1]//a[1]//h3[1]");
		By show5=By.xpath("//div[5]//div[1]//a[1]//h3[1]");
		By show6=By.xpath("//div[6]//div[1]//a[1]//h3[1]");


		
		
		if(cf.isElementPresent(show1))
		{
			driver.findElement(show1).click();
			wait.until(ExpectedConditions.titleContains("Marketplace - CCM"));
			
			
			Assert.assertEquals(driver.getTitle(), "Marketplace - CCM", "error");
			if(cf.isElementPresent(show2))
			{
				driver.findElement(show2).click();
				wait.until(ExpectedConditions.titleContains("Service Provisioning - CCM"));
				
				
				Assert.assertEquals(driver.getTitle(), "Service Provisioning - CCM", "error");


		       }
			if(cf.isElementPresent(show3))
			{
				driver.findElement(show3).click();
				wait.until(ExpectedConditions.titleContains("Spend Analysis - CCM"));



				String Insight_Titleact = driver.getTitle().trim();
				String Insight_Titlexp = "Spend Analysis - CCM";
				Assert.assertEquals(Insight_Titleact, Insight_Titlexp, "Insight Page is not getting open");


		       }
			if(cf.isElementPresent(show4))
			{
				driver.findElement(show4).click();
				wait.until(ExpectedConditions.titleContains("Service Provisioning - CCM"));
			
		
		Assert.assertEquals(driver.getTitle(), "Service Provisioning - CCM", "error");

				

		       }
			if(cf.isElementPresent(show5))
			{
				driver.findElement(show5).click();
				wait.until(ExpectedConditions.titleContains("My Profile - CCM"));
				
				
				Assert.assertEquals(driver.getTitle(), "My Profile - CCM", "error");

		       }
			if(cf.isElementPresent(show6))
			{
				driver.findElement(show6).click();
	wait.until(ExpectedConditions.titleContains("Account Settings - CCM"));
				
				
				Assert.assertEquals(driver.getTitle(), "Account Settings - CCM", "error");

		       }
			
			
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


@Test(priority =44,enabled =true)
public void Validate_46_notif() throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	try{Header hd = new Header(driver);

	boolean Notification_present;

		hd.getNotification().click();
		Thread.sleep(5000);

		Thread.sleep(5000);




	NotificationPage Np = new NotificationPage(driver);

	

		Np.getNotification_heading();
		Thread.sleep(5000);


		Np.getAll_Notification();
		Thread.sleep(5000);


		Np.getFlagged();
	

	Thread.sleep(5000);
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
		String 	title6= driver.getTitle();
		e.printStackTrace();
	

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
	
}


@Parameters({"username7","pswd7","url","domains","dburl","dbun","dbpswd"})
@Test(priority = 45,enabled =true)
public void Validate_47_userrole(String username , String pswd, String url, String domain,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	try{Header hd = new Header(driver);
	wait = new WebDriverWait(driver, 120);
	//driver.navigate().back();
	
	///
	
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
	
	////
	LoginPage lp= new LoginPage(driver);
	Properties prop=new Properties();
	FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);

	




	

	cf.gotoURL1(domain);
	Thread.sleep(10000);
	//Assert.assertEquals(cf.getnotaccess(), "t have access to this page. Please contact", "User able to access this page ");
	Assert.assertEquals(cf.getnotaccess().getText(), "Well this is awkward.", "User able to access this page ");
	
	driver.navigate().back();
	Thread.sleep(10000);
	  hd.logout();
	  Thread.sleep(5000);
	
}
catch(org.openqa.selenium.ElementClickInterceptedException e) {
	String 	title6= driver.getTitle();
	e.printStackTrace();
	driver.navigate().back();
	Thread.sleep(3000);	
	  hd.logout();
	Thread.sleep(5000);	
     Assert.assertTrue(false, "Failed" + e.getMessage());
}
catch (org.openqa.selenium.TimeoutException e) {
	String 	title6= driver.getTitle();
	e.printStackTrace();
	driver.navigate().back();
	Thread.sleep(3000);	
	  hd.logout();

	Thread.sleep(5000);	
     Assert.assertTrue(false, "Failed" + e.getMessage());
}
catch (org.openqa.selenium.StaleElementReferenceException e) {
	String 	title6= driver.getTitle();
	e.printStackTrace();
	driver.navigate().back();
	Thread.sleep(3000);	
	  hd.logout();
	Thread.sleep(5000);	
     Assert.assertTrue(false, "Failed" + e.getMessage());
}	catch (org.openqa.selenium.NoSuchElementException e) {
	String 	title6= driver.getTitle();
	e.printStackTrace();
	driver.navigate().back();
	Thread.sleep(3000);	
	  hd.logout();

	Thread.sleep(5000);	
     Assert.assertTrue(false, "Failed" + e.getMessage());
}
	}

	// accessiblity is no access and orders in reporta
@Parameters({"username7","pswd7","url","domains","dburl","dbun","dbpswd"})
@Test(priority = 46,enabled =true)
public void Validate_48_userrole_noacccess(String username , String pswd, String url, String domain,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	try{Header hd = new Header(driver);
	wait = new WebDriverWait(driver, 120);
	//hd.logout();
	Thread.sleep(6000);

	cf.gotoURL(url);
	
	LoginPage lp= new LoginPage(driver);
	Properties prop=new Properties();
	FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	wait = new WebDriverWait(driver, 120);
	wait.until(ExpectedConditions.elementToBeClickable(lp.getusername()));
	
	lp.getusername().sendKeys(username);
	wait.until(ExpectedConditions.elementToBeClickable(lp.getpassword()));
	lp.getpassword().sendKeys(pswd);
	wait.until(ExpectedConditions.elementToBeClickable(lp.getloginbtn()));
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
	Assert.assertEquals(driver.getTitle(), "Marketplace - CCM", "User is not being able to SignIn on application");
   

	cf.gotoURL1(domain);
	Thread.sleep(5000);
	Assert.assertEquals(cf.getnotaccess().getText(), "Well this is awkward.", "User able to access this page ");
	Thread.sleep(5000);
hd.getnoAccessback().click();

wait.until(ExpectedConditions.titleContains("Marketplace - CCM"));
Assert.assertEquals(driver.getTitle(), "Marketplace - CCM",
		"User not able to reach marketplace ccm page ");
Thread.sleep(2000);
cf.gotoURL1(domain);
hd.getlogo().click();

wait.until(ExpectedConditions.titleContains("Marketplace - CCM"));
Assert.assertEquals(driver.getTitle(), "Marketplace - CCM",
		"User not able to reach marketplace ccm page ");
Thread.sleep(2000);
cf.gotoURL1(domain);

	hd.getexecutive().click();
	   wait.until(ExpectedConditions.titleContains("Contact Us - CCM"));
				Assert.assertEquals(driver.getTitle(), "Contact Us - CCM",
						"User not able to reach contact us page ");
	Thread.sleep(2000);
	
	
	ft.getsocialIcon().isDisplayed();

	Thread.sleep(3000);
	ft.getmarketplace().click();
	  wait.until(ExpectedConditions.titleContains("Marketplace - CCM"));
			Assert.assertEquals(driver.getTitle(), "Marketplace - CCM",
					"User not able to reach marketplace ccm page ");

			Thread.sleep(3000);
		
	
	ft.getdiscover().click();
	  wait.until(ExpectedConditions.titleContains("Discover - CCM"));
		Assert.assertEquals(driver.getTitle(), "Discover - CCM",
				"User not able to reach discover ccm page ");

		Thread.sleep(5000);
		ft.getapps().click();
		Thread.sleep(3000);
	  wait.until(ExpectedConditions.titleContains("Applications - CCM"));
		Assert.assertEquals(driver.getTitle(), "Applications - CCM",
				"User not able to reach applications ccm page ");

		Thread.sleep(3000);
	ft.getinfrastruc().click();
	  wait.until(ExpectedConditions.titleContains("Infrastructure - CCM"));
		Assert.assertEquals(driver.getTitle(), "Infrastructure - CCM",
				"User not able to reach Infrastructure ccm page ");

		Thread.sleep(3000);
		ft.getplatform().click();
	  wait.until(ExpectedConditions.titleContains("Platforms - CCM"));
		Assert.assertEquals(driver.getTitle(), "Platforms - CCM",
				"User not able to reach platform ccm page ");

		Thread.sleep(3000);
	
	ft.getconsulting().click();
	  wait.until(ExpectedConditions.titleContains("Consulting - CCM"));
		Assert.assertEquals(driver.getTitle(), "Consulting - CCM",
				"User not able to reach consulting  ccm page ");




		
	ft.getinsights().click();
	Thread.sleep(30000);
	/*  wait.until(ExpectedConditions.titleContains("Spend Analysis - CCM"));
			Assert.assertEquals(driver.getTitle(), "Spend Analysis - CCM",
					"User not able to reach spend analysis ccm page ");*/


			Thread.sleep(3000);
	ft.getspendana().click();

	Thread.sleep(3000);
	  wait.until(ExpectedConditions.titleContains("Spend Analysis - CCM"));
		Assert.assertEquals(driver.getTitle(), "Spend Analysis - CCM",
				"User not able to reach spend analysis ccm page ");

	Thread.sleep(8000);
	


		Thread.sleep(3000);
	ft.getorders().click();
	  wait.until(ExpectedConditions.titleContains("Orders - CCM"));
		Assert.assertEquals(driver.getTitle(), "Orders - CCM",
				"User not able to reach order ccm  page ");

		Thread.sleep(3000);
	ft.getsignedagreement().click();
	   wait.until(ExpectedConditions.titleContains("Signed Agreements - CCM"));
		Assert.assertEquals(driver.getTitle(), "Signed Agreements - CCM",
				"User not able to reach signed agreement page ");

		Thread.sleep(3000);

	ft.getbilllines().click();
	   wait.until(ExpectedConditions.titleContains("Bill Lines - CCM"));
				Assert.assertEquals(driver.getTitle(), "Bill Lines - CCM",
						"User not able to reach bill lines page ");

				Thread.sleep(3000);
				ft.getbills().click();
	
	   wait.until(ExpectedConditions.titleContains("Bills - CCM"));
				Assert.assertEquals(driver.getTitle(), "Bills - CCM",
						"User not able to reach bill page ");

				Thread.sleep(3000);
	ft.getabtconn().click();

	   wait.until(ExpectedConditions.titleContains("About Connection - CCM"));
		Assert.assertEquals(driver.getTitle(), "About Connection - CCM",
				"User not able to reach abt conneciton page ");

		Thread.sleep(3000);
		ft.getabtccm().click();
	   wait.until(ExpectedConditions.titleContains("About - CCM"));
		Assert.assertEquals(driver.getTitle(), "About - CCM",
				"User not able to reach abt us page ");

		Thread.sleep(3000);
	
	ft.getcontact().click();
	   wait.until(ExpectedConditions.titleContains("Contact Us - CCM"));
		Assert.assertEquals(driver.getTitle(), "Contact Us - CCM",
				"User not able to reach contact us page ");

		Thread.sleep(3000);

	ft.gettermsofuse().click();
	   wait.until(ExpectedConditions.titleContains("Terms of Use - CCM"));
			Assert.assertEquals(driver.getTitle(), "Terms of Use - CCM",
					"User not able to reach terms of use page ");

			Thread.sleep(3000);
	
	ft.getprivacypolicy().click();
	   wait.until(ExpectedConditions.titleContains("Privacy Policy - CCM"));
		Assert.assertEquals(driver.getTitle(), "Privacy Policy - CCM",
				"User not able to reach privacy policy page ");

String 	OldTab=driver.getWindowHandle();
String  title4=null;		
Thread.sleep(7000);
	ft.getaccess().click();
	Thread.sleep(3000);
	Set<String> abc=driver.getWindowHandles();
	Iterator<String> it=abc.iterator();

	while(it.hasNext())
	{
	driver.switchTo().window(it.next());
	title4 = driver.getTitle();

	}	
	Thread.sleep(3000);
   // wait.until(ExpectedConditions.titleContains("Accessibility Policy - Connection"));
				//Assert.assertEquals(title4, "Accessibility Policy - Connection",
						//"User not able to reach accessibility policy page ");
				Thread.sleep(3000);
				driver.switchTo().window(OldTab);		
				Thread.sleep(5000);
				ft.gethelp().click();
				Thread.sleep(5000);
    wait.until(ExpectedConditions.titleContains("Help - CCM"));
			Assert.assertEquals(driver.getTitle(), "Help - CCM",
					"User not able to land reach help page");
			Thread.sleep(5000);
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

@Parameters({"username1","pswd1","url","404page","dburl","dbun","dbpswd"})
@Test(priority =47,enabled =true)
public void Validate404page_49(String username , String pswd, String url, String page404,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	try{Header hd = new Header(driver);
	wait = new WebDriverWait(driver, 120);
	cf.gotoURL(url);
	
	LoginPage lp= new LoginPage(driver);
	Properties prop=new Properties();
	FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	wait = new WebDriverWait(driver, 120);
	wait.until(ExpectedConditions.elementToBeClickable(lp.getusername()));
	
	lp.getusername().sendKeys(username);
	wait.until(ExpectedConditions.elementToBeClickable(lp.getpassword()));
	lp.getpassword().sendKeys(pswd);
	wait.until(ExpectedConditions.elementToBeClickable(lp.getloginbtn()));
	lp.getloginbtn().click();	
	Thread.sleep(5000);

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
	
	
	
	cf.gotoURL1(page404);
	Thread.sleep(5000);
	Assert.assertEquals(cf.getnotaccess1().getText(), "404", "User able to access this page ");
	Thread.sleep(5000);
hd.getnoAccessback().click();
Thread.sleep(5000);
wait.until(ExpectedConditions.titleContains("Marketplace - CCM"));
Assert.assertEquals(driver.getTitle(), "Marketplace - CCM",
		"User not able to reach marketplace ccm page ");
	
	
	
	
	
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
		String 	title6= driver.getTitle();
		e.printStackTrace();
	

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
   
}

@Parameters({"username3","pswd3","url","dburl","dbun","dbpswd"})
@Test(priority = 48,enabled =true)
public void Validate_50_acct_domains(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	try{Header hd = new Header(driver);
	wait = new WebDriverWait(driver, 120);

	Thread.sleep(5000);
	cf.gotoURL(url);
	
	LoginPage lp= new LoginPage(driver);
	Properties prop=new Properties();
	FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	wait = new WebDriverWait(driver, 120);
	wait.until(ExpectedConditions.elementToBeClickable(lp.getusername()));
	
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
	Thread.sleep(10000);
	Assert.assertEquals(driver.getTitle(), "Marketplace - CCM", "User is not being able to SignIn on application");

	
	Actions an = new Actions(driver);

		Thread.sleep(10000);
		an.moveToElement(hd.getAccountMenu()).perform();
		Thread.sleep(5000);
		hd.getAcctDomain().click();
		Thread.sleep(15000);
	Assert.assertEquals(driver.getTitle(), "Account Domains - CCM",
			"User not able to land to the Manage Domain page after clicking on manage domain option from account menu in the header");


	
	
	By invite=By.xpath("//a[contains(text(),'Invite a New User')]");


	By show2=By.xpath("//section[@id='domainApp']//a[@class='active'][contains(text(),'Account Domains')]");
	By show3=By.xpath("//section[@id='domainApp']//a[contains(text(),'Account Information')]");
	By show4=By.xpath("//section[@id='domainApp']//a[contains(text(),'Account Settings')]");
	By show5=By.xpath("//section[@id='domainApp']//a[contains(text(),'Address of Use')]");
	By show6=By.xpath("//section[@id='domainApp']//a[contains(text(),'Catalog Restrictions')]");
	By show7=By.xpath("//section[@id='domainApp']//a[contains(text(),'Change Password')]");
	
	By banner1=By.xpath("//section[@id='domainApp']//a[contains(text(),'My Profile')]");
	By banner2=By.xpath("//section[@id='domainApp']//a[contains(text(),'Notification Management')]");
	By banner3=By.xpath("//section[@id='domainApp']//a[contains(text(),'Payment Method')]");
	By banner4=By.xpath("//section[@id='domainApp']//a[contains(text(),'User Management')]");
	By banner5=By.xpath("//p[contains(text(),'\r\n" + 
			"                    The email domains listed below have been used to register your CCM account or to invite users in your organization to join your CCM account. Email domains are used in CCM to ensure that only users in your organization have access to your account. To add a new email domain to your CCM account, please ')]");
	
	
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
						driver.findElement(invite).click();
						Assert.assertEquals(driver.getTitle(), "User Management- CCM",
								"User not able to land to the UM invite page");
				       }

			       }

		       }

	       }
	}
	
	
	
		if(cf.isElementPresent(show2))
		{
			

	       
		if(cf.isElementPresent(show3))
		{
			

	       }
		if(cf.isElementPresent(show4))
		{
			

	       }
		if(cf.isElementPresent(show5))
		{
			

	       }
		if(cf.isElementPresent(show6))
		{
			

	       }
		
		if(cf.isElementPresent(show7))
		{
			

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
}
	
	catch (org.openqa.selenium.NoSuchElementException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
	

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
	
	
	
   
}

@Parameters({"username3","pswd3","url","dburl","dbun","dbpswd"})
@Test(priority = 49,enabled =true)
public void Validate_51_acct_info(String username , String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	
	try{Header hd = new Header(driver);
	wait = new WebDriverWait(driver, 120);


	Thread.sleep(6000);
	lp.getusername().sendKeys(username);
	
	lp.getpassword().sendKeys(pswd);
	lp.getloginbtn().click();
	Thread.sleep(5000);
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


	
	Actions an = new Actions(driver);

		Thread.sleep(30000);
		an.moveToElement(hd.getAccountMenu()).perform();
		Thread.sleep(5000);
		hd.getAcctinfo().click();
		Thread.sleep(15000);
	Assert.assertEquals(driver.getTitle(), "Account Information - CCM",
			"User not able to land to the info page");


	
	//hd.getcontus().click();

	//hd.getdescripcontactus().sendKeys("afsa");
	//hd.getcontussubmit();
	
	
	WebDriverWait wt1 = new WebDriverWait(driver,600);
	//WebElement  w=driver.findElement(By.id("loadingMask"));
   // wt1.until(ExpectedConditions.invisibilityOf(w));
	//	Thread.sleep(10000);
	By show2=By.xpath("//section[@id='domainApp']//a[@class='active'][contains(text(),'Account Domains')]");
	By show3=By.xpath("//section[@id='domainApp']//a[contains(text(),'Account Information')]");
	By show4=By.xpath("//section[@id='domainApp']//a[contains(text(),'Account Settings')]");
	By show5=By.xpath("//section[@id='domainApp']//a[contains(text(),'Address of Use')]");
	By show6=By.xpath("//section[@id='domainApp']//a[contains(text(),'Catalog Restrictions')]");
	By show7=By.xpath("//section[@id='domainApp']//a[contains(text(),'Change Password')]");
	
	By banner1=By.xpath("//section[@id='domainApp']//a[contains(text(),'My Profile')]");
	By banner2=By.xpath("//section[@id='domainApp']//a[contains(text(),'Notification Management')]");
	By banner3=By.xpath("//section[@id='domainApp']//a[contains(text(),'Payment Method')]");
	By banner4=By.xpath("//section[@id='domainApp']//a[contains(text(),'User Management')]");
	By banner5=By.xpath("//p[contains(text(),'The email domains listed below have been used to register your CCM account or to invite users in your organization to join your CCM account. Email domains are used in CCM to ensure that only users in your organization have access to your account. To add a new email domain to your CCM account, please')]");
	By banner6=By.xpath("//p[contains(text(),'Organization and Account Information is displayed below. Please update and save as needed. Please note: Some Organization information cannot be changed on this portal. Please ')]");
	
	
	if(cf.isElementPresent(banner1))
	{System.out.println("sfsa");
		if(cf.isElementPresent(banner2))
		{
			if(cf.isElementPresent(banner3))
			{
				if(cf.isElementPresent(banner4))
				{
					if(cf.isElementPresent(banner5))
					{
					
						if(cf.isElementPresent(banner6))
						{
							System.out.println("abb");
					       }
				       }

			       }

		       }

	       }
	}
	
	
	
		if(cf.isElementPresent(show2))
		{
			System.out.println("f");

	       
		if(cf.isElementPresent(show3))
		{
			
			System.out.println("e");
	       }
		if(cf.isElementPresent(show4))
		{
			
			System.out.println("d");
	       }
		if(cf.isElementPresent(show5))
		{
			System.out.println("C");

	       }
		if(cf.isElementPresent(show6))
		{
			
			System.out.println("b");
	       }
		
		if(cf.isElementPresent(show7))
		{
			
System.out.println("a");
	       }
       //

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
}

	catch (org.openqa.selenium.NoSuchElementException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
	

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
}
}





