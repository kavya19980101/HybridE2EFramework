package genericScripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel extends BasePage {
	
	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static XSSFSheet accesssheet(String filepath,String sheetName) throws IOException
	{
		fis =new FileInputStream(filepath);
		 workbook=new XSSFWorkbook(fis);
	    sheet=workbook.getSheet(sheetName);
		return sheet;
	}
	
	public static XSSFRow accessrow(String filepath,String sheetName,int rowvalue) throws IOException
	{
		fis=new FileInputStream(filepath);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
	 row=sheet.getRow(rowvalue);
		return row;
	}
	
	public static XSSFCell acesscel(String filepath,String sheetName,int rowvalue,int cellvalue) throws IOException
	{
		fis=new FileInputStream(filepath);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
	 row=sheet.getRow(rowvalue);
		  cell=row.getCell(cellvalue);
		  return cell;
	}
	
	public static int lastrowvalue(String filepath,String sheetName) throws IOException
	{
		fis=new FileInputStream(filepath);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		int lastrowvalue=sheet.getLastRowNum();
		return lastrowvalue;
	}
	public static int lastcellvalue(String filepath,String sheetName,int rowvalue) throws IOException
	{

		fis=new FileInputStream(filepath);
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(rowvalue);
		int lastcel=row.getLastCellNum();
	    return lastcel;
	}
	
	
}
