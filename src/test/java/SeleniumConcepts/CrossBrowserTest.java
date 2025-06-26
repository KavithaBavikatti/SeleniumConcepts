package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {

	public static void main(String[] args) {
		WebDriver driver;
		//driver.get("");
		String browserName="chrome";
		
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;

		default:
			System.out.println("Please pass the right browser....");
			throw new RuntimeException("======= Invalid Browser======");
		}
		driver.get("https://github.com/");

	}

}
