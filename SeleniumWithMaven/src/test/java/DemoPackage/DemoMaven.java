package DemoPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoMaven {

	@Test
	public void PageTest()
	{
		System.out.println("Welcome to the World of Jenkins.....");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Softy\\Cell\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com");
		System.out.println("Page Title is : " + dr.getTitle());
		System.out.println("Test Case finally passed and I'm ---->>>>> SUPER HAPPY man.hello<<<<<<<<...");
	}
}
