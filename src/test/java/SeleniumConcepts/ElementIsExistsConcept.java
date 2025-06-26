package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsExistsConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By username1=By.id("input-email");
		isElementDisplayed(username1);
		
		By username=By.id("Kavitha");		
		doIsElementDisplayed(username);
		
		By forgotPwd=By.linkText("Forgotten Password");
		isElementDisplayed(forgotPwd, 2);

	}
	
	public static List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public static boolean isElementDisplayed(By locator) {
		if(getElements(locator).size()==1) {
			System.out.println("Element is available on the page");
			return true;
		}
		else {
			System.out.println("Element is not available on the page");
			return false;
		}
			
		
	}
	
	public static boolean isElementDisplayed(By locator, int elementCount) {
		if(getElements(locator).size()== elementCount) {
			System.out.println("Element is available on the page " +elementCount+ " Times");
			return true;
		}
		else {
			System.out.println("Element is not available on the page");
			return false;
		}
			
		
	}
	
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static boolean doIsElementDisplayed(By locator) {
		try {
			getElement(locator).isDisplayed();
			System.out.println("Element is available on the page");
			return false;
			
		}
		catch (NoSuchElementException e) {
			System.out.println("Element is not available on the page");
			return false;
		}
	}

}
