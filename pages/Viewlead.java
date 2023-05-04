package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Baseclass;
import io.cucumber.java.en.Then;

public class Viewlead extends Baseclass {
	
	/*
	 * public Viewlead (ChromeDriver driver) { this.driver=driver; }
	 */
	@Then ("Verify if the Lead is created successfully (.*)$")
	 public void verify(String cname) {
		 String text = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
			if (text.contains(cname)) {
				System.out.println("Lead created successfully");
			}
			else {
				System.out.println("Lead is not created");
			}
	 }}
