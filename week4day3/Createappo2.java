package week4day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Createappo2 {
    @Test
	public void runCreateappo2() throws InterruptedException {
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
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='22']")).click();
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		String alt = driver.findElement(By.xpath("//div[@class='fieldLevelErrors']")).getText();
			if(alt.contains ("the following fields")){
					System.out.println("Error has appeared: "+"\n"	+alt);
			}else {
				System.out.println("error not appeared");
			}
			driver.close();

	}

}
