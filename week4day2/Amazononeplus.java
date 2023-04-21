package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazononeplus {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		System.out.println(price);
		//Thread.sleep(3000);
		
		WebElement custRatings = driver.findElement(By.xpath("//span[text()='3.0 out of 5 stars']"));
		Actions hover = new Actions(driver);
		Thread.sleep(3000);
		hover.moveToElement(custRatings).click().perform();
		Thread.sleep(9000);
		String text = driver.findElement(By.xpath("//div[@class='a-icon-row a-spacing-small a-padding-none']")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]")).click();	
		Set<String> amazonChild = driver.getWindowHandles();
		List<String> childwindow = new ArrayList<String>(amazonChild);
		driver.switchTo().window(childwindow.get(1));
		
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Screenshots/amazonchild.png");
		FileUtils.copyFile(scr, dst);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		String cartSubTotal = driver.findElement(By.xpath("//div[@class='a-column a-span11 a-text-left a-spacing-top-large']")).getText();
		Thread.sleep(2000);
		System.out.println(cartSubTotal);
		Thread.sleep(2000);

			if(cartSubTotal.contains("38,899")) {
				System.out.println("The price of the mobile is correct");
			}else {
				System.out.println("The price has deviated");
				}
			driver.quit();
	}

}
