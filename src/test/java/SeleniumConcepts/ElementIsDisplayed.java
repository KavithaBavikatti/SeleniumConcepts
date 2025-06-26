package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	
	static WebDriver driver ;

	public static void main(String[] args) {

		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		boolean flag = driver.findElement(By.id("input-email11")).isDisplayed();
//		System.out.println(flag);
		
		By email = By.id("input-email11");
		if(doElementIsDisplayed(email)) {
			getElement(email).sendKeys("kavitha@gmail.com");
		}
		else {
			System.out.println("element is not dislayed");
		}
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	

}
