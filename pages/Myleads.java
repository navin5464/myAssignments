package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Baseclass;
import io.cucumber.java.en.And;

public class Myleads extends Baseclass {
	/*
	 * public Myleads (ChromeDriver driver) { this.driver=driver; }
	 */
     @And ("Click on Create button")
	 public Createlead clickCreateLeads() {
    	 getDriver().findElement(By.linkText("Create Lead")).click();
		 return new Createlead();
		}
}
