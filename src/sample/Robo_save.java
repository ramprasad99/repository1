package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Robo_save {
  @Test
  public void f() throws AWTException, InterruptedException {
	  
	  FirefoxDriver d=new FirefoxDriver();
	  d.get("http://docs.seleniumhq.org/download/");
	  d.manage().window().maximize();
	  
	  //click 2.53.0 link
	  d.findElement(By.linkText("2.53.0")).click();
	  Thread.sleep(3000);
	  
	  Robot rb=new Robot();
	  
	  rb.keyPress(KeyEvent.VK_TAB);
	  rb.keyRelease(KeyEvent.VK_TAB);
	  
	  rb.delay(3000);
	  
	  rb.keyPress(KeyEvent.VK_ENTER);
	  rb.keyRelease(KeyEvent.VK_ENTER);
	  	  
  }
}
