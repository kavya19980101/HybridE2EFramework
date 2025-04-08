package runnerScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericScripts.BasePage;

public class TC02_VerificationOfAddEmployee extends BasePage{

@Test
public void TC02_AddEmployeeVerification() throws InterruptedException
{
	Thread.sleep(5000);
	dashboardpage.PIM_BTN().click();
	Thread.sleep(5000);
	boolean result= pimpageobjects.Add_Employee_BTN().isDisplayed();
	Thread.sleep(5000);
	Assert.assertTrue(result);
	Thread.sleep(5000);
	System.out.println("verification is done");

	
}
}
