package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Baseclass;
import io.cucumber.java.en.And;

public class Homepage extends Baseclass {
	
	/*
	 * public Homepage (ChromeDriver driver) { this.driver=driver; }
	 */
	@And ("Click on the CRM\\/SFA Link")
    public Myhomepage crmlink() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
    	return new Myhomepage ();
	}
}
