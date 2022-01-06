package CustomerPortal.Home;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Users {

	public WebDriver driver;
	WebDriverWait wait;
	public Users(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	By alertmsg=By.xpath("//span[@class='alert-msg']"); 
	By Settings=By.xpath("//a[@class='top-link' and text()='Settings']");
	
	By Jobs=By.xpath("//a[@class='top-link' and text()='Jobs']");

	By tabs = By.xpath("//a[@data-toggle='tab']");

	By RequestTab = By.xpath("//a[text()='Requests ']");

	By InvitesTab = By.xpath("//a[text()='Invites ']");

	By RequestActive = By.xpath("//a[@href='#RequestUsers' and @class = 'active']");

	By InvitesActive = By.xpath("//a[@href='#invites' and @class = 'active']");

	By Roles = By.xpath("(//a[text()='Roles'])[2]");

	//By CreateUser = By.xpath("(//a[text()='Create User'])[2]");

	By Users = By.xpath("//a[@class='top-link' and text()='Users']");

	//By DropDown = By.xpath("//select[@class='form-control ccp-txtbox pull-left col-lg-5 col-md-7 col-sm-8 col-xs-7']");

	By Edit = By.xpath("(//button[@class='btn-edit'])[1]");
	
	By InnerUser = By.xpath("//ul[@class='column']//a[text()='Users']");
	
	//By CreateUser = By.xpath("//ul[@class='column']//a[text()='Create User']");
	
	
	By CreateUser = By.xpath("//a[@class='btn auto-width btn btn-primary mr-0']");
	
	
	//a[@class='btn auto-width btn btn-primary mr-0']
	By RolesHeading=By.xpath("//div[@class='pull-left']/h1[text()='Roles']");
	
	By AddRoleBtn=By.xpath("//div[@class='pull-right invite-userbtn']");
	
	By AddRoleText=By.xpath("//div[@class='page-heading']/h1[text()='Add New Role']");
	
	By CancelBtn=By.xpath("//a[@class='btn' and text()='Cancel']");
	
	By EditBtn=By.xpath("(//a[@class='btn edit pull-right' and text()='Edit'])[1]");
	
	By UserTab=By.xpath("//a[text()='Users ']");
	
	By SearchBox=By.id("UserManagement");
	
	By SearchListing = By.xpath("//div[@class='users-listing']");
	
	By CCPRecord=By.xpath("//span[text()='CCP TEST MAIN 2']");
	
	By Dropdown = By.id("Users_Rights12");
	
	By SaveBtn = By.xpath("//a[text()='Save']");
	
	By InviteUserBtn=By.xpath("//a[@class='btn btn-primary mr-0']");
	//By InviteUserBtn= By.xpath("//a[text()='Invite Users']");
	By emailtextbox=By.id("email_address");
	
	By InviteBtn = By.xpath("//a[@class='btn btn-primary pull-left']");
	
	By EmailSuccessMsg=By.xpath("//span[@class='alert-msg']");
	
	By General_Msg=By.xpath("//span[@class='alert-msg']");
	
	By InviteMoreBtn=By.xpath("//a[text()='Invite More']");
	
	By CancelInvite=By.xpath("//a[text()='Cancel']");
	
	By DomainMsg=By.xpath("//span[@class='alert-msg' and text()='The user invite is sent successfully and the domain of invited user is added to the list as pending. once the invited user setup their account, the domain will automatically be active']");
	
	By Invite2Btn=By.xpath("//a[@class='btn btn-primary pull-left' and @tabindex='3']");
	
	

	By useractive=By.xpath("//li[1]//div[1]//div[1]//div[5]//span[1]//fieldset[1]//label[1]//span[1]");
	
	By selorg=By.xpath("//div[@class='tabsec-fields']//div[261]//label[1]//div[1]//span[1]//input[1]");
			

By userole1739=By.xpath("(//select[contains(@id,'Users_Rights')])[2]");
By userole17391=By.xpath("(//select[contains(@id,'Users_Rights')])[1]");
//	By userole1739=By.cssSelector(cssSelector)("//select[contains(@id,'Users_Rights')]");

	
	By saveuserbtn=By.xpath("//a[@class='btn btn-primary' and text()='Save']");
	
	By disabledrole=By.xpath("//select[contains(@id,'Users_Rights')]");
	
	
	By resendinv=By.xpath("//div[@id='invites']//div[@class='users-listing']//li[1]//div[1]//div[1]//div[3]]//a");
	
	By cancelinv=By.xpath("//div[@id='invites']//div[@class='users-listing']//li[1]//div[1]//div[1]//div[4]]//a[1]");
	
	By alertdanger=By.xpath("//div[@class='alert alert-danger ccp-alert-danger ']");
	
	
	
	By approve=By.xpath("//a[@class='btn btn-primary' and text()='Approve']");
	
	By resend=By.xpath("//a[@class='btn btn-primary' and text()='Resend Approval Email']");
	
	
	public WebElement getresend() {
		return driver.findElement(resend);
	}
	
	
	public WebElement getapprove() {
		return driver.findElement(approve);
	}
	
	public WebElement getresendinv() {
		return driver.findElement(resendinv);
	}
	public WebElement getaleretdanger() {
		return driver.findElement(alertdanger);
	}
	
	public WebElement getcancelinv() {
		return driver.findElement(cancelinv);
	}
	
	public WebElement getsaveuserbtn() {
		return driver.findElement(saveuserbtn);
	}
	public WebElement getselectorg() {
		return driver.findElement(selorg);
	}
	public WebElement getdisabledrole() {
		return driver.findElement(disabledrole);
	}
	public WebElement getrole() {
		return driver.findElement(userole1739);
	}
	public WebElement getrole1() {
		return driver.findElement(userole17391);
	}
	
	public WebElement getuseractive() {
		return driver.findElement(useractive);
	}
	
	public WebElement getInvite2Btn() {
		return driver.findElement(Invite2Btn);
	}
	public WebElement getDomainMsg() {
		return driver.findElement(DomainMsg);
	}
	public WebElement getGeneral_Msg() {
		return driver.findElement(General_Msg);
	}
	
	public WebElement getInviteBtn() {
		return driver.findElement(InviteBtn);
	}
	
	public WebElement getCancelInvite() {
		return driver.findElement(CancelInvite);
	}
	
	public WebElement getInviteMoreBtn() {
		return driver.findElement(InviteMoreBtn);
	}
	
	public WebElement getEmailSuccessMsg() {
		return driver.findElement(EmailSuccessMsg);
	}
	public WebElement getemailtextbox() {
		return driver.findElement(emailtextbox);
	}
	
	public WebElement getInviteUserBtn() {
		return driver.findElement(InviteUserBtn);
	}
	
	public WebElement getSaveBtn() {
		return driver.findElement(SaveBtn);
	}
	
	public WebElement getDropdown() {
		return driver.findElement(Dropdown);
	}
	
	public WebElement getCCPRecord() {
		return driver.findElement(CCPRecord);
	}
	
	public WebElement getSearchListing() {
		return driver.findElement(SearchListing);
	}

	public WebElement getSearchBox() {
		return driver.findElement(SearchBox);
	}
	
	public WebElement getUserTab() {
		return driver.findElement(UserTab);
	}
	
	public WebElement getEditBtn() {
		return driver.findElement(EditBtn);
	}
	
	public WebElement getCancelBtn() {
		return driver.findElement(CancelBtn);
	}
	
	public WebElement getAddRoleText() {
		return driver.findElement(AddRoleText);
	}
	
	public WebElement getAddRoleBtn() {
		return driver.findElement(AddRoleBtn);
	}
	
	public WebElement getRolesHeading() {
		return driver.findElement(RolesHeading);
	}
	
	//By DropDown = By.tagName("select");
	
	public WebElement getSettings() {
		return driver.findElement(Settings);
	}
	
	public WebElement getJobs() {
		return driver.findElement(Jobs);
	}
	
	public WebElement getEdit() {
		return driver.findElement(Edit);
	}
	
	public WebElement getUsers() {
		return driver.findElement(Users);
	}

	public WebElement getCreateUser() {
		return driver.findElement(CreateUser);
	}

	public WebElement getRoles() {
		return driver.findElement(Roles);
	}

	// By Heading = By.xpath("//span[text()='Address Of Use']");

	public WebElement getInvitesActive() {
		return driver.findElement(InvitesActive);
	}

	public WebElement getRequestActive() {
		return driver.findElement(RequestActive);
	}

	public List<WebElement> gettabs() {
		return driver.findElements(tabs);
	}

	public WebElement getRequestTab() {
		return driver.findElement(RequestTab);
	}

	public WebElement getInvitesTab() {
		return driver.findElement(InvitesTab);
	}
	
	public void  inviteuser(String email,String dburl, String dbun, String dbpswd,String inviteurl) throws IOException, InterruptedException , ClassNotFoundException, SQLException
	{ 
		Header hd = new Header(driver);
		Thread.sleep(7000);
		String ab=null;
		
		Actions an = new Actions(driver);
		an.moveToElement(hd.getAccountMenu()).perform();
		hd.getUsers().click();
		Thread.sleep(10000);
		wait = new WebDriverWait(driver, 120);
		Assert.assertEquals(driver.getTitle(), "User Management - CCM",
				"User not able to land to the User management page after clicking on user management from account menu in the header");


			Thread.sleep(5000);	
			Actions a=new Actions(driver);
			
			a.moveToElement(getInvitesTab()).click().build().perform();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(getInviteUserBtn()));
			Thread.sleep(3000);
			getInviteUserBtn().click();
			Thread.sleep(5000);

			getemailtextbox().sendKeys(email);
			Thread.sleep(5000);
			getInviteBtn().click();
			Thread.sleep(5000);
		
		
			   // String dbUrl = "jdbc:mysql://localhost:3306/database_sensitive";					
				//String username = "homestead";	
				//String password = "secret";					
				String query = "select token from user_invitations where email='" +email+"';";	            
		
	       	    Class.forName("com.mysql.jdbc.Driver");				
	        	Connection con = DriverManager.getConnection(dburl,dbun,dbpswd);
	    	   Statement stmt = con.createStatement();					
	  	ResultSet rs= stmt.executeQuery(query);							
	 	while (rs.next()){
			        		ab = rs.getString(1);								        	                               
	                        System. out.println("code ="+ab);		
	                }		
	  	con.close();
		String inviteURL=inviteurl+ab;
		//hd.getAccountMenu().click();
		//Thread.sleep(7000);
		//hd.getLogout().click();
		
		 WebElement web=driver.findElement(By.xpath("//a[@class='clearfix']//span[@class='account-title'][contains(text(),'My Account')]"));
			
		 Actions actions = new Actions(driver);
			actions.moveToElement(web);
			actions.perform();	 
	 Thread.sleep(7000);
		wait.until(ExpectedConditions.elementToBeClickable(hd.getLogout()));
		 Thread.sleep(3000);
	 hd.getLogout().click();
	 Thread.sleep(5000);
		String Shop_Titleact = driver.getTitle();
		Assert.assertEquals(Shop_Titleact, "Login - CCM", "User is not being able to Signout from the application");
	    driver.navigate().to(inviteURL);
	
	  
	}
	public void visibilityofAlert(String text) throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 180);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(alertmsg));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(alertmsg, text));
		Thread.sleep(5000);
	
	}
	
	public void gotoURL() throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 120);
	    driver.navigate().to("http://ccp-customer.local/auth/login");
	
	 		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "Login - CCM", "User is not being able to Signout from the application");
	   
	}
	public void loginapp() throws IOException, InterruptedException
	{
	
	LoginPage lp= new LoginPage(driver);
	Properties prop=new Properties();
	FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	wait = new WebDriverWait(driver, 120);
	wait.until(ExpectedConditions.elementToBeClickable(lp.getusername()));
	
	lp.getusername().sendKeys(prop.getProperty("username_cust1"));
	wait.until(ExpectedConditions.elementToBeClickable(lp.getpassword()));
	lp.getpassword().sendKeys(prop.getProperty("pswd_cust1"));
	wait.until(ExpectedConditions.elementToBeClickable(lp.getloginbtn()));
	lp.getloginbtn().click();	
	Thread.sleep(5000);
	Assert.assertEquals(driver.getTitle(), "Marketplace - CCM", "User is not being able to SignIn on application");
   
	}
}
