package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapdealAssign {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.id("pushDenied"));
		WebElement mensfashion = driver.findElement(By.xpath("//span[contains(text(),' Fashion')]"));
		Actions act = new Actions(driver);
		act.moveToElement(mensfashion).perform();
		driver.findElement(By.xpath("(//span[contains(text(),'Sports Shoes')])[1]")).click();
		
		String shoecount = driver.findElement(By.className("child-cat-count")).getText();
		System.out.println("total count ofsport shoe: "+shoecount);
		
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
        driver.findElement(By.xpath("//i[contains(@class,'sort-arrow')]")).click();
        driver.findElement(By.xpath("(//li[@class='search-li'])[1]")).click();
        Thread.sleep(3000);
        
        String firstPrice = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[1]")).getText();
		String r1 = firstPrice.replaceAll("Rs. ", "");
		int firstPriceVal = Integer.parseInt(r1);
        String secondPrice = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])[2]")).getText();
		String s1 = secondPrice.replaceAll("Rs. ", "");
		int secondPriceVal = Integer.parseInt(s1);
		if(firstPriceVal<secondPriceVal) {
			System.out.println("The items are sorted as expected");
		}else {
			System.out.println("The items are unsorted");
		}
		
		WebElement prizefrom = driver.findElement(By.xpath("(//input[@class='input-filter'])[1]"));
		prizefrom.clear();
		prizefrom.sendKeys("500");
        WebElement prizeupto = driver.findElement(By.xpath("(//input[@class='input-filter'])[2]"));
        prizeupto.clear();
        prizeupto.sendKeys("1200");
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Navy']/parent::div")).click();
        Thread.sleep(3000);
        String filter = driver.findElement(By.xpath("(//div[@class='filters'])[1]")).getText();
		if(filter.contains("Price:") && filter.contains("Navy")){
			System.out.println("All filters are successfully applied");
		}	else {
			System.out.println("Filters are not applied");
		}
		
		WebElement mouseover = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(mouseover).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@supc='SDL901001171'])[2]")).click();
		
		String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		Thread.sleep(2000);
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("The price of the shoe is "+ price+ "with " +discount);
		
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snap/sd.png");
		FileUtils.copyFile(scr, dst);
		driver.close();
        
		
		
		
		
	}

}
