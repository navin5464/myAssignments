package week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundalertAssign {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Show'][1]")).click();
		Alert simplealert = driver.switchTo().alert();
		simplealert.accept();
		String text1 = driver.findElement(By.id("simple_result")).getText();
		System.out.println(text1);
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.dismiss();
		String text2 = driver.findElement(By.id("result")).getText();
		System.out.println(text2);
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Dismiss')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		driver.findElement(By.xpath("(//a[@role='button']//span)[2]")).click();	
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//driver.findElement(By.xpath("(//span[contains(text(),'Show')])[5]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Ambrose");
		alert.accept();
		String confirm_result = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(confirm_result);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,'ui-button-danger')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'ui-confirmdialog-yes')]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[contains(text(),'Show')])[6]")).click();
		driver.findElement(By.xpath("//a[contains(@class,'maximize ')]")).click();
		Thread.sleep(2000);
		driver.close();


	}

}
