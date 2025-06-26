package SeleniumConcepts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForwardSimulation {
	
	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.navigate().to("https://www.google.com");
		System.out.println(driver.getTitle());//Google
		
		//driver.navigate().to("https://www.amazon.com/");
		driver.navigate().to(new URL("https://www.amazon.com/"));
		
		//driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());//Amazon
		
		driver.navigate().back();
		System.out.println(driver.getTitle());//Google

		driver.navigate().forward();
		System.out.println(driver.getTitle());//Amazon

		driver.navigate().back();
		System.out.println(driver.getTitle());//Google
		
		driver.navigate().refresh();//refresh the page
		
		
		//get vs to:
		//both are same
		//to() is calling get() method internally
		//to() is overloaded: to(String url) and to(URL url)
		//get(String url)
		
	}

}
