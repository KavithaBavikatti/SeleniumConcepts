package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchLinksHrefValuesORWebScraping {
static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		List<WebElement> allLinks=driver.findElements(By.cssSelector(".list-group a"));
		Thread.sleep(5000);
		
		System.out.println(allLinks.size());
		System.out.println("------------link href data------------");
		for(WebElement e:allLinks) {
			System.out.println(e.getDomAttribute("href"));
		}
		
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println("------------link img data------------");
		List<WebElement> allImg=driver.findElements(By.cssSelector("img"));
		for(WebElement e:allImg) {
			System.out.println(e.getDomAttribute("src"));
		}

	}

}
