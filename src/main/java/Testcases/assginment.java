package Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class assginment {
	
	
	WebDriver driver;
	
    @BeforeTest
   public void launchBrowser() throws InterruptedException {
  	 System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\ProjectMaveen\\Drivers1\\chromedriver.exe");
  	 driver = new ChromeDriver();
  	 driver.manage().window().maximize();
  	 
   }

	
   public void navigateToURL(String URL) {
	   driver.navigate().to(URL);
	   
   }
   
   
      public void screenshot(WebDriver driver , String name ) throws IOException {
    	  TakesScreenshot scrshot = ((TakesScreenshot)driver);
    	  File  scrFile=scrshot.getScreenshotAs(OutputType.FILE);
    	  File destFile= new File("D:\\Workspace\\ProjectMaveen\\Screenshots");
    	  FileUtils.copyFile(scrFile, destFile);
      }
      @AfterTest
      public void closebrower() {
    	  driver.quit();
      }
      
      
      
      
//         @Test     
//        public void Scrolling() throws InterruptedException {
//        	navigateToURL("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
//        	Thread.sleep(3000);
//        	  JavascriptExecutor js = (JavascriptExecutor) driver;
//        	  js.executeScript("window.scrollBy(0,8000)","");
//        	  Thread.sleep(2000);
//        }
//         
//         
//      
//      @Test
//      public void windowhandles() throws InterruptedException {
//    	  navigateToURL("https://demo.guru99.com/popup.php");
//    	  driver.findElement(By.xpath("//a[text()='Click Here']")).click();
//	      
//          Thread.sleep(3000);
//          
//          String parentWindowHandles = driver.getWindowHandle();
//          System.out.println("parentWindowHandles-"+ driver.getTitle());
//          
//          Reporter.log(parentWindowHandles, true);
//          
//          Set<String> windowHandles=  driver.getWindowHandles();
//          
//          for (String windowHandle : windowHandles) {
//        	  driver.switchTo().window(parentWindowHandles);
//        	  System.out.println("windowHandles-"  + driver.getTitle());
//			Reporter.log(windowHandle, true);
//          }  
//      }
//      
//     
//          
//    
//              @Test   
//             public void dropdownsss() throws InterruptedException {
//            	 navigateToURL("https://www.facebook.com/");
//            	 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
//            	 Thread.sleep(3000);
//            	 WebElement day =driver.findElement(By.id("day"));
//            	 Select obj = new Select(day);
//            	 obj.selectByVisibleText("6");
//            	 Reporter.log("day", true);
//            	 Thread.sleep(1000);
//            	 
//            	WebElement month = driver.findElement(By.id("month"));
//            	Select obj2 = new Select(month);
//            	obj2.selectByValue("7");
//            	Thread.sleep(1000);
//            	
//            	WebElement year = driver.findElement(By.id("year"));
//            	Select obj3 = new Select(year);
//            	obj3.selectByIndex(7);
//            	 
//             }
//              
//              
//              
//              
//           @Test   
//     public void print() throws InterruptedException {
//    	 navigateToURL("https://www.amazon.in/");
//    	 Thread.sleep(2000);
//    	String tittle = driver.getTitle();
//    	Reporter.log(tittle, true);
//    	String url = driver.getCurrentUrl();
//    	Reporter.log(url, true);
//    	String pagesource = driver.getPageSource();
//    	Reporter.log(pagesource, true);
//    	 
//     }
//           
//           
//           
//           @Test
//           public void links() {
//        	   navigateToURL("https://www.google.com/");
//        	   List<WebElement> alllinks =driver.findElements(By.tagName("a"));
//        	   System.out.println(alllinks.size());
//        	   for (WebElement webElement : alllinks) {
//        		   System.out.println(alllinks);
//				
//			}
//        	   
//        	 
//           }
//           
           public void readingdata() throws IOException, InterruptedException {
        	   Properties properties= new Properties();
        	   
    		   FileInputStream fileInputStream= new FileInputStream("D:\\Workspace\\ProjectMaveen\\facebookdata");
    		  properties.load(fileInputStream);
    		  String url=properties.getProperty("url");
    		   String email =properties.getProperty("email");
    		   String password =properties.getProperty("password");
    		   driver.get(url);
    		   Thread.sleep(20000);
    		   screenshot(driver, "facebook");
    		   driver.findElement(By.id("email")).sendKeys(email);
    		   driver.findElement(By.id("pass")).sendKeys(password);
    		   Thread.sleep(2000);
    		   screenshot(driver, "facebook2");
    		   }
      } 
      


