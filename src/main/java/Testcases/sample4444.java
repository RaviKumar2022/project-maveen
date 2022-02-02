package Testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample4444 {

	public static WebDriver driver;

	public static String readdata(String key) throws IOException {
		
		Properties properties = new Properties();
		FileInputStream fileinputstream = new FileInputStream("D:\\Workspace\\ProjectMaveen\\facebookdata");
		properties.load(fileinputstream);
		String value = properties.getProperty(key);
		return value;
	}    
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
			 
			 System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\ProjectMaveen\\Drivers1\\chromedriver.exe");
	    	 driver = new ChromeDriver();
	    	 driver.manage().window().maximize();
	    	 driver.navigate().to("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&prevRID=ST8N7TDJ61TJK6XFBTFX&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    	 
		   ;
		     Thread.sleep(3000);
		   
		    	 driver.findElement(By.id("\"ap_customer_name\"")).sendKeys(readdata("name"));
	}

}
