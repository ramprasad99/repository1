package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWait_Webdriverwait {
	
	FirefoxDriver driver;
	
	
	@Test
	public void waitTest()
	{
	
		FirefoxDriver driver=new FirefoxDriver();
		driver=new FirefoxDriver();
		driver.get("http://www.24hourfitness.com/not-yet-member.html");
		
		WebDriverWait mywait=new WebDriverWait(driver, 40);
		
		
		mywait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//*[@id='sli_search_1']")));
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='at-search-button']"))).click();
		
		
	}

}
