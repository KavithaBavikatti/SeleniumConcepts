package SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	WebDriver driver;
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
		
	}
	
	public  List<WebElement> getElements(By locator){
		return driver.findElements(locator);
	}
	
	public void doSendKeys(By locator,String value) {
		 getElement(locator).sendKeys(value);;
		
	}
	
	public void doClick(By locator) {
		 getElement(locator).click();
		
	}
	
	public String getElementText(By locator) {
		 return getElement(locator).getText();
		
	}
	
	public boolean doElementIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public  void doClick(String locatorType, String locatorValue) {
		getElement(getLocator(locatorType, locatorValue)).click();
	}	
	
	public  void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(getLocator(locatorType, locatorValue)).sendKeys(value);
	}
	
	
	
	public  boolean isElementDisplayed(By locator) {
		if(getElements(locator).size()==1) {
			System.out.println("Element is available on the page");
			return true;
		}
		else {
			System.out.println("Element is not available on the page");
			return false;
		}
			
		
	}
	
	public  boolean isElementDisplayed(By locator, int elementCount) {
		if(getElements(locator).size()== elementCount) {
			System.out.println("Element is available on the page " +elementCount+ " times");
			return true;
		}
		else {
			System.out.println("Element is not available on the page");
			return false;
		}
			
		
	}
	
	public  boolean doIsElementDisplayed(By locator) {
		try {
			getElement(locator).isDisplayed();
			System.out.println("Element is available on the page");
			return false;
			
		}
		catch (NoSuchElementException e) {
			System.out.println("Element is not available on the page");
			return false;
		}
	}
	
	public String doGetDomAttribute(By locator,String attributeName) {
		return getElement(locator).getDomAttribute(attributeName);
		
	}
	
	public String doGetDomProperty(By locator,String propName) {
		return getElement(locator).getDomProperty(propName);
		
	}
	
	
	public By getLocator(String locatorType, String locatorValue) {

		By locator = null;

		switch (locatorType.toUpperCase().trim()) {
		case "ID":
			locator = By.id(locatorValue);
			break;
		case "NAME":
			locator = By.name(locatorValue);
			break;
		case "CLASSNAME":
			locator = By.className(locatorValue);
			break;
		case "XPATH":
			locator = By.xpath(locatorValue);
			break;
		case "CSS":
			locator = By.cssSelector(locatorValue);
			break;
		case "LINKTEXT":
			locator = By.linkText(locatorValue);
			break;
		case "PARTIALLINKTEXT":
			locator = By.partialLinkText(locatorValue);
			break;
		case "TAGNAME":
			locator = By.tagName(locatorValue);
			break;

		default:
			System.out.println("invalid locator, please use the right locator...");
			break;
		}

		return locator;

	}



}
