package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);
		//Single selection
		while(true) {
			//If country is present on the first page
			if(driver.findElements(By.xpath("//td[text()='Canada']")).size()>0) {
				selectSingleCountry("Canada");
				break;
				
			}
			else {
				//Pagination logic 
				//Element not present in first page click next button
				WebElement nextButton=driver.findElement(By.cssSelector("button.next"));
				if(nextButton.getDomAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over.. Country not found");
					break;
				}
				nextButton.click();
				Thread.sleep(5000);
			}
		}	

	}
	
	public static void selectSingleCountry(String countryName) {		
		driver.
			findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).
				click();
		
	}

}
