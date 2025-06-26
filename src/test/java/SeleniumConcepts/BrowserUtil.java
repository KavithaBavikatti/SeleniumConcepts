package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;

	public WebDriver initDriver(String browserName) {
		System.out.println("browser name is: " + browserName);

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			throw new RuntimeException("===invalid browser===");
		}
		return driver;
	}
	
	public void launchUrl(String url) {
		if (url == null) {
			throw new RuntimeException("===Url can not be null===");
		}
		if (url.length() == 0) {
			throw new RuntimeException("===Url can not be blank or empty===");
		}

		if (url.indexOf("http") == 0) {
			driver.get(url);
		} else {
			throw new RuntimeException("===Invalid url: http/s missing in the url===");
		}
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getPageURL() {
		return driver.getTitle();
	}
	
	public String getCurrentURL() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		System.out.println("browser is closed");
		driver.close();
	}

	public void quitBrowser() {
		System.out.println("browser is quit");
		driver.quit();
	}
}
