package Testcases;

import java.sql.Driver;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolloperatins {
	
	private static final Object Element = null;
	WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\ProjectMaveen\\Drivers1\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.navigate().to("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
	     Thread.sleep(3000);
	}
	
	     @Test
        public void scroll() throws InterruptedException {
        	
        	  JavascriptExecutor js = (JavascriptExecutor) driver;
        	  js.executeScript("window.scrollBy(0,8000)","");
        	  Thread.sleep(2000);
//        	  js.executeAsyncScript("window.scrollBy(0,-7000)", "");
//        	 Thread.sleep(2000);
        }	
	     
	      @AfterTest
	     public void closeBrowser() {
		       driver.quit();
	}

}
