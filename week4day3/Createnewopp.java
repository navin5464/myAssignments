package week4day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Createnewopp {
    @Test
	public  void runCreatenewopp() throws InterruptedException {
		ChromeOptions dn = new ChromeOptions();
		dn.addArguments("--disable-notifications");
		ChromeDriver driver  = new ChromeDriver(dn);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		WebElement oppo = driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		driver.executeScript("arguments[0].click()", oppo);
		driver.findElement(By.xpath("//div[@title='New']")).click();
		WebElement opponame = driver.findElement(By.xpath("(//input[@part='input'])[3]"));
		opponame.sendKeys("Salesforce Automation by Naveen");
		opponame.getText();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='21']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		String verify = driver.findElement(By.xpath("//lightning-formatted-text[@slot='primaryField']")).getText();
		if(verify.equals("Salesforce Automation by Naveen")) {
			System.out.println("Opportunity Name is verified");
		}else {
			System.out.println("Opportunity Name is not verified");
		}
	Thread.sleep(2000);
	driver.close();
	}

}
