package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import CustomerPortal.Home.LoginPage;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.io.BufferedReader;
public class base {
	public static Logger Log = LogManager.getLogger(base.class.getName());
	public  static WebDriver driver;

	
	

	public WebDriver initializeDriver() throws IOException, InterruptedException {

	 String url;
		 DesiredCapabilities dCaps;
		String url_cust;
		String url_mgmt;
	 String username_mgmt;
	 String pswd_mgmt;
	 
	
		 String username_cust1;
		 String pswd_cust1;
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		url = prop.getProperty("url_cust");
		
		System.out.println("Browser selected is "+browserName);
		
		if(browserName.equals("phantom"))
		{
			
			
		    File file = new File("phantomjs.exe");				
           System.setProperty("phantomjs.binary.path", file.getAbsolutePath());
			//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			dCaps = new DesiredCapabilities();
			  dCaps.setJavascriptEnabled(true);
			  dCaps.setCapability("takesScreenshot", false);
			  
			  driver = new PhantomJSDriver(dCaps);
			 //driver = new ChromeDriver();
		}
		
		if(browserName.equals("chrome"))
		{
			
			ChromeOptions chromeOptions= new ChromeOptions();
			
			chromeOptions.setBinary("Application\\chrome.exe");
			//chromeOptions.setBinary("chrome.exe");

		   
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
			
			 driver = new ChromeDriver(chromeOptions);
			
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(browserName.equals("ie"))
		{
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		driver.manage().window().maximize();
		//driver.get(url);

		return driver;
	

	}
	
	public static WebDriver getdriver()
	{
		if (driver == null){
			return driver;
			}else{
			return driver;
			}
	}
	
	public void getScreenshot(String result) throws IOException {
	//File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	//FileUtils.copyFileToDirectory(src, new File("C:\\Automation-Snapshots\\" + result + " screenshot.png"));
	}
	
}
