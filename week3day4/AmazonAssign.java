package week3.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssign {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
                      search.click();
                      search.sendKeys("Bags");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),' for boys')]")).click();
        String text = driver.findElement(By.xpath("//span[contains(text(),'1-48 of over 50,000 results for')]")).getText();
        String text2 = driver.findElement(By.xpath("//span[contains(text(),'for boys')][1]")).getText();
        System.out.println(text+" "+text2);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='brandsRefinements']//li/span/a[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@id='brandsRefinements']//li/span/a)[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
        driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		Thread.sleep(3000);
		String text3 = driver.findElement(By.xpath("(//h2[contains(@class,'a-spacing-none')]//span)[1]")).getText();
		System.out.println(text3);
		String text4 = driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base'])[1]")).getText();
		System.out.println(text4);
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(1000);
		driver.close();
        
	}

}
