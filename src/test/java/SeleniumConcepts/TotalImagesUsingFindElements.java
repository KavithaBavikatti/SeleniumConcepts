package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImagesUsingFindElements {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//total Images
		
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> allImages=driver.findElements(By.tagName("img"));
		System.out.println("Total Links: "+allImages.size());
	}

}
