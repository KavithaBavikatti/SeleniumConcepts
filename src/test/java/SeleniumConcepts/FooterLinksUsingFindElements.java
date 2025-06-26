package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinksUsingFindElements {

	static WebDriver driver;
	
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//get all footer link and print the text on the console
		List<WebElement> footerLinks=driver.findElements(By.xpath("//footer//a"));
		
		System.out.println(footerLinks.size());
		for(WebElement e:footerLinks) {
			System.out.println(e.getText());
		}

	}

}
