package CustomerPortal.Home;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Address {

	public WebDriver driver;
	WebDriverWait wait;
	public Address(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By Heading = By.xpath("//h1[text()='Address of Use']");
	
	By RequestAddressBtn = By.xpath("//a[@class='btn btn-primary' and text()='Request Address of Use Change']");
	
	By AddressField=By.id("address_line_1");
	
	By City =By.id("city");
	By address=By.id("address_line_1");
	
	By State = By.id("state");
	
	By Zip_Code=By.id("zip_code");
	
	By Phone=By.id("phone");
	
	By SubmitBtn=By.xpath("//a[text()='Submit']");
	
	By ValidationMsg=By.xpath("//span[@class='alert-msg']");
	
	By ValidationMsg1=By.xpath("//span[@class='alert-msg']");
	

	public WebElement getValidationMsg() {
		return driver.findElement(ValidationMsg);
	}
	public WebElement getValidationMsg1() {
		return driver.findElement(ValidationMsg1);
	}
	public WebElement getSubmitBtn() {
		return driver.findElement(SubmitBtn);
	}
	public WebElement getaddress() {
		return driver.findElement(address);
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
	
	public WebElement getRequestAddressBtn() {
		return driver.findElement(RequestAddressBtn);
	}
	public WebElement getHeading() {
		return driver.findElement(Heading);
	}
}
