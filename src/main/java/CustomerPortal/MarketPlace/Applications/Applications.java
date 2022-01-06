package CustomerPortal.MarketPlace.Applications;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Applications {
	public WebDriver driver ;
	//public Select Se1;
	
	
	public Applications(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	

	By getnow= By.xpath("//a[@class='btn btn-primary' and text()='Get it Now']");
	By mange=By.xpath("//a[@class='btn btn-primary btngreen' and text()='Manage']");
	

	
	public WebElement gemanage()
	{
		return driver.findElement(getnow);
	}
	
	public WebElement getnow()
	{
		return driver.findElement(mange);
	}

	
	
	public  int  getcountgetnow()
	{
		java.util.List<WebElement> getnow =driver.findElements(By.xpath("//a[@class='btn btn-primary' and text()='Get it Now']"));
		return getnow.size();
	}

	
	public  int getcountmanage()
	{
		
	List<WebElement> mange =driver.findElements(By.xpath("//a[@class='btn btn-primary btngreen' and text()='Manage']"));
		return mange.size();
		
	}

	
	
	
}
