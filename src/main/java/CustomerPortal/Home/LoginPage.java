package CustomerPortal.Home;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

	public static WebDriver driver ;
	WebDriverWait wait;
	By Usernamefieldie=By.id("email");
	By Usernamefield=By.xpath("//input[@name='email']");

	//By Usernamefieldie=By.xpath("//input[@class='form-control' and @name='username' and @type='text']");
	//By Passwordfield=By.name("password");
	By cancel=By.xpath("//a[@class='btn' and text()='Cancel ']");
	By cancelchangepwd=By.xpath("//a[@class='btn pull-left' and text()='Cancel ']");

	By Passwordfield=By.xpath("//input[@id='password']");
	By un=By.xpath("//input[@id='email']");
	//By Passwordfieldie=By.xpath("//input[@class='form-control' and @name='password' and @type='password']");
	By Loginbtn=By.xpath("//button[@type='submit']");
	By Loginbtnie=By.cssSelector("button[type='submit']");
	//By Loginbtnie=By.xpath("//input[@class='login-btn btn-primary' and @type='submit' and @value='Login']");
	By alertmsgcontact=By.xpath("//div[@class='alert alert-success']");
	By Forget_Pswd=By.xpath("//a[@id='forgetUrl']");
	By sc=By.id("validation_code");
	By auth=By.xpath("//button[contains(text(),'Complete Authentication')]");
	
	
	By Create_Account=By.xpath("//a[text()='Create Account']");

	By Incorrect_Credentials = By.xpath("//div[@class='alert alert-danger ccp-alert-danger']");
	By Sbmt_Btn=By.xpath("//button[text()='Submit']");
	By emailfield = By.name("email");
	By ResetLink=By.xpath("//div[@role='alert']"); 
	By backlogin=By.xpath("//span[contains(text(),'Back to Login')]"); 
	By Gobacklogin=By.xpath("//span[contains(text(),'Go Back to Login')]"); 
	By contus=By.linkText("Contact Us");
	By priv=By.linkText("Privacy Policy");
	By tc=By.linkText("Terms of Use");
	By tc1=By.xpath("//div[@id='left-menubar']//a[contains(normalize-space(),'Terms of Use')]");
	By CreateAccount=By.linkText("Create Account");
	By fn=By.id("fname");
	By ln=By.id("lname");
	By ph=By.id("phone");
	By email=By.id("email");

	By msg=By.id("message");

	By submit=By.id("contact-submit");
	By verifyemail=By.linkText("Verify Email");
	By alertmsg=By.xpath("//span[@class='alert-msg']"); 


	By orgname=By.id("newOrganizationName");
	By Accountname=By.id("newCompanyName");
	By industrytype=By.id("industryTypes");
	By noofEmployees=By.id("companySizes");

	public LoginPage(WebDriver driver ) {
		// TODO Auto-generated constructor stub
		LoginPage.driver=driver;
	}
	public void alertmsgcontact(WebDriver driver ) {
		// TODO Auto-generated constructor stub
		Assert.assertEquals(driver.findElement(alertmsgcontact).getText(), "Message received, thank you for contacting us. We will respond to you shortly", "Message not sent");
		System.out.print("sfsff" +driver.findElement(alertmsgcontact).getText());
	}

	public WebElement Backloginpage(WebDriver driver ) {
		// TODO Auto-generated constructor stub
		return driver.findElement(backlogin);
	}
	
	public WebElement cancelchangepwd(WebDriver driver ) {
		// TODO Auto-generated constructor stub
		return driver.findElement(cancelchangepwd);
	}
	public WebElement GoBackloginpage(WebDriver driver ) {
		// TODO Auto-generated constructor stub
		return driver.findElement(Gobacklogin);
	}
	public WebElement getResetLink()
	{
		return driver.findElement(ResetLink);
	}

	public WebElement getalertmsgcontact()
	{
		return driver.findElement(alertmsgcontact);
	}
	public WebElement getSbmt_Btn()
	{
		return driver.findElement(Sbmt_Btn);
	}

	public WebElement getemailfield()
	{
		return driver.findElement(emailfield);
	}
	public WebElement verifyemail()
	{
		return driver.findElement(verifyemail);
	}

	public WebElement getIncorrect_Credentials()
	{
		return driver.findElement(Incorrect_Credentials);
	}

	public WebElement getCreate_Account()
	{
		return driver.findElement(Create_Account);
	}

	public WebElement getForget_Pswd()
	{
		return driver.findElement(Forget_Pswd);
	}

	public WebElement getusername()
	{
		return driver.findElement(Usernamefield);

	}
	public WebElement getusernameie()
	{
		return driver.findElement(Usernamefieldie);

	}
	public WebElement getloginbtnie()
	{
		return driver.findElement(Loginbtnie);

	}

	public WebElement getpassword()
	{
		return driver.findElement(Passwordfield);
	}
	public WebElement getsecretcode()
	{
		return driver.findElement(sc);
	}
	public WebElement getcompAuth()
	{
		return driver.findElement(auth);
	}
	
	public WebElement getun()
	{
		return driver.findElement(un);
	}

	public WebElement getloginbtn()
	{
		return driver.findElement(Loginbtn);
	}
	public WebElement contactus()
	{
		return driver.findElement(contus);
	}
	public WebElement privacy()
	{
		return driver.findElement(priv);
	}
	public WebElement termsconditions()
	{
		return driver.findElement(tc);
	}
	public WebElement termsconditions1()
	{
		return driver.findElement(tc1);
	}

	public void  sendmsg_contactus_cancel() throws IOException, InterruptedException
	{ wait = new WebDriverWait(driver, 120);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(fn)));  

	driver.findElement(fn).sendKeys("test1saima");
	Thread.sleep(3000);
	driver.findElement(ln).sendKeys("test1Tabassum");
	Thread.sleep(3000);
	driver.findElement(ph).sendKeys("033438473857");
	Thread.sleep(3000);
	driver.findElement(email).sendKeys("saima.tabassum@arpatech.com");
	Thread.sleep(3000);
	driver.findElement(msg).sendKeys("Hi, This is a test message");
	Thread.sleep(3000);
	driver.findElement(cancel).click();
	Thread.sleep(5000);

	}
	public void  sendmsg_contactus_submit() throws IOException, InterruptedException
	{ wait = new WebDriverWait(driver, 120);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(fn)));  

	driver.findElement(fn).sendKeys("test1saima");
	Thread.sleep(3000);
	driver.findElement(ln).sendKeys("test1Tabassum");
	Thread.sleep(3000);
	driver.findElement(ph).sendKeys("033438473857");
	Thread.sleep(3000);
	driver.findElement(email).sendKeys("saima.tabassum@arpatech.com");
	Thread.sleep(3000);
	driver.findElement(msg).sendKeys("Hi, This is a test message");
	Thread.sleep(3000);
	driver.findElement(submit).click();
	Thread.sleep(5000);

	}
	public void  enteremailInfo() throws IOException, InterruptedException
	{	 wait = new WebDriverWait(driver, 120);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(fn)));  

	driver.findElement(fn).sendKeys("test1saima");
	Thread.sleep(3000);
	driver.findElement(ln).sendKeys("test1Tabassum");
	Thread.sleep(3000);
	driver.findElement(ph).sendKeys("033438473857");
	Thread.sleep(3000);
	driver.findElement(email).sendKeys("saima.tabassum@arpatech.com");
	Thread.sleep(3000);
	driver.findElement(msg).sendKeys("Hi, This is a test message");
	Thread.sleep(3000);
	driver.findElement(submit).click();
	Thread.sleep(5000);

	}

}
