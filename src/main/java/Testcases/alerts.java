package Testcases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class alerts {
   
	WebDriver driver;
	      @BeforeTest
	     public void launchBrowser() throws InterruptedException {
	    	 System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\ProjectMaveen\\Drivers1\\chromedriver.exe");
	    	 driver = new ChromeDriver();
	    	 driver.manage().window().maximize();
	    	 driver.navigate().to("https://demo.guru99.com/popup.php");
	     }
	 
	      @Test
	     public void handlings () throws InterruptedException {
	    	 
	    	driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	      
	              Thread.sleep(3000);
	              
	              String parentWindowHandles = driver.getWindowHandle();
	              System.out.println("parentWindowHandles-"+ driver.getTitle());
	              
	              Reporter.log(parentWindowHandles, true);
	              
	              Set<String> windowHandles=  driver.getWindowHandles();
	              
	              for (String windowHandle : windowHandles) {
	            	  driver.switchTo().window(parentWindowHandles);
	            	  System.out.println("windowHandles-"  + driver.getTitle());
					Reporter.log(windowHandle, true);
				}
	     
	     
	     }

	       @AfterTest   
	      public void close() {driver.quit();}
	          
	         
}
