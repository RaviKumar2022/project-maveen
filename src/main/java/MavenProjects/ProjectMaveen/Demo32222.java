package MavenProjects.ProjectMaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo32222 {
       
	

	WebDriver driver;
	
	@BeforeTest
	public void launchbrowser() {
		//System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.navigate().to("http://www.facebook.com");
		
		
	}
	
	@Test
	public void testcase1() {
	String Tittle = driver.getTitle();
	String url = driver.getCurrentUrl();
	
	
	Reporter.log(Tittle, true);
	Reporter.log(url, true);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	
    	 
			
}

	
	

