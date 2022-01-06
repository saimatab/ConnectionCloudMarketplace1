package CustomerPortal.Manage.Subscriptions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Subscriptions {

	public WebDriver driver;
	
	public Subscriptions(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By mngsubscription= By.xpath("//a[contains(text(),'Manage Subscription')]");
	By qty= By.xpath("//input[@name='productQty']");

	By updatesubscription= By.xpath("//a[@id='updateSubscription']");
	
	
	By cancelupdate= By.xpath("//button[contains(text(),'Cancel Update')]");
	
	
	By continueupdate= By.xpath("//button[contains(text(),'Continue with Update')]");
	
	
	By pdfdownload= By.xpath("//img[@class='pdf_download']");
	
	By Submitorder= By.xpath("//button[@class='btn btn-default btn-create-account btn-primary']");
	By mangesubscCTA= By.xpath("//a[contains(text(),'Manage Subscription')]");
	
	//By mangesubscCTA= By.xpath("//a[@class='btn btn-primary' and text()='Manage Subscription']");
	By contactusCTA=By.xpath("//a[@class='btn buy-again' and text()='Contact Us']");
	//By goproviderportalCTA=By.xpath("//a[@class='btn btn-primary'] and text()='Go to Provider Portal']");
	By buyagainCTA=By.xpath("//a[contains(text(),'Buy it Again')]");
	By contactCTA=By.xpath("//a[@class='btn btn-secondary margin-right-zero']");
			
			//a[@class='btn btn-secondary margin-right-zero']
    By goproviderportalCTA2
    =By.xpath("//a[contains(text(),'Go To Provider Portal')]");
	By historyCTA=By.xpath("//a[@class='btn'] and text()='View History']");
	
	By back=By.xpath("//span[@class='back-link'] and text()='Back to Subscriptions']");
	By subhistory=By.xpath("//h2[@class='section-title']] and text()='Subscription History']");

	public WebElement getcontactCTA() {
		return driver.findElement(contactCTA);
	}
	public WebElement getproviderportal1() {
		return driver.findElement(goproviderportalCTA2);
	}
	public WebElement getsubhistory() {
		return driver.findElement(subhistory);
	}
	
	public WebElement getback() {
		return driver.findElement(back);
	}
	
	public WebElement getmngsubsCTA() {
		return driver.findElement(mangesubscCTA);
	}
	public WebElement getprovidportal() {
		return driver.findElement(goproviderportalCTA2);
	}
	public WebElement getmngsubs() {
		return driver.findElement(mngsubscription);
	}
	public WebElement getsubmitorder() {
		return driver.findElement(Submitorder);
	}
	public WebElement getpdfdownload() {
		return driver.findElement(pdfdownload);
	}
	public WebElement getmngqty() {
		return driver.findElement(qty);
	}
	public WebElement getupdatesubscription() {
		return driver.findElement(updatesubscription);
	}
	public WebElement getcancelupdate() {
		return driver.findElement(cancelupdate);
	}
	public WebElement getcontupdate() {
		return driver.findElement(continueupdate);
	}

	
	
}
