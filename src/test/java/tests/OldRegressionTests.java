package tests;

import static org.testng.Assert.assertEquals;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import CustomerPortal.Home.ChangePassword;

import CustomerPortal.MarketPlace.Discover.Discover;



import CustomerPortal.MarketPlace.Payment;
import CustomerPortal.MarketPlace.Procurement;

import resources.base;


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

public class OldRegressionTests extends base {
	public static Logger Log = LogManager.getLogger(base.class.getName());
	public CustomerPortal.Home.HomePage hp;
	public WebDriver driver;
	private WebElement HeaderSection;
	public static Properties prop;
	FileInputStream fis;
	@Test(priority = 0)
	public void ValidateLogin() throws IOException, InterruptedException {
		prop= new Properties();
		fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		driver = initializeDriver();
		 LoginPage lp= new LoginPage(driver);
			lp.getusername().sendKeys(prop.getProperty("username_cust1"));
			lp.getpassword().sendKeys(prop.getProperty("pswd_cust1"));
			lp.getloginbtn().click();	

		String TitleHome = driver.getTitle();
		Log.info("The title of the home page is captured");
		Thread.sleep(3000);
		Assert.assertEquals(TitleHome, "Marketplace - CCM", "User is not being able to Login to the application");
		Log.info("The title of the Shop page is Verified Successfully");
	}

	@Test(priority = 1)

	public void ValidateHomePage() throws InterruptedException {

		HomePage hm = new HomePage(driver);
		boolean MarketPlace_present;
		try {
			hm.getMarketPlace_Link().click();
			Thread.sleep(2000);
			

		} catch (NoSuchElementException e) {
		
		}
	
		boolean Manage_present;
		try {
			hm.getManage_Link();
			Thread.sleep(2000);
		

		} catch (NoSuchElementException e) {
			
		}
		
		boolean Insight_present;
		try {
			hm.getInsight_Link();
			Thread.sleep(2000);


		} catch (NoSuchElementException e) {
		
		}
		
		
		boolean Discover_present;
		try {
			hm.getDiscover().isEnabled();

		

		} catch (NoSuchElementException e) {
		
		}
	
		boolean Applications_present;
		try {
			hm.getApplication_Link().isEnabled();

		

		} catch (NoSuchElementException e) {
	
		}
	
		boolean Infrastructure_present;
		try {
			hm.getInfrastructure_Link();
			

		} catch (NoSuchElementException e) {
		
		}
	
		boolean Platform_present;
		try {
			hm.getPlatform_Link();
		

		} catch (NoSuchElementException e) {
		
		}
		boolean Consulting_present;
		try {
			hm.getConsulting();
	
		} catch (NoSuchElementException e) {
		
		}
		
		boolean dfp_present;
		try {
			hm.getDFP_Banner().isDisplayed();
		
		} catch (NoSuchElementException e) {
			
		}
		
		boolean FeaturedServices_present;
		try {
			hm.getFeatured_Services().isDisplayed();
	
		} catch (NoSuchElementException e) {
			
		}
	
		boolean FeaturedServices_Btn;

		try {
			hm.getBtn().isDisplayed();
	} catch (NoSuchElementException e) {
			
		}
		
		boolean Shop_present;
		try {
			hm.getShopSection().isDisplayed();

		} catch (NoSuchElementException e) {
		}
	
		boolean YourServices_present;
		try {
			hm.getServiceSection().isDisplayed();
		} catch (NoSuchElementException e) {
			
		}
	
	}

	@Test(priority = 2)

	public void ValidateServicesGetBtn() throws InterruptedException {

		HomePage hm = new HomePage(driver);
		boolean GetNow_present;
		try {
			hm.getBtn().click();
			Thread.sleep(3000);
		

		} catch (NoSuchElementException e) {
		
		}
	}
	@Test(priority = 3)

	public void ValidateProcurementCheckout() throws InterruptedException {

		HomePage hm = new HomePage(driver);
		boolean GetNow_present;
		try {
			hm.getP_GetBtn().click();
			Thread.sleep(10000);
		

		} catch (NoSuchElementException e) {
			
		}

	}

	@Test(priority = 4)

	public void ValidateProcurementOrder() throws InterruptedException {
		
    
		/*Procurement pr = new Procurement(driver);
	 //   WebElement yes=driver.findElement(By.xpath("//a[text()='Yes I do']"));
	    Thread.sleep(2000);
	    
	    
	    By show=By.xpath("//a[text()='Yes I do']");
		if(pr.isElementPresent(show))
		{
			
			pr.getYesBtn().click();
			Thread.sleep(2000);
			pr.gettenancycont().click();
			Thread.sleep(3000);
			pr.getContinue1().click();
			Thread.sleep(3000);
			pr.getContinue2().click();
			Thread.sleep(3000);
			pr.getagree().click();
			Thread.sleep(3000);
			pr.getSbmt_Order().click();
			}
		
			
	    else
			
	    {
		
				pr.getContinue1().click();
				Thread.sleep(10000);
				pr.getContinue2().click();
				Thread.sleep(10000);
			//	 WebElement agree1=driver.findElement(By.xpath("//a[text()='Yes I do']"));
				//   if (agree1.isDisplayed())
				//   {
				//pr.getagree().click();
				//Thread.sleep(3000);
				  // }
				   
				   WebElement agree2=driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg-txt mb-app-btn']"));
				   if (agree2.isDisplayed())
				   {
			agree2.click();
			Thread.sleep(10000);
				   }
					
					
					
				pr.getSbmt_Order().click();
				Thread.sleep(10000);
	    }
		Thread.sleep(8000);
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.titleContains("Order Received - CCM"));

			Assert.assertEquals(driver.getTitle(), "Order Received - CCM",
			"After clicking on submit button on procurement checkout, user is not able to navigate to order received page");*/
   
		// home  page have some products error 
	}
	
	@Test(priority = 5)

	public void ValidateNotificationPage() throws InterruptedException {

		Header hd = new Header(driver);

		 Thread.sleep(10000);
		boolean bell_present;
		try {
			
			WebDriverWait wait = new WebDriverWait(driver, 120);
			Thread.sleep(10000);
			wait.until(ExpectedConditions.elementToBeClickable(hd.getNotification()));
			Thread.sleep(10000);
			hd.getNotification().click();
			Thread.sleep(10000);
		

		} catch (NoSuchElementException e) {
		
		}
		Assert.assertEquals(driver.getTitle(), "Notifications - CCM",
				"User not able to land to the notification page after clicking on the bell icon from the header");

	
	
		
	
	}

	@Test(priority = 6)

	public void ValidateInviteEmail() throws InterruptedException {

		Header hd = new Header(driver);

		Thread.sleep(10000);
		boolean AccountMenu_present;
		Actions an = new Actions(driver);
		try {
			an.moveToElement(hd.getAccountMenu()).perform();
			hd.getUsers().click();
			Thread.sleep(10000);
		

		} catch (NoSuchElementException e) {
		
		}
		
		
	
		Assert.assertEquals(driver.getTitle(), "User Management - CCM",
				"User not able to land to the User management page after clicking on user management from account menu in the header");

		Users us = new Users(driver);

	
		// boolean Requesttab_present =false;

		Random rm = new Random();
		int i = rm.nextInt(1000) + 1;

		// WebDriverWait wt = new WebDriverWait(driver,50);

		try {
			Thread.sleep(5000);
		//	us.getInvitesTab().click();
			
			Actions a=new Actions(driver);
			
			a.moveToElement(us.getInvitesTab()).click().build().perform();
			Thread.sleep(5000);
			us.getInviteUserBtn().click();
			Thread.sleep(5000);

			us.getemailtextbox().sendKeys(i + "saima.tabassum" + i + "@arpatech.com");
			Thread.sleep(5000);
			us.getInviteBtn().click();
			Thread.sleep(5000);
		
//The user invite is sent successfully and the domain of invited user is added to the list as pending. Once the invited user setup their account, the domain will automatically be active
		
		//An account already exists for this business email address

			//The user s1@k.com has been invited successfully

	
			
			
			us.getInviteMoreBtn().click();
			Thread.sleep(5000);

			us.getemailtextbox().sendKeys("bilawal.alam" + i + "@arpatech" + i + ".com");
		
			Thread.sleep(5000);
			us.getInvite2Btn().click();

			Thread.sleep(20000);
		
			us.getInviteMoreBtn().click();
			Thread.sleep(5000);

			us.getemailtextbox().sendKeys("s" + i + "@arpatech" + i + ".com");
		
			Thread.sleep(5000);
			us.getInvite2Btn().click();

			Thread.sleep(20000);
		
			 WebElement alert=driver.findElement(By.xpath("//span[@class='alert-msg']"));
			    System.out.println(alert.getText());
			    
			us.getCancelInvite().click();
			us.getresendinv().click();
		//The user s1@k.com has been invited successfully



		} catch (NoSuchElementException e) {
			// Notificationtab_present = false;
			// Log.error("All notifications tab is not present on notification page");
			Log.error(e.getMessage());
		}
		
	}

	
	@Test(priority = 7)

	public void ValidateSearchUser() throws InterruptedException {

		Users us = new Users(driver);
	

		try {
			Thread.sleep(10000);
			us.getUserTab().click();
			Thread.sleep(10000);

		} catch (NoSuchElementException e) {

			Log.error(e.getMessage());
		}
	
	

		try {
			Thread.sleep(10000);
			us.getSearchBox().sendKeys("CCM" + Keys.ENTER);
			Thread.sleep(5000);
			

		} catch (NoSuchElementException e) {
			
		}

	
		Select se1;

		String Option1 = null;
		String Option2 = null;
	

		try {
			//se1 = new Select(us.getDropdown());
			//Option1 = se1.getOptions().get(0).getText().trim();
			//Option2 = se1.getOptions().get(1).getText().trim();
			//se1.selectByIndex(1);
			
			//Thread.sleep(20000);
		

		} catch (NoSuchElementException e) {
			
		}
}

	@Test(priority = 8)

	public void ValidateManageDomain() throws InterruptedException {

		Header hd = new Header(driver);

	
		Actions an = new Actions(driver);
		try {
			Thread.sleep(10000);
			an.moveToElement(hd.getAccountMenu()).perform();
			Thread.sleep(5000);
			hd.getAcctDomain().click();
			Thread.sleep(15000);

		

		} catch (NoSuchElementException e) {

			
		}

		Assert.assertEquals(driver.getTitle(), "Account Domains - CCM",
				"User not able to land to the Manage Domain page after clicking on manage domain option from account menu in the header");

	
	
	}

	@Test(priority = 9)

	public void ValidateEditProfile() throws InterruptedException {

		Header hd = new Header(driver);

		boolean MyProfle_present = false;
		Actions an = new Actions(driver);
		try {
			an.moveToElement(hd.getAccountMenu()).perform();
			hd.getMyProfile().click();

			Log.info("From the Customer Portal user is clicking on my profile from account menu");
			MyProfle_present = true;

		} catch (NoSuchElementException e) {

			Log.error("From the Customer Portal user not able to find my profile link from account menu");
			Log.error(e.getMessage());
		}
	Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "My Profile - CCM",
				"User not able to land to the My Profile page after clicking on My Profile page from account menu in the header");

		MyProfilePage mpp = new MyProfilePage(driver);

		// boolean Usertab_present =false;
		boolean EditProfile_present = false;

		try {
			mpp.getEditProfile_btn().click();

			EditProfile_present = true;

		} catch (NoSuchElementException e) {
			EditProfile_present = false;
			Log.error("Edit profile button is not appearing on My Profile page");
			Log.error(e.getMessage());
		}
		
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "Edit Profile - CCM",
				"User not able to land to the Edit Profile page after clicking on Edit profile button on the my profile page");

		boolean emaildisabled = false;
		boolean SaveBtn_present = false;
		EditProfilePage epp = new EditProfilePage(driver);

		try {
			// emaildisabled=epp.getemail().isEnabled();
			epp.getSaveBtn().click();

			SaveBtn_present = true;

		} catch (NoSuchElementException e) {

			Log.error("Save button is not appearing on Edit page");
			Log.error(e.getMessage());
		}
		// Assert.assertEquals(emaildisabled, false, "Email text field is not appearing
		// disable on edit profile page");
		Thread.sleep(5000);
	}

	@Test(priority = 10)

	public void ValidateUpload_Logo() throws InterruptedException, AWTException {

		Header hd = new Header(driver);

		boolean AccountSettings_present = false;
		Actions an = new Actions(driver);
		try {
			an.moveToElement(hd.getAccountMenu()).perform();
			hd.getAccountSettings().click();

			Log.info("From the Customer Portal user is clicking on Account settings from account menu");
			AccountSettings_present = true;

		} catch (NoSuchElementException e) {

			Log.error("From the Customer Portal user not able to click on Account settings from account menu");
			Log.error(e.getMessage());
		}
	Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "Account Settings - CCM",
				"User not able to land to the Account Settings page after clicking on Account settings link from account menu in the header");

		AccountSetting acc = new AccountSetting(driver);

		
		Robot rb = new Robot();
	

		try {
			Thread.sleep(5000);
			acc.getBrowseBtn().click();
			//acc.getBrowseBtn().sendKeys("C:\\Users\\bilaw\\Desktop\\logo\\1.png");
	
			Thread.sleep(4000);
			//rb.setAutoDelay(5000);
			StringSelection ss = new StringSelection("C:\\Saima\\Users\\saima.tabassum\\Desktop\\a.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			//rb.setAutoDelay(2000);
			
			Thread.sleep(4000);	
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);

			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			//rb.setAutoDelay(1000);
			Thread.sleep(2000);	
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(3000);
			acc.getSaveChanges().click();
			Thread.sleep(5000);
			
			//acc.getLogoText().isDisplayed();
			
			//LogoImageText=true;
			//filename= acc.getfilename().getText();
			//acc.getfilename().getText()

			
			acc.getSuccessMsg().isDisplayed();


		} catch (NoSuchElementException e) {

			Log.error(
					"On Account Setting Page Browse Button, Save Changes Button or Success Validation message is not appearing");
			Log.error(e.getMessage());
		}
	
	
		//Assert.assertEquals(LogoImageText, true, "Logo image is not getting uploaded");
		//Assert.assertEquals(filename, "1.png","Logo image is not getting uploaded");
	}
	@Test(priority = 11)

	public void ValidateAddressofUse() throws InterruptedException, AWTException {

		Header hd = new Header(driver);

		boolean AddressOfUse_present = false;
		Actions an = new Actions(driver);
		try {
			an.moveToElement(hd.getAccountMenu()).perform();
			hd.getAddressOfUse().click();
			AddressOfUse_present = true;
			Log.info("From the Customer Portal user is clicking on Address Of use from account menu");

		} catch (NoSuchElementException e) {

			Log.error("From the Customer Portal user not able to click on Address Of Use from account menu");
			Log.error(e.getMessage());
		}
	Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "Address of Use - CCM",
				"User not able to land to the Account Settings page after clicking on Account settings link from account menu in the header");

		Address ad = new Address(driver);

		boolean RequestAddressBtn_present = false;
		boolean AddressField_present = false;
		boolean City_present = false;
		boolean State_present = false;
		boolean ZipCode_present = false;
		boolean Phone_present = false;
		boolean Sbmt_present = false;
		boolean ValidationMsg_present = false;

		try {
			ad.getRequestAddressBtn().click();
			RequestAddressBtn_present = true;
			Thread.sleep(5000);
			Log.info("From the Address of Use page user is clicking on request address button");
			ad.getAddressField().sendKeys("756 Concho Ln");
			 AddressField_present = true;
			
			ad.getaddress().sendKeys("Houston");
			

			
		
			
			ad.getZip_Code().sendKeys("77084");
			
			 ZipCode_present = true;
			
			ad.getPhone().sendKeys("7138370311");
			
			 Phone_present = true;
			
			ad.getSubmitBtn().click();
			Sbmt_present = true;
			Thread.sleep(2000);
			
			ad.getValidationMsg().isDisplayed();
			ValidationMsg_present = true;
			
			
			driver.navigate().refresh();
			
			
			ad.getRequestAddressBtn().click();
			RequestAddressBtn_present = true;
			Thread.sleep(5000);
			Log.info("From the Address of Use page user is clicking on request address button");
			ad.getAddressField().sendKeys("756 Concho Ln");
			 AddressField_present = true;
			
			ad.getaddress().sendKeys("Houston");
			

			
		
			
			ad.getZip_Code().sendKeys("77084");
			
			 ZipCode_present = true;
			
			ad.getPhone().sendKeys("7138370311");
			
			 Phone_present = true;
			
			ad.getSubmitBtn().click();
			Sbmt_present = true;
			Thread.sleep(2000);
			
			ad.getValidationMsg1().isDisplayed();
			ValidationMsg_present = true;
			
			//"Change request already exists"
			
			
			
			
			
			
			
			

		} catch (NoSuchElementException e) {

			Log.error("From the Customer Portal user not able to click on Address Of Use from account menu");
			Log.error(e.getMessage());
		}
		
	}

	@Test(priority = 12)

	public void ValidateCatalogRestrictions() throws InterruptedException, AWTException {

		Header hd = new Header(driver);

		boolean CRestrictions_present = false;
		Actions an = new Actions(driver);
		try {
			Thread.sleep(10000);
			an.moveToElement(hd.getAccountMenu()).perform();
			hd.getCatalog_Restriction().click();
			Thread.sleep(10000);
	
		} catch (NoSuchElementException e) {

			Log.error("From the Customer Portal user not able to click on Catalog Restrictions from account menu");
			Log.error(e.getMessage());
		}
	Thread.sleep(10000);
		Assert.assertEquals(driver.getTitle(), "Catalog Restrictions - CCM",
				"User not able to land to the Catalog Restriction page after clicking on Catalog Restriction link from account menu in the header");

		Catalog cat = new Catalog(driver);

		try {
			cat.getRestricted().isDisplayed();			
			Thread.sleep(10000);
			cat.getUnrestricted().click();
	
			Thread.sleep(10000);
			cat.getCheckBox().click();
			Thread.sleep(10000);
			cat.getRestrict().click();
			
			Thread.sleep(10000);
			cat.getSucessMsg().isDisplayed();
			Thread.sleep(10000);
			cat.getServiceSearch().sendKeys("corp");
			Thread.sleep(10000);
		
			cat.getCheckBox().isDisplayed();
			Thread.sleep(10000);
			
			cat.getRestricted().click();
			Thread.sleep(10000);
			
			cat.getSelectAll().click();
			Thread.sleep(10000);
			
			cat.getUnRestrict().click();
			Thread.sleep(10000);
			
			cat.getUnRestrictSuccessMsg().isDisplayed();
			Thread.sleep(10000);
			
			
		} catch (NoSuchElementException e) {

			Log.error("On Catalog Restriction page all page elements are not appearing");
			Log.error(e.getMessage());
		}
		}
	
	@Test(priority = 13)

	public void ValidateChangePassword() throws InterruptedException, AWTException {

		Header hd = new Header(driver);
		WebDriverWait wt = new WebDriverWait(driver, 180);
		boolean ChangePassword_present = false;
		Actions an = new Actions(driver);
		//try {
		Thread.sleep(5000);
			an.moveToElement(hd.getAccountMenu()).perform();
			Thread.sleep(10000);
			hd.getChangePassword().click();
			Thread.sleep(10000);
		//} catch (NoSuchElementException e) {

			//Log.error("From the Customer Portal user not able to click on Change Passowrd Link from account menu");
			//Log.error(e.getMessage());
		//}

		Assert.assertEquals(driver.getTitle(), "Change Password - CCM",
				"User not able to land to the Change Password page after clicking on Change Password link from account menu in the header");
		
		ChangePassword cp = new ChangePassword(driver);


		//try {
			cp.getCurrentPswd().sendKeys("Connection123");			
			Thread.sleep(5000);
			
			cp.getNewPswd().sendKeys("abcd");
			Thread.sleep(5000);
			
			cp.getCnfrm_pswd().sendKeys("abcd");
			Thread.sleep(5000);
			
			cp.getSaveBtn().click();
	
			Thread.sleep(4000);
			
			Assert.assertEquals(cp.getalertmsg().getText(), "Password must have at least 8 characters and contain uppercase, lowercase letters and numbers.", "alert text not match");
			
			
	
	}
	
	@Test(priority = 14)

	public void ValidatePaymentMethod() throws InterruptedException, AWTException {
		Header hd = new Header(driver);
		boolean ChangePassword_present = false;
		Actions an = new Actions(driver);
		try {
			Thread.sleep(10000);
			an.moveToElement(hd.getAccountMenu()).perform();
			Thread.sleep(5000);
			hd.getPayment_Plan().click();
			Thread.sleep(10000);
		} catch (NoSuchElementException e) {

			Log.error("From the Customer Portal user not able to click on payment Method Link from account menu");
		Log.error(e.getMessage());
		}

		Assert.assertEquals(driver.getTitle(), "Payment Method - CCM",
				"User not able to land to the Payment Method page after clicking on Payment Method link from account menu in the header");
}
	
	@Test(priority = 15)

	public void ValidateDiscover() throws InterruptedException, AWTException {
		HomePage hm = new HomePage(driver);
		boolean Discover_present = false;
		try {
			Thread.sleep(5000);
			hm.getDiscover().click();
			Thread.sleep(10000);
		} catch (NoSuchElementException e) {
		}

		Assert.assertEquals(driver.getTitle(), "Discover - CCM",
				"User not able to land to the Discover Page page after clicking on discover link from MarkITPlace Section");
		SoftAssert sf = new SoftAssert();
		
		String Heading_Text = null ;
	
		Discover ds = new Discover(driver);
		try {
			Heading_Text= ds.getHeading().getText();
	
			ds.getStep1Title().getText();
			Thread.sleep(5000);
		ds.getStep2Title().getText();
		Thread.sleep(5000);
		ds.getExpectedUserLink().sendKeys("2");
		Thread.sleep(10000);	
		} catch (NoSuchElementException e) {

	}
		//Thread.sleep(5000);
		sf.assertEquals(Heading_Text, "Discover",
				"Heading in the discover page is not appearing as expected");
				

}	
	
	@Test(priority = 16)

	public void ValidateApplicationsLink() throws InterruptedException, AWTException {
		HomePage hm = new HomePage(driver);
		boolean Application_present = false;
		try {
			Thread.sleep(10000);
			hm.getApplication_Link().click();
			Thread.sleep(10000);
			} catch (NoSuchElementException e) {
			Log.error("From the Customer Portal user not able to click on Applications Link under MarkITPlace Section");
		Log.error(e.getMessage());
		}

		Assert.assertEquals(driver.getTitle(), "Applications - CCM",
				"User not able to land to the Shop page after clicking on Applications link from MarkITPlace Section");
		Assert.assertEquals(hm.getService_type().getText(), "SaaS x","SaaS text is not appearing under service type category selection in Application page");	
}	
	
	@Test(priority = 17)

	public void ValidateInfrastructureLink() throws InterruptedException, AWTException {
		HomePage hm = new HomePage(driver);
		boolean Infrastructure_present = false;
		try {
			hm.getInfrastructure_Link().click();
			Thread.sleep(10000);} catch (NoSuchElementException e) {
			Log.error("From the Customer Portal user not able to click on Infrastructure Link under MarkITPlace Section");
		Log.error(e.getMessage());
		}
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "Infrastructure - CCM",
				"User not able to land to the Shop page after clicking on Infrastructure link from MarkITPlace Section");
		Assert.assertEquals(hm.getService_type().getText(), "IaaS x","Iaas text is not appearing under service type category selection in Infrastructure page");	
}	
	
	@Test(priority = 18)

	public void ValidatePlatformLink() throws InterruptedException, AWTException {
		HomePage hm = new HomePage(driver);
		boolean Platform_present = false;
		try {
			hm.getPlatform_Link().click();
			Platform_present = true;
			Log.info("From the Customer Portal user is clicking on Platform link under MarkITPlace Section");
		} catch (NoSuchElementException e) {
			Log.error("From the Customer Portal user not able to click on Platform Link under MarkITPlace Section");
		Log.error(e.getMessage());
		}
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "Platform - CCM",
				"User not able to land to the Shop page after clicking on Platform link from MarkITPlace Section");
		Assert.assertEquals(hm.getService_type().getText(), "PaaS x","Paas text is not appearing under service type category selection in Platform page");	
}	
	
	@Test(priority = 19)

	public void ValidateConsultingLink() throws InterruptedException, AWTException {
		HomePage hm = new HomePage(driver);
		boolean Consulting_present = false;
		try {
			hm.getConsulting().click();
			Consulting_present = true;
			Log.info("From the Customer Portal user is clicking on Consulting link under MarkITPlace Section");
		} catch (NoSuchElementException e) {
			Log.error("From the Customer Portal user not able to click on Consulting Link under MarkITPlace Section");
		Log.error(e.getMessage());
		}
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "Consulting - CCM",
				"User not able to land to the Shop page after clicking on Consulting link from MarkITPlace Section");
		Assert.assertEquals(hm.getService_type().getText(), "Consulting x","Consulting text is not appearing under service type category selection in Consulting page");
}
	
	@Test(priority = 20)

	public void ValidateSearching() throws InterruptedException, AWTException {
		HomePage hm = new HomePage(driver);
		boolean Searching_present = false;
		int a = 0 ;
		try {
			hm.getMain_Search().sendKeys("Microsoft"+ Keys.ENTER);
			Searching_present = true;
			Log.info("From the Customer Portal user is searching the Microsoft service");
			Thread.sleep(5000);
			 a = hm.getProducts().size();
		} catch (NoSuchElementException e) {
			Log.error("From the Customer Portal user not able to search the Microsoft service");
		Log.error(e.getMessage());
		

	
		}
	}
		
		@Test(priority = 21)

	public void ValidateLogOut() throws InterruptedException, AWTException {
			
			Header hd = new Header(driver);

			// Thread.sleep(10000);
			boolean Logout_present;
			Actions an = new Actions(driver);
			try {
				an.moveToElement(hd.getAccountMenu()).perform();
				hd.getLogout().click();
				// Thread.sleep(2000);
				Log.info("From the Customer Portal user is clicking on Logout from account menu");
				Logout_present = true;

			} catch (NoSuchElementException e) {
				Logout_present = false;
				Log.error("Account menu and Logout is not appearing in the header");
				Log.error(e.getMessage());
			}
		Assert.assertEquals(driver.getTitle(), "Login - CCM",
					"User not able to land on the login page after clicking on Logout link");
			}
		
		@Test(priority = 22)
    public void ValidateInvalidPassword() throws InterruptedException, AWTException {
			
			LoginPage lp = new LoginPage(driver);
			
			boolean Username_present = false;
			boolean password_present = false;
			boolean Login_present = false;
			
			try {
			lp.getusername().sendKeys("ccptestmain@arpatech.com");
			Username_present = true;
			lp.getpassword().sendKeys("Connection1234");
			password_present = true;
			lp.getloginbtn().click();
			Login_present = true;
			Thread.sleep(5000);
			
				Log.info("From the Customer Portal user Login page , User is entering the correct username but wrong password");
				

			} catch (NoSuchElementException e) {
				
				Log.error("Username,password or Login button is not present on the Login Page");
				Log.error(e.getMessage());
			}
			
		
						}
		
		@Test(priority = 23,enabled=true)

    public void ValidateInvaliduser3Times() throws InterruptedException, AWTException {
			
			LoginPage lp = new LoginPage(driver);
			
			boolean Username_present = false;
			boolean password_present = false;
			boolean Login_present = false;
			
			try {
				for(int a = 0 ; a>=3 ;a++)
			{
			lp.getusername().clear();
			lp.getusername().sendKeys("ccptestmain@arpatech.com");
			Username_present = true;
			lp.getpassword().clear();
			lp.getpassword().sendKeys("Connection1234");
			password_present = true;
			lp.getloginbtn().click();
			Login_present = true;
			Thread.sleep(4000);
				}
			Thread.sleep(5000);
			
				Log.info("From the Customer Portal user Login page , User is entering the correct username but wrong password 3 times");
				

			} catch (NoSuchElementException e) {
				
				Log.error("Username,password or Login button is not present on the Login Page");
				Log.error(e.getMessage());
			}
			
	}
		
		@Test(priority = 24,enabled=true)

	public void ValidateLockedUser() throws InterruptedException, AWTException {
			
			LoginPage lp = new LoginPage(driver);
			
			boolean Username_present = false;
			boolean password_present = false;
			boolean Login_present = false;
			
			try {
			lp.getusername().clear();
			lp.getusername().sendKeys("ccptestmain@arpatech.com");
			Username_present = true;
			lp.getusername().clear();
			lp.getpassword().sendKeys("Connection1234");
			password_present = true;
			lp.getloginbtn().click();
			Login_present = true;
			Thread.sleep(5000);
			
			lp.getusername().clear();
			lp.getusername().sendKeys("ccptestmain@arpatech.com");
			//Username_present = true;
			lp.getusername().clear();
			lp.getpassword().sendKeys("Connection1234");
			//password_present = true;
			lp.getloginbtn().click();
			//Login_present = true;
			Thread.sleep(5000);
			
			
			lp.getusername().clear();
			lp.getusername().sendKeys("ccptestmain@arpatech.com");
			//Username_present = true;
			lp.getusername().clear();
			lp.getpassword().sendKeys("Connection1234");
			//password_present = true;
			lp.getloginbtn().click();
			//Login_present = true;
			Thread.sleep(5000);
			
				Log.info("From the Customer Portal user Login page , User is entering the correct username but wrong password");
				

			} catch (NoSuchElementException e) {
				
				Log.error("Username,password or Login button is not present on the Login Page");
				Log.error(e.getMessage());
			}
		
			}
		
		@Test(priority = 25)

	public void ValidateForgetPassword() throws InterruptedException, AWTException {
			
			LoginPage lp = new LoginPage(driver);
			
			boolean FPassword_present = false;
			boolean Email_present = false;
			boolean Sbmt_present = false;
		
			try {
			lp.getForget_Pswd().click();
			FPassword_present = true;
			Thread.sleep(10000);
			lp.getemailfield().sendKeys("saima.tabassum@arpatech.com");
			Email_present = true;
			
			lp.getSbmt_Btn().click();
			Sbmt_present = true;
			Thread.sleep(8000);
			
			Log.info("From the Customer Portal forget password page , User is clicking on forget password link and sending the email for password reset");
				

			} catch (NoSuchElementException e) {
				
				Log.error("Forget password link not present on the login page");
				Log.error(e.getMessage());
			}
			
	
			}
		
}
