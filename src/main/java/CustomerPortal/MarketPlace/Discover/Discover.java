package CustomerPortal.MarketPlace.Discover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Discover {

	public WebDriver driver;
	
	public Discover(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By Heading =By.xpath("//h1[@class='ccp-m-heading']");
	By Step1Title=By.xpath("(//span[@class='step-title'])[1]");
	By Step2Title=By.xpath("(//span[@class='step-title'])[2]");
	By ExpectedUserLink=By.id("ExpectedUsers");
	By ContinueBtn=By.xpath("//a[@title='Continue-btn']");
	By ContinueBtn1=By.xpath("//a[@class='btn btn-primary']");
	By savecont = By.xpath("//a[@class='btn btn-primary' and text()='Save & Continue']");
	By showres= By.xpath("//a[@class='btn btn-primary']");
	
	By LB= By.id("Load_Balancers");
	
	
	By Chkbox1=By.xpath("//label[contains(text(),'I need my solution delivered and managed from a ce')]");
	
	By Chkbox2=By.xpath("//label[contains(text(),'I need the solution accessible to my users on the')]");
	
	
	By Chkbox11=By.xpath("//label[contains(text(),'Provide users with tools to create, maintain,and c')]");
	
	By Chkbox22=By.xpath("//label[contains(text(),'Enable team collaboration and communication')]");
	
	
	By Chkbox111=By.xpath("//label[contains(text(),'I need self-service, on-demand, automated deployme')]");
	
	By Chkbox222=By.xpath("//label[contains(text(),'I need full control of my infrastructure while pur')]");
	
	By instance=By.xpath("//select[@id='instance_type']");
	By duration=By.xpath("//select[@id='contract_duration']");
	
	By pref=By.xpath("//p[contains(text(),'Your preferences did not match any service, please')]");

	
	By edit=By.xpath("//a[contains(text(),'Edit')]");
	By btype=By.xpath("//select[@id='BillingType']");

	By reqpurpoe=By.xpath("//tbody[1]//tr[5]//td[4]//span[1]//fieldset[1]//legend[1]//label[1]");
	
	By reqpurpoe1=By.xpath("//td[2]//span[1]//fieldset[1]//legend[1]//label[1]");

	By reqpurpbtn=By.xpath("//a[@class='btn btn-primary pull-right request-proposal-btn']");

	By btnprimaryreqpurposal=By.xpath("//input[@class='btn btn-primary']");
	By btnitemviewed=By.xpath("//div[@id='marketplace-content']//section[@id='recently-viewed-listing']//article[@class='list-title']//span[contains(text(),'Items you viewed')]");
	By COMPLSERVICES=By.xpath("//span[contains(text(),'COMPLEMENTARY DISCOVERY SERVICES')]");

	

	By restartdiscovery=By.xpath("//span[contains(text(),'Restart the Service Discovery Wizard')]");

	By textarea=By.xpath("//textarea[@id='ad_information']");

	public WebElement gettextarea() {
		return driver.findElement(textarea);
	}
	public WebElement getpref() {
		return driver.findElement(pref);
	}
	public WebElement getinstance() {
		return driver.findElement(instance);
	}
	public WebElement getduration() {
		return driver.findElement(duration);
	}
	public WebElement getCOMPSERVICES() {
		return driver.findElement(COMPLSERVICES);
	}
	public WebElement getitemviewed() {
		return driver.findElement(btnitemviewed);
	}
	public WebElement getbtnprimaryreqpurposal() {
		return driver.findElement(btnprimaryreqpurposal);
	}
	public WebElement getshowres() {
		return driver.findElement(showres);
	}
	
	
	public WebElement getContinueBtn() {
		return driver.findElement(ContinueBtn);
	}
	public WebElement getContinueBtn1() {
		return driver.findElement(ContinueBtn1);
	}

	public WebElement getreqpurpBtn() {
		return driver.findElement(reqpurpbtn);
	}
	
	public WebElement getreqpurcheck() {
		return driver.findElement(reqpurpoe1);
	}
	public WebElement getreqpurpoe() {
		return driver.findElement(reqpurpoe);
	}
	public WebElement getscBtn() {
		return driver.findElement(savecont);
	}
	public WebElement getbtype() {
		return driver.findElement(btype);
	}
	
	public WebElement getCheckbox2() {
		return driver.findElement(Chkbox1);
	}
	public WebElement getCheckbox1() {
		return driver.findElement(Chkbox2);
	}
	
	public WebElement getedit() {
		return driver.findElement(edit);
	}
	
	public WebElement getrestartdiscovery() {
		return driver.findElement(restartdiscovery);
	}
	
	
	public WebElement getCheckbox22() {
		return driver.findElement(Chkbox11);
	}
	public WebElement getCheckbox11() {
		return driver.findElement(Chkbox22);
	}
	
	
	
	
	public WebElement getCheckbox222() {
		return driver.findElement(Chkbox111);
	}
	
	public WebElement getCheckbox111() {
		return driver.findElement(Chkbox222);
	}
	
	
	
	
	public WebElement getExpectedUserLink() {
		return driver.findElement(ExpectedUserLink);
	}

	public WebElement getLB() {
		return driver.findElement(LB);
	}
	public WebElement getStep2Title() {
		return driver.findElement(Step2Title);
	}
	public WebElement getStep1Title() {
		return driver.findElement(Step1Title);
	}
	public WebElement getHeading() {
		return driver.findElement(Heading);
	}

	
}
