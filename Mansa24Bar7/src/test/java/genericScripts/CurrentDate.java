package genericScripts;


import java.util.Date;

public class CurrentDate {

	public static String dates() {
		Date d=new Date();
		String d1=d.toString();
		String d2=d1.replaceAll(":","-");
		return d2;
	}
}
