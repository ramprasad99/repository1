package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
//import jxl.read.biff.BiffException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws  IOException, JXLException ,BiffException{
	  
	  FirefoxDriver d=new FirefoxDriver();
	  d.get("http://opensource.demo.orangehrmlive.com/");
	  
	  
	  
	  FileInputStream fi=new FileInputStream("E:\\1122\\testdata.xls");
	  Workbook wb=Workbook.getWorkbook(fi);
	  
	  Sheet ws=wb.getSheet(0);
	  
	  d.findElement(By.id("txtUsername")).sendKeys(ws.getCell(0,1).getContents());
	  d.findElement(By.id("txtPassword")).sendKeys(ws.getCell(1,1).getContents());
	  d.findElement(By.id("btnLogin")).click();
	  
	  
	  
	  
  }
}
