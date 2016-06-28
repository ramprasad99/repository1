package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calander_Webtable {
	FirefoxDriver driver;
	
	@Test
	public void calanderTest()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Weekend\\chromedriver.exe" );
		//ChromeDriver driver=new ChromeDriver();	
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.id("OneWay")).click();
		driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		driver.findElement(By.id("ToTag")).sendKeys("Bhubaneswar, IN - Biju Patnaik (BBI)");
		//click date 
		driver.findElement(By.xpath("//*[@id='ORtrip']/section[2]/div[1]/dl/dd/div/a/i")).click();
		                            
		//user defined date
		String doj="10/05/2017";
		
		
		String[] a=doj.split("/");
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		
		
		int x=Integer.parseInt(a[1]);
		String month=months[x-1];
		
		String day=a[0];
		String year=a[2];
		
		
		//identify the year in the cal
		String calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!calyear.equals(year))
		{
			//click arrow in cal
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		// identify the month in the cal
		String calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while(!calmonth.equals(month))
		{
			//click arrow in cal
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/a")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		WebElement table=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		System.out.println(rows.size());
		// loop for rows
		for(int i=0;i<rows.size();i++)
		{
			//from row get no.of colmns
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			// loop for colmns in rows(i) 
			for(int j=0;j<cols.size();j++)
			{
				if(cols.get(j).getText().equals(day))
				{
					// click matching date
					cols.get(j).click();
					break;
				}
			}
		}
		Sleeper.sleepTightInSeconds(4);
		//click find flights
		driver.findElement(By.id("SearchBtn")).click();
		
	}
	
}


