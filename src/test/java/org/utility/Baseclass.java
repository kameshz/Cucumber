package org.utility;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass{
	public static WebDriver driver;
	static Actions a;
	static JavascriptExecutor js;
	static Robot r;
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	public static void winMax() {
		driver.manage().window().maximize();
	}
	
	public static void launchurl(String url) {
		driver.get(url);	
	}
	
	public static  void closebrowser() {
		driver.close();
	}
	
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);	
	}
	public static void screenshot(String filename) throws IOException {
		TakesScreenshot t=(TakesScreenshot)driver;
		File scr = t.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\eclipse workspace\\Maven\\screenshot\\"+filename+".png");
		FileUtils.copyFile(scr,dest);	
	}
	public static void sendkeys(WebElement w,String s) {
		w.sendKeys(s);	
	}
	public static void click(WebElement f) {
		f.click();
	}
	public static void selectbyvisibletext(WebElement wb, String text) {
		Select s=new Select(wb);
		s.selectByVisibleText(text);
	}
	
	public static void getcurrenturl() {
		String url = driver.getCurrentUrl();
		System.out.println("Current URL:"+url);
	}
	public static void movetoelement(WebElement b) {
		a=new Actions(driver);
		a.moveToElement(b).perform();	
	}
	public static void contextclick(WebElement c) {
		a=new Actions(driver);
		a.contextClick(c).perform();
	}
	public static void doubleclick(WebElement c) {
		a=new Actions(driver);
		a.doubleClick(c).perform();
	}
	public static void scrolldown(WebElement d) {
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true)",d);	
	}
	public static void jssendkeys(WebElement d,String text) {
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].setAttribute('value',"+text+")",d);	
	}
	public static void jsgetattribute(WebElement d,String text) {
		 js=(JavascriptExecutor)driver;
		 js.executeScript("return arguments[0].getAttribute('"+text+"')",d);	
	}
	
	public static void jsclick(WebElement d) {
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",d);	
	}
	public static void scrollup(WebElement d) {
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(false)",d);	
	}
	public static void gettext(WebElement d) {
		 String text = d.getText();
		 System.out.println(text);	
	}
	public static void getattribute(WebElement d,String s) {
		String at = d.getAttribute(s);
		System.out.println(at);
	}
	public static void keypressandrelease(int keyEvent) throws AWTException {
		r=new Robot();
		r.keyPress(keyEvent);
		r.keyRelease(keyEvent);
		}	
	public static String readfromExcel(String fileName, String sheetname, int rowNO, int cellNo) throws IOException {
		File f=new File("F:\\eclipse workspace\\Maven\\Excel\\"+fileName+".xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet s = book.getSheet(sheetname);
		Row row = s.getRow(rowNO);
		Cell cell = row.getCell(cellNo);
		int cellType = cell.getCellType();
		String value;
		if (cellType==1) {
			value = cell.getStringCellValue();			
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();	
			SimpleDateFormat sd=new SimpleDateFormat("MM/dd/yyyy");
			value = sd.format(dateCellValue);
		}else {
			double d = cell.getNumericCellValue();
			long l=(long)d;
			value = String.valueOf(l);
		}
		return value;
	}
	
	public static void createnew_sheet_row_cell(String fileName, String sheetname, int rowno, int cellno, String cellvalue) throws IOException {
		File f=new File("F:\\eclipse workspace\\Maven\\Excel\\"+fileName+".xlsx");
		Workbook book=new XSSFWorkbook();
		Sheet cs = book.createSheet(sheetname);
		Row cr = cs.createRow(rowno);
		Cell cc = cr.createCell(cellno);
		cc.setCellValue(cellvalue);
		FileOutputStream fout=new FileOutputStream(f);
		book.write(fout);
		
	}
	public static void createrow_exist(String fileName, String sheetname, int rowno, int cellno, String cellvalue) throws IOException {
		File f=new File("F:\\eclipse workspace\\Maven\\Excel\\"+fileName+".xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet cs = book.getSheet(sheetname);
		Row cr = cs.createRow(rowno);
		Cell cc = cr.createCell(cellno);
		cc.setCellValue(cellvalue);
		FileOutputStream fout=new FileOutputStream(f);
		book.write(fout);
	}
	public static void createcell_row_exist(String fileName, String sheetname, int rowno, int cellno, String cellvalue) throws IOException {
		File f=new File("F:\\eclipse workspace\\Maven\\Excel\\"+fileName+".xlsx");
		FileInputStream fin=new FileInputStream(f);
		Workbook book=new XSSFWorkbook(fin);
		Sheet cs = book.getSheet(sheetname);
		Row cr = cs.getRow(rowno);
		Cell cc = cr.createCell(cellno);
		cc.setCellValue(cellvalue);
		FileOutputStream fout=new FileOutputStream(f);
		book.write(fout);
		
	}
}
