package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Univariety {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://Users//jagadish//Downloads//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.univariety.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		/*Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Schools"))).build().perform();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Subject Selection")).click();*/
		
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("new-user-tab")).click();
		driver.findElement(By.id("ShopSignupFormModel_email")).sendKeys("peterparker@gmail.com");
		driver.findElement(By.id("ShopSignupFormModel_password")).sendKeys("12341234");
		driver.findElement(By.id("ShopSignupFormModel_mobile")).sendKeys("9999000011");
		driver.findElement(By.id("ShopSignupFormModel_firstname")).sendKeys("peter");
		driver.findElement(By.id("ShopSignupFormModel_lastname")).sendKeys("parker");
		Thread.sleep(3000);
		
		Select select =new Select(driver.findElement(By.id("select2-ShopSignupFormModel_schoolname-container")));
		select.selectByVisibleText("Meridian School");
		Thread.sleep(3000);
		Select select1 = new Select(driver.findElement(By.id("select2-board-container")));
		select1.selectByVisibleText("CBSE");
		Thread.sleep(3000);
		Select select2 = new Select(driver.findElement(By.id("select2-grade-container")));
		select2.selectByVisibleText("Class 10");
		driver.findElement(By.linkText("Signup")).click();
		
		
		
		
	}

}
