package excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Actionkw {
	
	public WebDriver driver;
	
	
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
		
	}
	public void navigate()
	{
		driver.get("http://opensource.demo.orangehrm.com/index.php/pim/addEmployee");
	}
	public void enterUsername()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	public void enterPassword()
	{
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}
	public void clickLogin()
	{
		driver.findElement(By.id("btnLogin")).click();
	}



}

