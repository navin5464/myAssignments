package week5day2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5day2.Readexcelintegration;

public class BaseclassAnnotations {
	public String filename;
	public RemoteWebDriver driver;
	
	@Parameters({"username","password","url","browser"})
	
	  @BeforeMethod
      public void Preconditions(String username,String password,String url,String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			 driver  = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("edge")) {
			driver  = new EdgeDriver();
		}
		 
  		driver.manage().window().maximize();
  		driver.get(url);
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
  		driver.findElement(By.id("username")).sendKeys(username);
  		driver.findElement(By.id("password")).sendKeys(password);
  		driver.findElement(By.className("decorativeSubmit")).click();
  		driver.findElement(By.linkText("CRM/SFA")).click();
	}
      @AfterMethod
      public void Postconditions() {
    	  driver.close();
      }
      
      @DataProvider(name="fetchdata")
  	public String[][] senddata() throws IOException {
  		String [][] readData= Readexcelintegration.readData(filename);
  		
  		return readData;
}
      }


