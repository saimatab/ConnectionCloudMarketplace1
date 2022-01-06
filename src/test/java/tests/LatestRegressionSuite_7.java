package tests;
import java.io.FileInputStream;
import org.openqa.selenium.JavascriptExecutor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
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
import org.openqa.selenium.interactions.Action;
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

public class LatestRegressionSuite_7 extends base {

	public HomePage hp;
	public Header hd;
	public CommonFunctions cf;
	public Users us;
	public RegisterationPage rp;
	public WebDriver driver;
	WebDriverWait wait;
	FileInputStream fis;
	String url_cust;
	LoginPage lp;
	public  Properties prop;
	String a ;
	Footer ft ;
	HomePage hm;
	By alertmsg=By.xpath("//span[@class='alert-msg']"); 
	public String email;
	Payment pay;
	Subscriptions sr;
	Procurement pr;

	int cs=0;
	String j1 ;

	CTAEstimate ctest;

	PDPCCM pp;

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
	public String email() {

		return email;

	}
	public String email2() {

		return email;

	}
	public LatestRegressionSuite_7() throws IOException, InterruptedException , ClassNotFoundException, SQLException {

		prop=new Properties();
		fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		driver = initializeDriver();
		driver=getdriver();
		lp= new LoginPage(driver);
		us= new Users(driver);
		cf= new CommonFunctions(driver);
		rp=new RegisterationPage(driver);
		pr = new Procurement(driver);
		hd=new Header(driver);

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
	@Parameters({"username9","pswd9","url","dburl1","dbun","dbpswd","env"})
	@Test(priority =4,enabled=true)
	public void Validate_PDP_11(String username1 , String pswd1, String url, String dburl, String dbun, String dbpswd,String env) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
		// 12 canot be autamted
	try {	
		//driver = initializeDriver();
		driver = getdriver();
	

		ctest=new CTAEstimate(driver);
		Random rm = new Random();
		int i = rm.nextInt(1000) + 1;
		Thread.sleep(5000);
		//23- In case the user is redirected to the PDP from the Quote screen and he needs to re-login, it must be checked if he belongs to same account for which the quote was generated.
		//24- In case the logged in User does not belong the same account, a message upon login must be shown in pop-up, “You are not authorized to see this Quote.“ with a cancel CTA
		driver.get(url);

		Thread.sleep(5000);


		lp.getusername().sendKeys(username1);

		lp.getpassword().sendKeys(pswd1);

		lp.getloginbtn().click();
		
		Thread.sleep(5000);
		String email111=username1;
		String query25 = "select two_factor_code from users where email='" +email111+  "';";	            
		Class.forName("com.mysql.jdbc.Driver");				
		Connection con25 = DriverManager.getConnection(dburl,dbun,dbpswd);
		Statement stmt25 = con25.createStatement();					
		ResultSet rs25= stmt25.executeQuery(query25);	
		System.out.println("code ="+query25);
		String a3=null;
		Thread.sleep(5000);
		while (rs25.next())
		{
			 a3 = rs25.getString(1);								        

			System.out.println("code ="+a3);
		}
		
		Thread.sleep(5000);
		lp.getsecretcode().sendKeys(a3);
		Thread.sleep(5000);
		lp.getcompAuth().click();
		Thread.sleep(9000);
		
		if(env.contentEquals("qa"))
		{

			String QUERY = "SELECT id FROM estimates WHERE user_id=2850 ORDER BY ID  DESC LIMIT 1";	    
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con1 = DriverManager.getConnection(dburl,dbun,dbpswd);
			Statement stmt2 = con1.createStatement();	



			ResultSet rsg= stmt2.executeQuery(QUERY);	
			int cs121=0;

			while (rsg.next()) {

				cs121 = rsg.getInt("id");
			}

			String hurl="https://ccpqa-customerportal.arpatech.com/catalog/estimates/"+cs121;
		cf.gotoURL1(hurl);
		Thread.sleep(5000);
		Assert.assertEquals(cf.getnotaccess1().getText(), "404", "User able to access this page ");
		Thread.sleep(5000);
	hd.getnoAccessback().click();
	
		}
		else if(env.contentEquals("uat"))
		{

		
			String QUERY = "SELECT id FROM estimates WHERE user_id=725 ORDER BY ID  DESC LIMIT 1";	    
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con1 = DriverManager.getConnection(dburl,dbun,dbpswd);
			Statement stmt2 = con1.createStatement();	



			ResultSet rsg= stmt2.executeQuery(QUERY);	
			int cs121=0;

			while (rsg.next()) {

				cs121 = rsg.getInt("id");
			}

			String hurl="https://ccpuat-customerportal.arpatech.com/catalog/estimates/"+cs121;
		cf.gotoURL1(hurl);
		Thread.sleep(5000);
		Assert.assertEquals(cf.getnotaccess1().getText(), "404", "User able to access this page ");
		Thread.sleep(5000);
	hd.getnoAccessback().click();
	
		}
		
		

		hm.getman().click();


		Thread.sleep(5000);
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("Service Provisioning - CCM"));



		By mangesubscCTA1= By.xpath("//a[@class='btn btn-primary' and text()='Manage Subscription']");
		Thread.sleep(5000);
		sr.getmngsubsCTA().click();
		Thread.sleep(5000);
		

	
	
	


		pp.ctaviewestimate().click();

		if(env.contentEquals("qa"))
		{


			Thread.sleep(3000);


			By show1=By.xpath("//a[@class='image-link']//img");
			By show2=By.xpath("//h2[contains(text(),'Corp. CSP Enterprise Mobility + Sec E5 Monthly')]");
			By show3=By.xpath("//label[contains(text(),'1')]");
			By show4=By.xpath("//div[@class='col-sm-3 col-print-3 col-tprice show-for-tablet']//label[contains(text(),'$13.48')]");
			By show5=By.xpath("//div[@class='col-sm-2 col-print-2 col-tprice show-for-tablet']//label[contains(text(),'$13.48')]");
			By show6=By.xpath("//span[@class='padding-summary'][contains(text(),'$13.48')]");
			By show7=By.xpath("//span[contains(text(),'$0.00')]");
			By show8=By.xpath("//span[@class='shipment-total-value padding-summary']");
			By show9=By.xpath("//a[@class='btn btn-primary hide-for-print']");
			By show10=By.xpath("//div[@class='after-invoice-footer']//p[contains(text(),'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum')][1]");




			if(cf.isElementPresent(show1))
			{
			}  



				if(cf.isElementPresent(show2))
				{
				}

				
					if(cf.isElementPresent(show3))
					{
						System.out.println("fgfh");}

						if(cf.isElementPresent(show4))
						{		System.out.println("2");	}
						if(cf.isElementPresent(show5))
						{
							System.out.println("3");	}
							if(cf.isElementPresent(show6))
							{
								System.out.println("4");	}
								if(cf.isElementPresent(show7))
								{
									System.out.println("5");	}

									if(cf.isElementPresent(show8))
									{	System.out.println("6");	}
									if(cf.isElementPresent(show9))
									{
										System.out.println("7");	}
										if(cf.isElementPresent(show10))
										{
											System.out.println("8");	
										}


								

			


			Actions builder=new Actions(driver);


			WebElement username_tooltip=driver.findElement(By.xpath("//img[@class='tooltip_img']"));
			Thread.sleep(3000);


			builder.moveToElement(username_tooltip).perform();
			Thread.sleep(3000);

			WebElement username_tooltip1=driver.findElement(By.xpath("//div[@class='tooltip tt-text']"));

			String tooltip_msg=username_tooltip1.getText();

			Thread.sleep(3000);

			System.out.println("Tooltip/ Help message is "+tooltip_msg);

			// By show11a=By.xpath("//span[contains(text(),'Organization Name:')]']");
			By show11a=By.xpath("//span[text()='Organization Name:']");

			By show11=By.xpath("//p[text()=' 242353']");

			By show12a=By.xpath("//span[text()='CCM Account Name:']");
			By show12=By.xpath("//p[text()=' 3535356']");


			By ctaAddressofuse=By.xpath("//div[@class='half-box half-box-right']//p[1]");
			By ctaAddressofuse1=By.xpath("//div[@class='half-box half-box-right']//p[3]");
			By ctausername=By.xpath("//div[@class='half-box half-box-left notes-ht']//p[1]");
			By ctauseremail=By.xpath("//div[@class='half-box half-box-left notes-ht']//p[2]");

			By ctanote=By.xpath("//div[@class='half-box half-box-right notes-ht']//p[2]");
			By ctasubmit=By.xpath("//a[@class='btn btn-primary btn-to-cart modal-btn hide-for-print' and text()='Submit']");


			JavascriptExecutor js1 = (JavascriptExecutor)driver;
			String script ="arguments[0].scrollIntoView(true);";
			//	WebElement scroll=driver.findElement(By.xpath("//a[@class='action-icon icon-mail']"));
			js1.executeScript(script,driver.findElement(show11a));


			Thread.sleep(10000);



			if(cf.isElementPresent(show11a))
			{	System.out.println("9");}
			if(cf.isElementPresent(show11))
			{
				System.out.println("10");
			}

			if(cf.isElementPresent(show12a))
			{		System.out.println("11");}

			if(cf.isElementPresent(show12))
			{
				System.out.println("12");
			}


			if(cf.isElementPresent(ctaAddressofuse))
			{
				System.out.println("13");

				if(cf.isElementPresent(ctaAddressofuse1))
				{

					System.out.println("14");
				}
			}
			if(cf.isElementPresent(ctauseremail))
			{


				String a=	driver.findElement(ctauseremail).getText();

				System.out.println("print email"+a);
				if(cf.isElementPresent(ctausername))
				{
					System.out.println("15");
					if(cf.isElementPresent(ctanote))
					{
						if(cf.isElementPresent(ctasubmit))
						{
							System.out.println("16");
						}
						//ctest.getctanote().sendKeys("saima");
						Thread.sleep(3000);

						//ctest.getctasubmit().click();
						Thread.sleep(3000);


					}
				}
			}


			Actions ab =new Actions(driver);
			Thread.sleep(5000);
			ab.click(driver.findElement(By.xpath("//a[@class='action-icon icon-email']"))).release().perform();

			Thread.sleep(5000);



			By ctaemailtitle=By.xpath("//div[@class='form-modal white-popup popup-small zoom-anim-dialog mfp-show schedule-report-modal clearfix']//h2[@class='modal-title'][contains(text(),'Estimate Document')]");

			if(cf.isElementPresent(ctaemailtitle))
			{
			}
			Thread.sleep(3000);

			pp.ctapopupcheck().click();
			Thread.sleep(3000);

			pp.getSendBtn().click();
			Thread.sleep(3000);

			driver.navigate().back();

			Thread.sleep(5000);
			By contactus=By.xpath("//div[@class='cost-calculator']//a[contains(text(),'Contact Us')]");

			if(cf.isElementPresent(contactus))
			{
			}
			Thread.sleep(5000);
			
			
		
			
			

			By viewestimate=By.xpath("//a[@class='action-icon icon-estimates']");

			js1.executeScript(script,driver.findElement(viewestimate));
			pp.ctaviewestimate().click();
			Thread.sleep(10000);
			driver.findElement(show1).click();
			Thread.sleep(9000);
			pp.ctaprodQty().sendKeys(Keys.CONTROL);

			pp.ctaprodQty().sendKeys(Keys.BACK_SPACE);
			Thread.sleep(5000);
			pp.ctaprodQty().clear();

			int ten =1273;
			String query = "SELECT id FROM estimates WHERE user_id=2849 ORDER BY ID  DESC LIMIT 1";	            
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
			Statement stmt = con.createStatement();	
			System.out.println("query ="+query );
			ResultSet rs= stmt.executeQuery(query);	
			int cs1=0;

			while (rs.next()) {

				cs1 = rs.getInt("id");
			}


			String  j2=  String.valueOf(cs1);
			int j3=       Integer.parseInt(j2);


			String query1 = "SELECT seats FROM estimate_items WHERE estimate_id=" +j3+ ";";	            
			Class.forName("com.mysql.jdbc.Driver");				

			Statement stmt1 = con.createStatement();	
			System.out.println("query ="+query1 );
			ResultSet rs1= stmt.executeQuery(query1);	
			int cs=0;

			while (rs1.next()) {

				cs = rs1.getInt("seats");
			}


			String  j4=  String.valueOf(cs+1);

			pp.ctaprodQty().sendKeys(j4);
			Thread.sleep(3000);
			Assert.assertEquals(pp.getctainvalidatepriorestimate().getText(), "This change will invalidate any prior Estimates.");

			pp.createEstimate().click();

			Thread.sleep(5000);


			//pp.ctapopupcheck().click();

			Thread.sleep(5000);
			pp.ctapopupcontinue().click();
			Thread.sleep(10000);
			driver.navigate().back();


			/*Thread.sleep(5000);

			pp.ctaprodQty().sendKeys(Keys.CONTROL);

			pp.ctaprodQty().sendKeys(Keys.BACK_SPACE);
			Thread.sleep(5000);

			pp.ctaprodQty().clear();


			//
			query = "SELECT id FROM estimates WHERE user_id=2849 ORDER BY ID  DESC LIMIT 1";	    
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con1 = DriverManager.getConnection(dburl,dbun,dbpswd);
			Statement stmt2 = con1.createStatement();	



			ResultSet rsg= stmt2.executeQuery(query);	
			int cs12=0;

			while (rsg.next()) {

				cs12 = rsg.getInt("id");
			}

			String query4 = "SELECT seats FROM estimate_items WHERE estimate_id=" +cs12+ ";";	            
			Class.forName("com.mysql.jdbc.Driver");				
			stmt2 = con1.createStatement();


			ResultSet rs12= stmt2.executeQuery(query4);	

			int cs13=0;
			while (rs12.next()) {

				cs13 = rs12.getInt("seats");
			}


			String  j41=  String.valueOf(cs13+1);

			pp.ctaprodQty().sendKeys(j41);
			Thread.sleep(5000);
			pp.createEstimate().click();
			Thread.sleep(5000);



			Thread.sleep(5000);

			pp.ctapopupcontinue().click();
			Thread.sleep(20000);
			driver.navigate().back();*/
			Thread.sleep(10000);
			pp.ctaviewestimate().click();
			Thread.sleep(5000);



			By show35=By.xpath("//label[contains(text(),'5')]");	


			if(cf.isElementPresent(show35))
			{

				System.out.println("most resent estiamted present");	

			}			

			Thread.sleep(5000);






		}






		else	if(env.contentEquals("uat"))
		{







			Thread.sleep(3000);


			By show11v=By.xpath("//a[@class='image-link']//img");
			By show21=By.xpath("//h2[contains(text(),'Corp. CSP Enterprise Mobility + Sec E5 Monthly')]");
			By show31=By.xpath("//label[contains(text(),'1')]");
			By show41=By.xpath("//div[@class='col-sm-3 col-print-3 col-tprice show-for-tablet']//label[contains(text(),'$13.48')]");
			By show51=By.xpath("//div[@class='col-sm-2 col-print-2 col-tprice show-for-tablet']//label[contains(text(),'$13.48')]");
			By show61=By.xpath("//span[@class='padding-summary'][contains(text(),'$13.48')]");
			By show71=By.xpath("//span[contains(text(),'$0.00')]");
			By show81=By.xpath("//span[@class='shipment-total-value padding-summary']");
			By show91=By.xpath("//a[@class='btn btn-primary hide-for-print']");
			By show101=By.xpath("//div[@class='after-invoice-footer']//p[contains(text(),'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum')][1]");




			if(cf.isElementPresent(show11v))
			{System.out.println("1dfdfd");}




			if(cf.isElementPresent(show21))
			{System.out.println("dfd");}



			if(cf.isElementPresent(show31))
			{
				System.out.println("1");}

			if(cf.isElementPresent(show41))
			{		System.out.println("2");}
			if(cf.isElementPresent(show51))
			{
				System.out.println("3");}

			if(cf.isElementPresent(show61))
			{
				System.out.println("4");}
			if(cf.isElementPresent(show71))
			{
				System.out.println("5");}

			if(cf.isElementPresent(show81))
			{	System.out.println("6");}
			if(cf.isElementPresent(show91))
			{
				System.out.println("7");}
			if(cf.isElementPresent(show101))
			{
				System.out.println("8");
			}







			Actions builder1=new Actions(driver);


			WebElement username_tooltip1v=driver.findElement(By.xpath("//img[@class='tooltip_img']"));
			Thread.sleep(3000);


			builder1.moveToElement(username_tooltip1v).perform();
			Thread.sleep(3000);

			WebElement username_tooltip11=driver.findElement(By.xpath("//div[@class='tooltip tt-text']"));

			String tooltip_msg1=username_tooltip11.getText();

			Thread.sleep(3000);

			System.out.println("Tooltip/ Help message is "+tooltip_msg1);

			// By show11a=By.xpath("//span[contains(text(),'Organization Name:')]']");
			By show111a=By.xpath("//span[text()='Organization Name:']");

			By show111=By.xpath("//p[text()=' tenant4saimauat']");

			By show121a=By.xpath("//span[text()='CCM Account Name:']");
			By show121=By.xpath("//p[text()=' tenant4saimauat']");


			By ctaAddressofuse1a=By.xpath("//div[@class='half-box half-box-right']//p[1]");
			By ctaAddressofuse11=By.xpath("//div[@class='half-box half-box-right']//p[3]");
			By ctausername1=By.xpath("//div[@class='half-box half-box-left notes-ht']//p[1]");
			By ctauseremail1=By.xpath("//div[@class='half-box half-box-left notes-ht']//p[2]");

			By ctanote1=By.xpath("//div[@class='half-box half-box-right notes-ht']//p[2]");
			By ctasubmit1=By.xpath("//a[@class='btn btn-primary btn-to-cart modal-btn hide-for-print' and text()='Submit']");


			JavascriptExecutor js11 = (JavascriptExecutor)driver;
			String script1 ="arguments[0].scrollIntoView(true);";
			//	WebElement scroll=driver.findElement(By.xpath("//a[@class='action-icon icon-mail']"));
			js11.executeScript(script1,driver.findElement(show111a));


			Thread.sleep(10000);



			if(cf.isElementPresent(show111a))
			{	System.out.println("9");}
			if(cf.isElementPresent(show111))
			{
				System.out.println("10");
			}

			if(cf.isElementPresent(show121a))
			{		System.out.println("11");}

			if(cf.isElementPresent(show121))
			{
				System.out.println("12");
			}


			if(cf.isElementPresent(ctaAddressofuse1a))
			{
				System.out.println("13");

				if(cf.isElementPresent(ctaAddressofuse11))
				{

					System.out.println("14");
				}
			}
			if(cf.isElementPresent(ctauseremail1))
			{


				String a1=	driver.findElement(ctauseremail1).getText();

				System.out.println("print email"+a1);
				if(cf.isElementPresent(ctausername1))
				{
					System.out.println("15");
					if(cf.isElementPresent(ctanote1))
					{
						if(cf.isElementPresent(ctasubmit1))
						{
							System.out.println("16");
						}
						//ctest.getctanote().sendKeys("saima");
						Thread.sleep(3000);

						//ctest.getctasubmit().click();
						Thread.sleep(3000);


					}
				}
			}


			Actions ab =new Actions(driver);
			Thread.sleep(5000);
			ab.click(driver.findElement(By.xpath("//a[@class='action-icon icon-email']"))).release().perform();

			Thread.sleep(5000);



			By ctaemailtitle=By.xpath("//div[@class='form-modal white-popup popup-small zoom-anim-dialog mfp-show schedule-report-modal clearfix']//h2[@class='modal-title'][contains(text(),'Estimate Document')]");

			if(cf.isElementPresent(ctaemailtitle))
			{
			}
			Thread.sleep(3000);

			pp.ctapopupcheck().click();
			Thread.sleep(3000);

			pp.getSendBtn().click();
			Thread.sleep(3000);

			driver.navigate().back();

			Thread.sleep(5000);
			By contactus=By.xpath("//div[@class='cost-calculator']//a[contains(text(),'Contact Us')]");

			if(cf.isElementPresent(contactus))
			{
			}
			Thread.sleep(5000);

			By viewestimate=By.xpath("//a[@class='action-icon icon-estimates']");

			js11.executeScript(script1,driver.findElement(viewestimate));



			pp.ctaviewestimate().click();
			Thread.sleep(10000);

			By show11v1=By.xpath("//a[@class='image-link']//img");
			driver.findElement(show11v1).click();
			Thread.sleep(9000);
			pp.ctaprodQty().sendKeys(Keys.CONTROL);

			pp.ctaprodQty().sendKeys(Keys.BACK_SPACE);
			Thread.sleep(5000);
			pp.ctaprodQty().clear();



			////

			int ten =163;
			String query = "SELECT id FROM estimates WHERE user_id=724 ORDER BY ID  DESC LIMIT 1";	            
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
			Statement stmt = con.createStatement();	
			System.out.println("query ="+query );
			ResultSet rs= stmt.executeQuery(query);	
			int cs1=0;

			while (rs.next()) {

				cs1 = rs.getInt("id");
			}


			String  j2=  String.valueOf(cs1);
			int j3=       Integer.parseInt(j2);

			String query1 = "SELECT seats FROM estimate_items WHERE estimate_id=" +j3+ ";";	            
			Class.forName("com.mysql.jdbc.Driver");				

			Statement stmt1 = con.createStatement();	
			System.out.println("query ="+query1 );
			ResultSet rs1= stmt.executeQuery(query1);	
			int cs=0;

			while (rs1.next()) {

				cs = rs1.getInt("seats");
			}


			String  j4=  String.valueOf(cs+1);




			//


			pp.ctaprodQty().sendKeys(j4);
			Thread.sleep(3000);
			Assert.assertEquals(pp.getctainvalidatepriorestimate().getText(), "This change will invalidate any prior Estimates.");

			pp.createEstimate().click();

			Thread.sleep(5000);


			//pp.ctapopupcheck().click();

			Thread.sleep(5000);
			pp.ctapopupcontinue().click();
			Thread.sleep(10000);
			driver.navigate().back();


			/*Thread.sleep(5000);

			pp.ctaprodQty().sendKeys(Keys.CONTROL);

			pp.ctaprodQty().sendKeys(Keys.BACK_SPACE);
			Thread.sleep(5000);

			pp.ctaprodQty().clear();


			//
			query = "SELECT id FROM estimates WHERE user_id=724 ORDER BY ID  DESC LIMIT 1";	    
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con1 = DriverManager.getConnection(dburl,dbun,dbpswd);
			Statement stmt2 = con1.createStatement();	



			ResultSet rsg= stmt2.executeQuery(query);	
			int cs12=0;

			while (rsg.next()) {

				cs12 = rsg.getInt("id");
			}







			String query4 = "SELECT seats FROM estimate_items WHERE estimate_id=" +cs12+ ";";	            
			Class.forName("com.mysql.jdbc.Driver");				
			stmt2 = con1.createStatement();


			ResultSet rs12= stmt2.executeQuery(query4);	

			int cs13=0;
			while (rs12.next()) {

				cs13 = rs12.getInt("seats");
			}


			String  j41=  String.valueOf(cs13+1);

			pp.ctaprodQty().sendKeys(j41);
			Thread.sleep(5000);
			pp.createEstimate().click();
			Thread.sleep(5000);


			//	pp.ctapopupcheck().click();
			Thread.sleep(5000);

			pp.ctapopupcontinue().click();
			Thread.sleep(20000);
			driver.navigate().back();*/
			Thread.sleep(10000);
			pp.ctaviewestimate().click();
			Thread.sleep(5000);



			By show35=By.xpath("//label[contains(text(),'5')]");	




			if(cf.isElementPresent(show35))
			{

				System.out.println("most resent estiamted present");	

			}			

			Thread.sleep(5000);





		}






		


		hd.logout();
	}
	catch (org.openqa.selenium.NoSuchElementException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
	

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}


	}


	@Parameters({"username10","pswd10","url","dburl1","dbun","dbpswd","env"})		
	@Test(priority = 5,enabled=true)

	public void estimate_partb(String username1 , String pswd1, String url, String dburl, String dbun, String dbpswd,String env) throws IOException, InterruptedException, ClassNotFoundException, SQLException{
	try {	
	
		driver = getdriver();
	
		driver.get(url);

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

		hm.getman().click();
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("Service Provisioning - CCM"));




		sr.getmngsubsCTA().click();
		Thread.sleep(3000);


		pp.ctaviewestimate().click();


		Thread.sleep(5000);

		pp.getnow1().click();		

		Thread.sleep(5000);



		By pdf=By.xpath("//img[@class='pdf_download']");
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		String script ="arguments[0].scrollIntoView(true);";
		Thread.sleep(5000);
		pp.ctapdf().click();	
		Thread.sleep(5000);

		String 	OldTab=driver.getWindowHandle();
		///

		pp.ctasubmitorder().click();

		Thread.sleep(5000);

		wait.until(ExpectedConditions.titleContains("Order Received - CCM"));

		Assert.assertEquals(driver.getTitle(), "Order Received - CCM",
				"After clicking on submit button on procurement checkout, user is not able to navigate to order received page");

		Thread.sleep(5000);
		//


		Thread.sleep(5000);

		Thread.sleep(5000);
		driver.switchTo().window(OldTab);

		Thread.sleep(5000);



		hm.getManage_Link().click();
		wait = new WebDriverWait(driver, 60);

		WebDriverWait wait1 = new WebDriverWait(driver, 300);

		Thread.sleep(5000);


		WebElement   pop5=driver.findElement(By.xpath("//span[@class='active']"));   
		WebElement   pop6=driver.findElement(By.id("SearchBySubscription"));   
		WebElement   pop7=driver.findElement(By.xpath("//div[@class='search-container']//i[@class='fa fa-search icon-search']"));   

		pop6.sendKeys("Corp. CSP Enterprise Mobility + Sec E5 Monthly");
		Thread.sleep(5000);
		pop7.click();
		//	Thread.sleep(240000);
		Thread.sleep(100000);


		By pop4=By.xpath("//p[@class='detail blue']");  
		Thread.sleep(5000);
		pop5.click();
		WebElement w=null;
		Thread.sleep(5000);
		while(!(cf.isElementPresent(pop4)))
		{ 
			try{
				//	Thread.sleep(300000);
				Thread.sleep(100000);
				pop5.click();
				w=driver.findElement(By.xpath("//p[@class='detail blue']"));
			}	catch (org.openqa.selenium.NoSuchElementException e) {
				////System.out.println("Error message: " + e.toString());

				e.printStackTrace();
				// System.out.println("catchcalled8");   Assert.assertTrue(false, "Failed" + e.getMessage());

			}

		}




		hd.logout();	
	}
	catch (org.openqa.selenium.NoSuchElementException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
	

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}

	}


	@Parameters({"username10","pswd10","url","dburl1","dbun","dbpswd","env"})	
	@Test(priority = 6,enabled=true)

	public void estimate_partc_update_subscription(String username1 , String pswd1, String url, String dburl, String dbun, String dbpswd,String env) throws IOException, InterruptedException, ClassNotFoundException, SQLException{
	try {	driver = getdriver();
	
		driver.get(url);
		lp.getusername().sendKeys(username1);

		lp.getpassword().sendKeys(pswd1);
		lp.getloginbtn().click();
		
		
		Thread.sleep(5000);
		String email111=username1;
		String query1 = "select two_factor_code from users where email='" +email111+  "';";	            
		Class.forName("com.mysql.jdbc.Driver");				
		Connection con1 = DriverManager.getConnection(dburl,dbun,dbpswd);
		Statement stmt1 = con1.createStatement();					
		ResultSet rs1= stmt1.executeQuery(query1);	
		System.out.println("code ="+query1);
		String a3=null;
		Thread.sleep(5000);
		while (rs1.next())
		{
			 a3 = rs1.getString(1);								        

			System.out.println("code ="+a3);
		}
		
		Thread.sleep(5000);
		lp.getsecretcode().sendKeys(a3);
		Thread.sleep(5000);
		lp.getcompAuth().click();
		Thread.sleep(5000);

		hm.getManage_Link().click();
		Thread.sleep(5000);
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleContains("Service Provisioning - CCM"));


		sr.getmngsubsCTA().click();
		Thread.sleep(3000);

		if(env.contentEquals("qa"))
		{

			int ten =1274;
			String query = "SELECT current_seats FROM  subscriptions where tenant_id=" +ten+ ";";	            
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
			Statement stmt = con.createStatement();	
			System.out.println("query ="+query );
			ResultSet rs= stmt.executeQuery(query);	
			int cs=0;

			while (rs.next()) {

				cs = rs.getInt("current_seats");
			}


			j1=  String.valueOf(cs+1);

			pp.ctaprodQty().sendKeys(Keys.CONTROL);

			pp.ctaprodQty().sendKeys(Keys.BACK_SPACE);
			Thread.sleep(5000);
			pp.ctaprodQty().clear();
			pp.ctaprodQty().sendKeys(j1);
			Thread.sleep(6000);


			pp.updatesub().click();
			Thread.sleep(5000);
			pp.cancelupdate().click();
			pp.ctaprodQty().sendKeys(Keys.BACK_SPACE);
			Thread.sleep(5000);
			pp.ctaprodQty().clear();
			pp.ctaprodQty().sendKeys(j1);
			Thread.sleep(6000);


			pp.updatesub().click();
			Thread.sleep(5000);
			pp.contupdate().click();
			Thread.sleep(10000);

			JavascriptExecutor js1 = (JavascriptExecutor)driver;

			js1.executeScript("window.scrollBy(0,350)");
			//////^^^^^
			By submitorder=By.xpath("//button[@class='btn btn-default btn-create-account btn-primary']");
			Thread.sleep(5000);
			driver.findElement(submitorder).click();
			Thread.sleep(5000);

			wait.until(ExpectedConditions.titleContains("Order Received - CCM"));

			Assert.assertEquals(driver.getTitle(), "Order Received - CCM",
					"After clicking on submit button on procurement checkout, user is not able to navigate to order received page");

			Thread.sleep(5000);

			hm.getManage_Link().click();
			wait = new WebDriverWait(driver, 60);


			Thread.sleep(5000);


			WebElement   pop5=driver.findElement(By.xpath("//span[@class='active']"));   
			WebElement   pop6=driver.findElement(By.id("SearchBySubscription"));   
			WebElement   pop7=driver.findElement(By.xpath("//div[@class='search-container']//i[@class='fa fa-search icon-search']"));   

			pop6.sendKeys("Corp. CSP Enterprise Mobility + Sec E5 Monthly");
			Thread.sleep(5000);
			pop7.click();
			Thread.sleep(240000);



			By pop4=By.xpath("//p[@class='detail blue']");  
			Thread.sleep(5000);
			pop5.click();
			WebElement w=null;
			Thread.sleep(5000);
			while(!(cf.isElementPresent(pop4)))
			{ 
				try{
					Thread.sleep(300000);
					pop5.click();
					w=driver.findElement(By.xpath("//p[@class='detail blue']"));
				}	catch (org.openqa.selenium.NoSuchElementException e) {
					////System.out.println("Error message: " + e.toString());

					e.printStackTrace();
					// System.out.println("catchcalled8");   Assert.assertTrue(false, "Failed" + e.getMessage());

				}

			}







		}


		///



		else if(env.contentEquals("uat"))
		{

			int ten =164;
			String query = "SELECT current_seats FROM  subscriptions where tenant_id=" +ten+ ";";	            
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
			Statement stmt = con.createStatement();	
			System.out.println("query ="+query );
			ResultSet rs= stmt.executeQuery(query);	
			int cs=0;

			while (rs.next()) {

				cs = rs.getInt("current_seats");
			}


			j1=  String.valueOf(cs+1);

			pp.ctaprodQty().sendKeys(Keys.CONTROL);

			pp.ctaprodQty().sendKeys(Keys.BACK_SPACE);
			Thread.sleep(5000);
			pp.ctaprodQty().clear();
			pp.ctaprodQty().sendKeys(j1);
			Thread.sleep(6000);


			pp.updatesub().click();
			Thread.sleep(5000);
			pp.cancelupdate().click();
			pp.ctaprodQty().sendKeys(Keys.BACK_SPACE);
			Thread.sleep(5000);
			pp.ctaprodQty().clear();
			pp.ctaprodQty().sendKeys(j1);
			Thread.sleep(6000);


			pp.updatesub().click();
			Thread.sleep(5000);
			pp.contupdate().click();
			Thread.sleep(10000);

			JavascriptExecutor js1 = (JavascriptExecutor)driver;

			js1.executeScript("window.scrollBy(0,350)");
			//////^^^^^
			By submitorder=By.xpath("//button[@class='btn btn-default btn-create-account btn-primary']");
			Thread.sleep(5000);
			driver.findElement(submitorder).click();
			Thread.sleep(5000);

			wait.until(ExpectedConditions.titleContains("Order Received - CCM"));

			Assert.assertEquals(driver.getTitle(), "Order Received - CCM",
					"After clicking on submit button on procurement checkout, user is not able to navigate to order received page");

			Thread.sleep(5000);

			hm.getManage_Link().click();
			wait = new WebDriverWait(driver, 60);


			Thread.sleep(5000);


			WebElement   pop5=driver.findElement(By.xpath("//span[@class='active']"));   
			WebElement   pop6=driver.findElement(By.id("SearchBySubscription"));   
			WebElement   pop7=driver.findElement(By.xpath("//div[@class='search-container']//i[@class='fa fa-search icon-search']"));   

			pop6.sendKeys("Corp. CSP Enterprise Mobility + Sec E5 Monthly");
			Thread.sleep(5000);
			pop7.click();
			Thread.sleep(240000);



			By pop4=By.xpath("//p[@class='detail blue']");  
			Thread.sleep(5000);
			pop5.click();
			WebElement w=null;
			Thread.sleep(5000);
			while(!(cf.isElementPresent(pop4)))
			{ 
				try{
					Thread.sleep(300000);
					pop5.click();
					w=driver.findElement(By.xpath("//p[@class='detail blue']"));
				}	catch (org.openqa.selenium.NoSuchElementException e) {
					////System.out.println("Error message: " + e.toString());

					e.printStackTrace();
					// System.out.println("catchcalled8");   Assert.assertTrue(false, "Failed" + e.getMessage());

				}

			}

		}
//Create estimate for the next time

			By mangesubscCTA1= By.xpath("//a[@class='btn btn-primary' and text()='Manage Subscription']");

		sr.getmngsubsCTA().click();
		Thread.sleep(5000);







		if(env.contentEquals("qa"))
		{
			int ten =1274;
			String query = "SELECT current_seats FROM  subscriptions where tenant_id=" +ten+ ";";	            
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
			Statement stmt = con.createStatement();	
			System.out.println("query ="+query );
			ResultSet rs= stmt.executeQuery(query);	
			int cs=0;

			while (rs.next()) {

				cs = rs.getInt("current_seats");
			}


			j1=  String.valueOf(cs+1);


			pp.ctaprodQty().sendKeys(Keys.CONTROL);

			pp.ctaprodQty().sendKeys(Keys.BACK_SPACE);
			Thread.sleep(5000);
			pp.ctaprodQty().clear();
			pp.ctaprodQty().sendKeys(j1);
			Thread.sleep(6000);
			driver.findElement(By.id("estimates")).click();;

			Thread.sleep(5000);


			//pp.ctapopupcheck().click();

			Thread.sleep(5000);
			pp.ctapopupcontinue().click();
			Thread.sleep(10000);
			driver.navigate().back();
			Thread.sleep(5000);
		}








		else if (env.contentEquals("uat"))
		{
			int ten =164;
			String query = "SELECT current_seats FROM  subscriptions where tenant_id=" +ten+ ";";	            
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
			Statement stmt = con.createStatement();	
			System.out.println("query ="+query );
			ResultSet rs= stmt.executeQuery(query);	
			int cs=0;

			while (rs.next()) {

				cs = rs.getInt("current_seats");
			}


			j1=  String.valueOf(cs+1);


			pp.ctaprodQty().sendKeys(Keys.CONTROL);

			pp.ctaprodQty().sendKeys(Keys.BACK_SPACE);
			Thread.sleep(5000);
			pp.ctaprodQty().clear();
			pp.ctaprodQty().sendKeys(j1);
			Thread.sleep(6000);
			driver.findElement(By.id("estimates")).click();;

			Thread.sleep(5000);

			Thread.sleep(5000);
			pp.ctapopupcontinue().click();
			Thread.sleep(10000);
			driver.navigate().back();
			Thread.sleep(5000);


		}



	}	catch (org.openqa.selenium.NoSuchElementException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
	

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}


	Thread.sleep(5000);	

hd.logout();



Thread.sleep(5000);	
		//	%%%%%			




















	}

	//	 



















}









