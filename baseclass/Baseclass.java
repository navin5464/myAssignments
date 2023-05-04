package baseclass;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.Readexcelintegration;

public class Baseclass extends AbstractTestNGCucumberTests {

private static final ThreadLocal<RemoteWebDriver> tdriver = new ThreadLocal<RemoteWebDriver>();
	
	public void setDriver() {
		tdriver.set(new ChromeDriver());
		tdriver.set(new EdgeDriver());
	}
	public RemoteWebDriver getDriver() {
		return tdriver.get();
	}
	/* public static ChromeDriver driver; */
	
	public String filename;
	
	
	@BeforeMethod
    public void Preconditions() {
  	   //driver  = new ChromeDriver();
		
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
	  @AfterMethod
      public void Postconditions() {
		  getDriver().close();
      }
	  
	  @DataProvider(name="fetchdata")
	  	public String[][] senddata() throws IOException {
	  		String [][] readData= Readexcelintegration.readData(filename);
	  		
	  		return readData;
	}
	  }
