package CustomerPortal.Home;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

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

import CustomerPortal.Insights.Reports.auditlog;
import CustomerPortal.MarketPlace.PDPCCM;



public class CommonFunctions {

	public WebDriver driver;
	WebDriverWait wait;
	public CommonFunctions(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	By selectfields=By.xpath("//a[@id='selectFields']");
	//By Column1stDropdown=By.xpath("(//div[@class='filter-search-drop-arrow active'])[3]");
	By Column1stDropdown=By.xpath(" //div[@class='filter-search-drop-arrow active']");
	By export=By.xpath("//a[@id='export']");
	
	By printpreviewcolorsettings=By.xpath("//print-preview-settings-section[@class='md-select'])");
	
	By  NotAccessible=By.xpath("//h1[contains(text(),'Well this is awkward.')]");
	By  NotAccessible1=By.xpath("//span[contains(text(),'404')]");
	
	//By APCRow=By.xpath("(//span[@class='control__indicator'])[1]");
	By billRow1=By.xpath("//span[contains(text(),'Microsoft CSP')]");
	
	By billRow=By.xpath("//span[contains(text(),'Corp. CSP Microsoft 365 E3')]");
	
    By filtersearchicon=By.xpath("//body/div[@id='reports-content']/div/div[@class='content']/section[@class='table-container container']/table[@class='mobile-table']/thead/tr/th[4]/div[1]/div[1]");
    		
 
    		//body/div[@id='reports-content']/div/div[@class='content']/section[@class='table-container container']/table[@class='mobile-table']/thead/tr/th[4]/div[1]/div[1]
	//By ApplyBtn=By.xpath("(//a[text()='Apply'])[1]");
	
	By ApplyBtn=By.xpath("	//div[@class='filter-search-drop-arrow active']//div[@class='filter-drop-down-container shift-left']//div//a[@class='btn btn-primary left-btn'][contains(text(),'Apply')]");
	
	By cp1=By.xpath("//input[@id='current_page']");

	//input[@id='current_page']
	By exportoptions=By.xpath("//select[@id='options']");
	By allpages=By.xpath("//input[@id='all_pages']");
	By currpage=By.xpath("//input[@id='current_page']");
	By clearresetall=By.xpath("//a[contains(text(),'Clear/Reset All')]");

	By exportreport=By.xpath("//button[contains(text(),'Export Report')]");

	By printcancelbtn=By.xpath("(//cr-button[@class='cancel-button'])");
	By exportcancel=By.xpath("//body/div[7]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[2]");
	
	By proviname=By.xpath("//html//body//div//div//div//div//div//div//div//div//div//div//ul//li//label[contains(text(),'Provider Name')]//span");

	By unselectall=By.xpath("//a[contains(text(),'Unselect All')]");
	By selectall=By.xpath("//a[@class='btn left-btn' and text()='Select All']");

	By searchdisplay=By.xpath("//input[@id='SelectFieldsToDisplay']");

	By apply=By.xpath("//button[contains(text(),'Apply')]");

	By cancel=By.xpath("//button[contains(text(),'Cancel')]");

	 //button[contains(text(),'Apply')]

	public WebElement getbillRow()
	{
		return driver.findElement(billRow);
	}
	public WebElement getbillRow1()
	{
		return driver.findElement(billRow1);
	}
	public WebElement getprintcancel()
	{
		return driver.findElement(printcancelbtn);
	}
	public WebElement getprintprview()
	{
		return driver.findElement(printpreviewcolorsettings);
	}
	public WebElement getnotaccess()
	{
		return driver.findElement(NotAccessible);
	}
	public WebElement getnotaccess1()
	{
		return driver.findElement(NotAccessible1);
	}
	public WebElement getapply()
	{
		return driver.findElement(apply);
	}
	public WebElement getcancel()
	{
		return driver.findElement(cancel);
	}
	public WebElement getfiltersearchicon()
	{
		return driver.findElement(filtersearchicon);
	}
	public WebElement getselectfeilds()
	{
		return driver.findElement(selectfields);
	}
	public WebElement getColumn1stDropdown()
	{
		return driver.findElement(Column1stDropdown);
	}
	
	public WebElement getsearchDisplay()
	{
		return driver.findElement( searchdisplay);
	}
	public WebElement getselectall()
	{
		return driver.findElement(selectall);
	}
	
	public WebElement getunselectall()
	{
		return driver.findElement(unselectall);
	}
	public WebElement getresetall()
	{
		return driver.findElement(clearresetall);
	}

	public WebElement getApplyBtn()
	{
		return driver.findElement(ApplyBtn);
	}
	public WebElement getexportreport()
	{
		return driver.findElement(exportreport);
	}
	
	public WebElement getexportcancel()
	{
		return driver.findElement(exportcancel);
	}
	public WebElement getprovname()
	{
		return driver.findElement(proviname);
	}
	
	
	public WebElement getexport()
	{
		return driver.findElement(export);
	}

	public WebElement getexportoption()
	{
		return driver.findElement(exportoptions);
	}	
	public WebElement getcurrentpage()
	{
		return driver.findElement(currpage);
	}
	public WebElement getallpages()
	{
		return driver.findElement(allpages);
	}
	
	
	public void export() throws IOException, InterruptedException
	{
	
	 CommonFunctions cf;
		cf= new CommonFunctions(driver);
		wait = new WebDriverWait(driver, 120);
		Actions ab =new Actions(driver);
		 Thread.sleep(3000);
		 wait.until(ExpectedConditions.elementToBeClickable(cf.getexport()));

		 cf.getexport().click();
		 Thread.sleep(3000);
	

		 cf.getexportreport().click();
		// driver.navigate().back();
		// wait.until(ExpectedConditions.elementToBeClickable(cf.getexport()));

		// cf.getexport().click();
		 Thread.sleep(3000);
	
		 
		 Select Se = new Select(cf.getexportoption());
			Thread.sleep(2000);
			Se.selectByIndex(1);
			Thread.sleep(2000);
			cf.getcurrentpage().click();
			Thread.sleep(2000);
			 cf.getexportreport().click();
				Thread.sleep(2000);
	cf.getexportcancel().click();
				Thread.sleep(2000);
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

		//wait.until(ExpectedConditions.visibilityOf(pp.getemaillink()));
			//Thread.sleep(5000);
			//pp.getemaillink().click();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.visibilityOf(pp.getemailbox()));
			pp.getemailbox().sendKeys("saima.tabassum@arpatech.com");
			//Log.info("After clicking on the email link the email dialog box has open");
			wait.until(ExpectedConditions.elementToBeClickable(pp.getSendBtn()));
			
			pp.getSendBtn().click();
	   
	}
	
	
	
	public void print() throws IOException, InterruptedException
	{

		wait = new WebDriverWait(driver, 120);
		Actions ab =new Actions(driver);
		 Thread.sleep(5000);
		 WebElement  a=driver.findElement(By.xpath("//a[@class='action-icon icon-print']"));
		 a.click();
		//ab.click(driver.findElement(By.xpath("//a[@class='action-icon icon-print']"))).release().perform();
		 Thread.sleep(5000);
		//	Select Se = new Select(getprintprview());
		//	Thread.sleep(5000);
		//	Se.selectByIndex(2);
			
			getprintcancel().click();
			//driver.switchTo().window(OldTab);
	}
	
	
	
	
	public void matchHeaders(String[] strArray) throws IOException, InterruptedException
	{
		
		
		 for(int i = 0; i < strArray.length; i++ ){
			 By show0=By.xpath(strArray[i]);
				if(isElementPresent(show0))
				{
					

				}
		    }
		
		
	   
	}
	
	
		
		
	   
	
	
	//a[contains(text(),'Unselect All')]
	//a[@id='selectFields']
	public void gotoURL(String url) throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 120);
	    driver.navigate().to(url);
	    
	 		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "Login - CCM", "User is not being able to Signout from the application");
	   
	}
	public void gotoURL1(String url) throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 120);
	    driver.navigate().to(url);
	    
	 
	   
	}
	public void loginapp(String dburl1,String dbun,String dbpwd) throws IOException, InterruptedException ,ClassNotFoundException,SQLException
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
	

Thread.sleep(5000);
			String email11=prop.getProperty("username_cust1");
			String query = "select two_factor_code from users where email='" +email11+  "';";	            
			Class.forName("com.mysql.jdbc.Driver");				
			Connection con = DriverManager.getConnection(dburl1,dbun,dbpwd);
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
	
	
	public boolean isElementPresent(By locatorKey) {
	    try {
	        driver.findElement(locatorKey);
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
}
