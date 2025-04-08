package runnerScripts;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericScripts.ApplicationConstants;
import genericScripts.BasePage;
import genericScripts.ExplicitWait;
import genericScripts.ReadExcel;

public class TC01_AddEmployee extends BasePage implements ApplicationConstants {
	
	@Test(dataProvider = "TestData")
	public void add_employee(String fn,String ln) throws InterruptedException
	{
	   ExplicitWait.waitUntilElementLoad(driver,dashboardpage.PIM_BTN()).click();
		//Thread.sleep(5000);
		//dashboardpage.PIM_BTN().click();
		Thread.sleep(5000);
	   ExplicitWait.waitUntilElementLoad(driver,pimpageobjects.Add_Employee_BTN()).click();
		//pimpageobjects.Add_Employee_BTN().click();
		//Thread.sleep(5000);
	   ExplicitWait.waitUntilElementLoad(driver,pimpageobjects.FN_tf()).sendKeys(fn);
		//pimpageobjects.FN_tf().sendKeys(fn);
		//Thread.sleep(5000);
		ExplicitWait.waitUntilElementLoad(driver,pimpageobjects.LN_tf()).sendKeys(ln);
		pimpageobjects.LN_tf().sendKeys(ln);
		Thread.sleep(5000);
		 ExplicitWait.waitUntilElementLoad(driver,pimpageobjects.save_btn()).click();
		//pimpageobjects.save_btn().click();
		//Thread.sleep(5000);
	}
	
	@DataProvider(name="TestData")
	public String[][] data() throws IOException
	{
	XSSFSheet sheet= ReadExcel.accesssheet(ExcelPath,"Sheet1");
		int lastrowvalue= ReadExcel.lastrowvalue(ExcelPath,"Sheet1");
		int lastcellvalue=ReadExcel.lastcellvalue(ExcelPath,"Sheet1",0);
		String[][] values=new String[lastrowvalue+1][lastcellvalue];
		for(int r=0;r<=lastrowvalue;r++)
		{
			ReadExcel.accessrow(ExcelPath, "Sheet1", r);
	for(int c=0;c<lastcellvalue;c++)
			{
				String celvalue=ReadExcel.acesscel(ExcelPath, "Sheet1", r,c).getStringCellValue();
			
				values[r][c]=celvalue;
				
			}
		}
		return values;
		
	}
	
	
	
}
