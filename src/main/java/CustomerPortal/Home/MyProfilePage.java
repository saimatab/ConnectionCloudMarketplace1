package CustomerPortal.Home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MyProfilePage {
	
	public WebDriver driver ;
	
	
	public MyProfilePage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By EditProfile_btn=By.xpath("//a[@class='btn edit xs-btn-auto']");
	By Heading = By.xpath("//h1[text()='My Profile']");
	By AccountSettings=By.xpath("(//a[text()='Account Settings'])[1]");
	//By Catalog=By.xpath("(//a[text()='Catalog Restrictions'])[3]");
	By Catalog=By.xpath("//section[@class='container my-profile clearfix']//a[contains(text(),'Catalog Restrictions')]");

	//By Domains=By.xpath("(//a[text()=' //a[@class='btn btn-primary']Manage Domains'])[3]");

	By Domains=By.xpath("//section[@class='container my-profile clearfix']//a[contains(text(),'Manage Domains')]");
	//By Notification_heading=By.xpath("//h1[text()='Notifications']");
	//By All_Notification=By.xpath("//span[text()='All Notifications']");
	//By Flagged=By.xpath("//span[text()='Flagged']");
	//By Logo = By.xpath("//img[@class='logo']");
	
	 //a[@class='btn btn-primary']
	By save = By.xpath("//a[contains(text(),'Save')]");
	By cancel = By.xpath("//a[contains(text(),'Cancel')]");
	
	
	public WebElement getsave()
	{
		return driver.findElement(save);
	}
	
	public WebElement getcancel()
	{
		return driver.findElement(cancel);
	}
	public WebElement getDomains()
	{
		return driver.findElement(Domains);
	}
	
	public WebElement getCatalog()
	{
		return driver.findElement(Catalog);
	}
	
	public WebElement getAccountSettings()
	{
		return driver.findElement(AccountSettings);
	}
	
	public WebElement getEditProfile_btn()
	{
		return driver.findElement(EditProfile_btn);
	}
	
	public WebElement getHeading()
	{
		return driver.findElement(Heading);
	}
	
	

}
