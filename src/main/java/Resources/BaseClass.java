package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass { //we write here only ones browser launch code and reuse it in other classes through inheritance(code reusebility.
	//esp we need it in test cases.
	public	WebDriver driver;
	public Properties prop;
	public WebDriver browserLaunch() throws IOException  {
		
		//System.getProperty("user.dir")+ =:we use at place of path of file so that it work in others pc without changing path.
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		
		
		//It reads the file.we pass the path of file(data.properties) in the bracket.
		//how to take path of file:-right click on data.properties-properties-location i.e path-copy and paste in bracket.'fis' contain driver=chrome
		
		
		//we have declared properties globally.
		prop=new Properties();//this will help to access the data.properties file.Properties is a class in java.
		                                 //we have created properties class object.
		prop.load(fis);//this method loads fis contain information i.e.file read info.we wanna access browser.
		
		//prop.get("browser");we have passed data.properties file's key in bracket .it will returns value of key.
		
		String browserName=prop.getProperty("browser"); //store chrome in browserName
		
		if(browserName.equalsIgnoreCase("chrome")) {
			                                //this line will work with already downloaded version of chrome only.
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\Anupam & Sanket\\Desktop\\105version\\chromedriver_win32\\chromedriver.exe");
			
			
	WebDriverManager.chromedriver().setup();//here we imported WebDriverManager.automatically work in updated  browser version which is in system.
	
	//WebDriverManager.chromedriver().driverVersion("105.0").setup();//this will run with particular browser
	
	driver = new ChromeDriver();
		
		
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			//firefox two lines code
			
		}
		                                                        //browserlaunch method help to return driver
		else if(browserName.equalsIgnoreCase("Edge")) {
			//Edge two lines code
			
		} 
		
		else {
			
			System.out.println("please select valid browser"); 
			
		}
		
		return driver;//we want this method should return driver.we use it in other classes.error pop up as inside method driver can't access
		                      //globally.therefore to access globally,we have to declare it global
		                    //method is void and return type is driver is not right ,we have to make return type webdriver
}
	
	
	//this will run before each test/method to launch browser.
	@BeforeMethod
   public void	LaunchBrowser() throws IOException {
	
		
         browserLaunch();
         
		driver.get(prop.getProperty("url"));//we have kept url in data.property and we access it .
		
	
	
	}
	
	@AfterMethod
	   public void	CloseBrowser()   {
		
			
	      driver.quit();
		
		}
}
