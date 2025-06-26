package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinksUsingFindElements {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//total Links
		//print the text of each link if text is available
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links: "+allLinks.size());
		
		System.out.println("===========1: for Loop=========");
		for (int i = 0; i < allLinks.size(); i++) {
			String linkText=allLinks.get(i).getText();
			if(linkText.length()!=0)
			{
				System.out.println(linkText);
			}
			
		}
		System.out.println("===========2: foreach Loop=========");
		for(WebElement e:allLinks) {
			String linkText=e.getText();
			if(linkText.length()!=0)
			{
				System.out.println(linkText);
			}
			
		}
		
		System.out.println("=========3: Stream ==========");
		allLinks.stream().forEach(e->System.out.println(e.getText()));

	}

}
