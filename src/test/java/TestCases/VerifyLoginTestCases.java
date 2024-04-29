package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjects;
import PageObjectModel.RegistrationPageObjects;
import resources.BaseClass;
import resources.CommonMethods;
import resources.constant;

public class VerifyLoginTestCases extends BaseClass {
	@Test
	public void VerifyLoginWithvalidData() throws IOException, InterruptedException {
		RegistrationPageObjects rpo = new RegistrationPageObjects(driver);
		  
		rpo.clickonMyAccount().click();

		
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.ClickonLogin().click();
		lpo.enteremail().sendKeys(email);
		lpo.enterpassword().sendKeys(constant.password);
	    lpo.clickonLoginButton().click();
	/*
	SoftAssert sa = new SoftAssert();  
	String actual = lpo.Entervalidpassword().getText();
    String expected = constant.expectedlogin;
    sa.assertEquals(actual, expected);
    sa.assertAll();*/
	    CommonMethods.HandleAssertion(lpo.Entervalidpassword().getText(), constant.expectedlogin);
		
	}
	@Test
public void VerifyLoginWithInvalidData() throws IOException, InterruptedException {
		RegistrationPageObjects rpo = new RegistrationPageObjects(driver);
		  
		rpo.clickonMyAccount().click();

		LoginPageObjects lpo = new LoginPageObjects(driver);
		lpo.ClickonLogin().click();
		lpo.enteremail().sendKeys(email);
		
		lpo.enterpassword().sendKeys(constant.InvalidPassword);
	lpo.clickonLoginButton().click();
	
	/*SoftAssert sa = new SoftAssert();  
	String actual = lpo.invalidactual().getText();
    String expected = constant.expectedInvalidlogin;
    sa.assertEquals(actual, expected);
    sa.assertAll();*/
	CommonMethods.HandleAssertion(lpo.invalidactual().getText(), constant.InvalidPassword);
}
}
