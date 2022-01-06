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
import CustomerPortal.Home.Users;
import resources.base;

public class LatestRegressionSuite_2 extends base {

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
	Subscriptions sr;
	Manage mn;
	HomePage hm;
	By alertmsg=By.xpath("//span[@class='alert-msg']"); 
	public String email;
	Payment pay;
	Procurement pr;
	public String email() {
		 
	return email;
		
	}
	public LatestRegressionSuite_2() throws IOException, InterruptedException , ClassNotFoundException, SQLException {

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
		pay=new Payment(driver);

		rp=new RegisterationPage(driver);
		hm = new HomePage(driver);
		ft=new Footer(driver);
	
		sr=new Subscriptions(driver);

		mn=new Manage(driver);


		auditlog al=new auditlog(driver);


	}
	
	@Parameters({"url","dburl","dbun","dbpswd","env"})
	@Test(priority = 7,enabled=true)
	public void Validate_AccountCreation_ProcessTwo_9(String url, String dburl, String dbun, String dbpswd,String env) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
		
		
			try { 
				prop=new Properties();
				fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
				prop.load(fis);
			
			//driver = initializeDriver();
				driver = getdriver();
				lp= new LoginPage(driver);
				us= new Users(driver);
				cf= new CommonFunctions(driver);
				rp=new RegisterationPage(driver);
				hd=new Header(driver);
				pay=new Payment(driver);
				 ft=new Footer(driver)  ;
				    pr = new Procurement(driver);
				    hm = new HomePage(driver);
				hm=new HomePage(driver);
				sr=new Subscriptions(driver);
				mn=new Manage(driver);
				Random rm = new Random();
				int i = rm.nextInt(100) + 1;

				rp=new RegisterationPage(driver);
			 hm = new HomePage(driver);
				ft=new Footer(driver);

				Thread.sleep(5000);
			wait = new WebDriverWait(driver, 120);
		    cf.gotoURL(url);
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(lp.getCreate_Account()));
			lp.getCreate_Account().click();
			
			
			Thread.sleep(5000);
			
			////


			// WebDriverWait wt = new WebDriverWait(driver,50);

			
			
			//
			
			String email11= "dove" + i + "@arpatech.com";
			
			
			
			
			
			
			
			
			
			
			rp.enteremailInfo(email11);
			Thread.sleep(8000);
		Thread.sleep(10000);
			
			String count = driver.findElement(By.xpath("//div[@class='ccp-form-warning']/p//span[@class='alert-msg']")).getText();
			System.out.println(count); 
			String expected="DO NOT CLOSE THIS WINDOW \nAn email has been sent for verification. Please follow the instructions to complete the email verification by providing the code in the email. Click Resend verification code if the email is not received".replaceAll("\\n|\\r\\\n", System.getProperty("line.separator"));
			System.out.println(expected.toString().trim());
			Thread.sleep(5000);
			Assert.assertEquals(count.contains("An email has been sent for verification"),expected.contains("An email has been sent for verification"), "alert text not match");
			
			
			
			Thread.sleep(5000);
			
			
			
			
			rp.click_resendcodeLinkInAlert();

	
			
			// = prop.getProperty("url_cust");
			Thread.sleep(5000);

			Assert.assertEquals(count.contains("An email has been sent for verification"),expected.contains("An email has been sent for verification"), "alert text not match");
			Thread.sleep(5000);
			//String dbUrl = "jdbc:mysql://localhost:3306/database_sensitive";					
			//String username = "homestead";	
			//String password = "secret";					
			String query = "select verification_code from signup_verification_token where email='" +email11+  "';";	            
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
			Statement stmt = con.createStatement();					
			ResultSet rs= stmt.executeQuery(query);							
			while (rs.next()){
				a = rs.getString(1);								        

				System. out.println("code ="+a);		
			}		
			con.close();			
			Thread.sleep(8000);
			rp.entercode(a);
			Thread.sleep(8000);
			
			rp.getnotlistedlabel().click();
			Thread.sleep(2000);
			JavascriptExecutor js1 = (JavascriptExecutor)driver;
			
		    js1.executeScript("window.scrollBy(0,180)");
			Thread.sleep(8000);
			rp.enterInvalidBusinessInfoDomainexist("Saimaqa2020org","saimaqa2020org","Business","0-49","756 Concho Ln Houston TX 77084","Houston","TX","77084","353.463.4646");
			Thread.sleep(3000);
			
		   // js1.executeScript("window.scrollBy(0,-180)");
				//Thread.sleep(5000);
				
           if (env.contentEquals("qa"))
           {
				
			rp.enterBusinessInfoBySelectOrg("1250");
			
           }
           else if (env.contentEquals("uat"))
           {
				
			rp.enterBusinessInfoBySelectOrg("287");
			
           }
           
			Thread.sleep(3000);
			rp.enterUserInfo("saima ","tabassum","233.343.4345","IT","Connection123","Connection123");
			Thread.sleep(3000);
			rp.AgreeCSA();
			Thread.sleep(10000);
			rp.createAccountclickRegPageBySelectOrg();
			Thread.sleep(5000);	
		
			}	catch(Error e){
				System.out.println("Error message: " + e.toString());
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
	@Parameters({"url","dburl","dbun","dbpswd","env","inviteurl"})
	@Test(priority = 8,enabled=true)
	public void Validate_AccountCreation_ProcessTwo_10(String url,String dburl, String dbun, String dbpswd, String env,String inviteurl) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
			try {
				

				Thread.sleep(5000);
				
				
				
				
				
				
				
				
			
				cf.gotoURL(url);
				Thread.sleep(3000);	
				cf.loginapp(dburl,dbun,dbpswd);
				Thread.sleep(5000);	
				Random rm = new Random();
				int i = rm.nextInt(1000) + 1;
				wait = new WebDriverWait(driver, 120);
				String email2="saima.tabassum+" + i + "@arpatech.com";
				us.inviteuser(email2, dburl,dbun, dbpswd,inviteurl);
				Thread.sleep(3000);	
				rp.enterUserInfo("saima ","tabassum","233.343.4345","Finance","Connection123","Connection123");
				Thread.sleep(3000);	
				rp.AgreeCSA();
				Thread.sleep(3000);	
				rp.createAccountclickonRegPage(email2);
				Thread.sleep(10000);	
				//hd.logout();
				Thread.sleep(5000);	
			}	catch(Error e){
				System.out.println("Error message: " + e.toString());
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
			//Alhamdullilah
		}
	 @Parameters({"url"})
	@Test(priority =9,enabled=true)
	public void Validate_ForgotPassword_11(String url) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	// 12 canot be autamted
	
			prop=new Properties();
			fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
		
		driver = initializeDriver();
			driver = getdriver();
			lp= new LoginPage(driver);
			us= new Users(driver);
			cf= new CommonFunctions(driver);
			rp=new RegisterationPage(driver);
			hd=new Header(driver);
			pay=new Payment(driver);
			 ft=new Footer(driver)  ;
			    pr = new Procurement(driver);
			    hm = new HomePage(driver);
			hm=new HomePage(driver);
			sr=new Subscriptions(driver);
			mn=new Manage(driver);
			Random rm = new Random();
			int i = rm.nextInt(100) + 1;

			rp=new RegisterationPage(driver);
		 hm = new HomePage(driver);
			ft=new Footer(driver);

			Thread.sleep(5000);
		wait = new WebDriverWait(driver, 120);
				try {
				cf.gotoURL(url);		    wait.until(ExpectedConditions.titleContains("Login - CCM"));
				Thread.sleep(10000);
				lp.getForget_Pswd().click();
			    wait.until(ExpectedConditions.titleContains("Forgot Password - CCM"));
				Assert.assertEquals(driver.getTitle(), "Forgot Password - CCM",
						"User not able to land reach forgot password page");
				Thread.sleep(5000);
				lp.getemailfield().sendKeys("a67215100@jj67j100.com");
				Thread.sleep(5000);
				lp.getSbmt_Btn().click();
	
				Thread.sleep(10000);
				By alertforgot=By.xpath("//div[@class='alert alert-success ccp-alert-success']"); 
				Thread.sleep(20000);
				//Assert.assertEquals(rp.getalertforgot().getText(), "A password reset link has been emailed to your email account on file. Please check your email", "alert text not match");

				String count = driver.findElement(By.xpath("//div[@class='alert alert-success ccp-alert-success']")).getText();

				String expected="A password reset link has been emailed to your email account on file. Please check your email".replaceAll("\\n|\\r\\\n", System.getProperty("line.separator"));
		
				Thread.sleep(3000);
				Assert.assertEquals(count.contains("A password reset link has been emailed"),expected.contains("A password reset link has been emailed"), "alert text not match");
				
				
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
	 @Parameters({"username2","pswd2","url","env"})
	@Test(priority =10,enabled=true)
	public void Validate_HeaderFooter_12(String username , String pswd, String url,String env) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
			



	try {
		 
		
		
		
		
		
		

		wait = new WebDriverWait(driver, 120);
		Thread.sleep(7000);
		

		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		Thread.sleep(10000);
		
		lp.getusername().sendKeys(username);
		
		lp.getpassword().sendKeys(pswd);
		lp.getloginbtn().click();
		
		
		if(env.contentEquals("qa")) {
			
			driver.findElement(By.xpath("//img[@class='logo']")).click();}
		
		if(env.contentEquals("uat")) {
			
		driver.findElement(By.xpath("//img[@class='logo']")).click();}
		

		Thread.sleep(20000);
		

				Thread.sleep(3000);
				hm.getglobalSearch().isDisplayed();
				Thread.sleep(3000);
				
	
				
				if(env.contentEquals("qa")) {
					String a=	hm.getacctinitials().getText();
				
						Assert.assertEquals(a, "HH");}
						
						if(env.contentEquals("uat")) {
							String a=	hm.getacctinitials().getText();
						
								Assert.assertEquals(a, "ST");}
				
				
				
				
				
				
				
				
				
			
				Thread.sleep(3000);
				hd.getAccountmenu_mgmt().isDisplayed();
				Thread.sleep(3000);
				hd.getBellIcon().isDisplayed();
				Thread.sleep(3000);



	//footer

	wait = new WebDriverWait(driver, 120);
				ft.getsocialIcon().isDisplayed();

				Thread.sleep(3000);
				
			
				ft.getmarketplace().isDisplayed();
			Thread.sleep(3000);
				ft.getdiscover().isDisplayed();
			Thread.sleep(3000);
			
					ft.getapps().isDisplayed();;
					Thread.sleep(3000);

				ft.getinfrastruc().isDisplayed();		
				
				Thread.sleep(3000);
				 
					ft.getplatform().isDisplayed();
				Thread.sleep(3000);
				ft.getconsulting().isDisplayed();
		
		
				
					Thread.sleep(3000);
				ft.getmanage().isDisplayed();
				Thread.sleep(3000);
				ft.getsubscriptions().isDisplayed();
				Thread.sleep(3000);
				ft.getcalender().isDisplayed();
				Thread.sleep(3000);
				
				ft.getinsights().isDisplayed();
			
						Thread.sleep(3000);
				ft.getspendana().isDisplayed();

				Thread.sleep(3000);
			
				
				ft.getorders().isDisplayed();
		
					Thread.sleep(3000);
				ft.getsignedagreement().isDisplayed();
				

					Thread.sleep(3000);

				
				ft.getbilllines().isDisplayed();
			
							Thread.sleep(3000);
							ft.getbills().isDisplayed();
				
			//hkhkhlhfhfhgggj

							Thread.sleep(3000);
					
				ft.getabtconn().isDisplayed();
			

					Thread.sleep(3000);
					
					ft.getabtccm().isDisplayed();
				

					Thread.sleep(3000);
				
				ft.getcontact().isDisplayed();
		

					Thread.sleep(3000);
				
				ft.gettermsofuse().isDisplayed();
				

						Thread.sleep(3000);
					
				ft.getprivacypolicy().isDisplayed();
						
		Thread.sleep(3000);
				ft.getaccess().isDisplayed();
					
				Thread.sleep(3000);
		
							ft.gethelp().isDisplayed();
							Thread.sleep(3000);
							Thread.sleep(3000);	
			
							hd.logout();
							Thread.sleep(3000);
	}
	catch(org.openqa.selenium.ElementClickInterceptedException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
		hd.logout();
		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
	catch(org.openqa.selenium.NoSuchElementException e) {
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
	 @Parameters({"username2","pswd2","url","env","dburl","dbun","dbpswd",})
	@Test(priority = 11,enabled=true)
	public void Validate_HomePage_13(String username , String pswd, String url,String env,String dburl, String dbun, String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{

	//14 will be tested with multiple procuments
	try {
		

		
		wait = new WebDriverWait(driver, 120);
		Thread.sleep(20000);
		lp.getusername().sendKeys(username);
		
		lp.getpassword().sendKeys(pswd);
		Thread.sleep(3000);
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
		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(3000);
		
				hm.getconn_logo().click();
				Thread.sleep(2000);
				hm.getglobalSearch().isDisplayed();
				Thread.sleep(5000);
				
				if(env.contentEquals("qa")) {
			String a=	hm.getacctinitials().getText();
		
				Assert.assertEquals(a, "HH");}
				
				if(env.contentEquals("uat")) {
					String a=	hm.getacctinitials().getText();
				
						Assert.assertEquals(a, "ST");}
				
				Thread.sleep(2000);
				
				hd.getAccountmenu_mgmt().isDisplayed();
				Thread.sleep(2000);
				hd.getBellIcon().isDisplayed();
				Thread.sleep(2000);
				
				hm.getManage_Link();
				Thread.sleep(2000);
				hm.getInsight_Link();
				Thread.sleep(2000);
	            hm.getMarketPlace_Link();
	            Thread.sleep(2000);
				hm.getDiscover().isEnabled();
				   Thread.sleep(2000);
				hm.getApplication_Link().isEnabled();
				   Thread.sleep(2000);
				hm.getInfrastructure_Link();
				   Thread.sleep(2000);
				hm.getPlatform_Link();
				   Thread.sleep(2000);
			
				hm.getConsulting();
				   Thread.sleep(2000);
	            hm.getMarketplaceaccountname();
	            Thread.sleep(2000);
				hm.getDFP_Banner().isDisplayed();
				   Thread.sleep(2000);
				//hm.getFeatured_Services().isDisplayed();
				   Thread.sleep(2000);
				   
				   By GetBtn=By.xpath("(//a[@tabindex='0' and text()='Get it Now'])[1]");
				   By GetBtn1=By.xpath("(//a[@tabindex='0' and text()='Manage'])[1]");
			
					if((cf.isElementPresent(GetBtn)) || (cf.isElementPresent(GetBtn1)))
					{
				  
				    	 Assert.assertTrue(true, "Pass" + "Get now button enabled");
				    	 
				    
				     
					}
					
					
				     
				    	 
					
				   Thread.sleep(2000);
				hm.getShopSection().isDisplayed();
				//wait.until(ExpectedConditions.invisibilityOf(hm.getServiceSection()));
				
				wait = new WebDriverWait(driver, 120);
				ft.getsocialIcon().isDisplayed();

				Thread.sleep(3000);


						Thread.sleep(5000);
						wait.until(ExpectedConditions.elementToBeClickable(ft.getdiscover()));
				
				ft.getdiscover().click();
				Thread.sleep(5000);
				  wait.until(ExpectedConditions.titleContains("Discover - CCM"));
					Thread.sleep(3000);
					Assert.assertEquals(driver.getTitle(), "Discover - CCM",
							"User not able to reach discover ccm page ");
					Actions action9 = new Actions(driver);
					Thread.sleep(5000);
					Thread.sleep(5000);
					
					WebElement element92 = driver.findElement(By.xpath("//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Applications')]"));
			
					action9.moveToElement(element92).click().build().perform();
					Thread.sleep(10000);
					Assert.assertEquals(driver.getTitle(), "Applications - CCM",
							"User not able to reach applications ccm page ");

					Thread.sleep(3000);
					wait.until(ExpectedConditions.elementToBeClickable(ft.getinfrastruc()));
				ft.getinfrastruc().click();			
				
				Thread.sleep(3000);
				  wait.until(ExpectedConditions.titleContains("Infrastructure - CCM"));
					Assert.assertEquals(driver.getTitle(), "Infrastructure - CCM",
							"User not able to reach Infrastructure ccm page ");

					Thread.sleep(3000);
					wait.until(ExpectedConditions.elementToBeClickable(ft.getplatform()));
					ft.getplatform().click();
				  wait.until(ExpectedConditions.titleContains("Platforms - CCM"));
					Assert.assertEquals(driver.getTitle(), "Platforms - CCM",
							"User not able to reach platform ccm page ");

					Thread.sleep(3000);
					wait.until(ExpectedConditions.elementToBeClickable(ft.getconsulting()));
				ft.getconsulting().click();
				  wait.until(ExpectedConditions.titleContains("Consulting - CCM"));
					Assert.assertEquals(driver.getTitle(), "Consulting - CCM",
							"User not able to reach consulting  ccm page ");
					Thread.sleep(3000);
					wait.until(ExpectedConditions.elementToBeClickable(ft.getmanage()));
					Thread.sleep(30000);
					WebElement element = driver.findElement(By.xpath("//div[@class='footer-top-right clearfix']//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'MANAGE')]"));
					Actions actions = new Actions(driver);
					actions.moveToElement(element).click().build().perform();
					Thread.sleep(3000);
					
					JavascriptExecutor js1 = (JavascriptExecutor)driver;

					js1.executeScript("window.scrollBy(0,1000)");
			
					
		
			
		WebElement element9 = driver.findElement(By.xpath("//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Subscriptions')]"));

		action9.moveToElement(element9).click().build().perform();
		Thread.sleep(10000);
		
		WebElement element1 = driver.findElement(By.xpath("//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Usage')]"));

		actions.moveToElement(element1).click().build().perform();
		Thread.sleep(10000);
		
		WebElement element2= driver.findElement(By.xpath("//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Calendar')]"));

		actions.moveToElement(element2).click().build().perform();
		Thread.sleep(10000);
		WebElement element3= driver.findElement(By.xpath("//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Insights')]"));

		actions.moveToElement(element3).click().build().perform();
		Thread.sleep(10000);
		WebElement element4= driver.findElement(By.xpath("//ul[@class='col-sm-3 col-xs-3']//a[contains(text(),'Spend Analysis')]"));

		actions.moveToElement(element4).click().build().perform();
		Thread.sleep(10000);
			
			

				Thread.sleep(3000);
				  wait.until(ExpectedConditions.titleContains("Spend Analysis - CCM"));
					Assert.assertEquals(driver.getTitle(), "Spend Analysis - CCM",
							"User not able to reach spend analysis ccm page ");
		
				Thread.sleep(3000);
				wait.until(ExpectedConditions.elementToBeClickable(ft.getauditlog()));
				Thread.sleep(3000);
				ft.getauditlog().click();
				Thread.sleep(3000);
				  wait.until(ExpectedConditions.titleContains("Audit Log - CCM"));
					Assert.assertEquals(driver.getTitle(), "Audit Log - CCM",
							"User not able to reach audit log ccm page ");
		
					wait.until(ExpectedConditions.elementToBeClickable(ft.getorders()));
					Thread.sleep(3000);
				ft.getorders().click();
				Thread.sleep(3000);
				  wait.until(ExpectedConditions.titleContains("Orders - CCM"));
					Assert.assertEquals(driver.getTitle(), "Orders - CCM",
							"User not able to reach order ccm  page ");

					wait.until(ExpectedConditions.elementToBeClickable(ft.getsignedagreement()));
					Thread.sleep(3000);
				ft.getsignedagreement().click();
				   wait.until(ExpectedConditions.titleContains("Signed Agreements - CCM"));
					Assert.assertEquals(driver.getTitle(), "Signed Agreements - CCM",
							"User not able to reach signed agreement page ");

					Thread.sleep(3000);

					wait.until(ExpectedConditions.elementToBeClickable(ft.getbilllines()));
				ft.getbilllines().click();
				Thread.sleep(3000);
				   wait.until(ExpectedConditions.titleContains("Bill Lines - CCM"));
							Assert.assertEquals(driver.getTitle(), "Bill Lines - CCM",
									"User not able to reach bill lines page ");

							wait.until(ExpectedConditions.elementToBeClickable(ft.getbills()));
							Thread.sleep(3000);
							ft.getbills().click();
							Thread.sleep(3000);
				   wait.until(ExpectedConditions.titleContains("Bills - CCM"));
							Assert.assertEquals(driver.getTitle(), "Bills - CCM",
									"User not able to reach bill page ");

							Thread.sleep(3000);
							wait.until(ExpectedConditions.elementToBeClickable(ft.getabtconn()));
				ft.getabtconn().click();
				Thread.sleep(3000);
				   wait.until(ExpectedConditions.titleContains("About Connection - CCM"));
					Assert.assertEquals(driver.getTitle(), "About Connection - CCM",
							"User not able to reach abt conneciton page ");

					Thread.sleep(3000);
					wait.until(ExpectedConditions.elementToBeClickable(ft.getabtconn()));
					ft.getabtccm().click();
					Thread.sleep(3000);
				   wait.until(ExpectedConditions.titleContains("About - CCM"));
					Assert.assertEquals(driver.getTitle(), "About - CCM",
							"User not able to reach abt us page ");

					Thread.sleep(3000);
					wait.until(ExpectedConditions.elementToBeClickable(ft.getcontact()));
				ft.getcontact().click();
				   wait.until(ExpectedConditions.titleContains("Contact Us - CCM"));
					Assert.assertEquals(driver.getTitle(), "Contact Us - CCM",
							"User not able to reach contact us page ");

					Thread.sleep(3000);
					wait.until(ExpectedConditions.elementToBeClickable(ft.gettermsofuse()));
				ft.gettermsofuse().click();
				Thread.sleep(3000);
				   wait.until(ExpectedConditions.titleContains("Terms of Use - CCM"));
						Assert.assertEquals(driver.getTitle(), "Terms of Use - CCM",
								"User not able to reach terms of use page ");

						Thread.sleep(3000);
						wait.until(ExpectedConditions.elementToBeClickable(ft.getprivacypolicy()));
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
				Thread.sleep(3000);
				Iterator<String> it=abc.iterator();
				Thread.sleep(3000);
				while(it.hasNext())
				{
				driver.switchTo().window(it.next());
				Thread.sleep(3000);
				title4 = driver.getTitle();
				Thread.sleep(3000);
				}	
				Thread.sleep(3000);
			    wait.until(ExpectedConditions.titleContains("Accessibility Policy - Connection"));
							Assert.assertEquals(title4, "Accessibility Policy - Connection",
									"User not able to reach accessibility policy page ");
							Thread.sleep(3000);
							driver.switchTo().window(OldTab);		
							Thread.sleep(5000);
							ft.gethelp().click();
							Thread.sleep(5000);
							
			    wait.until(ExpectedConditions.titleContains("Help - CCM"));
						Assert.assertEquals(driver.getTitle(), "Help - CCM",
								"User not able to land reach help page");
						wait.until(ExpectedConditions.elementToBeClickable(ft.getprivacypolicy()));
						Thread.sleep(3000);
						hd.logout();
						Thread.sleep(3000);
	}
	catch(org.openqa.selenium.ElementClickInterceptedException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
		hd.logout();
		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
	catch(org.openqa.selenium.NoSuchElementException e) {
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

	@Test(priority =12, enabled =true)
	public void Validate_multiple_service_procurment_14() throws IOException, InterruptedException , ClassNotFoundException, SQLException{
		
		//need to develop
	}
	
	 @Parameters({"url","dburl","dbun","dbpswd"})
	@Test(priority = 13,enabled=true)
public void Validate_AccountCreation_ProcessOne_8( String url, String dburl, String dbun, String dbpswd ) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
		try{

	

		Random rm = new Random();
		int i = rm.nextInt(100) + 1;
		Random rm1 = new Random();
		int j1 = rm1.nextInt(100) + 1;

		rp=new RegisterationPage(driver);
	 hm = new HomePage(driver);
		ft=new Footer(driver);

		wait = new WebDriverWait(driver, 120);

			driver.get(url);
			Thread.sleep(3000);
			email="TestAutomation"+i+ "@" +"jj67j"+i+"ff"+j1+".com";	
			System.out.println(email);
		
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(lp.getCreate_Account()));
			Thread.sleep(2000);
			lp.getCreate_Account().click();
			Thread.sleep(5000);
			/*rp.enteremailInfo(email);
		
			Thread.sleep(7000);
			By alertmsg1=By.xpath("//span[@class='alert-msg']"); 
			wait.until(ExpectedConditions.visibilityOfElementLocated(alertmsg1));

			String count = driver.findElement(By.xpath("//div[@class='ccp-form-warning']/p//span[@class='alert-msg']")).getText();
			System.out.println(count); 
			String expected="DO NOT CLOSE THIS WINDOW \nAn email has been sent for verification. Please follow the instructions to complete the email verification by providing the code in the email. Click Resend verification code if the email is not received".replaceAll("\\n|\\r\\\n", System.getProperty("line.separator"));
			System.out.println(expected.toString().trim());
			Thread.sleep(10000);
			Assert.assertEquals(count.contains("An email has been sent for verification"),expected.contains("An email has been sent for verification"), "alert text not match");
			
			Thread.sleep(10000);
			rp.click_resendcodeLinkInAlert();
			Thread.sleep(3000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(alertmsg));
			
			Assert.assertEquals(count.contains("An email has been sent for verification"),expected.contains("An email has been sent for verification"), "alert text not match");
			Thread.sleep(3000);
			rp.entercode("1");
		wait.until(ExpectedConditions.visibilityOfElementLocated(alertmsg));
			Thread.sleep(3000);
			
			Assert.assertEquals(rp.getalertverifyemail().getText(), "The Verification Code field must have at least 6 characters", "alert text not match");
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			lp.getCreate_Account().click();
			Thread.sleep(3000);
			rp.enteremailInfo(email);
			Thread.sleep(7000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(alertmsg));
			Thread.sleep(3000);
			Assert.assertEquals(count.contains("An email has been sent for verification"),expected.contains("An email has been sent for verification"), "alert text not match");
				Thread.sleep(3000);
			rp.entercode("124567");
			
			Thread.sleep(3000);
			//rp.visibilityofAlert("The provided verification code does not match with the code sent to you in the email. please retry or click resend verification code in case you have not received one");
			wait.until(ExpectedConditions.visibilityOfElementLocated(alertmsg));
			Thread.sleep(3000);
	
			Assert.assertEquals(rp.getalertverifyemail().getText(), "The provided verification code does not match with the code sent to you in the email. Please retry", "alert text not match");
			Thread.sleep(5000);
	
			driver.navigate().back();
		
			
			Thread.sleep(3000);
			
			lp.getCreate_Account().click();
			Thread.sleep(3000);*/

		
			rp.enteremailInfo(email);

			Thread.sleep(10000);
	

			String count = driver.findElement(By.xpath("//div[@class='ccp-form-warning']/p//span[@class='alert-msg']")).getText();
			System.out.println(count); 
			String expected="DO NOT CLOSE THIS WINDOW \nAn email has been sent for verification. Please follow the instructions to complete the email verification by providing the code in the email. Click Resend verification code if the email is not received".replaceAll("\\n|\\r\\\n", System.getProperty("line.separator"));
			
			Assert.assertEquals(count.contains("An email has been sent for verification"),expected.contains("An email has been sent for verification"), "alert text not match");

			Thread.sleep(5000);
			
			String query = "select verification_code from signup_verification_token where email='" +email+ "';";	            
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
			Statement stmt = con.createStatement();	
			System.out.println("query ="+query );
			ResultSet rs= stmt.executeQuery(query);	
			System.out.println("email ="+email );
		
			while (rs.next()){
				a = rs.getString(1);								        
				System.out.println("code ="+a);}		
			
			con.close();			
			Thread.sleep(7000);
			rp.entercode(a);
	
			Thread.sleep(5000);
			rp.entervalidBusinessInfo("TestAutomation"+i,"TestAutomation"+i,"Business in Retail","50-250","756 Concho Ln Houston TX 77084","Houston","TX","77084","233.343.4345");
			//rp.enterInvalidBusinessInfoDomainexist("Saima2025","Saima2025","Business","50-250","756 Concho Ln Houston TX 77084","Houston","TX","77084","233.343.4345");
			//rp.enterBusinessInfoDomainexist("Saima2025","Saima202556","Business in Retail","50-250","756 Concho Ln Houston TX 77084","Houston","TX","77084","233.343.4345");
			Thread.sleep(5000);
			rp.enterUserInfo("saima","tabassum","233.343.4345","IT","Connection123","Connection123");
			Thread.sleep(3000);
			rp.Subcriptionsavecontinue();
			rp.AgreeCSA();
			rp.createAccountclickonRegPage(email);
			Thread.sleep(5000);
		
			
			//lp.getun().sendKeys("s213788@abc788.com");
			lp.getpassword().sendKeys("Connection123");
			lp.getloginbtn().click();

	
			Actions an = new Actions(driver);

		
			
		
		
			Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(hd.getAccountMenu()));
			an.moveToElement(hd.getAccountMenu()).perform();
			
		//	 WebElement web=driver.findElement(By.xpath("//a[@class='clearfix']//span[@class='account-title'][contains(text(),'My Account')]"));
		//		wait.until(ExpectedConditions.elementToBeClickable(web));
		//		an.moveToElement(web).perform();
			
			
			Thread.sleep(5000);
			hd.getPayment_Plan().click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(hd.getaddPM()));
			Thread.sleep(3000);
			hd.getaddPM().click();
			
	
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(pay.getAddCreditBtn()));
			pay.getAddCreditBtn().click();
			Thread.sleep(7000);
			
		
			wait.until(ExpectedConditions.elementToBeClickable(pay.getccid()));
			pay.getccid().sendKeys("saima tabasum");
			Thread.sleep(3000);

			
			
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
			Thread.sleep(8000);
			pay.getsave().click();
			Thread.sleep(5000);
			//Assert.assertEquals(cp.getalertmsg().getText(), "Credit card details saved successfully", "alert text not match");
			//pay.getcanecl().click();
			Thread.sleep(3000);
	
			wait.until(ExpectedConditions.elementToBeClickable(pay.getBAad1()));
			pay.getBAad1().sendKeys("756 Concho Ln Houston, TX, 77084");;
			Thread.sleep(5000);

			JavascriptExecutor js1 = (JavascriptExecutor)driver;
				
		    js1.executeScript("window.scrollBy(0,300)");
			Thread.sleep(5000);
			
			wait.until(ExpectedConditions.elementToBeClickable(pay.getBAzip()));
	
		Thread.sleep(5000);
			pay.getBAzip().sendKeys("77084");
			Thread.sleep(30000);
			By usediffshipAddress11=By.xpath("//input[@id='city']");
		
	WebElement  j=driver.findElement(By.xpath("//input[@id='zipCode']"));
			while(!(cf.isElementPresent(usediffshipAddress11)))
			{	Thread.sleep(3000);
			Actions action =new Actions(driver);
			
			j.sendKeys(Keys.CONTROL,"a");
			Thread.sleep(3000);
			j.sendKeys(Keys.DELETE);
			Thread.sleep(3000);
			j.sendKeys("77084");
			//driver.findElement(By.xpath("//input[@id='zipCode']")).sendKeys("77084");
			//action.sendKeys("Keys.TAB");
			//	Thread.sleep(3000);
				//pay.getBAzip().sendKeys("77084");
				Thread.sleep(25000);
			}															
			Thread.sleep(6000);
			WebDriverWait wait1 = new WebDriverWait(driver, 180);
			wait1.until(ExpectedConditions.visibilityOfElementLocated(usediffshipAddress11));
			Thread.sleep(6000);
			pay.getBAph().sendKeys("343.534.6346");
			Thread.sleep(3000);
			wait.until(ExpectedConditions.elementToBeClickable(pay.getBASave()));
			Thread.sleep(10000);
		   pay.getBASave().click();
			
			
			
			
			
			Thread.sleep(3000);
			//By bbb=By.xpath("//a[contains(text(),'Change Payment Method')]"); 

			Thread.sleep(5000);
			hd.logout();

			Thread.sleep(5000);
		//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(bbb)));
		//	Thread.sleep(5000);
   
		//	Assert.assertEquals( driver.findElement(bbb).getText(), "Change Payment Method",
		//	"not match");
			
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
	 @Parameters({"url","dburl1","dbun","dbpswd","env"})
@Test(priority = 14,enabled=true, dependsOnMethods={"Validate_AccountCreation_ProcessOne_8"})
//@Test(priority = 5,enabled=true)
public void Validate_procurment_17(String url,String dburl, String dbun, String dbpswd,String env) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
		


	try {
	
	

		

  //driver.navigate().to(url);

		
		Random rm = new Random();
		int i = rm.nextInt(1000) + 1;

		wait = new WebDriverWait(driver, 120);

		Thread.sleep(5000);
       
		
	
		lp.getusername().sendKeys(email);
	
		lp.getpassword().sendKeys("Connection123");
		
		lp.getloginbtn().click();
		
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(hd.getSearchTab()));
		Thread.sleep(3000);
			hd.getSearchTab().sendKeys("Corp. CSP Enterprise Mobility + Sec E5 Monthly" + Keys.ENTER);
			Thread.sleep(8000);
			
			
		    
	
			
			//wait.until(ExpectedConditions.elementToBeClickable(hm.getsearchgetitnow()));
			Thread.sleep(4000);
	//	hm.getsearchgetitnow().click();
		Thread.sleep(4000);
		
		for(int j=0;j<5;j++)
		{
			
		String  now="//a[@class='btn btn-primary' and text()='Get it Now']["+j+"]";
		
		By getnow1 = By.xpath(now);
		 
	
		if(cf.isElementPresent(getnow1)) {
			Thread.sleep(4000);
		driver.findElement(getnow1).click();
		Thread.sleep(4000);
		break;
		}
	}
		
		
		
		
		
	wait.until(ExpectedConditions.elementToBeClickable(hm.getP_GetBtn()));
		hm.getP_GetBtn().click();
		Thread.sleep(3000);
	
		wait.until(ExpectedConditions.titleContains("Procurement - CCM"));

			Assert.assertEquals(driver.getTitle(), "Procurement - CCM",
			"After clicking on submit button on procurement checkout, user is not able to navigate to  procurement  page");
		
		 WebElement yes=driver.findElement(By.xpath("//a[contains(text(),'No I')]"));
		    Thread.sleep(2000);
		    if(yes.isDisplayed())
		    {      yes.click();
		    Thread.sleep(9000);
					pr.getverify_domain().sendKeys("TestAutomationDomain"+i);
					
					
					Thread.sleep(5000);
					
					pr.getverify_tenantname().sendKeys("TestAutomationDomain"+i);
					Thread.sleep(5000);
					pr.getContinue().click();
					Thread.sleep(5000);
					 if(env.contentEquals("uat"))
					 {
					 Select se = new Select(pr.getaddress());
						Thread.sleep(3000);
						se.selectByIndex(1);
						Thread.sleep(3000);
						pr.getContinue13().click();
						Thread.sleep(3000);
			
				
					pr.getPo().sendKeys("purchase order no :");
					Thread.sleep(5000);
					pr.getContinue2().click();
					Thread.sleep(7000);
					pr.getagree1().click();
					Thread.sleep(3000);
					pr.getSbmt_Order().click();}
					 
					 if(env.contentEquals("qa"))
					 {
						 
			
						 pr.getContinue132().click();
							Thread.sleep(3000);
					 Select se = new Select(pr.getaddress());
						Thread.sleep(3000);
						se.selectByIndex(1);
						Thread.sleep(3000);
						pr.getContinue13().click();
						Thread.sleep(3000);
			
				
					pr.getPo().sendKeys("purchase order no :");
					Thread.sleep(5000);
					pr.getContinue2().click();
					Thread.sleep(7000);
					pr.getagree1().click();
					Thread.sleep(3000);
					pr.getSbmt_Order().click();}
					 
					 
					 
					 
					 
		    }
				
		    else
				
		    {
			
					pr.getContinue1().click();
					Thread.sleep(5000);
					pr.getContinue2().click();
					Thread.sleep(5000);
		
					   
					   WebElement agree2=driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg-txt mb-app-btn']"));
					   if (agree2.isDisplayed())
					   {
				agree2.click();
				Thread.sleep(5000);
					   }
		
					pr.getSbmt_Order().click();
					Thread.sleep(5000);
		    }
			Thread.sleep(5000);

			wait.until(ExpectedConditions.titleContains("Order Received - CCM"));

				Assert.assertEquals(driver.getTitle(), "Order Received - CCM",
				"After clicking on submit button on procurement checkout, user is not able to navigate to order received page");
				
				hm.getManage_Link().click();
				 wait = new WebDriverWait(driver, 60);
					wait.until(ExpectedConditions.titleContains("Service Provisioning - CCM"));
					
					WebDriverWait wait1 = new WebDriverWait(driver, 300);

					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
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
							 
							    e.printStackTrace();
							
							}
							
						}
						
						
				///////@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
						
						

						/*hm.getManage_Link().click();
						Thread.sleep(5000);
					
						WebElement   pop6c=driver.findElement(By.id("SearchBySubscription"));   
				     	WebElement   pop7c=driver.findElement(By.xpath("//div[@class='search-container']//i[@class='fa fa-search icon-search']"));   
						
				    pop6c.sendKeys("Corp. CSP Enterprise Mobility + Sec E5 Monthly");
					Thread.sleep(5000);
						pop7c.click();
						Thread.sleep(5000);*/
						PDPCCM pp=new PDPCCM(driver);
					
						
									
						
										By historyCTA=By.xpath("//a[@class='btn'] and text()='View History']");
										By mangesubscCTA1= By.xpath("//a[@class='btn btn-primary' and text()='Manage Subscription']");

										By contactusCTA1=By.xpath("//body/div[@id='manage-content']/div[@id='OrderApp']/section[2]/div[1]/div[2]/section[1]/div[2]/div[2]/a[5]");
										if(mn.isElementPresent(mangesubscCTA1))
											
										{
											sr.getmngsubsCTA().click();
										
											String TitleHome2=driver.getTitle();
											Thread.sleep(10000);

											JavascriptExecutor js1 = (JavascriptExecutor)driver;

											js1.executeScript("window.scrollBy(0,500)");
										if(mn.isElementPresent(contactusCTA1))
												
											{
												System.out.println("contact us present");	
											}
										
										     By goproviderportalCTA1=By.xpath("//a[contains(text(),'Go To Provider Portal')]");
										  
										 	By suspendCTA1=By.xpath("//a[contains(text(),'Suspend Subscription')]");
										 	By cancelsubsCTA1=By.xpath("//a[contains(text(),'Cancel Subscription')]");
										//	By updatesubs=By.xpath("//a[@class='btn btn-primary disabled'] and text()='Update Subscription']");
										// 	By createestimate=By.xpath("//a[@class='btn disabled'] and text()='Create Estimate']");&& mn.isElementPresent(updatesubs)  && mn.isElementPresent(createestimate)
										 	
									if(mn.isElementPresent(goproviderportalCTA1) && mn.isElementPresent(suspendCTA1) && mn.isElementPresent(cancelsubsCTA1))
												
											{
										
												System.out.println("present all buttons that are required");	
											}

										}
										System.out.println("hi3");
										String 	OldTab=driver.getWindowHandle();
										sr.getproviderportal1().click();
									 	WebElement  cont=driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
									cont.click();

											driver.switchTo().window(OldTab);
										
											Thread.sleep(10000);
										
						
						
										
										/////// suspend subscription
						
						
						
											System.out.println("hi4");
											driver.navigate().back();

				WebElement   pop611=driver.findElement(By.id("SearchBySubscription"));   
					 pop611.sendKeys("Corp. CSP Enterprise Mobility + Sec E5 Monthly");
				  	WebElement   pop711=driver.findElement(By.xpath("//div[@class='search-container']//i[@class='fa fa-search icon-search']"));   
					
						Thread.sleep(3000);
							pop711.click();
						
						Thread.sleep(5000);	
						JavascriptExecutor js1 = (JavascriptExecutor)driver;
						js1.executeScript("window.scrollBy(0,250)");
							 sr.getmngsubsCTA().click();
								Thread.sleep(3000);



											

														js1.executeScript("window.scrollBy(0,500)");
														Thread.sleep(3000);

					By suspend=By.xpath("//a[contains(text(),'Suspend Subscription')]");
					
					driver.findElement(suspend).click();
					Thread.sleep(3000);
				 	WebElement  cont1=driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
					cont1.click();

					Thread.sleep(3000);	
					System.out.println("hi4sf");
					WebElement  back=driver.findElement(By.xpath("//span[contains(text(),'Back to Subscriptions')]"));
					back.click();
					Thread.sleep(3000);
					
					WebElement   pop61=driver.findElement(By.id("SearchBySubscription"));   
					 pop61.sendKeys("Corp. CSP Enterprise Mobility + Sec E5 Monthly");
				  	WebElement   pop71=driver.findElement(By.xpath("//div[@class='search-container']//i[@class='fa fa-search icon-search']"));   
					
						Thread.sleep(3000);
							pop71.click();
			
						Thread.sleep(60000);	
						js1.executeScript("window.scrollBy(0,250)");
							 sr.getmngsubsCTA().click();
								Thread.sleep(3000);
							 	WebElement  sttxt=driver.findElement(By.xpath("//body/div[@id='manage-content']/div[@id='OrderApp']/section[2]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/p[1]/span[2]"));
						 	String  h=sttxt.getText();
						 	
						 	
						 	
						 	
							 	if(h.contentEquals("Suspended"))
							 	{
							 	By a1=By.xpath("//a[contains(text(),'Reactivate Subscription')]");
				    By a2=By.xpath("//a[contains(text(),'Contact Us')]");
				    By a3=By.xpath("//a[contains(text(),'Cancel Subscription')]");

					
					if(mn.isElementPresent(a1) && mn.isElementPresent(a2) && mn.isElementPresent(a3))
						 
					{
					
						System.out.println("all required button present suspended cases");
					}
					
							 	}
						
						
						
						
							 	//$$$$$$$$$$$$$ reactivate 
							 	
								/*
							 	
							 	By re=By.xpath("//a[contains(text(),'Reactivate Subscription')]");
								
								driver.findElement(re).click();
								Thread.sleep(3000);
							 cont1=driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
								cont1.click();

								Thread.sleep(3000);	
								System.out.println("hi4sf");
								 back=driver.findElement(By.xpath("//span[contains(text(),'Back to Subscriptions')]"));
								back.click();
								Thread.sleep(3000);

								
								WebElement   pop6111=driver.findElement(By.id("SearchBySubscription"));   
								 pop6111.sendKeys("Corp. CSP Enterprise Mobility + Sec E5 Monthly");
							  	WebElement   pop7111=driver.findElement(By.xpath("//div[@class='search-container']//i[@class='fa fa-search icon-search']"));   
								
									Thread.sleep(3000);
										pop7111.click();
									
									Thread.sleep(80000);	
									js1.executeScript("window.scrollBy(0,250)");
										 sr.getmngsubsCTA().click();
											Thread.sleep(3000);
										 	WebElement  sttxt1=driver.findElement(By.xpath("//body/div[@id='manage-content']/div[@id='OrderApp']/section[2]/div[1]/div[2]/section[1]/div[2]/div[1]/div[1]/p[1]/span[2]"));
									 	String  h1=sttxt1.getText();
									 	
									 	
									 	
									 	
										 	if(h1.contentEquals("Active"))
										 	{
										 		
										 		
										 		By cancel=By.xpath("//a[contains(text(),'Cancel Subscription')]");
												
												driver.findElement(cancel).click();
												Thread.sleep(3000);
											 cont1=driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
												cont1.click();

												Thread.sleep(3000);	
												
												 back=driver.findElement(By.xpath("//span[contains(text(),'Back to Subscriptions')]"));
												back.click();
												Thread.sleep(3000);

												
												WebElement   pop61111=driver.findElement(By.id("SearchBySubscription"));   
												 pop61111.sendKeys("Corp. CSP Enterprise Mobility + Sec E5 Monthly");
											  	WebElement   pop71111=driver.findElement(By.xpath("//div[@class='search-container']//i[@class='fa fa-search icon-search']"));   
												
													Thread.sleep(3000);
														pop71111.click();
													
													Thread.sleep(80000);	
													js1.executeScript("window.scrollBy(0,250)");
														 
															Thread.sleep(3000);
															
														    By a21=By.xpath("//a[contains(text(),'Buy it Again')]");
														    By a31=By.xpath("//a[contains(text(),'View History')]");
														
										 		
														    if(mn.isElementPresent(a21) && mn.isElementPresent(a31))
																 
															{
															
																System.out.println("all required button present cancelled cases");
															}
										 		
										 		
										 		
										 		
										 		
										 	}
								

						
						
						
						//////////@@@@@@@@@@@@@@@@@@@@@@@@@@@@
						
						
			
						
						*/
						
						
						
						
						
						
						
						
						
						
						
						
			 
			 	
			 	
			 	
			 	
			 	

						
						
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
	catch (org.openqa.selenium.NoSuchElementException e) {
		String 	title6= driver.getTitle();
		e.printStackTrace();
	

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}


}

	 @Parameters({"url","dburl1","dbun","dbpswd","env"})
	@Test(priority = 15,enabled=true,dependsOnMethods={"Validate_AccountCreation_ProcessOne_8","Validate_procurment_17"})
//@Test(priority = 5,enabled=true)

public void Validate_procurment_17_a(String url,String dburl, String dbun, String dbpswd,String env) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
		try{

			wait = new WebDriverWait(driver, 120);

			Procurement pr;
	    pr = new Procurement(driver);
	    hm = new HomePage(driver);

	   

	    	
	    		wait = new WebDriverWait(driver, 120);

	    		Thread.sleep(5000);
	           
	    		
	    
	    		
	    		
	    		
	    		
		Random rm = new Random();
		int i = rm.nextInt(1000) + 1;
		Thread.sleep(5000);

		wait.until(ExpectedConditions.elementToBeClickable(hd.getSearchTab()));
		Thread.sleep(3000);
			hd.getSearchTab().sendKeys("CSP Power BI Premium P1 Annual" + Keys.ENTER);
			Thread.sleep(8000);

			Thread.sleep(4000);

		Thread.sleep(4000);
		
		for(int j=0;j<5;j++)
		{
			
		String  now="//a[@class='btn btn-primary' and text()='Get it Now']["+j+"]";
		
		By getnow1 = By.xpath(now);
		 

		if(cf.isElementPresent(getnow1)) {
			Thread.sleep(4000);
		driver.findElement(getnow1).click();
		Thread.sleep(4000);
		break;
		}
	}
		
		
		
		
		
	wait.until(ExpectedConditions.elementToBeClickable(hm.getP_GetBtn()));
		hm.getP_GetBtn().click();
		Thread.sleep(3000);
	
		wait.until(ExpectedConditions.titleContains("Procurement - CCM"));

			Assert.assertEquals(driver.getTitle(), "Procurement - CCM",
			"After clicking on submit button on procurement checkout, user is not able to navigate to  procurement  page");
		
		/* WebElement yes=driver.findElement(By.xpath("//a[contains(text(),'No I')]"));
		    Thread.sleep(2000);
		    if(yes.isDisplayed())
		    {      yes.click();
		    Thread.sleep(9000);
					pr.getverify_domain().sendKeys("ssaima"+i);
					Thread.sleep(5000);
					pr.getContinue().click();
					Thread.sleep(15000);
					if(env.contentEquals("uat"))
					 {
					 Select se = new Select(pr.getaddress());
						Thread.sleep(3000);
						se.selectByIndex(1);
						Thread.sleep(3000);
						pr.getContinue13().click();
						Thread.sleep(3000);
			
				
					pr.getPo().sendKeys("purchase order no :");
					Thread.sleep(5000);
					pr.getContinue2().click();
					Thread.sleep(7000);
					pr.getagree1().click();
					Thread.sleep(3000);
					pr.getSbmt_Order().click();}
					 
					 if(env.contentEquals("qa"))
					 {
					 Select se = new Select(pr.getaddress());
						Thread.sleep(3000);
						se.selectByIndex(1);
						Thread.sleep(3000);
						pr.getContinue13().click();
						Thread.sleep(3000);
			
				
					pr.getPo().sendKeys("purchase order no :");
					Thread.sleep(5000);
					pr.getContinue2().click();
					Thread.sleep(7000);
					pr.getagree1().click();
					Thread.sleep(3000);
					pr.getSbmt_Order().click();}
					 
		    }
				
		    else
				
		    {*/
			
		       	if(env.contentEquals("qa"))
		    	{
		       		pr.getContinuestep().click();
		       		Thread.sleep(5000);
		
					pr.getContinue1().click();
					Thread.sleep(5000);
					pr.getContinue2().click();
					Thread.sleep(5000);
		    	}
		    	if(env.contentEquals("uat"))
		    	{
		    		pr.getContinuestep().click();
					Thread.sleep(5000);
					pr.getContinue1().click();
					Thread.sleep(5000);
					pr.getContinue2().click();
					Thread.sleep(5000);
		    	}
				
	
					   
					   WebElement agree2=driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg-txt mb-app-btn']"));
					   if (agree2.isDisplayed())
					   {
				agree2.click();
				Thread.sleep(5000);
					   }
		
					pr.getSbmt_Order().click();
					Thread.sleep(5000);
		    
			Thread.sleep(5000);

			wait.until(ExpectedConditions.titleContains("Order Received - CCM"));

				Assert.assertEquals(driver.getTitle(), "Order Received - CCM",
				"After clicking on submit button on procurement checkout, user is not able to navigate to order received page");
				
				hm.getManage_Link().click();
				 wait = new WebDriverWait(driver, 60);
					wait.until(ExpectedConditions.titleContains("Service Provisioning - CCM"));
	
					WebDriverWait wait1 = new WebDriverWait(driver, 300);
	
			     	WebElement   pop5=driver.findElement(By.xpath("//span[@class='active']"));   
			      	WebElement   pop6=driver.findElement(By.id("SearchBySubscription"));   
			     	WebElement   pop7=driver.findElement(By.xpath("//div[@class='search-container']//i[@class='fa fa-search icon-search']"));   
					
			    pop6.sendKeys("CSP Power BI Premium P1 Annual");
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
								Thread.sleep(200000);
								pop5.click();
								w=driver.findElement(By.xpath("//p[@class='detail blue']"));
							}	catch (org.openqa.selenium.NoSuchElementException e) {
								////System.out.println("Error message: " + e.toString());
								   
							    e.printStackTrace();
								 // System.out.println("catchcalled8");   Assert.assertTrue(false, "Failed" + e.getMessage());
							
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
						//Assert.assertEquals(w.getText(), "Active","status is pending , service not procured succcessfully");
		        
}


@Parameters({"url","dburl1","dbun","dbpswd","env"})
@Test(priority = 16,enabled=true,dependsOnMethods={"Validate_AccountCreation_ProcessOne_8","Validate_procurment_17_a"})
public void Validate_procurment_17_b(String url,String dburl, String dbun, String dbpswd,String env) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	try {	
		

	
///test ///////
		driver = getdriver();
	
		wait = new WebDriverWait(driver, 120);
		Thread.sleep(5000);
       
	
	    
	    

		Random rm = new Random();
		int i = rm.nextInt(1000) + 1;
		Thread.sleep(5000);

		wait.until(ExpectedConditions.elementToBeClickable(hd.getSearchTab()));
		Thread.sleep(3000);
			hd.getSearchTab().sendKeys("CSP Microsoft 365 F1" + Keys.ENTER);
			Thread.sleep(8000);
			
			
		    
	
			
			//wait.until(ExpectedConditions.elementToBeClickable(hm.getsearchgetitnow()));
			Thread.sleep(4000);
	//	hm.getsearchgetitnow().click();
		Thread.sleep(4000);
		
		for(int j=0;j<5;j++)
		{
			
		String  now="//a[@class='btn btn-primary' and text()='Get it Now']["+j+"]";
		
		By getnow1 = By.xpath(now);
		 
		
		if(cf.isElementPresent(getnow1)) {
			Thread.sleep(4000);
		driver.findElement(getnow1).click();
		Thread.sleep(4000);
		break;
		}
	}
		
		
		
		
		
	wait.until(ExpectedConditions.elementToBeClickable(hm.getP_GetBtn()));
		hm.getP_GetBtn().click();
		Thread.sleep(3000);
	
		wait.until(ExpectedConditions.titleContains("Procurement - CCM"));

			Assert.assertEquals(driver.getTitle(), "Procurement - CCM",
			"After clicking on submit button on procurement checkout, user is not able to navigate to  procurement  page");
		
		    	if(env.contentEquals("qa"))
		    	{
		    		pr.getContinuestep().click();
		       		Thread.sleep(5000);
		
					pr.getContinue1().click();
					Thread.sleep(5000);
					pr.getContinue2().click();
					Thread.sleep(5000);
		    	}
		    	else	if(env.contentEquals("uat"))
		    	{
		    		pr.getContinuestep().click();
		       		Thread.sleep(5000);
					pr.getContinue1().click();
					Thread.sleep(5000);
					pr.getContinue2().click();
					Thread.sleep(5000);
		    	}
		    	
				Thread.sleep(10000);  
					   WebElement agree2=driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg-txt mb-app-btn']"));
					   if (agree2.isDisplayed())
					   {
				agree2.click();
				Thread.sleep(5000);
					   }
		
					pr.getSbmt_Order().click();
					Thread.sleep(5000);
		    
			Thread.sleep(5000);

			wait.until(ExpectedConditions.titleContains("Order Received - CCM"));

				Assert.assertEquals(driver.getTitle(), "Order Received - CCM",
				"After clicking on submit button on procurement checkout, user is not able to navigate to order received page");
	hd.logout();
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



}

