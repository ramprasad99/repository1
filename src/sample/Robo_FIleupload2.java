package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;



public class Robo_FIleupload2 {
	@Test
	public void fileUpload() throws IOException, AWTException, InterruptedException
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(3000);
		//click browse btn
		driver.findElement(By.id("photo")).click();
		
		Sleeper.sleepTightInSeconds(3);
		//file upload (AutoIT)
		Runtime.getRuntime().exec("E:\\0708\\Auto_fileupload.exe");
		
		
		

	
	}

}





/* 
 
 //code to copy the path into system clipboard

		StringSelection path=new StringSelection("C:\\Users\\Public\\"
				+ "Pictures\\Sample Pictures\\Desert.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);
		
		//click browse button
		driver.findElement(By.id("photo")).click();
		Thread.sleep(2000);
		
        Robot r=new Robot();
		//performing paste operation ctrl+v

        r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.delay(2000);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.delay(2000);	
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
 
 */
