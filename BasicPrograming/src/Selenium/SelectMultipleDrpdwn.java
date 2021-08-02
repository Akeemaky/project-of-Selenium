package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectMultipleDrpdwn {
		static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://Users//jagadish//Downloads//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.univariety.com/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.linkText("Log In")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("new-user-tab")).click();
		Thread.sleep(3000);
		
		String SelectSchool_xpath = "//select[@id='ShopSignupFormModel_schoolname']//option";
		String Board_xpath = "//select[@id='board']//option";
		String Class_xpath = "//select[@id='grade']//option";
		
		selectDropDownValue(SelectSchool_xpath, "Meridian School");
		selectDropDownValue(Board_xpath, "CBSE");
		selectDropDownValue(Class_xpath, "10");
		
	}

	public static void selectDropDownValue(String xpathvalue, String value) {
		List<WebElement> Board = driver.findElements(By.xpath(xpathvalue));
		System.out.println(Board.size());
		
		for(int i=0; i<Board.size(); i++)
		{
			System.out.println(Board.get(i).getText());
			if(Board.get(i).getText().equals(value)) {
				Board.get(i).click();
				break;
			}
		}
	}
	
	
	
	
}
