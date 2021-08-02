package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectbyvisiblewithmuldrpdwn {
	
		static WebDriver driver;
		
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://Users//jagadish//Downloads//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.univariety.com/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("new-user-tab")).click();
		Thread.sleep(3000);
		
		WebElement School = driver.findElement(By.xpath("//*[@id='select2-ShopSignupFormModel_schoolname-container']"));
		WebElement Board = driver.findElement(By.id("board"));
		WebElement Class = driver.findElement(By.id("grade"));
		
		/*Select select = new Select(School);
		select.selectByVisibleText("Meridian School");
		
		Select select1 = new Select(Board);
		select1.selectByVisibleText("CBSE");
		
		Select select2 = new Select(Class);
		select2.selectByVisibleText("10");*/

		String Categories = "Meridian School-CBSE-10";
		String CategoriesArr[] = Categories.split("-");
		
		Selectvaluefromdropdown(School, "CategoriesArr[0]");
		Selectvaluefromdropdown(Board, "CategoriesArr[1]");
		Selectvaluefromdropdown(Class, "CategoriesArr[2]");		
		
		
	}

		public static void Selectvaluefromdropdown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	
	
}
