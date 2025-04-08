package genericScripts;

import java.io.File;
import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerClass extends BasePage implements ITestListener, ApplicationConstants{

	
	public void onStart(ITestContext context)
	{
reporter=new ExtentSparkReporter("./src/test/resources/ExtentReports/"+context.getName()+" "+CurrentDate.dates()+".html");
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("E2EFramework");
		reporter.config().setTheme(Theme.STANDARD);
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("OS", "Windows");
		reports.setSystemInfo("Browser1", "Chrome");
		reports.setSystemInfo("Browser2", "Firefox");
		reports.setSystemInfo("Tester_id", "00215");
		System.out.println("The Execution process has been started");
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("The Testcase Execution has been started");
	}
	public void onTestSuccess(ITestResult result)
	{
		ExtentTest test=reports.createTest(result.getName());
		test.log(Status.PASS, result.getName()+"this test cassse is Success");
		System.out.println("The " +result.getName()+" Testcase Execution has been Succeess");
	}
	public void onTestFailure(ITestResult result)
	{
		ExtentTest test=reports.createTest(result.getName());
		test.log(Status.FAIL, result.getName()+"this test case is failed");
		test.log(Status.FAIL, result.getThrowable());
		System.out.println("The "+result.getName()+" Testcase Execution  has been Failed");
		
	 
		try {
		 CaptureScreenShot.getphoto(result.getName()+"_"+CurrentDate.dates()+".png");
		} catch (IOException e) {
			
		
		}
			
		
			
			
			
				// TODO Auto-generated catch block
			
		
	}
	public void onTestSkipped(ITestResult result)
	{
		ExtentTest test=reports.createTest(result.getName());
		test.log(Status.SKIP, result.getName()+"this test case is Success");
		System.out.println("The " +result.getName()+" Testcase Execution has been Skipped");
	}
	public void onFinish(ITestContext context)
	{
		System.out.println("The Execution process has been Finish");
		reports.flush();
	}
}
