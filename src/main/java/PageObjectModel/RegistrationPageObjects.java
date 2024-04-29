package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPageObjects {
	
	public WebDriver driver;
	
	//we will store locators here
	private By myAccount = By.xpath("//a[@title='My Account']");
	private By Register = By.xpath("//a[text()='Register']");
	private By FirstName = By.xpath("//input[@name='firstname']");
	private By LastName = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By telephone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By confirmpassword = By.xpath("//input[@name='confirm']");
	private By checkbox= By.xpath("//input[@type='checkbox']");
	private By submit = By.xpath("//input[@type='submit']");
	private By actual =By.xpath("//h1[text()='Your Account Has Been Created!']");
	private By fnactual = By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	
	
	
	public RegistrationPageObjects(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	
	}
	public WebElement clickonMyAccount() {
    	return driver.findElement(myAccount);
    }
    public WebElement clickonRegister() {
    	return driver.findElement(Register);
    }
    public WebElement EnterFirstName() {
    	return driver.findElement(FirstName);
    }
    public WebElement EnterLastName() {
    	return driver.findElement(LastName);
    }
    public WebElement Enteremail() {
    	return driver.findElement(email);
    }
    public WebElement Entertelephone() {
    	return driver.findElement(telephone);
    }
    public WebElement Enterpassword() {
    	return driver.findElement(password);
    }
    public WebElement Enterconfirmpassword() {
    	return driver.findElement(confirmpassword);
    }
    public WebElement clickoncheckbox() {
    	return driver.findElement(checkbox);
    }
    public WebElement clickonsubmit() {
    	return driver.findElement(submit);
    }
    public WebElement ActualText() {
    	return driver.findElement(actual);
    } 
    public WebElement FirstnameActualText() {
    	return driver.findElement(fnactual);
    
}
}