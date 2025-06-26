package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightNavigationLinksUsingFindElements {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> allLinks=driver.findElements(By.cssSelector(".list-group a"));
		Thread.sleep(5000);
		System.out.println(allLinks.size());
		for(WebElement e:allLinks) {
			System.out.println(e.getText());
		}

	}

}
