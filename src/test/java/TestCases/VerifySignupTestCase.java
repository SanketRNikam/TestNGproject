package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;
import pageObjectModel.LoginPageObject;
import pageObjectModel.SignUpPageObjects;

public class VerifySignupTestCase extends BaseClass {
	
	
	@Test
	public void SignUp() throws IOException, InterruptedException {
		
		//browserLaunch();                                           we have modified this
		//driver.get("https://login.salesforce.com/?locale=in");
		
	   LoginPageObject lpo=new LoginPageObject(driver);// create this class object and call all methods.
	
		lpo.ClickOntryforfree().click();

		
	Thread.sleep(5000);
	
	 String expected=TestCaseData.expectedTitle;//title should be stable.
	 String actualTitle=driver.getTitle();
	 CommonUtilities.handleAssertion(actualTitle,expected);
	 
	//signup page from here
	
		SignUpPageObjects spo=new SignUpPageObjects(driver);// create this class object and call all methods.
	
		spo.Enterfirstname().sendKeys(TestCaseData.firstname);
	              //we donot need this code as we have created common method for these i.e.CommonUtilities(class),DropDownHandle(method)
		//Select s=new Select(spo.selectjobtitle());//this is static dropsown
	    // s.selectByIndex(1);
		 spo.Enterlastname () .sendKeys(TestCaseData.lastname);
	     spo.EnterWorkEmail().sendKeys(TestCaseData.email);
	     spo.EnterCompany().sendKeys(TestCaseData.company);
	     spo.EnterPhone().sendKeys(TestCaseData.phone);
	     
	     
	     CommonUtilities. DropDownHandle(spo.selectjobtitle(),1);
	     CommonUtilities. DropDownHandle(spo.selectemployees(),2);
	     CommonUtilities. DropDownHandle(spo.EnterCountry(),1);
	     CommonUtilities. DropDownHandle(spo.Selectstate(),1);

	    
	     
	     
	     
	     	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
