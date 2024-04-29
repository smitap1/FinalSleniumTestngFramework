package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.RegistrationPageObjects;
import resources.BaseClass;
import resources.CommonMethods;
import resources.constant;

public class VerifyRegistrationTestCases extends BaseClass {

		
	
	
	@Test
	public void verifyRegistrationwithValidData() throws IOException, InterruptedException {
		
		
		RegistrationPageObjects rpo = new RegistrationPageObjects(driver);
		  
		rpo.clickonMyAccount().click();
		rpo.clickonRegister().click();
		rpo.EnterFirstName().sendKeys(constant.firstname);
		rpo.EnterLastName().sendKeys(constant.lastname);
		rpo.Enteremail().sendKeys(email);
		//CommonMethods.HandleWait(driver, 10, rpo.Entertelephone());
		rpo.Entertelephone().sendKeys(constant.phone);
		rpo.Enterpassword().sendKeys(constant.password);
		rpo.Enterconfirmpassword().sendKeys(constant.confirmpassword);
		rpo.clickoncheckbox().click();
		rpo.clickonsubmit().click();
		
		/*SoftAssert sa = new SoftAssert();  
		String actual = rpo.ActualText().getText();
	    String expected = constant.ExpectedRegistration;
	    	 sa.assertEquals(actual, expected);
	    sa.assertAll();*/
		
		CommonMethods.HandleAssertion(rpo.ActualText().getText(), constant.ExpectedRegistration);
}
	@Test  
	public void verifyRegistrationwithInValidData() throws IOException {
		
		
		RegistrationPageObjects rpo = new RegistrationPageObjects(driver);
		  
		rpo.clickonMyAccount().click();
		rpo.clickonRegister().click();
		rpo.clickonsubmit().click();
		
		/*SoftAssert sa = new SoftAssert();  
		String fnactual = rpo.FirstnameActualText().getText();
	    String fnexpected = constant.ExpectedFirstName;
	    sa.assertEquals(fnactual, fnexpected);
	    sa.assertAll();*/
		CommonMethods.HandleAssertion(rpo.FirstnameActualText().getText(), constant.ExpectedFirstName);
}
}

