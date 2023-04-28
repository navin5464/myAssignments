package marathon1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginsalesforce2 extends Baseclassmarathon {
	
	@BeforeTest
	public void setData() {
		filename="name&amount";
	}

	@Test(dataProvider = "fetchdata")
	public void Loginsalesforce2(String oppName, String amount) throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(2000);
		WebElement scroll = driver.findElement(By.xpath("//span[text()='View All Key Deals']"));
		Actions scrollDown = new Actions(driver);
		scrollDown.scrollToElement(scroll).perform();
		Thread.sleep(2000);
		WebElement viewAllKeyFields = driver.findElement(By.xpath("//span[text()='View All Key Deals']"));
		driver.executeScript("arguments[0].click()", viewAllKeyFields);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@name='Amount']")).sendKeys(amount);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(oppName);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).sendKeys("29/04/2023");
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input-value')])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		WebElement dropDown1 = driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input-value')])[2]"));
		driver.executeScript("arguments[0].click()", dropDown1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='New Customer']")).click();
		driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input-value')])[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Partner Referral']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search Campaigns...']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='New Campaign']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class=' input'])[1]")).sendKeys("New Campaign by Jahnavi");
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String OppNameFinal = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		Thread.sleep(2000);
		if (OppNameFinal.equals(oppName)) {
			System.out.println("Opportunity Name is verified");
		} else {
			System.out.println("Opportunity Name is wrong");
		}
	}

}
