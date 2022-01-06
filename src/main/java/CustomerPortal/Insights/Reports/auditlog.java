package CustomerPortal.Insights.Reports;

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

import CustomerPortal.Home.LoginPage;
import CustomerPortal.MarketPlace.PDPCCM;



public class auditlog {

	public WebDriver driver;
	WebDriverWait wait;
	public auditlog(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	By selectfields=By.xpath("//a[@id='selectFields']");
	By Column1stDropdown=By.xpath("(//div[@class='filter-search-drop-arrow'])[3]");
	//By APCRow=By.xpath("(//span[@class='control__indicator'])[1]");
	By billRow=By.xpath("//span[contains(text(),'Microsoft CSP')]");
	By billprovidernamesearch=By.xpath("//input[@id='Provider Nameprovider_name']");
	//By ApplyBtn=By.xpath("(//a[text()='Apply'])[1]");
	
	By ApplyBtn=By.xpath("	//div[@class='filter-search-drop-arrow active']//div[@class='filter-drop-down-container shift-left']//div//a[@class='btn btn-primary left-btn'][contains(text(),'Apply')]");
	

	
	

	
	
	
	//a[contains(@class,'reports')][contains(text(),'Orders')]

	By export=By.xpath("//a[@id='export']");
	
	By exportoptions=By.xpath("//select[@id='options']");
	By currpage=By.xpath("//input[@id='all_pages']");
	By allpages=By.xpath("//input[@id='current_page']");
	
	
	By exportreport=By.xpath("//button[contains(text(),'Export Report')]");

	
	By exportcancel=By.xpath("//div[@class='white-popup popup-small zoom-anim-dialog mfp-show export-report-modal clearfix']//div//button[@class='btn btn-secondary'][contains(text(),'Cancel')]");
	
	By proviname=By.xpath("//html//body//div//div//div//div//div//div//div//div//div//div//ul//li//label[contains(text(),'Provider Name')]//span");
	By provid=By.xpath("//html//body//div//div//div//div//div//div//div//div//div//div//ul//li//label[contains(text(),'Provider ID')]//span");

	By unselectall=By.xpath("//a[contains(text(),'Unselect All')]");
	By selectall=By.xpath("//a[@class='btn left-btn' and text()='Select All']");

	By searchdisplay=By.xpath("//input[@id='SelectFieldsToDisplay']");

	By apply=By.xpath("//a[@class='btn btn-primary']");

	By cancel=By.xpath("//button[contains(text(),'Cancel')]");

	 //button[contains(text(),'Apply')]

	By date=By.xpath("//span[@class='control__indicator']");

By bill=By.xpath("//label[@class='drag-handle sort-arrow descend']");
	
	
By billprovid=By.xpath("//label[@class='drag-handle sort-arrow none'][contains(text(),'Provider ID')]");
By billproviname=By.xpath("//label[@class='drag-handle sort-arrow none'][contains(text(),'Provider Name')]");
	


By auditlog=By.xpath("//a[contains(@class,'reports')][contains(text(),'Audit Log')]");
By order=By.xpath("//a[contains(@class,'reports')][contains(text(),'Orders')]]");
By signedagreement=By.xpath("//a[contains(@class,'reports')][contains(text(),'Signed Agreements')]");
By subscription=By.xpath("//a[contains(@class,'reports')][contains(text(),'Subscriptions')]");
By billline=By.xpath("//a[contains(@class,'reports')][contains(text(),'Bill Lines')]");

By bills=By.xpath("//a[contains(@class,'reports')][contains(text(),'Bills')]");

By col1stdropdown=By.xpath("//div[@class='filter-field calendarField']//div[@class='filter-search-drop-arrow']");

By timeperiod=By.xpath("//select[@id='date[created_at][timePeriod][input]']");
By from=By.id("date[created_at][fromUnit][input]");
By to=By.id("date[created_at][toUnit][input]");




public WebElement getfrom()
{
	return driver.findElement(from);
}
public WebElement getapply()
{
	return driver.findElement(apply);
}

public WebElement getto()
{
	return driver.findElement(to);
}

public WebElement getdate()
{
	return driver.findElement(date);
}

public WebElement gettimeperiod()
{
	return driver.findElement(timeperiod);
}

public WebElement getColumn1stDropdown()
{
	return driver.findElement(col1stdropdown);
}


public WebElement getbill()
{
	return driver.findElement(bills);
}

public WebElement getorder()
{
	return driver.findElement(order);
}

public WebElement getsignedagreement()
{
	return driver.findElement(signedagreement);
}

public WebElement getsubscription()
{
	return driver.findElement(subscription);
}

public WebElement getbillline()
{
	return driver.findElement(billline);
}

	
public WebElement getauditlog()
{
	return driver.findElement(auditlog);
}

	



	public void email() throws IOException, InterruptedException
	{
		PDPCCM pp = new PDPCCM(driver);
		pp = new PDPCCM(driver);
	
		wait = new WebDriverWait(driver, 120);
		Actions ab =new Actions(driver);
		 Thread.sleep(5000);
		ab.click(driver.findElement(By.xpath("//a[@class='action-icon icon-mail']"))).release().perform();

		 Thread.sleep(5000);

		wait.until(ExpectedConditions.visibilityOf(pp.getemaillink()));
			Thread.sleep(5000);
			pp.getemaillink().click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOf(pp.getemailbox()));
			pp.getemailbox().sendKeys("saima.tabassum@arpatech.com");
			//Log.info("After clicking on the email link the email dialog box has open");
			wait.until(ExpectedConditions.elementToBeClickable(pp.getSendBtn()));
			
			pp.getSendBtn().click();
	   
	}
	
	
	
	
	//a[contains(text(),'Unselect All')]
	//a[@id='selectFields']
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
	
	
	public void DBConnection(String URL, String username , String pwd, String query) throws SQLException,ClassNotFoundException, IOException, InterruptedException
	{
		String a;
	
		Class.forName("com.mysql.jdbc.Driver");				
		Connection con = DriverManager.getConnection(URL,username,pwd);
		Statement stmt = con.createStatement();					
		ResultSet rs= stmt.executeQuery(query);							
		while (rs.next()){
			a = rs.getString(1);								        
			System. out.println("code ="+a);}		
		
		con.close();	
	//	String dbUrl = "jdbc:mysql://localhost:3306/database_sensitive";					
	//	String username = "homestead";	
	//	String password = "secret";					
		//String query = "select verification_code from signup_verification_token where email='" +email+  "';";	            
		
	}
	
	
	
}
