package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeyConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement firstName=driver.findElement(By.id("input-firstname"));
		WebElement lastName=driver.findElement(By.id("input-lastname"));
		
		String name="Selenium";
		StringBuilder sb=new StringBuilder("SendKeys");
		StringBuffer sf=new StringBuffer("Concept");
		firstName.sendKeys(name,sb,sf);
		lastName.sendKeys(null);//it will throw the exception value cannot be null on send keys

	}

}
