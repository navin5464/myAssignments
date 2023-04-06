package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Navin");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("naveen.ambrish@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123456789");
		
		Select options = new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		options.selectByIndex(4);
		
		Select auto = new Select(driver.findElement(By.id("createLeadForm_marketingCampaignId")));
		auto.selectByVisibleText("Automobile");
		
		Select corp = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
		corp.selectByValue("OWN_SCORP");
		
		driver.findElement(By.name("submitButton")).click();
	}

}
