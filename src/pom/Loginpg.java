package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpg {
	
	@FindBy(linkText="Admin")
	WebElement ad;
	
	public void adn()
	{
		ad.click();
	}

}
