package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefecreatelead {
	public ChromeDriver driver;
	@Given ("Launch the browser and open the url and maximise")
	public void launchbrowser () {
		 driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	
	@And ("Enter the username as Democsr")
	public void username () {
		driver.findElement(By.id("username")).sendKeys("Democsr");
}
	
	@And ("Enter the password as crmsfa")
	public void password () {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
}
	
    @And ("click the login button")
	public void login () {
		driver.findElement(By.className("decorativeSubmit")).click();
}
	
    @When ("click the crmsfa link")
    public void clickCrmsfa() {
    	driver.findElement(By.linkText("CRM/SFA")).click();
    }
	@And ("click on the lead button")
	public void leadbutton () {
		driver.findElement(By.linkText("Leads")).click();	
	}
	@And ("click on create button")
	public void create () {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@And ("enter the company name")
	public void cmpname () {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	}
	@And ("enter the first name") 
	public void fname () {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Navin");
	}
	@And ("enter the last name") 
	public void lname () {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
	}
	@And ("enter the phname") 
	public void email () {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");	
	}
	@When ("click on submit button")
	public void submitbtt () {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then ("lead created successfully") 
	public void lead () {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
	}
	
	
	}
	