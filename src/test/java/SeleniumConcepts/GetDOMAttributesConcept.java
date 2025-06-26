package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDOMAttributesConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By emailId=By.id("input-email");
		
		System.out.println(doGetDomAttribute(emailId, "placeholder"));
		
		System.out.println(doGetDomProperty(emailId, "attributeStyleMap"));

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetDomAttribute(By locator,String attributeName) {
		return getElement(locator).getDomAttribute(attributeName);
		
	}
	
	public static String doGetDomProperty(By locator,String propName) {
		return getElement(locator).getDomProperty(propName);
		
	}

}
