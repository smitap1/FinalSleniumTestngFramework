package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	//we will store locators here
	private By login= By.xpath("//a[text()='Login']");
	private By email = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By loginButton = By.xpath("//input[@type='submit']");
	private By validactualpassword = By.xpath("//h2[text()='My Account']"); 
	private By actual =By.xpath("//div[@class='alert alert-danger alert-dismissible']");
	
	
	
	public LoginPageObjects(WebDriver driver2) {
		this.driver =driver2;
	}
	public WebElement ClickonLogin() {
    	return driver.findElement(login);
	}
	public WebElement enteremail() {
    	return driver.findElement(email);
    }
    public WebElement enterpassword() {
    	return driver.findElement(password);
    }
    public WebElement clickonLoginButton() {
    	return driver.findElement(loginButton);
    }
    public WebElement Entervalidpassword() {
    	return driver.findElement(validactualpassword);
    }
    public WebElement invalidactual() {
    	return driver.findElement(actual);
    }
    
    
    
}
