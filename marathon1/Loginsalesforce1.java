package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginsalesforce1 extends Baseclassmarathon {
	@BeforeTest
	public void setData() {
		filename="question&details";
	}
	
		 @Test (dataProvider="fetchdata")
			public  void Loginsalesforce1(String question,String details) throws InterruptedException {
	
		driver.findElement(By.xpath("//input[@part='input']")).sendKeys("Content");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//mark[text()='Content']")).click();
		Thread.sleep(5000);
		WebElement wb = driver.findElement(By.xpath("//span[text()='Chatter']"));
        driver.executeScript("arguments[0].click();", wb);
        String title = driver.getTitle();
        System.out.println("Title :" +title);
        driver.findElement(By.xpath("//span[text()='Question']")).click();
        WebElement ques = driver.findElement(By.xpath("//textarea[@role='textbox']"));
        ques.sendKeys(question);
        WebElement det = driver.findElement(By.xpath("//div[@role='textbox']"));
        det.sendKeys(details);
        driver.findElement(By.xpath("//button[text()='Ask']")).click();
        String text = driver.findElement(By.xpath("//span[text()='how to practice selenium']")).getText();
        if(text.contains ("the following fields")){
			System.out.println("question appears: "+"\n"	+text);
	}else {
		System.out.println("question not appeared");
	}

}}
