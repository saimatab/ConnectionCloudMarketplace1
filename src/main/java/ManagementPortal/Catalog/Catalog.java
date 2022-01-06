package ManagementPortal.Catalog;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Catalog {

	public WebDriver driver;
	
	public Catalog(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	By Heading = By.xpath("//h1[text()='Catalog Restrictions']");
	
	By Categories=By.xpath("//a[@class='top-link' and text()='Categories']");
	
	By SelectFieldBtn = By.id("selectFields");
	
	By SyncBtn = By.id("sync");
	
	By SyncSuccess=By.xpath("//div[text()='Sync Completed Successfully']");
	
	By SyncClose=By.xpath("//button[@type='button' and text()='Close']");
	
	By ExportBtn = By.id("export");
	
	By ExportCancel=By.xpath("(//button[@class='btn btn-secondary' and text()='Cancel'])[7]");
	
	By SelectFields=By.id("selectFields");
	
	By CancelBtn = By.xpath("(//button[@class='btn btn-secondary' and text()='Cancel'])[6]");
	
	By Arrow1 = By.xpath("(//td[@columnname='Arrow'])[1]");
	
	By EditCategory = By.xpath("//a[text()='Edit Category']");
	
	By ApplyBtn=By.id("updateCategoryBtn");
	
	By Catheading = By.xpath("//h2[text()='Edit Category']");
	
	By Restricted = By.xpath("//a[text()=' Restricted ']");
	
	By Unrestricted=By.xpath("//a[text()='Unrestricted']");
	
	By CheckBox = By.xpath("(//span[@class='checkbox checkbox-primary sel-all'])[1]");
	
	By Restrict=By.xpath("//a[text()='Restrict']");
	
	By SucessMsg=By.xpath("//div[@class='ccp-form-success']");
	
	By ServiceSearch=By.name("terms");
	
	By SelectAll = By.xpath("//label[text()='Select All']");
	
	By UnRestrict=By.xpath("//a[text()='Unrestrict']");
	
	By UnRestrictSuccessMsg=By.xpath("//span[text()='Catalog restrictions saved successfully']");
	
	
	public WebElement getUnRestrictSuccessMsg() {
		return driver.findElement(UnRestrictSuccessMsg);
	}
	
	public WebElement getUnRestrict() {
		return driver.findElement(UnRestrict);
	}
	public WebElement getSelectAll() {
		return driver.findElement(SelectAll);
	}
	public WebElement getServiceSearch() {
		return driver.findElement(ServiceSearch);
	}
	
	public WebElement getSucessMsg() {
		return driver.findElement(SucessMsg);
	}
	
	public WebElement getRestrict() {
		return driver.findElement(Restrict);
	}
	
	public WebElement getCheckBox() {
		return driver.findElement(CheckBox);
	}
	
	public WebElement getRestricted() {
		return driver.findElement(Restricted);
	}
	public WebElement getUnrestricted() {
		return driver.findElement(Unrestricted);
	}
	
	public WebElement getCatheading() {
		return driver.findElement(Catheading);
	}
	
	public WebElement getApplyBtn() {
		return driver.findElement(ApplyBtn);
	}
	
	public WebElement getEditCategory() {
		return driver.findElement(EditCategory);
	}
	
	public WebElement getArrow1() {
		return driver.findElement(Arrow1);
	}
	
	public WebElement getCancelBtn() {
		return driver.findElement(CancelBtn);
	}
	
	
	public WebElement getExportCancel() {
		return driver.findElement(ExportCancel);
	}
	
	public WebElement getExportBtn() {
		return driver.findElement(ExportBtn);
	}
	
	public WebElement getSyncClose() {
		return driver.findElement(SyncClose);
	}
	
	public WebElement getSyncSuccess() {
		return driver.findElement(SyncSuccess);
	}
	
	public WebElement getSyncBtn() {
		return driver.findElement(SyncBtn);
	}
	
	public WebElement getSelectFieldBtn() {
		return driver.findElement(SelectFieldBtn);
	}
	
	public WebElement getCategories() {
		return driver.findElement(Categories);
	}
	
	public WebElement getHeading() {
		return driver.findElement(Heading);
	}
}
