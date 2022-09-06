package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObjects {
	public WebDriver driver;
	
private By firstname = By.xpath("//input[@name='UserFirstName']");
private By lastname= By.xpath("//input[@name='UserLastName']");
private By jobtitle  = By.xpath("//select[@name='UserTitle']");
private By employees = By.xpath("//select[@name='CompanyEmployees']");
private By WorkEmail = By.xpath("//input[@name='UserEmail']");
private By Company = By.xpath("//input[@name='CompanyName']");
private By Phone = By.xpath("//input[@name='UserPhone']");
private By Country = By.xpath("//select[@name='CompanyCountry']");	
private By state  = By.xpath("//select[@name='CompanyState']");	

	
public SignUpPageObjects(WebDriver driver2) {
	
	this.driver=driver2;
}


public WebElement Enterfirstname () {
	
	return driver.findElement(firstname);
	}
	

public WebElement selectjobtitle() {
	
	return driver.findElement(jobtitle);//this is dropdown.select tagname.use select class.
	

}
	
public WebElement selectemployees() {
	
	return driver.findElement(employees);//this is dropdown.select tagname.use select class.
	
	
}
	
public WebElement Enterlastname () {
	
	return driver.findElement(lastname);
	
}

public WebElement EnterWorkEmail() {
	
	return driver.findElement(WorkEmail);	
	
}


public WebElement EnterCompany() {
	
	return driver.findElement(Company);
	
}


public WebElement EnterPhone() {
	
	return driver.findElement(Phone);
	
}


public WebElement EnterCountry() {
	
	return driver.findElement(Country);
	
}


public WebElement Selectstate() {
	
	return driver.findElement(state);
	
}

	
	
	
	
	
	
	
	
	
	
	
}
