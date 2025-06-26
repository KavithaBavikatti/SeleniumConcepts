package SeleniumConcepts;

import java.time.Duration;
import java.util.List;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablePaginationMultiSelection {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(6000);
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {
				verifyMultipleCountrySelection("India");
			}
			//Pagination logic 
			//Element not present in first page click next button
			
			WebElement nextButton=driver.findElement(By.cssSelector("button.next"));
			if(nextButton.getDomAttribute("class").contains("disabled")) {
				System.out.println("Pagination is over.. Country not found");
				break;
			}
			nextButton.click();
			Thread.sleep(1000);
			
		}
		
	}
	
	public static void verifyMultipleCountrySelection(String countryName) {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> checkboxes = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
			    By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")));
		
		checkboxes.stream().forEach(e -> e.click());
		//driver.
			//findElements(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']"))
			//.stream()
				//.forEach(e -> e.click());		
	}

}
