package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalTextFieldsUsingFindElements {
	static WebDriver driver;
	public static void main(String[] args) {
		
		//total Images
		
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> totalTextFields=driver.findElements(By.className("form-control"));
		
		List<WebElement> regTextFields=driver.findElements(By.xpath("//form//input[@class='form-control']"));
		
		System.out.println(totalTextFields.size());//7
		System.out.println(regTextFields.size());//6
		
		
	}

}
