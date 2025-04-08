package genericScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.DashBoardPage;
import pageObjects.LoginPageObjects;
import pageObjects.PimPageObjects;

public class BasePage {

	public static WebDriver driver;
	public static FileInputStream fis;
	public ReadPropertyFiles rpf;
	public LoginPageObjects loginpage;
	public DashBoardPage dashboardpage;
	public PimPageObjects pimpageobjects;
	public Logger log;
	public ExtentSparkReporter reporter;
	public ExtentReports reports;

	@BeforeTest
	public void ConfigReports()
	{
		
		 
	}
	
	@BeforeClass
	public void BrowserConfiguration() throws IOException
	{
		log = LogManager.getLogger("BrowserConfiguration");
		log.info("The Browser is Configured");
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver(options);
		rpf=new ReadPropertyFiles();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		loginpage=new LoginPageObjects(driver);
		dashboardpage=new DashBoardPage(driver);
		pimpageobjects=new PimPageObjects(driver);
		rpf=new ReadPropertyFiles();
		
	}
	
	@BeforeMethod
	public void LaunchApplication()
	{
		driver.get(rpf.getUrl());
		loginpage.Usn_TF().sendKeys(rpf.getusn());
		loginpage.Pwd_TF().sendKeys(rpf.getpass());
		loginpage.Login_BTN().click();
		boolean result= dashboardpage.Upgrade_Btn().isDisplayed();
		Assert.assertTrue(result);
		
	}
	

	
	@AfterMethod
	public void CloseApplication() throws InterruptedException
	{
		
		Thread.sleep(5000);
	dashboardpage.ProfilePicture().click();
	dashboardpage.LogoutOptions().click();
	boolean result= loginpage.logintxt().isDisplayed();
	Assert.assertTrue(result);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}
	
	@AfterTest
	public void FlushReport()
	{
		
	}
}
