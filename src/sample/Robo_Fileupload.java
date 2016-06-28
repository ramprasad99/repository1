package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Robo_Fileupload {
  @Test
  public void f() throws AWTException, IOException, InterruptedException {
	  
	  FirefoxDriver d=new FirefoxDriver();
	  d.get("http://docs.seleniumhq.org/download/");
	  d.manage().window().maximize();
	  
	  Thread.sleep(3000);
	  d.findElement(By.linkText("2.53.0")).click();
	  
	  Thread.sleep(3000);
	  Runtime.getRuntime().exec("E:\\0708\\Auto_save8.exe");
	  
	
  }
}


/*Robot rb=new Robot();

rb.keyPress(KeyEvent.VK_PERIOD);
rb.keyRelease(KeyEvent.VK_PERIOD);*/