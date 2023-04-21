package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandleandScreenshot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
		
		driver.findElement(By.linkText("FLIGHTS")).click();
		Set<String> wh = driver.getWindowHandles();
		List<String> handle = new ArrayList<String>(wh);
		driver.switchTo().window(handle.get(1));
		String title = driver.getTitle();
		System.out.println(title);
		
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File dst = new File("./snap/s.png");
		FileUtils.copyFile(scr, dst);
		driver.close();
		
		driver.switchTo().window(handle.get(0));
		String title2 = driver.getTitle();
		System.out.println(title2);
		driver.quit();
	}

}
