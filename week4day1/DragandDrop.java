package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(0);
		WebElement dra = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions Act = new Actions(driver);
		Act.dragAndDropBy(dra, 193, 0).perform();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
