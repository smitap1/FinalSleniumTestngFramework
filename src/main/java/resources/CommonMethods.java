package resources;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonMethods {
	public static void HandleAssertion(String actual,String expected) {
		
		SoftAssert sa = new SoftAssert();  
		String actualText = actual;
	    String expectedText = expected;
	    sa.assertEquals(actualText, expectedText);
	    sa.assertAll();
		
	}
	
   /*public static void HandleWait(WebDriver driver,int time,WebElement element) {
	   
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
	
	wait.until(ExpectedConditions.visibilityOf(element));*/
	
}
