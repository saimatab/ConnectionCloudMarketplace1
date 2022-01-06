package tests;
import java.io.FileInputStream;
import org.openqa.selenium.JavascriptExecutor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Set;
import java.util.Properties;
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
import ManagementPortal.Customers.Customer;
import CustomerPortal.Home.Domains;
import CustomerPortal.Home.EditProfilePage;
import CustomerPortal.Home.ForgetPswdPage;
import CustomerPortal.Home.Header;
import CustomerPortal.Home.HomePage;
import CustomerPortal.Insights.Insight;
import CustomerPortal.Home.LoginPage;
import CustomerPortal.Manage.Manage;
import CustomerPortal.Home.MyProfilePage;
import CustomerPortal.Home.NotificationPage;
import ManagementPortal.Catalog.Providers.Provider;
import CustomerPortal.Home.RegisterationPage;
import CustomerPortal.Home.Role;
import CustomerPortal.Home.Users;
import resources.base;

public class LatestRegressionSuite_1 extends base {

	public HomePage hp;
	public RegisterationPage rp;
	public WebDriver driver;
	WebDriverWait wait;
	FileInputStream fis;
	String url_cust;
	LoginPage lp;
	public  Properties prop;
	 @Parameters({"url","dburl","dbun","dbpswd","env"})
	@Test(priority = 0,enabled =true)
	public void ValidateLoginPage_FooterLinks_1to5(String url,String dburl1, String dbun,String dbpwd,String env) throws IOException,  ClassNotFoundException,SQLException,InterruptedException {
		try{prop=new Properties();
		fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		driver = initializeDriver();
		lp= new LoginPage(driver);
	    rp=new RegisterationPage(driver);
		/* Main page footer link validation */ 
		wait = new WebDriverWait(driver, 120);
	
			String parentWindowHandler = driver.getWindowHandle();
		
			driver.get(url);
			
			
			
			Thread.sleep(5000);
			lp.contactus().click();
			
			Thread.sleep(5000);
	
			String subWindowHandler = null;
			Set<String> handles = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()) {
				subWindowHandler = iterator.next();
			}
			driver.switchTo().window(subWindowHandler);
			Thread.sleep(5000);
			String TitleHome1 = driver.getTitle();
		WebDriverWait	wait1 = new WebDriverWait(driver, 300);
			wait1.until(ExpectedConditions.titleContains("Contact Us - CCM"));
			//wait = new WebDriverWait(driver, 120);
			Assert.assertEquals(TitleHome1, "Contact Us - CCM", "User is not being able to reach  contact us page");
			
			// window
			/*String subWindowHandler = null;

			Set<String> handles = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()) {
				subWindowHandler = iterator.next();
			}
			driver.switchTo().window(subWindowHandler);*/ // switch 
			
		
			
			lp.Backloginpage(driver).click();
			wait.until(ExpectedConditions.titleContains("Login - CCM"));
			lp.termsconditions().click();
	
			Thread.sleep(5000);
			
			String subWindowHandler1 = null;
			Set<String> handles1 = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator1 = handles1.iterator();
			while (iterator1.hasNext()) {
				subWindowHandler1 = iterator1.next();
			}
			driver.switchTo().window(subWindowHandler1);
			Thread.sleep(5000);
			
			String TitleHome2 = driver.getTitle();
			wait.until(ExpectedConditions.titleContains("Terms of Use - CCM"));
			Assert.assertEquals(TitleHome2, "Terms of Use - CCM", "User is not being able to reach  terms of use page");
			lp.Backloginpage(driver).click();
			
			wait.until(ExpectedConditions.titleContains("Login - CCM"));
			lp.privacy().click();
			
	
			
			
	Thread.sleep(5000);
			
			String subWindowHandler2= null;
			Set<String> handles2 = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator2 = handles2.iterator();
			while (iterator2.hasNext()) {
				subWindowHandler2= iterator2.next();
			}
			driver.switchTo().window(subWindowHandler2);
			Thread.sleep(5000);
			
			
			
			String TitleHome3 = driver.getTitle();
			wait.until(ExpectedConditions.titleContains("Privacy Policy - CCM"));
			Assert.assertEquals(TitleHome3, "Privacy Policy - CCM", "User is not being able to reach  privacy policy page");

			/* Top left menus validation */
			wait.until(ExpectedConditions.elementToBeClickable(lp.contactus()));  
			lp.contactus().click();
			wait.until(ExpectedConditions.titleContains("Contact Us - CCM"));
		    Assert.assertEquals(TitleHome1, "Contact Us - CCM", "User is not being able to reach contact us page");
			Thread.sleep(5000);
			lp.sendmsg_contactus_cancel();
			Thread.sleep(5000);
			lp.sendmsg_contactus_submit();
			Thread.sleep(5000);
			wait = new WebDriverWait(driver, 400);
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-success']")));  
			//lp.getalertmsgcontact();
			//lp.alertmsgcontact(driver);
	
			lp.termsconditions1().click();
			wait.until(ExpectedConditions.titleContains("Terms of Use - CCM"));
			Assert.assertEquals(TitleHome2, "Terms of Use - CCM", "User is not being able to reach terms of use page");
			Thread.sleep(3000); 
			wait.until(ExpectedConditions.elementToBeClickable(lp.privacy()));  
			
			lp.privacy().click();
			wait.until(ExpectedConditions.titleContains("Privacy Policy - CCM"));
			Assert.assertEquals(TitleHome3, "Privacy Policy - CCM", "User is not being able to reach  privacy policy page");
			Thread.sleep(3000);
			lp.Backloginpage(driver).click();
			wait.until(ExpectedConditions.titleContains("Login - CCM"));
		
		/*}
		catch (NoSuchElementException e) {
			e.printStackTrace();
		}*/
	
			String subWindowHandler3= null;
			Set<String> handles3 = driver.getWindowHandles(); // get all window handles
			Iterator<String> iterator3 = handles3.iterator();
			while (iterator3.hasNext()) {
				
				subWindowHandler3= iterator3.next();
				if(!parentWindowHandler.equals(subWindowHandler3)) {
				driver.switchTo().window(subWindowHandler3);
				driver.close();
				}
			}
			driver.switchTo().window(parentWindowHandler);
		
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

	 @Parameters({"username1","pswd1","url"})
	 @Test(priority = 1,enabled=true)
	public void Validate_AlreadyExistsEmail_6(String username , String pswd, String url) throws IOException, InterruptedException{
		
		/* Account already exists */ 
		try
		
		{
			Thread.sleep(5000);
			driver.get(url);
	
			Thread.sleep(5000);

		
	      rp.getCreate_Account().click();
			rp.enteremailInfo(username);
			Thread.sleep(5000);
	
			Assert.assertEquals(rp.getalertaccountalreadyexist().getText(), "An account already exists for this business email address. Please Login or select Forgot Password", "alert text not match");
			rp.checklogin_links_from_alertmsg(username);
			Thread.sleep(3000);
			rp.getCreate_Account().click();
			Thread.sleep(3000);
			rp.enteremailInfo(username);
			Thread.sleep(10000);
			Assert.assertEquals(rp.getalertaccountalreadyexist().getText(), "An account already exists for this business email address. Please Login or select Forgot Password", "alert text not match");
			Thread.sleep(10000);
			
			rp.check_forgotpassword_links_from_alertmsg(username);	
			Thread.sleep(5000);
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
		

	 
	 @Parameters({"username1","pswd1","url"})
	@Test(priority = 2,enabled=true)

	public void Validate_InvalidEmail_7(String username , String pswd, String url) throws IOException, InterruptedException{
		
		/* Account already exists */ 
		
	try {	
		
		driver.get(url);
		Thread.sleep(5000);
		
		
		Thread.sleep(3000);
			rp.getCreate_Account().click();
			Thread.sleep(3000);
			rp.verifyemail().click();
			Thread.sleep(3000);
			Assert.assertEquals(rp.getalertverifyemail().getText(), "The Business Email field is required", "alert text not match");
			driver.navigate().back();	
			rp.getCreate_Account().click();
			Thread.sleep(3000);
			rp.enteremailInfo("s");
			Thread.sleep(3000);
			Assert.assertEquals(rp.getalertverifyemail().getText(), "The Business Email field must be a valid email", "alert text not match");
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


