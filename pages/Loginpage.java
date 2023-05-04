package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import baseclass.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Loginpage extends Baseclass {

	/*
	 * public Loginpage (ChromeDriver driver) { this.driver=driver;
	 * 
	 * }
	 */
	@Given("Enter the username as (.*)$")
	public Loginpage enterUsername(String Uname) {
		getDriver().findElement(By.id("username")).sendKeys(Uname);
		return this;
	}

	@And("Enter the password as (.*)$")
	public Loginpage enterPassword(String pwd) {
		getDriver().findElement(By.id("password")).sendKeys(pwd);
		return this;
	}

	@Then("Click on login button")
	public Homepage clickLoginbutton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new Homepage();
	}
}
