package CustomerPortal.Manage.Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Calendar {
	public WebDriver driver ;
	//public Select Se1;
	
	
	public Calendar(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	
	//By Billing_Link = By.xpath("//a[@class='top-link' and text()='Billing & Invoice']");
	By Calendar= By.xpath("//a[@class='top-link' and text()='Calendar']");
	By Subscription=By.xpath("//a[@class='top-link' and text()='Subscriptions']");
	By Billing_Link = By.xpath("//a[@class='top-link' and text()='Billing']");
	
	By Usage_Link = By.xpath("//a[@class='top-link' and text()='Usage']");
	By subscribecal= By.xpath("//button[@id='subscribe-btn']");
	
	
	By expiringsubs= By.xpath("//span[@class='control__indicator']");
	
	By cont= By.xpath("//button[contains(text(),'Continue')]");
	
	
	By copyURL= By.xpath("//button[contains(text(),'Copy URL')]");
	
	By close= By.xpath("//button[contains(text(),'Close')]");
	By expiry= By.xpath("//a[contains(text(),'Corp. CSP Project Online Premium Monthly'");
	By expiry1= By.xpath("//body/div[@id='manage-content']/div[1]/section[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]//a[1]");
	

	
	//button[contains(text(),'Copy URL')]
	//button[contains(text(),'Continue')]
	//span[@class='control__indicator']
	//button[@id='subscribe-btn']
/*
	
	By ReportsBtn=By.linkText("Reports");
	By OrdersBtn=By.linkText("Orders");
	By Purchase_Analysis_Btn=By.linkText("Purchase Analysis");
	By SavedReports=By.xpath("//a[@class='my-reports']");
	By View_Full_Calendar=By.linkText("View full calendar");
	//By RecentOrdersDropDown=
	//Select Se2 = new Select(driver.findElement(By.xpath("//select[@class='grid-item-control-select']")));
	//Select Se3 = new Select(driver.findElement(By.xpath("//select[@class='grid-item-control-select']")));
	By AllOrdersLink=By.linkText("See all orders");
	By SeeAllQuotes=By.linkText("See all quotes");
	*/
	public boolean isElementPresent(By locatorKey) {
	    try {
	        driver.findElement(locatorKey);
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
	
	public boolean isElementDisabled(By locatorKey) {
	    try {
	        boolean flag=driver.findElement(locatorKey).isEnabled();
	        return flag;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
	public WebElement getUsage_Link()
	{
		return driver.findElement(Usage_Link);
	}
	public WebElement getexpiry()
	{
		return driver.findElement(expiry1);
	}
	public WebElement getsubscribecal()
	{
		return driver.findElement(subscribecal);
	}
	public WebElement getBilling_Link()
	{
		return driver.findElement(Billing_Link);
	}
	public WebElement getclose()
	{
		return driver.findElement(close);
	}
	public WebElement getexpsubs()
	{
		return driver.findElement(expiringsubs);
	}
	public WebElement getcont()
	{
		return driver.findElement(cont);
	}
	public WebElement getcopyURL()
	{
		return driver.findElement(copyURL);
	}
	
	public WebElement getCalendar()
	{
		return driver.findElement(Calendar);
	}
	public WebElement getSubscription()
	{
		return driver.findElement(Subscription);
	}
	
	/*
	
	public WebElement getOrdersBtnBtn()
	{
		return driver.findElement(OrdersBtn);
	}
	
	public WebElement get_Purchase_Analysis_BtnBtn()
	{
		return driver.findElement(Purchase_Analysis_Btn);
	}
	
	public WebElement getSavedReports()
	{
		return driver.findElement(SavedReports);
	}
	
	public WebElement getView_Full_Calendar()
	{
		return driver.findElement(View_Full_Calendar);
	}
	
	public WebElement getAllOrdersLink()
	{
		return driver.findElement(AllOrdersLink);
	}
	
	public WebElement getSeeAllQuotes()
	{
		return driver.findElement(SeeAllQuotes);
	}
	
	//public WebElement getCalendarDiv()
	//{
		//return driver.findElement(CalendarDiv);
	
	
	*/
	
}
