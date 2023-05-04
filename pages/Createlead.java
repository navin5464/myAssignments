package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class Createlead extends Baseclass {
	
	/*
	 * public Createlead (ChromeDriver driver) { this.driver=driver; }
	 */
	 @And ("Enter the First Name as (.*)$")
	 public Createlead firstname(String fname) {
		 getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		 return this;
		}
	 @And ("Enter the Last Name as (.*)$")
	 public Createlead lastname(String lname) {
		 getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		 return this;
		}
	 @And ("Enter the CompanyName as (.*)$")
	 public Createlead companyname(String cname) {
		 getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		 return this;
		}
	 @When ("Click on the final Submit button")
	 public Viewlead submit() {
		 getDriver().findElement(By.name("submitButton")).click();
		 return new Viewlead();
		}
}
