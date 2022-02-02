package MavenProjects.ProjectMaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sample11111111111111111 {

	WebDriver driver;
	
	@Test
	public void launchbrowser() {
		//System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	
		
	}
	
	
	
     public void close() {
    	 driver.close();
			
}
}
