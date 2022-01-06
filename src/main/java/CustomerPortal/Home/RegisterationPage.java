package CustomerPortal.Home;

import java.io.IOException;

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

public class RegisterationPage {
	public WebDriver driver;
	WebDriverWait wait;
	//By email = By.xpath("//input[@id='email']");
	By Usernamefield=By.xpath("//input[@name='email']");

	By emailfield = By.id("email");
	By emailfield1 = By.id("Email");
	By Verify_email=By.xpath("//a[@class='btn btn-primary' and text()='Verify Email']");
	
	
	By Sbmt_Btn=By.xpath("//button[text()='Submit']");
	By Validation_Msg=By.xpath("//span[text()='Please provide your business email address']");

	//By orgname=By.id("newOrganizationName");
	By orgname=By.xpath("//div[@id='autosuggest']/div/input[@type='text']");
	By Accountname=By.id("newCompanyName");
	By industrytype=By.id("industryTypes");
	By noofEmployees=By.id("companySizes");
	

	By domainexistorgname=By.xpath("//div[@id='autosuggest']/div/input[@type='text']");
	By domainexistAccountname=By.id("companyName");
	By domainexistindustrytype=By.id("selectedIndustryType");
	By domainexistnoofEmployees=By.id("newCompanySizes");

	
	
	By Savecont =By.xpath("//a[text()='Save & Continue']");

	By City =By.id("ba_city");

	By State = By.id("ba_state");

	By Zip_Code=By.id("ba_zip_code");
	By AddressField=By.id("ba_address_line_1");
	By Phone=By.id("ba_phone");

	By SubmitBtn=By.xpath("//a[text()='Submit']");

	By ValidationMsg=By.xpath("//span[@class='alert-msg']");
	By Create_Account=By.xpath("//a[text()='Create Account']");


	By alertmsglogin=By.xpath("//a[contains(text(),'Login')]");
	By alertmsgresendcode=By.xpath("//a[contains(text(),'Resend verification code')]");
	By fn=By.id("FirstName");
	By ln=By.id("LastName");
	By ph=By.id("Phone");
	By jobtitle=By.id("JobTitle");
	By pwd=By.id("Password");

	By confirmpwd=By.id("ConfirmPassword");

	By email=By.id("email");
	By Gobacklogin=By.xpath("//span[contains(text(),'Go Back to Login')]");

	By ff1=By.xpath("//a[@class='btn' and contains(text(), 'No')]");
	
	By notlisted=By.xpath("//div[contains(text(),'My organization is not listed')]");
	By msg=By.id("message");
	By submit=By.id("contact-submit");
	By verifyemail=By.linkText("Verify Email");
	By alertmsg=By.xpath("//span[@class='alert-msg']"); 
	By alertforgot=By.xpath("//div[@class='alert alert-success ccp-alert-success']"); 
	By alertsuccessLoginpage=By.xpath("//div[@class='alert alert-success ccp-alert-success']"); 
	By alertmsgforgotpassword=By.xpath("//a[contains(text(),'Forgot Password')]");	
	By alertmsgforgotpasswordsubmit=By.xpath("//div[@class='alert alert-success ccp-alert-success']");	
	By cancel=By.xpath("//a[@class='btn' and text()='Cancel ']");
	By connectionlogoforgotpwdpage=By.xpath("//div[@class='col-12 p-0 mb-4 ccp-logo']//img[@class='ccp-logo']"); 

	By alertmsgcontact=By.xpath("//div[@class='alert alert-success']");
	By verifycode=By.id("code");
	By verifycodeBtn=By.linkText("Verify");
	By agreement=By.id("agreement");

	public RegisterationPage(WebDriver driver)
	{
		this.driver=driver;

	}

	public WebElement getemail()
	{
		return driver.findElement(email);
	}

	public WebElement getVerify_btn()
	{
		return driver.findElement(Verify_email);
	}

	public WebElement getValidation_Msg()
	{
		return driver.findElement(Validation_Msg);
	}

	public WebElement getorgname() {
		// TODO Auto-generated constructor stub
		return driver.findElement(orgname);
	}
	public WebElement getacctname() {
		// TODO Auto-generated constructor stub
		return driver.findElement(Accountname);
	}

	public WebElement getindustrytype() {
		// TODO Auto-generated constructor stub
		return driver.findElement(industrytype);
	}

	public WebElement getnoEmployees() {
		// TODO Auto-generated constructor stub
		return driver.findElement(noofEmployees);
	}

	public WebElement getSubmitBtn() {
		return driver.findElement(SubmitBtn);
	}

	public WebElement getAddressField() {
		return driver.findElement(AddressField);
	}
	public WebElement getfn() {
		return driver.findElement(fn);
	}
	public WebElement getln() {
		return driver.findElement(ln);
	}
	public WebElement getph() {
		return driver.findElement(ph);
	}
	public WebElement getjobtitle() {
		return driver.findElement(jobtitle);
	}
	public WebElement getpwd() {
		return driver.findElement(pwd);
	}
	public WebElement getconfirmpwd() {
		return driver.findElement(confirmpwd);
	}
	public WebElement getCity() {
		return driver.findElement(City);
	}

	public WebElement getState() {
		return driver.findElement(State);
	}

	public WebElement getZip_Code() {
		return driver.findElement(Zip_Code);
	}
	public WebElement getPhone() {
		return driver.findElement(Phone);
	}
	public WebElement getsavecontinue()
	{
		return driver.findElement(Savecont);
	}
	
	public WebElement getorgnamedomainexist() {
		// TODO Auto-generated constructor stub
		return driver.findElement(domainexistorgname);
	}
	public WebElement getacctnamedomainexist() {
		// TODO Auto-generated constructor stub
		return driver.findElement(domainexistAccountname);
	}

	public WebElement getindustrytypedomainexist() {
		// TODO Auto-generated constructor stub
		return driver.findElement(domainexistindustrytype);
	}

	public WebElement getnoEmployeesdomainexist() {
		// TODO Auto-generated constructor stub
		return driver.findElement(domainexistnoofEmployees);
	}

	
	public void visibilityofAlert(String text) throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 180);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(alertmsg));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(alertmsg, text));
		Thread.sleep(5000);
	
	}
	public void visibilityofAlertLoginpage(String text) throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 180);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(alertmsg));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(alertsuccessLoginpage, text));
		Thread.sleep(5000);
	
	}
	public void enterUserInfo(String fn, String ln, String phone, String jobtitle,String pwd,String confirmpwd) throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.elementToBeClickable(getfn()));
		getfn().sendKeys(fn);
		wait.until(ExpectedConditions.elementToBeClickable(getln()));
		getln().sendKeys(ln);
		wait.until(ExpectedConditions.elementToBeClickable(getph()));		
		getph().sendKeys(phone);
		wait.until(ExpectedConditions.elementToBeClickable(getjobtitle()));	
		Select se = new Select(getjobtitle());
		Thread.sleep(3000);
		se.selectByVisibleText(jobtitle);
		wait.until(ExpectedConditions.elementToBeClickable(getpwd()));
		getpwd().sendKeys(pwd);
		wait.until(ExpectedConditions.elementToBeClickable(getconfirmpwd()));
		getconfirmpwd().sendKeys(confirmpwd);
		savecontinueclick();
		Thread.sleep(5000);
	}
	public void savecontinueclick() throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 120);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(getsavecontinue()));
		Thread.sleep(5000);
		getsavecontinue().click();
		Thread.sleep(5000);
	}
	public void AgreeCSA() throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 120);
		//wait.until(ExpectedConditions.elementToBeClickable(getagreement()));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(agreement));
		getagreement().click();
		Thread.sleep(5000);
	}
	public void enterBusinessInfo(String orgname, String actname, String industype, String noEmployees,String address1, String city, String state, String zipcode,String phone) throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(getorgname()));
		getorgname().sendKeys(orgname);
		wait.until(ExpectedConditions.elementToBeClickable(getacctname()));
		getacctname().sendKeys(actname);
		wait.until(ExpectedConditions.elementToBeClickable(getindustrytype()));
		Select se = new Select(getindustrytype());
		se.selectByVisibleText(industype);
		wait.until(ExpectedConditions.elementToBeClickable(getnoEmployees()));
		Select se1 = new Select(getnoEmployees());
		se1.selectByVisibleText(noEmployees);
		wait.until(ExpectedConditions.elementToBeClickable(getAddressField()));
		getAddressField().sendKeys(address1);
		wait.until(ExpectedConditions.elementToBeClickable(getCity()));
		getCity().sendKeys(city);
		wait.until(ExpectedConditions.elementToBeClickable(getState()));
		Select se2 = new Select(getState());
		se2.selectByVisibleText(state);
		wait.until(ExpectedConditions.elementToBeClickable(getZip_Code()));
		Select se3= new Select(getZip_Code());
		se3.selectByVisibleText(zipcode);
		wait.until(ExpectedConditions.elementToBeClickable(getPhone()));
		getPhone().sendKeys(phone);
		savecontinueclick();
		Thread.sleep(5000);
	}

	public void enterBusinessInfoDomainexist(String orgname, String actname, String industype, String noEmployees,String address1, String city, String state, String zipcode,String phone) throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 120);
	
		wait.until(ExpectedConditions.elementToBeClickable(getacctnamedomainexist()));
		getacctnamedomainexist().sendKeys(actname);
	
		savecontinueclick();
	       Thread.sleep(5000);
	}
	public void enterInvalidBusinessInfo(String orgname, String actname, String industype, String noEmployees,String address1, String city, String state, String zipcode,String phone) throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(getorgname()));
		getorgname().sendKeys(orgname);
		wait.until(ExpectedConditions.elementToBeClickable(getacctname()));
		getacctname().sendKeys(actname);
		wait.until(ExpectedConditions.elementToBeClickable(getindustrytype()));
		Select se = new Select(getindustrytype());
		se.selectByVisibleText(industype);
		wait.until(ExpectedConditions.elementToBeClickable(getnoEmployees()));
		Select se1 = new Select(getnoEmployees());
		se1.selectByVisibleText(noEmployees);
		wait.until(ExpectedConditions.elementToBeClickable(getAddressField()));
		getAddressField().sendKeys(address1);
		wait.until(ExpectedConditions.elementToBeClickable(getCity()));
		getCity().sendKeys(city);
		wait.until(ExpectedConditions.elementToBeClickable(getState()));
		Select se2 = new Select(getState());
		se2.selectByVisibleText(state);
		wait.until(ExpectedConditions.elementToBeClickable(getZip_Code()));
		getZip_Code().sendKeys(zipcode);
		wait.until(ExpectedConditions.elementToBeClickable(getPhone()));
		getPhone().sendKeys(phone);
		savecontinueclick();
		visibilityofAlert("Account name already exists");
		
		Assert.assertEquals(getalertverifyemail().getText(), "Account name already exists", "alert text not match");
		Thread.sleep(5000);
	}
	
	public void entervalidBusinessInfo(String orgname, String actname, String industype, String noEmployees,String address1, String city, String state, String zipcode,String phone) throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 120);
		Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(getorgname()));
		getorgname().sendKeys(orgname);
		wait.until(ExpectedConditions.elementToBeClickable(getacctname()));
		getacctname().sendKeys(actname);
		wait.until(ExpectedConditions.elementToBeClickable(getindustrytype()));
		Select se = new Select(getindustrytype());
		se.selectByVisibleText(industype);
		wait.until(ExpectedConditions.elementToBeClickable(getnoEmployees()));
		Select se1 = new Select(getnoEmployees());
		se1.selectByVisibleText(noEmployees);
		wait.until(ExpectedConditions.elementToBeClickable(getAddressField()));
		getAddressField().sendKeys(address1);
		//wait.until(ExpectedConditions.elementToBeClickable(getCity()));
		//getCity().sendKeys(city);
		//wait.until(ExpectedConditions.elementToBeClickable(getState()));
		//Select se2 = new Select(getState());
		//se2.selectByVisibleText(state);
		wait.until(ExpectedConditions.elementToBeClickable(getZip_Code()));
		Thread.sleep(4000);
		getZip_Code().sendKeys(zipcode);
		
		
		
		
		
		Thread.sleep(7000);
		
	 CommonFunctions cf;
		cf= new CommonFunctions(driver);
	
		By usediffshipAddress11=By.xpath("//input[@id='ba_city']");
		
		WebElement  j=driver.findElement(By.xpath("//input[@id='ba_zip_code']"));
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
		
		
		
		
		
		
		
		
		
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(getPhone()));
		getPhone().sendKeys(phone);
		Thread.sleep(7000);
		savecontinueclick();
	Thread.sleep(5000);
	}
	
	public void Subcriptionsavecontinue() throws IOException, InterruptedException
	{
	
		savecontinueclick();
	Thread.sleep(5000);
	}
	public void enterInvalidBusinessInfoDomainexist(String orgname, String actname, String industype, String noEmployees,String address1, String city, String state, String zipcode,String phone) throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(getorgnamedomainexist()));
		getorgnamedomainexist().sendKeys(orgname);
		getorgnamedomainexist().sendKeys(Keys.TAB);
		getorgnamedomainexist().sendKeys(Keys.ENTER);
	
		wait.until(ExpectedConditions.elementToBeClickable(getacctnamedomainexist()));
		getacctnamedomainexist().sendKeys(actname);
		wait.until(ExpectedConditions.elementToBeClickable(getindustrytypedomainexist()));
		Select se = new Select(getindustrytypedomainexist());
		se.selectByVisibleText(industype);
		wait.until(ExpectedConditions.elementToBeClickable(getnoEmployeesdomainexist()));
		Select se1 = new Select(getnoEmployeesdomainexist());
		se1.selectByVisibleText(noEmployees);
		wait.until(ExpectedConditions.elementToBeClickable(getAddressField()));
		getAddressField().sendKeys(address1);
		/*wait.until(ExpectedConditions.elementToBeClickable(getCity()));
		getCity().sendKeys(city);
		wait.until(ExpectedConditions.elementToBeClickable(getState()));
		Select se2 = new Select(getState());
		se2.selectByVisibleText(state);*/
		wait.until(ExpectedConditions.elementToBeClickable(getZip_Code()));
		getZip_Code().sendKeys(zipcode);
		Thread.sleep(60000);
		
		//By usediffshipAddress11=By.xpath("//input[@id='ba_city']");
		
	

	//	WebDriverWait wait1 = new WebDriverWait(driver, 180);
		//wait1.until(ExpectedConditions.visibilityOfElementLocated(usediffshipAddress11));
		//Thread.sleep(6000);
		
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(getPhone()));
		Thread.sleep(8000);
		getPhone().sendKeys(phone);
		Thread.sleep(3000);
		savecontinueclick();
		Thread.sleep(3000);
	//	visibilityofAlert("Company name already exists");
		Thread.sleep(3000);
		Assert.assertEquals(getalertverifyemail().getText(), "Account name already exists", "alert text not match");
		Thread.sleep(5000);
	}
	
	
	
	
	
	public void checkCreationAccountDisabled()throws IOException, InterruptedException
	{
		
		try
		{
		getCreate_Account();
		}
		catch(NoSuchElementException e )
		{
		//nothing
		}
	}
	public WebElement getalertaccountalreadyexist()
	{
		return driver.findElement(alertmsg);
	}
	public WebElement getalertsuccessLoginpage()
	{
		return driver.findElement(alertsuccessLoginpage);
	}
	public WebElement getalertverifyemail()
	{
		return driver.findElement(alertmsg);
	}
	public WebElement getalertforgotemail()
	{
		return driver.findElement(alertforgot);
	}
	public WebElement getalertforgot()
	{
		return driver.findElement(alertforgot);
	}
	public WebElement getverificationcode()
	{
		return driver.findElement(verifycode);
	}
	public WebElement getCreate_Account()
	{
		return driver.findElement(Create_Account);
	}

	public WebElement GoBackloginpage(WebDriver driver ) {
		// TODO Auto-generated constructor stub
		return driver.findElement(Gobacklogin);
	}


	public void  check_forgotpassword_links_from_alertmsg(String username) throws IOException, InterruptedException
	{ wait = new WebDriverWait(driver, 120);


	driver.findElement(alertmsgforgotpassword).click();
	wait.until(ExpectedConditions.titleContains("Forgot Password - CCM"));
	String TitleHome2 = driver.getTitle();

	Assert.assertEquals(TitleHome2, "Forgot Password - CCM", "User is not being able to reach  forgotpassword page");

	String name = driver.findElement(emailfield1).getAttribute("value");
	Thread.sleep(3000);
	Assert.assertEquals(name, username, "email address feild not prefilled with desired value");
	Thread.sleep(3000);
	driver.findElement(Sbmt_Btn).click();
	
	Assert.assertEquals(driver.findElement(alertmsgforgotpasswordsubmit).getText(), "A password reset link has been emailed to your email account on file. Please check your email", "password reset link alert not sent");
	Thread.sleep(5000);

	GoBackloginpage(driver).click();

	Assert.assertEquals(driver.getTitle(), "Login - CCM", "User is not being able to Login to the application");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.findElement(Sbmt_Btn).click();
	Thread.sleep(3000);
	driver.findElement(connectionlogoforgotpwdpage).click();
	Thread.sleep(3000);
	Assert.assertEquals(driver.getTitle(), "Login - CCM", "User is not being able to Login to the application");

	}
	public void  checklogin_links_from_alertmsg(String username) throws IOException, InterruptedException
	{ wait = new WebDriverWait(driver, 120);
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(alertmsglogin)));

	driver.findElement(alertmsglogin).click();
	wait.until(ExpectedConditions.titleContains("Login - CCM"));

	Assert.assertEquals(driver.getTitle(), "Login - CCM", "User is not being able to Login to the application");

	String name = driver.findElement(Usernamefield).getAttribute("value");
	Thread.sleep(3000);
	Assert.assertEquals(name, username, "email address field not prefilled with desired value");
	}
	public void  enteremailInfo(String email) throws IOException, InterruptedException
	{ wait = new WebDriverWait(driver, 120);

	wait.until(ExpectedConditions.titleContains("Create Account - CCM"));
	Thread.sleep(5000);
	wait.until(ExpectedConditions.elementToBeClickable(getemailfield()));
	Thread.sleep(5000);
	getemailfield().sendKeys(email);
	Thread.sleep(5000);
	verifyemail().click();

	}

	public void  createAccountclickonRegPage(String em) throws IOException, InterruptedException
	{ wait = new WebDriverWait(driver, 120);
	wait.until(ExpectedConditions.elementToBeClickable(getCreate_Account()));

	getCreate_Account().click();

	Thread.sleep(5000);
	wait.until(ExpectedConditions.titleContains("Login - CCM"));
	String TitleHome2 = driver.getTitle();

	Assert.assertEquals(TitleHome2, "Login - CCM", "User is not being able to reach  login page");
	String name = driver.findElement(email).getAttribute("value");
	Thread.sleep(3000);
	
	Assert.assertEquals(name, em, "email address feild not prefilled with desired value");
	Thread.sleep(3000);
	visibilityofAlertLoginpage("Account created successfully Please login.");
	Assert.assertEquals(getalertsuccessLoginpage().getText(), "Account created successfully Please login.", "alert text not match");
	Thread.sleep(3000);

	}
	public void  createAccountclickRegPageBySelectOrg() throws IOException, InterruptedException
	{ wait = new WebDriverWait(driver, 120);
	wait.until(ExpectedConditions.elementToBeClickable(getCreate_Account()));
	getCreate_Account().click();
	Thread.sleep(10000);
	RegisterationPage rp=new RegisterationPage(driver);
	
	Assert.assertEquals(rp.getalertverifyemail().getText(), "Your account request is sent to the Account Administrator. You will be notified once it is processed", "alert text not match");
	
	//visibilityofAlert("Your account request is sent to the Account Administrator. You will be notified once it is processed.");
	Thread.sleep(3000);

	}

	public void click_resendcodeLinkInAlert() throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(alertmsgresendcode)));

		driver.findElement(alertmsgresendcode).click();
		Thread.sleep(5000);

	}

	public void entercode(String code) throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 120);
		Thread.sleep(5000);

		wait.until(ExpectedConditions.elementToBeClickable(getverificationcode()));
		getverificationcode().sendKeys(code);
		wait.until(ExpectedConditions.elementToBeClickable(getverifycodeBtn()));
		getverifycodeBtn().click();
		Thread.sleep(5000);


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
	public WebElement getverifycodeBtn()
	{
		return driver.findElement(verifycodeBtn);
	}
	public WebElement getagreement()
	{
		return driver.findElement(agreement);
	}
	
	public WebElement getnotlistedlabel()
	{
		return driver.findElement(notlisted);
	}

	public WebElement getorgradio(String row)

	{
		String orgradio="//input[@name='organization' and @value='" + row +"']";
		By orgradio1=By.xpath(orgradio);

		return driver.findElement(orgradio1);
	}

	public void enterBusinessInfoBySelectOrg(String row) throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 120);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(getorgradio(row)));
		Thread.sleep(3000);
		getorgradio(row).click();
		Thread.sleep(3000);
		savecontinueclick();

		Thread.sleep(5000);
	}
	public void visibilityofAlertforgot(String text) throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 180);
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(alertmsg));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(alertforgot, text));
		Thread.sleep(5000);
	
	}

}
