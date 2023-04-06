package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createcontact {

	public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("navin");
		driver.findElement(By.id("lastNameField")).sendKeys("kumar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("na");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("M");
	    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mech");
		driver.findElement(By.id("createContactForm_description")).sendKeys("starting to learn automation");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("naveen.ambrish@gmail.com");
		Select state=new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
		state.selectByVisibleText("New York");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("I am a tester");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}

}
