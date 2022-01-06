package CustomerPortal.Insights;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Insight {

	public WebDriver driver ;
	//public Select Se1;
	
	
	public Insight(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	By PAnalysis = By.xpath("//a[@class='top-link' and text()='Purchase Analysis']");
	By CAnalysis = By.xpath("//a[@class='top-link' and text()='Comparative Analysis']");
	By Recommendation = By.xpath("//a[@class='top-link' and text()='Recommendations']");
	By Report=By.xpath("//a[@class='top-link' and text()='Reports']");
	
	By Dashboard= By.xpath("//a[@class='top-link' and text()='Dashboard']");
	By Reports= By.xpath("//a[@class='top-link' and text()='Reports']");
	By SpendAnalysis = By.xpath("//a[@class='top-link' and text()='Spend Analysis']");
	By sp1 = By.xpath("//h2[contains(text(),'Spend by Provider')]");
	By sp2 = By.xpath("//h2[contains(text(),'Spend by Category')]");
	By sp3 = By.xpath("//h2[contains(text(),'Spend Projection')]");
	By sp4 = By.xpath("//h2[contains(text(),'Spend by Type')]");
	
	By sp5 = By.xpath("//h2[contains(text(),'Spend by Service')]");
	By repo = By.xpath("//a[contains(text(),'Reports')]");
	

	By expand=By.xpath("//div[@id='spendByMfg-wrapper']//a[@class='action-link expand'][contains(text(),'Expand')]");
	
	
	By collapse=By.xpath("//div[@id='spendByMfg-wrapper']//a[@class='action-link expand'][contains(text(),'Collapse')]");
	By dropdownprov=By.xpath("//div[@id='spendByMfg-wrapper']//select[@id='spendByMfg-range-select']");
	By dropdownservice=By.xpath("//div[@id='savingsByMfg-wrapper']//select[@id='savingsByMfg-range-select']");
	By calyear=By.id("CalendarYear");
	
	By dropdowntype=By.xpath("//div[@id='yearOverYearSpend-wrapper']//select[@id='yearOverYearSpend-range-select']");
	By dropdowncategory=By.xpath("//div[@id='yearOverYearSpend2-wrapper']//select[@id='yearOverYearSpend2-range-select']");
	
	By svg=By.xpath("//body/div[@id='insights-content']/div[@class='purchase-analysis-body']/div[@class='page-container']/div[@id='purchase-analysis']/div[@id='spendByMfg-wrapper']/div[@class='track-grid-item']/div[@id='spendByMfg']/div/div/div/*[1]");
	
	public  int  getcountexpand()
	{
		java.util.List<WebElement> getnow =driver.findElements(By.xpath("//div[@id='CostPorjection-wrapper']//a[@class='action-link expand'][contains(text(),'Expand')]"));
		return getnow.size();
	}
	

	public  int  getcountdrag()
	{
		java.util.List<WebElement> getnow =driver.findElements(By.xpath("//div[@id='CostPorjection-wrapper']//span[@class='action-link drag']"));
		return getnow.size();
	}
	
	
	//h2[contains(text(),'Spend by Provider')]
	
	
	//By MonthlyView= By.xpath("//*[@id='track-calandar']/div/section/div[1]/div[2]/div/span");
	//By DetailView= By.xpath("//*[@id='track-calandar']/div/section/div[1]/div[2]/div/a/span");
	//By FirstPlus=By.xpath("(//a[@class='btn-expand-content'])[1]");
	//By ReportLink=By.linkText("(6) PLANAR SYSTEMS");
	
	//By CalendarDropdown=By.id("calendarSelectYearMonthly");
	
	//Select Se1= new Select(driver.findElement(By.className("small native-drop native-drop-large")));
	
	public WebElement getexpand()
	{
		return driver.findElement(expand);
		
	}
	public WebElement getreport()
	{
		return driver.findElement(repo);
		
	}
	public WebElement getsvg()
	{
		return driver.findElement(svg);
		
	}

	public WebElement getdropddownprov()
	{
		return driver.findElement(dropdownprov);
		
	}
	public WebElement getdropddownprov1()
	{
		return driver.findElement(calyear);
		
	}
	public WebElement getdropddowntype()
	{
		return driver.findElement(dropdowntype);
		
	}
	public WebElement getdropddowncat()
	{
		return driver.findElement(dropdowncategory);
		
	}
	public WebElement getdropddownservice()
	{
		return driver.findElement(dropdownservice);
		
	}
	
	public WebElement getcollapse()
	{
		return driver.findElement(collapse);
		
	}
	public WebElement getSp1()
	{
		return driver.findElement(sp1);
		
	}
	
	public WebElement getSp2()
	{
		return driver.findElement(sp2);
		
	}
	
	public WebElement getSp3()
	{
		return driver.findElement(sp3);
		
	}
	
	public WebElement getSp4()
	{
		return driver.findElement(sp4);
		
	}
	public WebElement getSp5()
	{
		return driver.findElement(sp5);
		
	}
	
	
	
	public WebElement getSpendAnalysis()
	{
		return driver.findElement(SpendAnalysis);
		
	}
	
	public WebElement getPAnalysis()
	{
		return driver.findElement(PAnalysis);
		
	}
	
	public WebElement getCAnalysis()
	{
		return driver.findElement(CAnalysis);
		
	}
	
	public WebElement getRecommendation()
	{
		return driver.findElement(Recommendation);
		
	}
	
	public WebElement getDashboard()
	{
		return driver.findElement(Dashboard);
		
	}
	
	
	public WebElement getReports()
	{
		return driver.findElement(Report);
		
	}
	/*
	public WebElement getFirstPlus()
	{
		return driver.findElement(FirstPlus);
		
	}
	
	public WebElement getSubscribeBtn()
	{
		return driver.findElement(SubscribeBtn);
		
	}
	
	public WebElement getMonthlyView()
	{
		return driver.findElement(MonthlyView);
		
	}

	public WebElement getDetailView()
	{
		return driver.findElement(DetailView);
		
	}

	public Select getCalendar()
	{
		
		return Se1;
		
	}
	*/
}
