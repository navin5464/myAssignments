package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		// Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		//Maximise the window
		driver.manage().window().maximize();
		
		// Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		// Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Naveen");
		
		// Enter the last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		
		
		// Enter the mobile number
		driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number')]")).sendKeys("1234567890");
		
		// Enterthe password
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Naviieen@5464");
		
		//  Handle all the three drop downs
		
		Select dateDropdown = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
		dateDropdown.selectByValue("2");
		
		
		Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
		monthDropdown.selectByIndex(11);
		
		Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
		yearDropdown.selectByVisibleText("1994");
		
		// Select the radio button "Female" 
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
		//Close browser
		driver.close();
		            
	}

}
