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
import CustomerPortal.Home.LoginPage;
import CustomerPortal.Manage.Manage;
import CustomerPortal.Manage.Subscriptions.Subscriptions;
import CustomerPortal.MarketPlace.PDPCCM;
import CustomerPortal.MarketPlace.Payment;
import CustomerPortal.MarketPlace.Procurement;
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

public class LatestRegressionSuite_3 extends base  {

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
 String email;
 
	
	
	
	public LatestRegressionSuite_3() throws IOException, InterruptedException , ClassNotFoundException, SQLException {

		prop=new Properties();
		fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
//	driver = initializeDriver();
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

	}
	
	 @Parameters({"username3","pswd3","url","env","dburl","dbun","dbpswd"})
	@Test(priority =14,enabled=true)
	public void Validate_GlobalSearch_15(String username , String pswd, String url,String env,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
	//catalog
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
	    pr = new Procurement(driver);
		hd=new Header(driver);
		srp=new SearchResult(driver);
		rp=new RegisterationPage(driver);
		hm = new HomePage(driver);
		ft=new Footer(driver);
		pp=new PDPCCM(driver);
		sr=new Subscriptions(driver);
		LatestRegressionSuite_2  suite2=new LatestRegressionSuite_2();
	//	email=suite2.email;
	
		Thread.sleep(3000);
		driver.get(url);
		Thread.sleep(10000);
		lp.getusername().sendKeys(username);
		Thread.sleep(5000);
		
		
		lp.getpassword().sendKeys(pswd);
		Thread.sleep(5000);
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
		
		
		
		
		
		
		
		
		wait = new WebDriverWait(driver, 120);
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(hd.getSearchTab()));
		
		hd.getSearchTab().sendKeys("abc" + Keys.ENTER);
		Thread.sleep(5000);
		Thread.sleep(2000);
		Assert.assertEquals(srp.getnoresultmsg().getText(), "No results found",
				"No result msg not displayed");
		Thread.sleep(3000);
		
		hd.getSearchTab().clear();
		Thread.sleep(5000);
		hd.getSearchTab().sendKeys("Power BI" + Keys.ENTER);
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Power bi - CCM",
				"User not able to land to the power BI service page after clicking on Catalog Restriction link from account menu in the header");

		//header footer not need to verified
		srp.getLstvwId().click();
		Thread.sleep(4000);

		srp.getGridvwId().click();
		Thread.sleep(4000);

		Assert.assertEquals(srp.getGridVwCount().size() > 0, true,
				"After clicking on Grid View Icon the products are not displaying as Grid");
		// Sorting Check
		Select se = new Select(srp.getSortDropDown());
		String defact = se.getFirstSelectedOption().getText();
		Assert.assertEquals(defact, "Best match", "Best Match Option is not Selected as Default");
		String DropdownOptionsExp[] = { "Best match", "Price: Low to High", "Price: High to Low" };
		String ExpProdName[]= {"CSP Power BI Premium P1 Monthly" , "CSP Power BI Premium P1 Annual ","Corp. CSP Power BI Pro  ","Corp. CSP AE Annual Power BI Pro "};

		for (int i = 0; i < 1; i++) {
			se.selectByValue("name");
			Thread.sleep(5000);
			Assert.assertEquals(se.getFirstSelectedOption().getText().trim(), DropdownOptionsExp[i],
					"The Options appearing in the sorting Dropdown are not same as expected");
		}

		Thread.sleep(3000);
		// Size Dropdown Checking
		Select se1 = new Select(srp.getSizedd());
		Thread.sleep(3000);
		String defsize = se1.getFirstSelectedOption().getText();
		Assert.assertEquals(defsize, "12", "12 Option is not appearing selected as default on the size dropdown");
		String SizeDropdownExp[] = { "12", "24", "36", "48" };
	
	
		   WebElement dropdown = driver.findElement(By.xpath("//select[@id='ddSort-show']"));
		   
		   List<WebElement> options = dropdown.findElements(By.tagName("option"));
		    System.out.println(options.size());
		   
		   

		
		
		   for (int i=0;i<options.size();i++) {
			se1.selectByValue(SizeDropdownExp[i]);
			Thread.sleep(12000);
			Assert.assertEquals(options.get(i).getText(), SizeDropdownExp[i],
					"The Options appearing in the size Dropdown are not same as expected");
	}
		Thread.sleep(3000);
		
		if(env.contentEquals("qa"))
		{

		srp.getproddisplay().getText();

        
		Assert.assertEquals(srp.getproddisplay().getText(),"1-3", "Products displayed not  matches with expected count ");
		srp.gettotalprod();
		Assert.assertEquals(srp.gettotalprod().getText(),"3", "total count  of products not matches");
		
		}
		
		else if(env.contentEquals("uat"))
			
		{
			
			List<WebElement> list = driver.findElements(By.xpath("//div[@class='product-list-content']//div[@class='product-list-grid clearfix grid']//div[@class='product-grid-item clearfix']"));
			Integer itemsCount = list.size();
			Integer  expcount=6;
			Integer retResult=itemsCount.compareTo(expcount);
		
			   if(retResult > 0) {  
			        System.out.println("product not equal as expected");  
		          } else if(retResult< 0) {  
		              System.out.println("product noy equal as expected");  
		          } else {  
		             System.out.println("product equal as expected");  
		          } 
			
			
			
			
		}
		
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
		hd.logout();

		Thread.sleep(5000);	
	     Assert.assertTrue(false, "Failed" + e.getMessage());
	}
	}
	 @Parameters({"username3","pswd3","url","dburl","dbun","dbpswd"})
	@Test(priority = 15,enabled=true)
	public void Validate_PDP_16(String username, String pswd, String url,String dburl,String dbun,String dbpwd) throws IOException, InterruptedException , ClassNotFoundException, SQLException{
		


		try{
			
			driver.get(url);
			Thread.sleep(10000);
			lp.getusername().sendKeys(username);
			Thread.sleep(5000);
			
			
			lp.getpassword().sendKeys(pswd);
			Thread.sleep(5000);
			lp.getloginbtn().click();
			
			
			Thread.sleep(5000);
			String email11="qunoot.ahmed+098765@arpatech.com";
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
			
			
			
			
			
			
			
			
			
			
			
			Thread.sleep(8000);
        hd.getSearchTab().clear();
        
		hd.getSearchTab().sendKeys("Corp. CSP Enterprise Mobility + Sec E5 Monthly" + Keys.ENTER);
		for(int i=0;i<5;i++)
		{
		
		String  now="//a[@class='btn btn-primary' and text()='Get it Now']["+i+"]";
		
		By getnow1 = By.xpath(now);
		 
		//while(!(cf.isElementPresent(getnow1)))
		///{
		//hd.getSearchTab().sendKeys("Power BI" + Keys.ENTER);
		//Thread.sleep(6000);
	
	   // hm.getnowtbn1().click();
		if(cf.isElementPresent(getnow1)) {
			Thread.sleep(5000);
		driver.findElement(getnow1).click();
		break;
		}
	}
		
		Thread.sleep(5000);
	    
		pp.createEstimate().click();
		 //loading mask
		Thread.sleep(5000);
		pp.ctapopupcancel().click();;
		 //loading mask
		Thread.sleep(5000);
		pp.createEstimate().click();
		Thread.sleep(5000);
String DropdownOptionsExp[] = {"saima tab saima tab, a6721574@jj67j74.com, Administrator" };
		
		pp.ctapopupsearching("saima tab", DropdownOptionsExp);
		
        String DropdownOptionsExp1[] = {"saima tab saima tab, a6721574@jj67j74.com, Administrator" };
		
		pp.ctapopupsearching("saima tab", DropdownOptionsExp1);
		
		 String DropdownOptionsExp2[] = {"saima tab saima tab, a6721574@jj67j74.com, Administrator" };
			
			pp.ctapopupsearching("a6721574@jj67j74.com", DropdownOptionsExp2);
			
			// String DropdownOptionsExp3[] = {"saima tabassum, saima.tabassum+310@arpatech.com,User","saima tabassum, saima.tabassum+182@arpatech.com,User","saima tabassum, saima.tabassum+767@arpatech.com,User","saima tabassum, saima.tabassum+388@arpatech.com,User","saima tabassum, saima.tabassum+609@arpatech.com,User","saima tabassum, saima.tabassum+107@arpatech.com,User"};
				
			//	pp.ctapopupsearching("User", DropdownOptionsExp3);
				
				 String DropdownOptionsExp4[] = {"saima tab saima tab, a6721574@jj67j74.com, Administrator"};
					
					pp.ctapopupsearching("Admin", DropdownOptionsExp4);
						
					//Thread.sleep(10000);
					
				//	pp.ctapopupcheck().click();
					
					Thread.sleep(5000);
		 pp.ctapopupcontinue().click();
		 //loading mask
			Thread.sleep(60000);
			WebDriverWait wait1 = new WebDriverWait(driver, 180);
		    wait1.until(ExpectedConditions.titleContains("Estimate Details - CCM"));
					Assert.assertEquals(driver.getTitle(), "Estimate Details - CCM",
							"User not able to land reach estiamte ccm page");
					Thread.sleep(5000);
					hd.logout();
		}
		catch(org.openqa.selenium.ElementClickInterceptedException e) {
			String 	title6= driver.getTitle();
			e.printStackTrace();
			driver.get(url);
			Thread.sleep(5000);	
			hd.logout();
			Thread.sleep(5000);	
		     Assert.assertTrue(false, "Failed" + e.getMessage());
		}
		catch(java.lang.AssertionError e) {
			String 	title6= driver.getTitle();
			e.printStackTrace();
			driver.get(url);
			Thread.sleep(5000);	
			hd.logout();
			Thread.sleep(5000);	
		     Assert.assertTrue(false, "Failed" + e.getMessage());
		}
		catch (org.openqa.selenium.TimeoutException e) {
			String 	title6= driver.getTitle();
			e.printStackTrace();
			Thread.sleep(5000);	
			driver.get(url);
			Thread.sleep(5000);	
			hd.logout();
			Thread.sleep(5000);	
		     Assert.assertTrue(false, "Failed" + e.getMessage());
		}
		catch (org.openqa.selenium.StaleElementReferenceException e) {
			String 	title6= driver.getTitle();
			e.printStackTrace();
			Thread.sleep(5000);	
			driver.get(url);
			Thread.sleep(5000);	
			hd.logout();
			Thread.sleep(5000);	
		     Assert.assertTrue(false, "Failed" + e.getMessage());
		}
		catch (org.openqa.selenium.NoSuchElementException e) {
			String 	title6= driver.getTitle();
			e.printStackTrace();
		
			driver.get(url);
			Thread.sleep(5000);	
			hd.logout();
			Thread.sleep(5000);	
		     Assert.assertTrue(false, "Failed" + e.getMessage());
		}

	}

	@Test(priority = 16, enabled =false)
public void Validate_Procurement_update_18() throws IOException, InterruptedException , ClassNotFoundException, SQLException{
		
	
	

	}



}

