package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {//we make/write here common methods for all common code in a project.
	
	
	public static void DropDownHandle(WebElement dropdownxpath,int dropdownxValue  ) {
		//we write here common code of all dropdown
		Select s=new Select(dropdownxpath);//in bracket we write xpath in webelement form.
	     s.selectByIndex(dropdownxValue);//whatever index parameter we put signup that automatically come under these file parameter.
	                                     //to choose dynamic index
		//s.selectByValue("dropdownxValue");//string
		//s.deselectByVisibleText("dropdownxValue");//string.just change parameter type from int to string .
	}
	
	
	//common for both login and signup.
public static void handleAssertion(String actual , String expected) {
		
		
		SoftAssert Assertion=new SoftAssert();
		 Assertion.assertEquals(actual, expected); //this two known as validation point.we are comparing here.
	    // System.out.println("hello i am java");//no need of this line .put if you want to print
	      Assertion.assertAll();

	}
	
	
	
}

