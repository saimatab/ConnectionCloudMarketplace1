package CustomerPortal.Home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Domains {

	public WebDriver driver;
	
	public Domains(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	

	By Heading = By.xpath("//h1[text()='Manage Domains']");
	
	By DefaultText=By.xpath("//span[text()='Default']");
	
	By ArpatechDomain=By.xpath("//div[text()='arpatech.com']");
	
	
	public WebElement getDefaultText() {
		return driver.findElement(DefaultText);
	}
	
	public WebElement getArpatechDomain() {
		return driver.findElement(ArpatechDomain);
	}
	
	public WebElement getHeading() {
		return driver.findElement(Heading);
	}
}
