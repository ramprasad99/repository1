package excel;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.xerces.impl.dv.xs.DecimalDV;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;



public class execel1 {
	

	@Test
	public void f() throws IOException, InterruptedException {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		FileInputStream f=new FileInputStream("D:\\123\\links.xlsx");
		
		@SuppressWarnings("resource")
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Row r=null;
		Cell c=null;
		
		Iterator<Row> row=ws.iterator();
		row.next();
		
		
		while(row.hasNext())
		{
			r=row.next();
			
			driver.findElement(By.linkText(r.getCell(0).getStringCellValue())).click();
			String acturl=driver.getCurrentUrl();
			
			c=r.createCell(2);
			c.setCellValue(acturl);
			
			String expurl=r.getCell(1).getStringCellValue();
			if(acturl.equals(expurl))
			{
				c=r.createCell(3);
				c.setCellValue("Passed");
			}
			else
			{
				c=r.createCell(3);
				c.setCellValue("Failed");
			}
			driver.navigate().back();
			
		}
		
		Thread.sleep(4000);
		FileOutputStream f1=new FileOutputStream("D:\\123\\links123456.xlsx");
		wb.write(f1);
		f1.close();
		

	}

}
