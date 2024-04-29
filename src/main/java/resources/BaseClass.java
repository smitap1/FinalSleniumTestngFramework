package resources;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
	//browser code
	public WebDriver driver;
	public Properties prop;
	public static String email =generateRandomEmail();
	
	
	 public void driverInitialization() throws IOException {
		 FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	
	 //access the data from properties file
         prop= new Properties();
		 prop.load(fis);
		 String browserName =prop.getProperty("browser");
		 if (browserName.equalsIgnoreCase("chrome")) {
			  driver = new ChromeDriver();
			 
		 }
		 else if (browserName.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
		 }else if(browserName.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();
		 }else {
			 System.out.println("Please choose proper driver value");
		 }

		 
	 }
		public static String generateRandomEmail() {
			return "abc"+ System.currentTimeMillis() + "@gmail.com";
		}
		
		@BeforeMethod
		
		public void LaunchBrowserandUrl() throws IOException {
		
		driverInitialization();
		
		driver.get(prop.getProperty("url"));
		 
}
}
		
		
