package week2day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnadvancedxpath {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("DemoCsr");
		driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//form[@id='login']//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		driver.findElement(By.xpath("(//input[@class='inputBox'])[1]")).sendKeys("Testleaf");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("Navin");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[4]")).sendKeys("Kumar");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("Auto");
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])")).click();
	}

}
