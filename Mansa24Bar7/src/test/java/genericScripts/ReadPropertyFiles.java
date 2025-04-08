package genericScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFiles extends BasePage implements ApplicationConstants {

	
	public Properties pro;
	ReadPropertyFiles() throws IOException
	{
		fis=new FileInputStream(url);
		pro=new Properties();
		pro.load(fis);
	}
	
	public String getUrl()
	{
		return pro.getProperty("TestUrl");
	}
	
	public String getusn()
	{
		return pro.getProperty("TestUsn");
	}
	
	public String getpass()
	    {
		return pro.getProperty("Testpass");
		}
}
