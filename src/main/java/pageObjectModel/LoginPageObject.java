package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPageObject {//we keep locators(xpath and others) of all login page object(we keep page vise locaters at one place).
	//driver.findElement(By.xpath("")).sendkeys();(here keep locators,constructor,methods)
	
	//hii my git
	
	//this driver doesnot have scope
	public WebDriver driver;
	//we have achieved encapsulation here.
	private By username= By.xpath("//input[@id='username']");//By is a locator.this is for username .privete=declare as variable privete and 
	                                                           //access  within the public method(encpsulation)
	private By password= By.xpath("//input[@id='password']");//this is for password.

	private By LoginButton = By.xpath("//input[@id='Login']");//this is for Login.private accessible within class only.
	private By tryforfree = By.xpath("//a[@id='signup_link']");
	
//this is constructor
	public LoginPageObject(WebDriver driver2) {//driver2 from LoginPageObject.
		
		this.driver=driver2;
	}
	
		


	public WebElement EnterUsername() {//we change return type WebElement.public method we can access in other classes
		
		
	return driver.findElement(username);//this is web element
		
	}//we have kept all locators at one place becouse if infuture any mistake did ,we can find that erroe here easily .

	
	public WebElement Enterpassword() {//we change return type WebElement
		
		return driver.findElement(password);//this is web element
			
		}
	public WebElement EnterLoginButton() {//we change return type WebElement
		
		return driver.findElement(LoginButton);//this is web element
			
		}
	
    public WebElement ClickOntryforfree() {//we change return type WebElement
		
		return driver.findElement(tryforfree);//this is web element
			
		}
		
	
}


