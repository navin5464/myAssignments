package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Baseclass;
import io.cucumber.java.en.And;

public class Myhomepage extends Baseclass {
	
	/*
	 * public Myhomepage (ChromeDriver driver) { this.driver=driver; }
	 */
	@And ("Click on the Leads tab button")
	 public Myleads clickLeads() {
		getDriver().findElement(By.linkText("Leads")).click();
		 return new Myleads ();
		}

}
