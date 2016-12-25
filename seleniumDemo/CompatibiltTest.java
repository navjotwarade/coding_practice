package seleniumDemo;




import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.WebDriver;

public class CompatibiltTest{
private WebDriver driver;


@Test
public void testChrome() throws InterruptedException{
	//Set up the setProperty according to the location of chromedriver.exe
  //	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pulkit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chimawarade\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//C:\\Users\\chimawarade\\Downloads\\chromedriver_win32\\chromedriver.exe
	driver= new ChromeDriver();
	driver.get("https://www.goibibo.com/");
	driver.manage().window().maximize();
	System.out.println("Loading the website Goibibo for checking compatibility with Chrome");
	Thread.sleep(5000);
	String title = driver.getTitle();
	Assert.assertEquals("Book Cheap Flights, Air Tickets, Hotels, Bus & Holiday Packages at Goibibo", title);
}
@Test
public void testExplorer() throws InterruptedException{
	//Set up the setProperty according to the location of iedriver.exe
	//System.setProperty("webdriver.ie.driver", "C:\\Users\\Pulkit\\Downloads\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe");
	System.setProperty("webdriver.ie.driver", "C:\\Users\\chimawarade\\Downloads\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	// C:\\Users\\chimawarade\\Downloads\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe
	driver= new InternetExplorerDriver();
	driver.navigate().to("https://www.goibibo.com/");
	driver.manage().window().maximize();
	System.out.println("Loading the website Goibibo to check compatibility with IE");
	Thread.sleep(5000);
	String title = driver.getTitle();
	Assert.assertEquals("Book Cheap Flights, Air Tickets, Hotels, Bus & Holiday Packages at Goibibo", title);
}
@Test
public void testFirefox() throws InterruptedException{
	driver= new FirefoxDriver();
	driver.get("https://www.goibibo.com/");
	driver.manage().window().maximize();
	System.out.println("Loading the website Goibibo on Firefox");
	Thread.sleep(5000);
	String title = driver.getTitle();
	Assert.assertEquals("Book Cheap Flights, Air Tickets, Hotels, Bus & Holiday Packages at Goibibo", title);
	
}
@AfterMethod
public void tearDown(){
	System.out.println("Closing the session.");
	if(driver!=null)
		driver.quit();
}
}

