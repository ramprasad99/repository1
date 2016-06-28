package grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid1 {
	@Parameters("browser")
	
	@Test
	public void sample(String b) throws MalformedURLException, Exception 
	{
		DesiredCapabilities cap=null;
		
		if(b.equals("firefox"))
		{
		cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		}
		else if(b.equals("chrome"))
		{
			
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		RemoteWebDriver d=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		d.get("http://google.com");
		d.manage().window().maximize();
		
		d.findElement(By.xpath("html/body/div/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[3]/div/input[1]")).sendKeys("selenium");
		
		Thread.sleep(6000);
		d.findElement(By.name("btnG")).click();
		
		d.findElement(By.xpath(".//*[@id='lst-ib']")).clear();
	}

}
