package SeleniumConcepts;

public class LoginTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();

		brUtil.initDriver("chrome");
		//brUtil.launchUrl(null);

		String title = brUtil.getPageTitle();
		if (title.equals("Account Login")) {
			System.out.println("title -- pass");
		} else {
			System.out.println("title -- fail");
		}

		String url = brUtil.getCurrentURL();
		if (url.contains("route=account/login")) {
			System.out.println("login url is correct");
		}

		brUtil.closeBrowser();

	}

}
