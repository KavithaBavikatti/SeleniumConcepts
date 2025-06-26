package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyWebElementList {


	static WebDriver driver;
	
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> allLinks=driver.findElements(By.cssSelector("kavitha"));//wrong locator
		
		System.out.println(allLinks.size());//returns 0 
	}

}
