package SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
//		// 1. open browser(chrome, ff, safri, edge)
//		WebDriver driver = new ChromeDriver();//123
//		// 2. enter url
//		driver.get("https://www.google.com");//123
//		// 3. get the page title
//		String title = driver.getTitle();//123
//		System.out.println("page title:" + title);
//
//		// 4. get url
//		String url = driver.getCurrentUrl();//123
//		System.out.println("page url:" + url);
//
//		// 5. close the browser
//		driver.quit();//123
//		
//		//sid=null
//		
//		driver = new ChromeDriver();//456
//		driver.get("https://www.google.com");//456
//		System.out.println(driver.getTitle());//456

		// close:
		// 1. open browser(chrome, ff, safri, edge)
		WebDriver driver = new ChromeDriver();// 123
		// 2. enter url
		driver.get("https://www.google.com");// 123
		// 3. get the page title
		String title = driver.getTitle();// 123
		System.out.println("page title:" + title);

		// 4. get url
		String url = driver.getCurrentUrl();// 123
		System.out.println("page url:" + url);

		// 5. close the browser
		driver.close();//123
		
		//sid=invalid//NoSuchSessionException: invalid session id
		
		driver = new ChromeDriver();//456
		driver.get("https://www.google.com");//456
		System.out.println(driver.getTitle());//456

	}

}
