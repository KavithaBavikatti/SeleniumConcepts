package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementDisplayedDisabledChecked {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		WebElement passEle=driver.findElement(By.id("pass"));//Element is disabled
		WebElement firstName=driver.findElement(By.id("fname"));//Element is disabled
		
		boolean isdisplyed=passEle.isDisplayed();
		System.out.println(isdisplyed);//true
		
		boolean isEnabled=passEle.isEnabled();
		System.out.println(isEnabled);//false
		
		boolean isFirstNamedisplyed=firstName.isDisplayed();
		System.out.println(isFirstNamedisplyed);//true
		
		boolean isFirstNameEnabled=firstName.isEnabled();
		System.out.println(isFirstNameEnabled);//true
		
		driver.navigate().to("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement policyCheck=driver.findElement(By.xpath("//input[@name='agree']"));
		System.out.println(policyCheck.isSelected());
	}

}
