package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderSelect {
		
	static WebDriver driver; 
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C://Users//jagadish//Downloads//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		
		//new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-div")));
		
		String monthyear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(monthyear);
		String month = monthyear.split(" ")[0].trim();
		String year = monthyear.split(" ")[1].trim();
		
		while(!(month.equals("October") && year.equals("2021"))){
			driver.findElement(By.xpath("//a[@title='Next']")).click();
			monthyear= driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(monthyear);
			month = monthyear.split(" ")[0].trim();
			year = monthyear.split(" ")[1].trim();
			}
	
		driver.findElement(By.xpath("//a[text()='20']")).click();
	
	}
	

}
