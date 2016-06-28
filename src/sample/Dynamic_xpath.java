package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

public class Dynamic_xpath {
  @Test
  public void f() throws InterruptedException {
	  
	  FirefoxDriver d=new FirefoxDriver();
	  d.get("http://yahoo.com");
	  d.manage().window().maximize();
	  
	  d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  
	  
	  
	  
	  Thread.sleep(50000);
	  d.findElement(By.id("UHSearchBox")).sendKeys("selenium");
	  Thread.sleep(6000);
	  List<WebElement> items= d.findElements(By.xpath
			  ("//*[starts-with(@id,'yui_3_12_0_1_146639')]/a"));
	  
	  // ( OR )
	  
	 // List<WebElement> items= d.findElements(By.xpath
		//	  ("//*[contains(@id,'ui_3_12_0_1_146639')]/a"));
	  
	  Thread.sleep(4000);
	  System.out.println(items.size());
	  
	  Sleeper.sleepTightInSeconds(4);
	  //click first item from identified tagname elements
	  items.get(0).click();

  }
}
