package SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterationPageTest {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName=By.id("input-firstname");
		By lastName=By.id("input-lastname");
		By email=By.id("input-email");
		By telephone=By.id("input-telephone");
		
		By password=By.id("input-password");
		By confirmPwd=By.id("input-confirm");
		By radioSubscribe=By.xpath("//input[@value='0']");
		By checkboxPolicy=By.name("agree");
		
		By buttonContinue=By.xpath("//input[@value='Continue']");
		
		ElementUtil eUtil=new ElementUtil(driver);
		eUtil.doSendKeys(firstName, "Shanvi");
		eUtil.doSendKeys(lastName, "Satish");
		eUtil.doSendKeys(email, "Shanvi@gmail.com");
		eUtil.doSendKeys(telephone, "1234567878");
		eUtil.doSendKeys(password, "Shanvi");
		eUtil.doSendKeys(confirmPwd, "Shanvi");
		
		eUtil.doClick(radioSubscribe);
		eUtil.doClick(checkboxPolicy);
		eUtil.doClick(buttonContinue);
		
		By successMessg = By.tagName("h1");
		
		String msg=eUtil.getElementText(successMessg);
		if(msg.contains("Your Account Has Been Created!")) {
			System.out.println("user is created -- pass");
		} else {
			System.out.println("user reg is failed");
		}

	}

}
