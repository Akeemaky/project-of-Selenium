package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Launchbrowser {

		public static void main(String[] args) throws InterruptedException{
			 
			
			System.setProperty("webdriver.gecko.driver","C://Users//jagadish//Downloads//geckodriver.exe");
			 WebDriver driver = new FirefoxDriver();
			 driver.get("https://www.spicejet.com/");
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 //Thread.sleep(2000);
			 
			 Actions action = new Actions(driver);
			 action.moveToElement(driver.findElement(By.id("highlight-book"))).build().perform();
			 Thread.sleep(3000);
			 //Alert alert = driver.switchTo().alert();
			 //alert.dismiss();			 
			 //driver.findElement(By.xpath("//a[contains(text(),'Flights')]")).click();
			 driver.findElement(By.linkText("Hotels")).click();
			 Thread.sleep(4000);
			 driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txtOriginStation1_MST']")).sendKeys("agra");
			 Thread.sleep(3000);
			 
			 String title = driver.getTitle();
			 System.out.println(title);
			 
			 driver.close();
			 /*Select select = new Select(driver.findElement(By.linkText("VIDEOS")));
			 select.selectByVisibleText("Cucumber Video Tutorials");*/
			 
			 
		}
		
}