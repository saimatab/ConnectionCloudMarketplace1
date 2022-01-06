package CustomerPortal.MarketPlace;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Payment {

	public WebDriver driver;
	
	public Payment(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By ChangeBtn = By.xpath("//a[contains(text(),'Change Payment Method')]");
	
	By AddCreditBtn=By.id("show-credit-card-iframe");
	//By cardno = By.xpath("//iframe[@id='eProtect-iframe']//section[@id='PaymentApp']//div[@class='modal-mask']//input[@id=accountNumber]");
	
By cardno = By.id("accountNumber");//iframe[@id='eProtect-iframe']
	
	
	//form[@id='fCheckout']
	//By cardno = By.xpath("//section[@id='PaymentApp']//form[@id='fCheckout']//iframe[@id='eProtect-iframe']//input[@id=accountNumber]");
	
	By namecard=By.id("show-credit-card-iframe");
	By reqnet= By.xpath("//a[contains(text(),'Request Net Terms')]");

	By cardexpiry1= By.name("expMonth");
	By cardexpiry2= By.id("expYear");
	By cvv= By.id("cvv");
	By savecard= By.xpath("//a[contains(text(),'Save Card')]");
	
	By savecard1=By.xpath("//a[@class='btn btn-primary pull-left' and text()='Save']");;
	
	By cancel=By.xpath("//a[@class='btn pull-left' and text()='Cancel']");;
	By usedifferentcc=By.xpath("//a[contains(text(),'Use a different credit card')]");;

	By dunsno=By.xpath("//input[@id='business-duns-number']");;

	By savecont=By.xpath("//a[@class='btn btn-primary' and text()='Save & Continue']");;

	By submitreq=By.xpath("//a[@class='btn btn-primary' and text()='Submit Request']");;
	By cancel1net=By.xpath("//a[@class='btn' and text()='Cancel']");;

	By BAChecbox=By.xpath("//input[@id='billing-copyFormBusiness']");;
   By alert =By.xpath("//p[contains(text(),'A request for Net Terms is pending for this account. Please Contact Us for assistance.')]");;
   By alert1 =By.xpath("//p[contains(text(),'Your payment method cannot be changed from Net Ter')]");;
   By contactus =By.xpath("//p[contains(text(),'//p[contains(text(),'A request for Net Terms is pending for this account. Please Contact Us for assistance.')]')]//a[contains(text(),'Contact Us')]");;
   By desc =By.xpath("//textarea[@id='_requestDetail']");;
	By submitcontact=By.xpath(" //a[contains(text(),'Submit')]");; 
	
	By BAadl=By.xpath("//input[@id='addressLine1']");; 
	
	By BAzip=By.xpath("//input[@id='zipCode']");; 
	By BAph=By.xpath("//input[@id='phone']");; 
	//a[@class='btn btn-primary pull-left']
	//input[@id='zipCode']
	By BASave=By.xpath("//a[contains(text(),'Save')]");;
	By ccid = By.id("CCName");
	
	
	
	
	
	public WebElement getBAad1() {
		return driver.findElement(BAadl);
	}
	
	public WebElement getBAzip() {
		return driver.findElement(BAzip);
	}
	public WebElement getBAph() {
		return driver.findElement(BAph);
	}
	
	public WebElement getBASave() {
		return driver.findElement(BASave);
	}
	
	
	
	public WebElement getccid() {
		return driver.findElement(ccid);
	}
	
	public WebElement desc() {
		return driver.findElement(desc);
	}
	
	public WebElement submitcontact() {
		return driver.findElement(submitcontact);
	}
	
	
	public WebElement alertpending() {
		return driver.findElement(alert);
	}
	public WebElement alertpending1() {
		return driver.findElement(alert1);
	}
	public WebElement contactus() {
		return driver.findElement(contactus);
	}
	
	public void chckbtndisabled() {
		Boolean isbutton;
		isbutton=driver.findElement(By.xpath("//a[contains(text(),'Request Net Terms')]")).isEnabled();
			if (isbutton=false)	
			{
				System.out.print("btndisabled");
				
			}
				
				
	}
	public WebElement Checbox() {
		return driver.findElement(BAChecbox);
	}
	public WebElement getcancel1net() {
		return driver.findElement(cancel1net);
	}
	

	public WebElement getdunsno() {
		return driver.findElement(dunsno);
	}
	public WebElement getdsubreq(){ 
		return driver.findElement(submitreq);
	}
	
	public WebElement getsavecont() {
		return driver.findElement(savecont);
	}
	
	public WebElement getusediffcc() {
		return driver.findElement(usedifferentcc);
	}
	
	public WebElement getsavecard1() {
		return driver.findElement(savecard1);
	}
	
	public WebElement getcanecl() {
		return driver.findElement(cancel);
	}
	
	
	public WebElement getsave() {
		return driver.findElement(savecard);
	}
	
	public WebElement getcvv() {
		return driver.findElement(cvv);
	}
	public WebElement getreqNet() {
		return driver.findElement(reqnet);
	}
	public WebElement getcardNameField() {
		return driver.findElement(namecard);
	}

	public WebElement getcardno() {
		return driver.findElement(cardno);
	}

	public WebElement getcardmonthexpiry() {
		return driver.findElement(cardexpiry1);
	}

	public WebElement getcardyearexpiry() {
		return driver.findElement(cardexpiry2);
	}



	public WebElement getAddCreditBtn() {
		return driver.findElement(AddCreditBtn);
	}
	
	public WebElement getChangeBtn() {
		return driver.findElement(ChangeBtn);
	}
	public WebElement getreqnetterms() {
		return driver.findElement(reqnet);
	}
}
