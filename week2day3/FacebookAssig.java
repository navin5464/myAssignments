package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssig {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://en-gb.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.name("firstname")).sendKeys("naveen");
        driver.findElement(By.name("lastname")).sendKeys("kumar");
        driver.findElement(By.name("reg_email__")).sendKeys("123456789");
        driver.findElement(By.id("password_step_input")).sendKeys("Nani@5464");
        Select day = new Select(driver.findElement(By.id("day")));
		day.selectByValue("2");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Dec");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1994");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
	}

}
