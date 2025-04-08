package genericScripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
public class CaptureScreenShot extends BasePage implements ApplicationConstants{

	
	
	public static void getphoto(String filename) throws IOException {
		
	TakesScreenshot tss=(TakesScreenshot) driver;
	File src=tss.getScreenshotAs(OutputType.FILE);
	String path=defectPath+filename;
	File dst=new File(path);
	FileHandler.copy(src, dst);
	
	
	}
}
