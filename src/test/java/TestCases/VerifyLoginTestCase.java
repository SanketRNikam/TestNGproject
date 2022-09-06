package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.BaseClass;
import Resources.CommonUtilities;
import Resources.TestCaseData;
import pageObjectModel.LoginPageObject;

public class VerifyLoginTestCase extends BaseClass {//we write test case here 
	//extends(Inheritance) BaseClass becouse it contain browser code
	//ask import if extend from one package to another but if extend from one class to another class in same package,it don't ask to import.
	
	
	@Test
	public void login() throws IOException {
		//here we write 1 test
		//browserLaunch();//no need writing two line code to launch browser      we have modified this by using before method in base class
		//this driver has scope
		//driver.get("https://login.salesforce.com/?locale=in");
		
		LoginPageObject lpo=new LoginPageObject(driver);// create this class object and call all methods.
		
		lpo.EnterUsername().sendKeys(TestCaseData.username) ;//hard coded data which has passed in sendkeys,this is not allowed.we keep it
		                                                     //in seperate file and access from there.
		lpo.Enterpassword().sendKeys(TestCaseData.password);
		
		lpo.EnterLoginButton().click();
		
		String expected=TestCaseData.expectedMessage;
		
	    String actual=driver.findElement(By.xpath("//div[@id='error']")).getText();//Xpath  and getTest of actual error message .this will come after 
	                                                                                       //script run
	
	    CommonUtilities.handleAssertion(actual,expected);
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
