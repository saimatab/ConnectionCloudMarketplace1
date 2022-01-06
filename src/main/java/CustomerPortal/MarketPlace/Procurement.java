package CustomerPortal.MarketPlace;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Procurement {

	public WebDriver driver;
	
	public WebDriverWait wait;
	public Procurement(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	By City =By.id("ba_city");

	By State = By.id("ba_state");

	By Zip_Code=By.id("zipCode");
	By AddressField=By.id("addressLine1");
	By Phone=By.id("phone");
	By Savecont =By.xpath("//a[text()='Save']");
	By Catheading = By.xpath("//h2[text()='Edit Category']");
	By Tenancy=By.xpath("(//span[@class=\"step-title\"])[1]");
	By Address=By.xpath("//span[@class=\"step-title\" and text()='Address of Use']");
	By Payment = By.xpath("//span[@class=\"step-title\" and text()='Payment and Billing']");
	By Review_Order=By.xpath("//span[@class=\"step-title\" and text()='Review Order']");
	//By Continue1=By.xpath("//a[@class=\"btn btn-primary\" and text()='Continue']");
	
	By tenancycont=By.xpath("//form//a[@class='btn btn-primary'][contains(text(),'Continue')]");
	By Continue1=By.xpath("//div[@id='step3-form']//a[@class='btn btn-primary'][contains(text(),'Continue')]");
	By Continuea=By.xpath("//div[@id='step1-form']//a[text()='Continue']");
	By Continuestep1=By.xpath("//div[@id='step1']//a[text()='Continue']");
	By Continue13=By.xpath("//div[@id='step3-form']//a[text()='Continue']");
	By Continue132=By.xpath("//div[@id='step2-form']//a[text()='Continue']");
	By Continuestep4=By.xpath("//div[@id='step4-form']//a[text()='Continue']");
	By getaddress=By.name("selectedAddressOfUse");
	
	
	By Continue0=By.xpath("//div[@id='step1']//a[@class='btn btn-primary'][contains(text(),'Continue')]");
	By Continue2=By.xpath("//div[@id='step4-form']//a[@class='btn btn-primary']");
	By agree=By.xpath("//a[@class='btn btn-primary btn-lg-txt']");
	
	By agree1=By.xpath("//a[@class='btn btn-primary btn-lg-txt mb-app-btn']");
	
	
	//By Continue2=By.xpath("(//a[@class=\"btn btn-primary\" and text()='Continue'])[2]");
	//By Continue3=By.xpath("(//a[@class=\"btn btn-primary\" and text()='Continue'])[2]");
	By Submit_Order=By.xpath("//a[@class=\"btn btn-primary\" and text()='Submit Order']");
	By YesBtn=By.xpath("//a[text()='Yes I do']");
	By Sbmt_Order=By.xpath("//a[text()='Submit Order']");
	
	
	By addcard=By.xpath("//a[@class='btn btn-primary' and text()='Add Card']");

	By cardname = By.id("CCName");

	By cardno=By.id("accountNumber");
	By cardexpirymonth=By.id("expMonth");
	By cardexpiryyear=By.id("expYear");
	By cvv=By.id("cvv");
	By tid=By.id("tenant_id");
	By VerifyDomain=By.id("customField0");	
	By tenantname=By.id("tenant_name1");	
	By po=By.id("purchase_order");	
	public void selectbyvalue(WebElement locator, String text) throws IOException, InterruptedException{
		Select se2 = new Select(locator);
		se2.selectByValue(text);
		Thread.sleep(5000);
	}
	
	public WebElement getContinue() {
		return driver.findElement(Continue0);
	}
	public WebElement getContinue13() {
		return driver.findElement(Continue13);
	}
	public WebElement getContinue132() {
		return driver.findElement(Continue132);
	}
	public WebElement getstep4() {
		return driver.findElement(Continuestep4);
	}
	public WebElement getSbmt_Order() {
		return driver.findElement(Sbmt_Order);
	}
	public WebElement getYesBtn() {
		return driver.findElement(YesBtn);
	}
	public WebElement getverify_domain() {
		return driver.findElement(VerifyDomain);
	}
	public WebElement getverify_tenantname() {
		return driver.findElement(tenantname);
	}
	public WebElement getaddress() {
		return driver.findElement(getaddress);
	}
	public WebElement getagree() {
		return driver.findElement(agree);
	}
	public WebElement getagree1() {
		return driver.findElement(agree1);
	}
	public WebElement getSubmit_Order() {
		return driver.findElement(Submit_Order);
	}
	/*public WebElement getContinue3() {
		return driver.findElement(Continue3);
	}*/
	public WebElement getContinue2() {
		return driver.findElement(Continue2);
	}
	public WebElement getPo() {
		return driver.findElement(po);
	}
	
	public WebElement getContinue1() {
		return driver.findElement(Continue1);
	}
	public WebElement getContinue1a() {
		return driver.findElement(Continuea);
	}
	public WebElement getContinuestep() {
		return driver.findElement(Continuestep1);
	}
	public WebElement gettenancycont() {
		return driver.findElement(tenancycont);
	}
	public WebElement entertenantid() {
		return driver.findElement(tid);
	}
	public WebElement getAddress() {
		return driver.findElement(Address);
	}
	
	public WebElement getPayment() {
		return driver.findElement(Payment);
	}
	
	public WebElement getReview_Order() {
		return driver.findElement(Review_Order);
	}
	
	public WebElement getCatheading() {
		return driver.findElement(Catheading);
	}
	public WebElement getTenancy() {
		return driver.findElement(Tenancy);
	}
	//rp.entervalidBusinessInfo("Saima2025","Saima2025","Business in Retail","50-250","756 Concho Ln Houston TX 77084","Houston","TX","77084","233.343.4345");
	
	public void setbillingAddress(String address1, String city, String state, String zipcode,String phone) throws IOException, InterruptedException {
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(getAddressField()));
		getAddressField().sendKeys(address1);
	//	wait.until(ExpectedConditions.elementToBeClickable(getCity()));
		//getCity().sendKeys(city);
	//	wait.until(ExpectedConditions.elementToBeClickable(getState()));
	//	Select se2 = new Select(getState());
		//se2.selectByVisibleText(state);
		wait.until(ExpectedConditions.elementToBeClickable(getZip_Code()));
		getZip_Code().sendKeys(zipcode);
		wait.until(ExpectedConditions.elementToBeClickable(getPhone()));
		getPhone().sendKeys(phone);
		getsave().click();

		Thread.sleep(5000);
		
	}
	
	public void setCreditCard(String cardname, String cardno, String expirymonth, String expiryyear,String CVV) throws IOException, InterruptedException {
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(getcardname()));
		getcardname().sendKeys(cardname);
		wait.until(ExpectedConditions.elementToBeClickable(getcardno()));
		getcardno().sendKeys(cardno);
		
		wait.until(ExpectedConditions.elementToBeClickable(getZip_Code()));
		selectbyvalue(getcardexpirymonth(), expirymonth);
		wait.until(ExpectedConditions.elementToBeClickable(getPhone()));
		selectbyvalue(getcardexpiryyear(), expiryyear);
		wait.until(ExpectedConditions.elementToBeClickable(getPhone()));
		getcvv().sendKeys(CVV);
		wait.until(ExpectedConditions.elementToBeClickable(getPhone()));
		getaddcard().click();
	Thread.sleep(5000);

		
	}
	
	
	
	public WebElement getcardname() {
		return driver.findElement(cardname);
	}
	public WebElement getcardno() {
		return driver.findElement(cardno);
	}

	public WebElement getcardexpirymonth() {
		return driver.findElement(cardexpirymonth);
	}

	public WebElement getcardexpiryyear() {
		return driver.findElement(cardexpiryyear);
	}
	public WebElement getcvv() {
		return driver.findElement(cvv);
	}
	public WebElement getaddcard()
	{
		return driver.findElement(addcard);
	}
	
	
	
	public boolean isElementPresent(By locatorKey) {
	    try {
	        driver.findElement(locatorKey);
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
	
	
	
	
	public WebElement getAddressField() {
		return driver.findElement(AddressField);
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
	public WebElement getsave()
	{
		return driver.findElement(Savecont);
	}
	public void savecontinueclick() throws IOException, InterruptedException
	{
		wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.elementToBeClickable(getsavecontinue()));
		getsavecontinue().click();
		Thread.sleep(5000);
	}
}
