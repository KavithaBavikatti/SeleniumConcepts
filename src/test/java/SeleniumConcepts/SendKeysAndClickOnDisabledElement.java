package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysAndClickOnDisabledElement {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		WebElement passEle=driver.findElement(By.id("pass"));//Element is disabled
		passEle.sendKeys("Test123");//ElementNotInteractableException: element not interactable
		passEle.click();//No error
		String isPassDisabled=passEle.getDomAttribute("disabled");
		System.out.println(isPassDisabled);//true

	}

}
