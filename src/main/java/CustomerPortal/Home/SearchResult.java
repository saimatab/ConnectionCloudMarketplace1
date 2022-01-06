package CustomerPortal.Home;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResult {

	public WebDriver driver;
	WebDriverWait wait;
	public SearchResult(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By LstvwId=By.id("bt-products-list");
	By LstVwCount=By.xpath("//a[@class='grid-control-icon icon-list active']");
	By GridVwCount=By.xpath("//a[@class='grid-control-icon icon-grid active']");
	By GridvwId=By.id("bt-products-grid");
	By SortDropDown=By.xpath("//select[@id='ddSort-by-dropdown']");
	By Sizedd=By.xpath("//select[@id='ddSort-show']");
	By Category1=By.xpath("//label[contains(text(),'Media Services (53)')]");
	By Category2=By.xpath("//label[contains(text(),'Telephony (72)')]");
	By Category3=By.xpath("//label[contains(text(),'Consulting (14)')]");
   By pagtotal=By.xpath("//label[contains(text(),'Business Productivity (23)')]");
	By PageNum2=By.xpath("(//a[@class='page-link'])[1]");
	//By ApplyCat=By.xpath("(//a[text()='Apply'])[2]");
	By ApplyCat=By.xpath("//div[@class='form-modal white-popup popup-small zoom-anim-dialog mfp-show schedule-report-modal clearfix']//button[@class='bt-apply-filters btn btn-primary'][contains(text(),'Apply')]");
	//a[@class='bt-apply-filters btn btn-primary']
	By ApplyCat1=By.xpath("//a[@class='bt-apply-filters btn btn-primary']");
	
	By Page2Count=By.xpath("//span[@class='current' and text()='2']");
	By ProductCount=By.xpath("//h2[contains(@id,'product-name')]");
	By PageNumCount=By.xpath("//strong[contains(text(),'49')]");
	By CategorySelectionCount=By.xpath("//span[@class='selection' and text()='Media Services ']");
	By CategorySelectionCount1=By.xpath("//span[@class='selection' and text()='Telephony ']");
	By ClearCat1=By.xpath("//span[contains(text(),'Telephony ')]//a[@class='icon-clear']");
	By ClearCat2=By.xpath("//span[contains(text(),'Media Services')]//a[@class='icon-clear']");
	
	By  clearallselect= By.id("bt-clear-all-selections");
	
	By clear=By.xpath("//div[@id='product-list-menu']//li[@class='selection-category']//span[contains(text(),'Media Services')]//a[@class='icon-clear']");
	By clear1=By.xpath("//div[@id='product-list-menu']//li[@class='selection-category']//span[contains(text(),'Telephony')]//a[@class='icon-clear']");
	By clear2=By.xpath("//a[@class='bt-clear-filters']");


	By ProductName1=By.xpath("(//h2[contains(@id,'product-name-')])[1]");
	By showmore=By.xpath("//a[@class='bt-show-more']");
	
	By proddisplay=By.xpath("//div[@class='pagination-total']//strong[contains(text(),'1-3')]");
	By totalprod=By.id("NumPages");
	By noresultmsg=By.xpath("//strong[contains(text(),'No results found')]");
	
	
	public WebElement getproddisplay()
	{
		return driver.findElement(proddisplay);
	}
	public WebElement getapplycat1()
	{
		return driver.findElement(ApplyCat1);
	}
	public WebElement getnoresultmsg()
	{
		return driver.findElement(noresultmsg);
	}
	public WebElement gettotalprod()
	{
		return driver.findElement(totalprod);
	}
	
	public WebElement getSortDropDown()
	{
		return driver.findElement(SortDropDown);
	}
	public WebElement getclearallselect()
	{
		return driver.findElement(clearallselect);
	}
	public WebElement getclear()
	{
		return driver.findElement(clear);
	}
	public WebElement getclear2()
	{
		return driver.findElement(clear2);
	}
	public WebElement getClearcat1()
	{
		return driver.findElement(clear);
	}
	public WebElement getClearcat2()
	{
		return driver.findElement(clear1);
	}
	public WebElement getGridvwId()
	{
		return driver.findElement(GridvwId);
	}
	
	public List<WebElement> getCategorySelectionCount()
	{
		return driver.findElements(CategorySelectionCount);
	}
	public List<WebElement> getCategorySelectionCount1()
	{
		return driver.findElements(CategorySelectionCount1);
	}
	public List<WebElement> getGridVwCount()
	{
		return driver.findElements(GridVwCount);
	}
	
	
	public List<WebElement> getLstVwCount()
	{
		return driver.findElements(LstVwCount);
	}
	public WebElement getShowMoreLink()
	{
		return driver.findElement(showmore);
	}
	public WebElement getCategory1()
	{
		return driver.findElement(Category1);
	}
	public WebElement getCategory2()
	{
		return driver.findElement(Category2);
	}
	public WebElement getCategory3()
	{
		return driver.findElement(Category3);
	}

	public WebElement getLstvwId()
	{
		return driver.findElement(LstvwId);
	}
	public WebElement getSizedd()
	{
		return driver.findElement(Sizedd);
	}
	public List<WebElement> getPageNumCount()
	{
		return driver.findElements(PageNumCount);
	}
	
	public List<WebElement> getProductCount()
	{
		return driver.findElements(ProductCount);
	}
	
	public List<WebElement> getPage2Count()
	{
		return driver.findElements(Page2Count);
	}
	
	public WebElement getApplyCat()
	{
		return driver.findElement(ApplyCat);
	}
	
	public WebElement getPageNum2()
	{
		return driver.findElement(PageNum2);
	}
	
	public boolean isElementPresent(By locatorKey) {
	    try {
	        driver.findElement(locatorKey);
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
	
	
}
