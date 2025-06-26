package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcepts {
	static WebDriver driver;

	public static void main(String[] args) {
				
		driver = new ChromeDriver();//123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// create a webelement + perform an action(click, sendkeys, gettext,isDisplayed...)
		// FE + click, sendKeys, getText....

		// 1. Approach
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("naveen@123");

		// 2. Approach
//		WebElement emailId_ele = driver.findElement(By.id("input-email"));
//		WebElement pwd_ele = driver.findElement(By.id("input-password"));
//		
//		emailId_ele.sendKeys("naveen@gmail.com");
//		pwd_ele.sendKeys("naveen@123");

		// 3. By locator: object repository
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement emailId_ele = driver.findElement(email);
//		WebElement pwd_ele = driver.findElement(password);
//		
//		emailId_ele.sendKeys("naveen@gmail.com");
//		pwd_ele.sendKeys("naveen@123");

		// 4. By locator + generic function for webelement:
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(email).sendKeys("naveen@gmail.com");
//		getElement(password).sendKeys("naveen@123");
		
		//5. By locator + generic function for webelement + generic function for action(sendkeys)
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(email, "naveen@gmail.com");
//		doSendKeys(password, "naveen@123");
		
		//6. By locator + generic function for webelement + generic function for action(sendkeys) - in ElementUtil
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(email, "kavitha@gmail.com");
		elUtil.doSendKeys(password, "Test@123");
		
		//7. By locator + BrowserUtil+ElementUtil

	}
	
//	public static void doSendKeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//	}
//
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}

		
	

}
